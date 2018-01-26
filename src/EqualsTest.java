import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EqualsTest {

    /*String a = "text";
    String b = "teXt";
    String c = "teXt";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsTest that = (EqualsTest) o;
        return Objects.equals(a, that.a) &&
                Objects.equals(b, that.b) &&
                Objects.equals(c, that.c);
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b, c);
    }

    public void show() {

        if (a == b && b == c) {
            System.out.println("pierwszy jest ok");
        } else {
            System.out.println("pierwszy nie jest ok");
        }

        if (a.equals(b) && b.equals(c)) {
            System.out.println("drugi jest ok");
        } else {
            System.out.println("drugi nie jest ok");
        }

        if (b.equals(c)) {
            System.out.println("trzeci jest ok");
        } else {
            System.out.println("trzeci nie jest ok");
        }
    }

    public void builder() {


        String s1 = "a#b#c";
        String[] s1Array = s1.split("#");
        System.out.println(s1Array.length);
        for (int i = 0; i < s1Array.length; i++) {
            System.out.println(s1Array[i]);
        }

    }

    public void fillTable(int x) {

        int[] array = new int[x];

        int rand;

        for (int i = 0; i < x; i++) {
            rand = (int) (Math.random()) * 10;
            array[i] = rand;
            System.out.println(array[i]);
        }

        int range = 5;
    }

    public void fillMap() {

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 4;

        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";

        Map<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(a, s1);
        mapa.put(b, s2);
        mapa.put(c, s2);
        mapa.put(c, s3);
        mapa.put(d, s4);


        for (Integer key : mapa.keySet()) {
            System.out.println(key);
        }
        for (String key : mapa.values()) {
            System.out.println(key);
        }
        for (Integer key : mapa.keySet()) {
            System.out.println(mapa.keySet());
        }
        for (Integer key : mapa.keySet()) {

            System.out.println(key);
            System.out.println(mapa.get(key));
        }*/




}



