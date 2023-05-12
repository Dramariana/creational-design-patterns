package components;

public class Wall {
   private int quantity;
    private Material material;
    private String ColorPaint;

    private WallType wallType;

    public Wall(int quantity,WallType wallType, Material material, String colorPaint) {
        this.quantity = quantity;
        this.wallType=wallType;
        this.material = material;
        ColorPaint = colorPaint;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getColorPaint() {
        return ColorPaint;
    }

    public void setColorPaint(String colorPaint) {
        ColorPaint = colorPaint;
    }

    public WallType getWallType() {
        return wallType;
    }

    public void setWallType(WallType wallType) {
        this.wallType = wallType;
    }
}
