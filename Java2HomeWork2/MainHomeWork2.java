package Java2HomeWork2;

public class MainHomeWork2 {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"1", "2", "3", "3"},
                {"2", "6", "8", "4"},
                {"7", "2", "7", "9"},
                {"8", "2", "1", "2"}
        };
        String[][] wrongSizeMatrix = {
                {"4", "1", "6", "7"},
                {"6", "1", "а", "1"},
                {"0", "2", "7", "3"},
                {"0", "2", "7", "3"}
        };
        String[][] wrongChar = {
                {"3", "2", "2", "1"},
                {"4", "1", "", "3"},
                {"8", "2", "7", "3"},
                {"6", "2", "7", "3"}
        };

        try {
            System.out.println(Converter.strConverter(correctMatrix));
        } catch (CustomException e) {
            e.getMessage();
        }


        try {
            System.out.println(Converter.strConverter(wrongSizeMatrix));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(wrongChar));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}
