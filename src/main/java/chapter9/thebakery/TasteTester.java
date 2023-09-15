package chapter9.thebakery;

public class TasteTester {
    public static void main(String[] args) {
BirthdayCake birthdayCake = new BirthdayCake("Chocolate ",12.99 );
WeddingCake weddingCake = new WeddingCake("Strawberry ",15.98);
Cake cake = new Cake("Lemon ",5.99);
birthdayCake.setCandles(3);
weddingCake.setTiers(4);
        System.out.println("The flavor of the cake is: " + cake.getFlavor() + "And the price is "+ cake.getPrice() );
        System.out.println("The flavor of the cake is: " + birthdayCake.getFlavor() + "And the price is " + birthdayCake.getPrice());
        System.out.println("The flavor of the cake is: " + weddingCake.getFlavor() + "And the price is "+ weddingCake.getPrice());

        

    }
}
