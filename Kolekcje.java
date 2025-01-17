import java.util.*;


public class Kolekcje {
    public static <T> void printUnique(Collection<T> items){
        Set<T> uniqueElements = new HashSet<>(items);
        for (T item : uniqueElements) {
            System.out.println(item);
        }
    }

    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2){
        ArrayList<T> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    public static <T extends Comparable<T>> TreeSet<T> findElementInRange(TreeSet<T> set, T lowerBound, T upperBound){
        TreeSet<T> newSet = new TreeSet<>();
        for (T element : set) {
            if (element.compareTo(lowerBound) >= 0 && element.compareTo(upperBound) <= 0)
                newSet.add(element);
        }

        return newSet;
    }

    public static <T> boolean isPalindrome(LinkedList<T> list){
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            if (list.get(i) != list.get(n - 1 - i))
                return false;
        }
        return true;
    }

    public static <T> Set<T> findUniqueElements(List<T> list){
        return new HashSet<>(list);
    }

    public static <T> HashMap<T, Integer> countValueOccurences(HashMap<T, T> map){
        HashMap<T, Integer> occurrences = new HashMap<>();
        for(T element: map.values()){
            occurrences.put(element, occurrences.getOrDefault(element, 0) + 1);
        }
        return occurrences;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        //printUnique(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("1");
        list2.add("2");
        //printUnique(list2);

        TreeSet<String> set1 = new TreeSet<>(list2);
        TreeSet<String> set2;
        set2 = findElementInRange(set1, "2", "4");
        System.out.println(set2 + "\n");


        TreeSet<Integer> set3 = new TreeSet<>(list);
        TreeSet<Integer> set4;
        set4 = findElementInRange(set3, 2, 4);
        System.out.println(set4 + "\n");

        LinkedList<Integer> linkedList = new LinkedList<>(list);
        System.out.println(linkedList);
        System.out.println(isPalindrome(linkedList) + "\n");

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("1", "asd");
        map1.put("2", "asd");
        map1.put("3", "bvc");
        map1.put("4", "fdfdf");
        HashMap<String, Integer> mapOccurences = countValueOccurences(map1);
        System.out.println(mapOccurences);
    }
}