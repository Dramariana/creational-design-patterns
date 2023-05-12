package delivery;

public class BiciDelivery implements Delivery{
    @Override
    public void paint() {
        System.out.println("You have created BiciDelivery.");
    }

    @Override
    public void preparing() {
        System.out.println("we are preparing your order.");
    }

    @Override
    public void onTheWay() {
        System.out.println("the BiciDelivery man is on his way.");

    }

    @Override
    public void delivered() {
        System.out.println("the BiciDelivery man arrived at the destination.");

    }

}
