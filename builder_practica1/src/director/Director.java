package director;

import builders.Builder;
import components.*;
import houses.HouseType;

import static components.Material.*;
import static components.WallType.*;

public class Director {

    public void constructNormalHouse(Builder builder) {
        builder.setHouseType(HouseType.NORMAL_HOUSE);
        builder.setDoors(6);
        builder.setGarage(0);
        builder.setBedroom(3);
        builder.setBadroom(2);
        builder.setRoof(new Roof(WOOD_GLASS,"GREY"));
        builder.setWall(new Wall(4,OUTSIDE,WOOD_GLASS,"GREY"));
        builder.setWindows(4);
    }

    public void constructCastle(Builder builder) {
        builder.setHouseType(HouseType.CASTLE);
        builder.setDoors(13);
        builder.setGarage(5);
        builder.setBedroom(5);
        builder.setBadroom(6);
        builder.setPool(new Pool(70,20,150));
        builder.setRoof(new Roof(STONE_IRON,"SILVER"));
        builder.setWall(new Wall(4,OUTSIDE,STONE_IRON,"SILVER"));
        builder.setWindows(8);
    }

    public void constructPalace(Builder builder) {
        builder.setHouseType(HouseType.PALACE);
        builder.setDoors(27);
        builder.setGarage(8);
        builder.setBedroom(10);
        builder.setBadroom(15);
        builder.setPool(new Pool(200,100,150));
        builder.setRoof(new Roof(GOLD_DIAMOND,"GOLD"));
        builder.setWall(new Wall(4,OUTSIDE,GOLD_DIAMOND,"GOLD"));
        builder.setWindows(16);
    }
}
