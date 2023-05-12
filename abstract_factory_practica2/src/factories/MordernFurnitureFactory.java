package factories;

import chairs.Chairs;
import chairs.ModernChair;
import coffeTables.CoffeTable;
import coffeTables.ModernCoffeTable;
import sofas.ModernSofa;
import sofas.Sofas;

public class MordernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chairs createChair() {
        return new ModernChair();
    }

    @Override
    public Sofas createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
        return new ModernCoffeTable();
    }
}
