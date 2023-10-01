export class Parcel {
    id: number;
    weight: number;
    price: number;
    senderAddress: string;
    receiverAddress: string;
  
    constructor(
      id: number,
      weight: number,
      price: number,
      senderAddress: string,
      receiverAddress: string
    ) {
      this.id = id;
      this.weight = weight;
      this.price = price;
      this.senderAddress = senderAddress;
      this.receiverAddress = receiverAddress;
    }
  }
  