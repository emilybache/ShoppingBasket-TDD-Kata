package codingdojo.example1a;

public class Cents {
    private long amount;

    Cents(long amount) {
        this.amount = amount;
    }

    public static Cents fromDollars(double dollars) {
        return new Cents(Math.round(dollars*100));
    }
}
