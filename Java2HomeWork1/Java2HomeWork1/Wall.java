package Java2HomeWork1;

public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }
    public void overcome(Jump jumper) {
        jumper.jump(height);
    }
}
