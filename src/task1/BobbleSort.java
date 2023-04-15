package task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BobbleSort {
    private static Logger log = Logger.getLogger(BobbleSort.class.getName());
    public static void write (int[] array) {
        try(FileWriter in = new FileWriter("bobbleSort.txt")) {
            String[] data = bobbleSort(array);
            for (String datum : data) in.append(datum);
            log.log(Level.INFO, "Finished");
        } catch (IOException e) {
            log.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public static String[] bobbleSort (int[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            log.log(Level.INFO, Arrays.toString(array));
//            System.out.println(Arrays.toString(array));
            result[i] = Arrays.toString(array);
        }
        log.log(Level.INFO, "Sorting completed");
//        System.out.println(Arrays.toString(result));
        return result;
    }
}
