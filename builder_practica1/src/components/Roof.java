package components;

public class Roof {

    private Material material;
    private String ColorPaint;

    public Roof(Material material, String colorPaint) {
        this.material = material;
        ColorPaint = colorPaint;
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
}
