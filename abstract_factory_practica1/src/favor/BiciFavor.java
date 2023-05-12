package favor;

public class BiciFavor implements Favor{
    @Override
    public void paint() {
        System.out.println("You have created BiciFavor.");
    }

    @Override
    public void driverOnTheWay() {
        System.out.println("the BiciDriver is on his way.");
    }

    @Override
    public void driverHasOrder() {
        System.out.println("the BiciDriver has your order.");
    }

    @Override
    public void driverArrived() {
        System.out.println("BiciDriver has arrived at destination.");
    }
}
