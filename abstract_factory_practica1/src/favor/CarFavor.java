package favor;

public class CarFavor implements Favor{

    @Override
    public void paint() {
        System.out.println("You have created CarFavor.");
    }

    @Override
    public void driverOnTheWay() {
        System.out.println("the CarDriver is on his way.");
    }

    @Override
    public void driverHasOrder() {
        System.out.println("the CarDriver has your order.");
    }

    @Override
    public void driverArrived() {
        System.out.println("CarDriver has arrived at destination.");
    }
}
