import { Component, OnInit } from '@angular/core';
import { TaskService } from '../../services/task.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-create-task',
  templateUrl: './create-task.component.html',
  styleUrls: ['./create-task.component.scss']
})
export class CreateTaskComponent implements OnInit {
  priorities: string[] = [
    'Urgent',
    'Important',
    'Not Important'
  ];
  taskForm: FormGroup;
  validMessage: string = "";

  constructor(private taskService: TaskService) { }

  ngOnInit(): void {
    this.taskForm = new FormGroup({
      taskName: new FormControl('',Validators.required),
      description: new FormControl('',Validators.required),
      userLogin: new FormControl('',Validators.required),
      createdOn: new FormControl(),
      isDone: new FormControl(),
      //priority: new FormControl(),
    })
  }

  submitTask(){
    if(this.taskForm.valid) {
      this.validMessage = "Your task has been added.";
      this.taskService.createTask(this.taskForm.value).subscribe(
        data => {
          this.taskForm.reset();
          return true;
        },
        error => {
          return Observable.throw(error);
        }
      );
    } else {
      this.validMessage = "Please fill out the form before submitting";
    }

  }

}
