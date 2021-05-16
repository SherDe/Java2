package Java2HomeWork1;

public class Road {
    private int lenght;

    public Road(int lenght) {
        this.lenght = lenght;
    }
    public void overcome(Run runner) {
        runner.run(lenght);
    }
}
