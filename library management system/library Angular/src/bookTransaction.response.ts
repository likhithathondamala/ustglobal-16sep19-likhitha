export class BookTransactionResponse {
    constructor(
        public transactionId: number,
        public registrationId: number,
        public issueDate: any,
        public returnDate: any,
        public bid: number,
        public id: number
    ) {}
}