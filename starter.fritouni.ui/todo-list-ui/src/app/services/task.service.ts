import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

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

  createTask(task){
    let body = JSON.stringify(task);
    return this.http.post('/server/api/v1/todolist', body, httpOptions);
  }
}
