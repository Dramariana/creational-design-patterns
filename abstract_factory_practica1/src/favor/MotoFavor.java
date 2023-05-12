package favor;

public class MotoFavor implements Favor{
    @Override
    public void paint() {
        System.out.println("You have created MotoFavor.");
    }

    @Override
    public void driverOnTheWay() {
        System.out.println("the MotoDriver is on his way.");
    }

    @Override
    public void driverHasOrder() {
        System.out.println("the MotoDriver has your order.");
    }

    @Override
    public void driverArrived() {
        System.out.println("MotoDriver has arrived at destination.");
    }
}
