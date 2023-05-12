package app;

import chairs.Chairs;
import coffeTables.CoffeTable;
import factories.FurnitureFactory;
import sofas.Sofas;

public class Application {

    private Chairs chair;
    private Sofas sofa;
    private CoffeTable coffeTable;

    public Application(FurnitureFactory furnitureFactory) {
        chair=furnitureFactory.createChair();
        sofa=furnitureFactory.createSofa();
        coffeTable=furnitureFactory.createCoffeTable();
    }

    public void sitOn() {
        chair.sitOn();
        sofa.sitOn();
    }

    public void hasLegs() {
        chair.hasLegs();
        sofa.hasLegs();
        coffeTable.hasLegs();
    }

    public void build() {
        chair.build();
        sofa.build();
        coffeTable.build();
    }
}
