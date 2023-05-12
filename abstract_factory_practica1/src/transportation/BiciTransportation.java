package transportation;

public class BiciTransportation implements  Transportation{
    @Override
    public void paint() {
        System.out.println("You have created BiciTransportation.");
    }

    @Override
    public void driverOnTheWay() {
        System.out.println("the BiciDriver is on his way.");
    }

    @Override
    public void driverClose() {
        System.out.println("BiciDriver is 3 minutes away.");
    }

    @Override
    public void driverArrived() {

        System.out.println("BiciDriver has arrived at destination.");
    }
}
