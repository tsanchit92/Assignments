import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-menu',
  template: `
  <div style="padding :10px">
  <nav>
    <button style=" border:5px solid maroon"  routerLink="addMenu" routerLinkActive="active">Add</button>
    <button  style=" border:5px solid maroon" routerLink="editMenu" routerLinkActive="active">Edit</button>
    <button style=" border:5px solid maroon"  routerLink="deleteMenu" routerLinkActive="active">Delete</button>
    <router-outlet></router-outlet>
    </nav>
   
  </div>
  <div style=";color:brown;border:black solid;font-size:20px">
  <ul >
    <li style="border:5px green solid;padding:2px" *ngFor="let menu of menus">
        <span>{{menu.id}}</span>  -- <span>{{menu.name}}</span> -- <span>{{menu.prize}}</span>
    </li>
  </ul>
  </div>
 
  
    
     
  `,
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {
  menus = 
  [
    {"id":1,"name":"Pizza","prize":"$40"},
    {"id":2,"name":"Noodles","prize":"$50"},
    {"id":3,"name":"PavBhaji","prize":"$25"},
    {"id":4,"name":"Grilled Sandwich","prize":"$60"},
    {"id":5,"name":"Chilli Paneer","prize":"$35"}
  ]

 

  constructor() { }

  ngOnInit(){
   
  }

}
