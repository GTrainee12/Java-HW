import java.util.Random;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
public class HW1J {
    //случайное число в диапозоне от 0 до 1000
    static int Random () {
        Random rand = new Random();
        int i = rand.nextInt(0, 2000 + 1);
        return i;
    }

    //поиск старшего бита
    static int bit(int i) {
        int n = Integer.toBinaryString(i).length();
        return n;
    }


    static Integer[] getArrayMultiMax(int number, int multiNumber) {
        ArrayList<Integer> myArray = new ArrayList<>();
        for (int i = number; i <= Short.MAX_VALUE ; i++) {
            if (i % multiNumber == 0) {
                myArray.add(i);
            }
        }
        Integer[] array = new Integer[myArray.size()];
        myArray.toArray(array);
        return array;
    }

    static Integer[] getArrayMultiMin(int number, int multiNumber) {
        ArrayList<Integer> getArray = new ArrayList<>();
        for (int i = number; i >= Short.MIN_VALUE; i--) {
            if (i % multiNumber != 0) {
                getArray.add(i);
            }
        }
        Integer[] array = new Integer[getArray.size()];
        getArray.toArray(array);
        return array;
    }

    public static void printArray(Integer[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (i < array.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }

    static void writeToFile(Integer[] array, String name) {
        try (FileWriter fw = new FileWriter(name + ".txt", false)) {
            fw.write("[");
            for (int i = 0; i < array.length; i++) {
                fw.append(array[i].toString());
                if (i < array.length - 1) {
                    fw.append(", ");
                }
            }
            fw.write("]");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {

        int i = Random();
        int n = bit(i);
        Integer[] m1 = getArrayMultiMax(n, i);
        Integer[] m2 = getArrayMultiMin(n, i);

        System.out.println(i);
        System.out.println(n);
        writeToFile(m1,"m1");
        writeToFile(m2, "m2");

    }
}
