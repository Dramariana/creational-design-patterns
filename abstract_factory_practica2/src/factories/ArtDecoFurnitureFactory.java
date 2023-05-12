package factories;

import chairs.ArtDecoChair;
import chairs.Chairs;
import coffeTables.ArtDecoCoffeTable;
import coffeTables.CoffeTable;
import sofas.ArtDecoSofa;
import sofas.Sofas;

public class ArtDecoFurnitureFactory implements FurnitureFactory{
    @Override
    public Chairs createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofas createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ArtDecoCoffeTable();
    }
}
