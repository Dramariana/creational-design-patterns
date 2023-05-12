package delivery;

public class CarDelivery implements Delivery {
    @Override
    public void paint() {

        System.out.println("You have created CarDelivery.");
    }

    @Override
    public void preparing() {
        System.out.println("we are preparing your order.");
    }

    @Override
    public void onTheWay() {
        System.out.println("the CarDelivery man is on his way.");

    }

    @Override
    public void delivered() {
        System.out.println("the CarDelivery man arrived at the destination.");

    }
}
