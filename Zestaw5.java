import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Zestaw5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(9);
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
        System.out.println("Zad3");
        System.out.println(mergeSorted(numbers1, numbers2));
        System.out.println("Zad4");
        ArrayList<Integer> zad4Array = toArrayList("Hello World");
        System.out.println(zad4Array);
        System.out.println("Zad5");
        System.out.println(checkDigit(zad4Array, 5));
        System.out.println("Zad6");
        System.out.println(countDigit(zad4Array, 5));
        System.out.println("Zad7");
        System.out.println(uniqueArrayList(numbers_joined));
        System.out.println("Zad8");
        System.out.println(countArrayList(zad4Array));
    }

    public static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> mergedArray = new ArrayList<>();
        mergedArray.addAll(tab1);
        mergedArray.addAll(tab2);
        return mergedArray;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> mergedArray = new ArrayList<>();
        int i = 0, n1 = tab1.size(), n2 = tab2.size();

        while (i < n1 && i < n2) {
            mergedArray.add(tab1.get(i));
            mergedArray.add(tab2.get(i));
            i++;
        }
        while (i < n1)
        {
            mergedArray.add(tab1.get(i));
            i++;
        }
        while (i < n2)
        {
            mergedArray.add(tab2.get(i));
            i++;
        }
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

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> mergedArray = new ArrayList<>();
        mergedArray.addAll(tab1);
        mergedArray.addAll(tab2);
        Collections.sort(mergedArray);
        return mergedArray;
    }

    public static boolean checkDigit (ArrayList<Integer> tab, int cyfra)
    {
        for (Integer integer : tab) {
            if (integer == cyfra) {
                return true;
            }
        }
        return false;
    }

    public static int countDigit (ArrayList<Integer> tab, int cyfra)
    {
        int counter = 0;
        for (Integer integer : tab) {
            if (integer == cyfra) {
                counter++;
            }
        }
        return counter;
    }
}
