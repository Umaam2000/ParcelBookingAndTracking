import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Parcel } from '../model/parcel.model';


@Component({
  selector: 'app-parcel-details',
  templateUrl: './parcel-details.component.html',
  styleUrls: ['./parcel-details.component.css']
})
export class ParcelDetailsComponent implements OnInit {
[x: string]: any;
  parcels: Parcel[] = [];
  showDetailsPopup: boolean = false;
  showTrackingPopup: boolean = false;
  selectedParcel: Parcel | undefined;

  ngOnInit() {
    // Fetch parcel data from the backend and assign it to the parcels array
    this.fetchParcels();
  }

  fetchParcels() {
    // Simulating fetching parcels from the backend
    setTimeout(() => {
      // Assuming you receive the parcel data from the backend API as an array
      const parcelData = [
        { parcelId: 1, senderAddress: 'Sender 1',price:8000, receiverAddress: 'Receiver 1', weight: 5 },
        { parcelId: 2, senderAddress: 'Sender 2',price:9000, receiverAddress: 'Receiver 2', weight: 3 },
        { parcelId: 3, senderAddress: 'Sender 3',price:500, receiverAddress: 'Receiver 3', weight: 7 }
      ];

      // Map the parcel data to Parcel instances
      this.parcels = parcelData.map(parcel => new Parcel(
        parcel.parcelId,
        parcel.price,
        parcel.weight,
        parcel.receiverAddress,
        parcel.senderAddress
        
      ));
    }, 1000);
  }

  openDetailsPopup(parcel: Parcel) {
    this.selectedParcel = parcel;
    this.showDetailsPopup = true;
  }

  closeDetailsPopup() {
    this.showDetailsPopup = false;
    this.selectedParcel = undefined;
  }

  trackingStatusPopup(parcel: Parcel) {
    this.selectedParcel = parcel; // Set the selected parcel for the tracking status popup
    this.showTrackingPopup = true; // Display the tracking status popup
  }

  closeTrackingPopup() {
    this.showTrackingPopup = false; // Hide the tracking status popup
  }
}