import java.util.ArrayList;

public class Counter<T> {
    ArrayList<T> list = new ArrayList<T>();

    public void add(T objekt){
        list.add(objekt);
    }
    public int getCount(){
        return list.size();
    }
}
