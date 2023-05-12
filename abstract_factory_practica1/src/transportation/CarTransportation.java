package transportation;

public class CarTransportation implements Transportation{
    @Override
    public void paint() {
        System.out.println("You have created CarTransportation.");
    }
    @Override
    public void driverOnTheWay() {
        System.out.println("the CarDriver is on his way.");
    }

    @Override
    public void driverClose() {
        System.out.println("CarDriver is 3 minutes away.");
    }

    @Override
    public void driverArrived() {
        System.out.println("CarDriver has arrived at destination.");
    }
}
