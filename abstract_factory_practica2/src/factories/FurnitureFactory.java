package factories;

import chairs.Chairs;
import coffeTables.CoffeTable;
import sofas.Sofas;

public interface FurnitureFactory {
    Chairs createChair();

    Sofas createSofa();

    CoffeTable createCoffeTable();
}
