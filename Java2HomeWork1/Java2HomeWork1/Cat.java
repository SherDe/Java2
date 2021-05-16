package Java2HomeWork1;

public class Cat implements Jump, Run {
    private int runLenght;
    private int jumpHeight;
    @Override
    public void jump(int height) {
        if (jumpHeight >= height) {
            System.out.println("Мурзик перепрыгнул");
        } else {
            System.out.println("Мурзик не перепрыгнул");
        }

    }

    @Override
    public void run(int lenght) {
        if (runLenght >= lenght)
        {
            System.out.println("Кот пробежал");
        } else {
            System.out.println("Кот не пробежал");
        }

    }
}
