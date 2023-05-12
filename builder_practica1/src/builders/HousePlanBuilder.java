package builders;

import components.Pool;
import components.Roof;
import components.Wall;
import houses.House;
import houses.HouseType;
import houses.Plan;

public class HousePlanBuilder implements Builder {
    private HouseType type;
    private int doors;
    private int windows;

    private int bedroom;
    private int badroom;
    private Roof roof;
    private Pool pool;
    private int garage;
    private Wall wall;

    @Override
    public void setHouseType(HouseType houseType) {
        this.type = houseType;
    }

    @Override
    public void setDoors(int door) {
        this.doors = door;
    }

    @Override
    public void setGarage(int garage) {
        this.garage = garage;
    }

    @Override
    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    @Override
    public void setBadroom(int badroom) {
        this.badroom = badroom;
    }

    @Override
    public void setPool(Pool pool) {
        this.pool = pool;
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void setWall(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    public Plan getResult() {

        return new Plan(type,doors,windows,bedroom,badroom,roof,pool,garage,wall);
    }
}
