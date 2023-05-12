package houses;

import components.Pool;
import components.Roof;
import components.Wall;

public class House {

    private HouseType type;
    private int doors;
    private int windows;

    private int bedroom;
    private int badroom;
    private Roof roof;
    private Pool pool;
    private int garage;
    private Wall wall;

    public House(HouseType type, int doors, int windows, int bedroom, int badroom, Roof roof, Pool pool, int garage, Wall wall) {
        this.type = type;
        this.doors = doors;
        this.windows = windows;
        this.bedroom = bedroom;
        this.badroom = badroom;
        this.roof = roof;
        this.pool = pool;
        this.garage = garage;
        this.wall = wall;
    }

    public HouseType getType() {
        return type;
    }

    public void setType(HouseType type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBadroom() {
        return badroom;
    }

    public void setBadroom(int badroom) {
        this.badroom = badroom;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public int getGarage() {
        return garage;
    }

    public void setGarage(int garage) {
        this.garage = garage;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }
}
