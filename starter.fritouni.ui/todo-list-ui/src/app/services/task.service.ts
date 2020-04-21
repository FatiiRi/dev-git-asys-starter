import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Task } from '../models/task.model';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private http:HttpClient) { }

  getTasks() {
    return this.http.get('/server/api/v1/todolist');
  }

  getTask(id: number) {
    return this.http.get('/server/api/v1/todolist/' + id);
  }

  createTask(task:Task){
    let body = JSON.stringify(task);
    return this.http.post('/server/api/v1/todolist/create', body, httpOptions);
  }
}
