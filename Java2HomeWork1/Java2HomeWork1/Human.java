package Java2HomeWork1;

public class Human implements Jump, Run{
    private int runLenght;
    private int jumpHeight;
    @Override
    public void jump(int height) {
        if (jumpHeight >= height) {
            System.out.println("Человек перепрыгнул");

    } else {
            System.out.println("Человек не смог перепрыгнуть");
        }
    }

    @Override
    public void run(int lenght) {
        if (runLenght >= lenght)
        {
            System.out.println("Человек пробежал");
        } else {
            System.out.println("Человек не пробежал");
        }

    }
}
