package Java2HomeWork5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork5 {
    private String[] header;
    private Integer[][] data;

    public HomeWork5() {
        header = new String[]{"value1", "value2", "value3"};
        data = new Integer[][]{{1, 2, 3}, {1, 3, 5}, {5, 6, 7}};
    }

    public void load(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            header = bufferedReader.readLine().split(";");
            String line;
            ArrayList<Integer[]> arrayList = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                arrayList.add(stringToIntArray(line));
            }
            data = arrayList.toArray(new Integer[][]{});
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private Integer[] stringToIntArray(String str) {
        String[] stringArray = str.split(";");
        Integer[] intArray = new Integer[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public static void main(String[] args) {
        HomeWork5 homeWork5 = new HomeWork5();
        homeWork5.load("test.csv");
        System.out.println(Arrays.toString(homeWork5.header));
        System.out.println(Arrays.deepToString(homeWork5.data));
    }
}
