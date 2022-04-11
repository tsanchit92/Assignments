import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddMenuComponent } from './add-menu/add-menu.component';
import { AddRestaurantComponent } from './add-restaurant/add-restaurant.component';
import { AdminComponent } from './admin/admin.component';
import { DeleteMenuComponent } from './delete-menu/delete-menu.component';
import { DeleteRestaurantComponent } from './delete-restaurant/delete-restaurant.component';
import { EditMenuComponent } from './edit-menu/edit-menu.component';
import { EditRestaurantComponent } from './edit-restaurant/edit-restaurant.component';
import { MenuComponent } from './menu/menu.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
 
  {
    path:"admin",
    component:AdminComponent,
    children:
  [
    {
      path:"menu",
      component:MenuComponent,
      children:
      [
        {path:"addMenu",component:AddMenuComponent},
        {path:"editMenu",component:EditMenuComponent},
        {path:"deleteMenu",component:DeleteMenuComponent}
      ]
    },
    {
      path:"restaurant",
       component:RestaurantComponent,
    children:
    [
      {path:"addRestaurant",component:AddRestaurantComponent},
      {path:"editRestaurant",component:EditRestaurantComponent},
      {path:"deleteRestaurant",component:DeleteRestaurantComponent}
    ]}
  ]
},
  {path:"restaurant",component:RestaurantComponent},
  {
    path:"user",
    component:UserComponent,
    children:
    [
      {path:"menu",component:MenuComponent},
      {path:"restaurant",component:RestaurantComponent}
    ]

}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
export const routingComponents=[MenuComponent,AdminComponent,RestaurantComponent,UserComponent,AddMenuComponent,EditMenuComponent,DeleteMenuComponent,AddRestaurantComponent,EditRestaurantComponent,DeleteRestaurantComponent]

