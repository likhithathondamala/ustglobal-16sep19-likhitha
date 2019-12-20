export class ProductResponse{
    constructor(
        public id: number,
        public name: string,
        public category: string,
        public company: string,
        public quantity: number,
        public price:number

    ){}
}