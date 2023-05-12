package builders;

import components.*;
import houses.HouseType;

public interface Builder {

    void setHouseType(HouseType houseType);

    void setDoors(int door);

    void setGarage(int garage);

    void setBedroom(int bedroom);

    void setBadroom(int badroom);

    void setPool(Pool pool);

    void setRoof(Roof roof);

    void setWall(Wall wall);

    void setWindows(int windows);
}
