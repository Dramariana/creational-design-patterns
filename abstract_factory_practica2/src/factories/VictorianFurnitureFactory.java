package factories;

import chairs.Chairs;
import chairs.VictorianChair;
import coffeTables.CoffeTable;
import coffeTables.VictorianCoffeTable;
import sofas.Sofas;
import sofas.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chairs createChair() {

        return new VictorianChair();
    }

    @Override
    public Sofas createSofa() {

        return new VictorianSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {

        return new VictorianCoffeTable();
    }
}
