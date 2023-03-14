
import java.util.Random;
import java.util.*;
public class Merge {
    public static void main(String args[]) {
        // Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
        // Реализовать алгоритм сортировки списков компаратором.
        ArrayList<Integer> sortArr1 = new ArrayList<>();
        ArrayList<Integer> sortArr2 = new ArrayList<>();

        for (int j = 0; j < 15; j++) {
            sortArr1.add(new Random().nextInt(1, 200));
            sortArr2.add(new Random().nextInt(1, 200));
        }
        System.out.println("Список 1: " + sortArr1);
        System.out.println("Список 2: " + sortArr2);
        ArrayList<Integer> sortArr3 = new ArrayList<>();
        sortArr3.addAll(sortArr1);
        sortArr3.addAll(sortArr2);

        Object last = null;
        Collections.sort(sortArr3);

        Iterator i = sortArr3.iterator();
        while(i.hasNext()) {
            Object o = i.next();
            if (o.equals(last)) {
                i.remove();
            } else {
                last = o;
            }
        }
        System.out.println("Объединенный список  : " + sortArr3);


        //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        int maxItem = sortArr3.get(0);
        int minItem = sortArr3.get(0);
        int sumItems = 0;
        for (int item : sortArr3) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }

        int min = Collections.min(sortArr3);
        System.out.println("Min : " + min);
        int max = Collections.max(sortArr3);
        System.out.println("Max : " + max);
        float average = (float)sumItems/sortArr3.size();
        System.out.println("Среднее арифметическое: "+ average);



        // Пусть дан произвольный список целых чисел, удалить из него чётные числа
        int j = 0;
        while (j < sortArr3.size()) {
            if (sortArr3.get(j) % 2 == 0) {
                sortArr3.remove(j);
            }
            else {
                j++;
            }
        }
        System.out.printf("Список с удаленными четными числами: "+ sortArr3);

        }
    }