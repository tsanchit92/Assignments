import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-admin',
  template: `
  <div>
        <button  style="font-style:italic;font-size:20px;background-color:blue;color:white" routerLink="menu" routerLinkActive="active">Menu</button>
        <button  style="font-style:italic;font-size:20px;background-color:blue;color:white" routerLink="restaurant" routerLinkActive="active">Restaurants</button>
      <router-outlet></router-outlet>
  </div>
  `,
  styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
