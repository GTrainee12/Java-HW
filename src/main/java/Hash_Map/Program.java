package Hash_Map;
import java.util.Iterator;

public class Program {

    public static void main(String[] args) {
        System.out.println(-7 % 4);

        HM_new<String, String> hashMap1 = new HM_new<>(4);

        String ret = hashMap1.put("+79001112233", "Андрей");
        ret = hashMap1.put("+79001112232", "Василий");
        ret = hashMap1.put("+79001112234", "Александр1");
        ret = hashMap1.put("+79001112235", "Александр2");
        ret = hashMap1.put("+79001112236", "Александр3");
        ret = hashMap1.put("+79001112237", "Александр4");
        ret = hashMap1.put("+79001112212", "Александр4");
        ret = hashMap1.put("+79001112213", "Александр4");
        ret = hashMap1.put("+79001112214", "Александр4");

        //ret = hashMap1.get("+79001112233");

        //ret = hashMap1.remove("+79001112233");
        //ret = hashMap1.remove("+79001112233");

        //ret = hashMap1.get("+79001112233");

    }
}
