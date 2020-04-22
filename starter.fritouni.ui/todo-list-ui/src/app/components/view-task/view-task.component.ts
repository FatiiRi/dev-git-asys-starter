import { Component, OnInit } from '@angular/core';
import { TaskService } from '../../services/task.service';
import { ActivatedRoute } from '@angular/router'
@Component({
  selector: 'app-view-task',
  templateUrl: './view-task.component.html',
  styleUrls: ['./view-task.component.scss']
})
export class ViewTaskComponent implements OnInit {
  public task;

  constructor(
    private taskService: TaskService,
    private route: ActivatedRoute)
    { 

    }

  ngOnInit(): void {
    this.getOneTask(this.route.snapshot.params.id);
  }

  getOneTask(id:number) {
    this.taskService.getTask(id).subscribe(
      data => {
        this.task = data
      },
      err => console.log(err),
      () => console.log('task loaded')
    );

  }

}
