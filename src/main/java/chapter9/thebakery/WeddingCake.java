package chapter9.thebakery;

public class WeddingCake extends Cake{

    private int tiers;

    public WeddingCake(String flavor, double price) {
        super(flavor, price);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
