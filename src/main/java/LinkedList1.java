import java.util.*;
import java.time.Instant;
import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args) {


        long startTimeA = Instant.now().toEpochMilli();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (long i=0;i<10000000;i++)
        {
            list.add(0);
        }
        long endTime = Instant.now().toEpochMilli();

        long timeElapsed = endTime - startTimeA;

        System.out.println("Время выполнения ArrayList : " + timeElapsed);


            long startTime1 = Instant.now().toEpochMilli();
        LinkedList<Integer> a = new LinkedList<>();
        for (long i=0;i<10000000;i++)
        {
            a.add(0);
        }
        long endTime1 = Instant.now().toEpochMilli();

        long timeElapsed1 = endTime1 - startTime1;
        System.out.println("Время выполнения LinkedList : " + timeElapsed1);
    }


}
