import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-restaurant',
  template:`
  <div style="padding :10px">
  <nav>
    <button style=" border:5px solid maroon"  routerLink="addRestaurant" routerLinkActive="active">Add</button>
    <button  style=" border:5px solid maroon" routerLink="editRestaurant" routerLinkActive="active">Edit</button>
    <button style=" border:5px solid maroon"  routerLink="deleteRestaurant" routerLinkActive="active">Delete</button>
    <router-outlet></router-outlet>
  </nav>
    
  </div>
  <div style=";color:brown;border:black solid;font-size:20px">
  <ul >
    <li style="border:5px green solid;padding:2px" *ngFor="let restaurant of restaurants">
        <span>{{restaurant.id}}</span>  -- <span>{{restaurant.name}}</span> -- <span>{{restaurant.star}}</span>
    </li>
  </ul>
  </div>
  ` ,
  styleUrls: ['./restaurant.component.scss']
})
export class RestaurantComponent implements OnInit {

  restaurants = 
  [
    {"id":1,"name":"Taj","star":"3"},
    {"id":2,"name":"Tunday","star":"4"},
    {"id":3,"name":"Sharma Tea","star":"4"},
    {"id":4,"name":"Mughlai","star":"4"},
    {"id":5,"name":"Mansarovar","star":"4"}
  ]


  constructor() { }

  ngOnInit(): void {
  }

}
