package components;

public class Pool {

    private int length;
    private int width;
    private int depth;

    public Pool(int length, int width, int depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
