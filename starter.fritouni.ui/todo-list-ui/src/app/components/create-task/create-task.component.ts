import { Component, OnInit } from '@angular/core';
import { TaskService } from '../../services/task.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Observable } from 'rxjs';
import { Task } from 'src/app/models/task.model';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-create-task',
  templateUrl: './create-task.component.html',
  styleUrls: ['./create-task.component.scss']
})
export class CreateTaskComponent implements OnInit {
  taskForm: FormGroup;
  validMessage: string = "";
  createdTask;
  id;
  alert:string = "alert alert-info";

  constructor(private taskService: TaskService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params.id;
    if(this.id !== undefined && this.id !== null && this.id !== ''){
      this.getOneTask(this.id);
    }

    this.taskForm = new FormGroup({
      taskId: new FormControl(),
      taskName: new FormControl('',Validators.required),
      description: new FormControl('',Validators.required),
      userLogin: new FormControl('',Validators.required),
      createdOn: new FormControl(),
      isDone: new FormControl(),
    })
  }

  submitTask(){
    if(this.taskForm.valid) {
      this.createdTask = this.taskForm.value;
        this.taskService.upsertTask(this.createdTask).subscribe(
          data => {
            this.validMessage = "Your task has been submitted !";
            this.alert = "alert alert-success";
            if(this.id === undefined || this.id === null){
              this.taskForm.reset();
            }
            return true;
          },
          error => {
            this.validMessage = "An Error has occurred!"
            this.alert = "alert alert-error"
            return Observable.throw(error);
          }
        );     
    } else {
      this.alert = "alert alert-warning"
      this.validMessage = "Please fill out the form before submitting!";
    }
  }
  getOneTask(id:number){
    this.taskService.getTask(id).subscribe(
      data => {
        this.taskForm.setValue(data);
      },
      err => console.log(err),
      () => console.log('task loaded')
    );

  }

}
