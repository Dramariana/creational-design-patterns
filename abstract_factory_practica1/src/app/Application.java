package app;

import delivery.Delivery;
import factories.BiciFactory;
import factories.CarFactory;
import factories.Factory;
import factories.MotoFactory;
import favor.Favor;
import transportation.Transportation;

public class Application {

    private Delivery delivery;
    private Transportation transportation;
    private Favor favor;

    private int option;

    public Application(Factory factory, int optionA) {
        option = optionA;
        if (option == 1) {
            delivery = factory.createDelivery();
        } else if (option == 2) {
            transportation = factory.createTrasportation();
        } else {
            favor = factory.createFavor();
        }


    }

    public void paint() {
        if (option == 1) {
            delivery.paint();
        } else if (option == 2) {
            transportation.paint();
        } else {
            favor.paint();
        }
    }

    public void firstStep() {
        if (option == 1) {

            delivery.preparing();
        } else if (option == 2) {
            transportation.driverOnTheWay();
        } else {
            favor.driverOnTheWay();
        }
    }

    public void secondStep() {
        if (option == 1) {

            delivery.onTheWay();
        } else if (option == 2) {
            transportation.driverClose();
        } else {
            favor.driverHasOrder();
        }
    }

    public void thirdStep() {
        if (option == 1) {

            delivery.delivered();
        } else if (option == 2) {
            transportation.driverArrived();
        } else {
            favor.driverArrived();
        }
    }
}
