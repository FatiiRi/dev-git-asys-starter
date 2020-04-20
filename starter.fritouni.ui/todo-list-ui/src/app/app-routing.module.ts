import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TodolistComponent } from './components/todolist/todolist.component';
import { CreateTaskComponent } from './components/create-task/create-task.component';

const routes: Routes = [
    {
    path:'',
    component: TodolistComponent
    },
    {
      path:'todoList',
      component: TodolistComponent
    },
    {
      path:'newTask',
      component: CreateTaskComponent
    }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
