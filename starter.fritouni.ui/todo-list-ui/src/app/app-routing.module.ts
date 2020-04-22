import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TodolistComponent } from './components/todolist/todolist.component';
import { CreateTaskComponent } from './components/create-task/create-task.component';
import { ViewTaskComponent } from './components/view-task/view-task.component';

export const routes: Routes = [
    {
      path:'',
      component: TodolistComponent
    },
    {
      path:'todolist/view/:id',
      component: ViewTaskComponent
    },
    {
      path:'todolist',
      component: TodolistComponent
    },
    {
      path:'newtask',
      component: CreateTaskComponent
    },
    {
      path:'newtask/:id',
      component: CreateTaskComponent
    }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
