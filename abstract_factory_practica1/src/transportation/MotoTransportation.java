package transportation;

public class MotoTransportation implements Transportation{
    @Override
    public void paint() {
        System.out.println("You have created MotoTransportation.");
    }

    @Override
    public void driverOnTheWay() {
        System.out.println("the MotoDriver is on his way.");
    }

    @Override
    public void driverClose() {
        System.out.println("MotoDriver is 3 minutes away.");
    }

    @Override
    public void driverArrived() {
        System.out.println("MotoDriver has arrived at destination.");
    }
}
