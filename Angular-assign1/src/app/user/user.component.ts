import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  template: `
    <button routerLink="menu" routerLinkAcitve="active">Show Menu</button>
    <button routerLink="restaurant" routerLinkAcitve="active">Show Restaurant</button>
    <router-outlet></router-outlet>
    
  `,
  styleUrls: ['./user.component.scss']
})
export class UserComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
