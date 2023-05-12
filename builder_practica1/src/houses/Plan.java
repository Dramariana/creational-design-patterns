package houses;

import components.Pool;
import components.Roof;
import components.Wall;

public class Plan {

    private HouseType type;
    private int doors;
    private int windows;

    private int bedroom;
    private int badroom;
    private Roof roof;
    private Pool pool;
    private int garage;
    private Wall wall;

    public Plan(HouseType type, int doors, int windows, int bedroom, int badroom, Roof roof, Pool pool, int garage, Wall wall) {
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

    public String print() {
        String info = "";
        info += "Type of House: " + type + "\n";
        info += "Count of doors: " + doors + "\n";
        info += "Count of garage: " + garage + "\n";
        info += "Count of bedroom: " + bedroom + "\n";
        info += "Count of badroom: " + badroom + "\n";
        info += "Count of windows: " + windows + "\n";
        info += "Roof: material - " + roof.getMaterial() + "; Color- " + roof.getColorPaint() + "\n";
        info += "Walls: material - " + wall.getMaterial() + "; Color- " + wall.getColorPaint() + "; wall type- " + wall.getWallType() + "; quantity- " + wall.getQuantity() + "\n";
        info += "Pool: depth - " + pool.getDepth() + "; length- " + pool.getLength() + "; width- " + pool.getWidth() + "\n";


        return info;
    }
}
