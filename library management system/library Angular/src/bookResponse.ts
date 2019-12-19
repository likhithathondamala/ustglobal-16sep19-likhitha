export class BookResponse {
    constructor(
        public bid: number,
        public bname: string,
        public author: string,
        public publisher: string,
        public yearofpublication: Date
    ) {}
}
