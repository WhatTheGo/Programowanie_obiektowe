import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Zestaw5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);

        ArrayList<Integer> numbers_joined = append(numbers1, numbers2);
        System.out.println("Zad1");
        System.out.println(numbers_joined);
        System.out.println("Zad2");
        System.out.println(merge(numbers1, numbers2));
        System.out.println("Zad4");
        ArrayList<Integer> zad4Array = toArrayList("Hello World");
        System.out.println(zad4Array);
        System.out.println("Zad7");
        System.out.println(uniqueArrayList(numbers_joined));
        System.out.println("Zad8");
        System.out.println(countArrayList(zad4Array));
    }

    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        for (int i = 0; i < tab2.size(); i++) {
            tab1.add(tab2.get(i));
        }
        return tab1;
    }

    // excess dodaj reszte a nie cała tablice
    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        int n = 0;
        ArrayList<Integer> excess = new ArrayList<>();
        if (tab1.size() > tab2.size()) {
            n = tab2.size();
            excess = tab2;
        }
        else {
            n = tab1.size();
            excess = tab1;
        }
        ArrayList<Integer> mergedArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            mergedArray.add(tab1.get(i));
            mergedArray.add(tab2.get(i));
        }

        mergedArray.addAll(excess);
        return mergedArray;
    }

    public static ArrayList<Integer> toUniqueArray(ArrayList<Integer> tab) {
        int n = tab.size();
        int j;
        ArrayList<Integer> uniqueArray = new ArrayList<>();
        uniqueArray.add(tab.getFirst());
        for (int i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (Objects.equals(tab.get(i), tab.get(j))) {
                    break;
                }
            }
            if (j == i) {
                uniqueArray.add(tab.get(i));
            }
        }
        return uniqueArray;
    }

    public static int occurenceCounter (ArrayList<Integer> tab, int k) {
        int counter = 0;
        for (Integer integer : tab) {
            if (integer == k) {
                counter++;
            }
        }
        return counter;
    }

    public static ArrayList<ArrayList<Integer>> uniqueArrayList(ArrayList<Integer> tab) {
        ArrayList<ArrayList<Integer>> uniqueArrayList = new ArrayList<>();
        ArrayList<Integer> uniqueTab = toUniqueArray(tab);

        for (int i = 0; i < uniqueTab.size(); i++) {
            uniqueArrayList.add(new ArrayList<>());
            uniqueArrayList.get(i).add(uniqueTab.get(i));
            uniqueArrayList.get(i).add(0);
        }
        return uniqueArrayList;
    }

    public static ArrayList<ArrayList<Integer>> countArrayList(ArrayList<Integer> tab) {
        ArrayList<ArrayList<Integer>> uniqueArrayList = new ArrayList<>();
        ArrayList<Integer> uniqueTab = toUniqueArray(tab);

        for (int i = 0; i < uniqueTab.size(); i++) {
            uniqueArrayList.add(new ArrayList<>());
            uniqueArrayList.get(i).add(uniqueTab.get(i));
            uniqueArrayList.get(i).add(occurenceCounter(tab, uniqueTab.get(i)));
        }
        return uniqueArrayList;
    }

    public static ArrayList<Integer> toArrayList(String napis) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int len = napis.length();
        char character;
        for (int i = 0; i < len; i++) {
            character = napis.charAt(i);
            arrayList.add((int) character);
        }

        Collections.sort(arrayList);
        return arrayList;
    }
}
