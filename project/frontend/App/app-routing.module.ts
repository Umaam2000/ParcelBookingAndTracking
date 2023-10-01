import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ParcelDetailsComponent } from './parcel-details/parcel-details.component';

const routes: Routes = [
  { path: '', component: ParcelDetailsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }