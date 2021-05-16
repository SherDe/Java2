package Java2HomeWork1;

public class MainHomework1 {
    public static void main(String[] args) {
        Jump[] jumpers = {new Cat(10, 23), new Human(20, 17), new Robot(12, 19)};
        Run[] runners = {new Cat(10, 10), new Human(20, 17)new Robot(12, 56)};
        Competitable[] competitors = {new Cat(10, 23), new Human(20, 17), new Robot(56, 7) };

        Overcomeable[] obstacles = {new Wall(15), new Road(50)};

        for (Overcomeable overcomeable : obstacles) {
            for (Competitable competitable : competitors) {
                overcomeable.overcome(competitable);
            }
    }
}

