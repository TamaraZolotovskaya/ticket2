import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

//Напишите Java-программу для итерации объекта типа HashMap
// с использованием цикла while и улучшенного цикла for.

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
        }


        for (Map.Entry entry : map.entrySet()) {
            System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
        }


    }

}