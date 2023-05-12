package delivery;

public class MotoDelivery implements Delivery{
    @Override
    public void paint() {
        System.out.println("You have created MotoDelivery.");
    }
    @Override
    public void preparing() {
        System.out.println("we are preparing your order.");
    }

    @Override
    public void onTheWay() {
        System.out.println("the MotoDelivery man is on his way.");

    }

    @Override
    public void delivered() {
        System.out.println("the MotoDelivery man arrived at the destination.");

    }
}
