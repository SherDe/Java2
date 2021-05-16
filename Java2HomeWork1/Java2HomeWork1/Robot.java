package Java2HomeWork1;

public class Robot implements Jump, Run{
    private int runLenght;
    private int jumpHeight;

    public Robot(int runLenght) {
        this.runLenght = runLenght;
    }

    @Override
    public void jump(int height) {
        if (jumpHeight >= height) {
            System.out.println("Робот перепрыгнул");
        }
        else {
            System.out.println("Робот не справился с задачей");
        }

    }

    @Override
    public void run(int lenght) {
        if (runLenght >= lenght)
        {
            System.out.println("Робот пробежал");
        } else {
            System.out.println("Робот не пробежал");
        }

    }

}
