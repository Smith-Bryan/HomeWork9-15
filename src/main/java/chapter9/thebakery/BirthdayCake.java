package chapter9.thebakery;

public class BirthdayCake extends Cake {
    private int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public BirthdayCake(String flavor, double price) {
        super(flavor, price);
    }
}

