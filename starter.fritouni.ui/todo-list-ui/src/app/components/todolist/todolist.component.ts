import { Component, OnInit } from '@angular/core';
import { TaskService } from '../../services/task.service';
import { faTrashAlt, faPencilAlt } from '@fortawesome/free-solid-svg-icons';
import { DatePipe } from '@angular/common'

@Component({
  selector: 'app-todolist',
  templateUrl: './todolist.component.html',
  styleUrls: ['./todolist.component.scss']
})
export class TodolistComponent implements OnInit {
  public tasks;
  faTrash = faTrashAlt;
  faPencil = faPencilAlt;
  validMessage: string = "";

  constructor(private taskService : TaskService) { }

  ngOnInit() {
    this.getTasks();
  }

  getTasks() {
    this.taskService.getTasks().subscribe(
      data => {
        console.log(data);
        this.tasks = data;
      },
      err => console.error(err),
      () => console.log('tasks loaded')
    );
  }

  onDeleteClick(id:number) {
    this.taskService.deleteTask(id).subscribe(
      data => {
        this.validMessage = "Your task has been deleted!";
        this.getTasks();
      },
      error => {
        this.validMessage = "An Error has occurred!"
      },
      () => console.log('task deleted' + id)
    );
  }
}
