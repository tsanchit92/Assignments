import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';



@Component({
  selector: 'app-root',
  template: `
  <h2 class ="h2">
       Welcome to angular {{title}}
  </h2>
  <div>
    <h3>Select Your Profile :- We repect your choice </h3>
  </div>
  <div>
  <nav style=" text-align:center;padding:15px">
    
     <button  style="font-style:italic;font-size:20px;background-color:blue;color:white" routerLink="admin" routerLinkActive="active">Admin</button>
    
     <button  style="font-style:italic;font-size:20px;background-color:blue;color:white" routerLink="user" routerLinkActive="active">User</button>
  </nav>
     <router-outlet></router-outlet>
  </div>
  `,
  styles:[' h2.h2{ text-align : center;border:5px solid black;border-radius:100px;font-style:italic}h3{text-align:center}']
})
export class AppComponent {
  
  
 
  title = 'Assignments';
  constructor(){}


}
