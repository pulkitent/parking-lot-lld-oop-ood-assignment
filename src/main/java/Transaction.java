public class Transaction {
    private final Double id;
    private final PaymemtMode mode;

    public Transaction(PaymemtMode mode) {
        this.id = Math.random();
        this.mode = mode;
    }
}