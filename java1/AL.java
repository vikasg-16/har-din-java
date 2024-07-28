import java.util.*;
import java.util.ArrayList;

public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add operation
        list.add(2);
        list.add(5);
        list.add(1, 7);
        System.out.println(list);

        //get operation
        int ele1 =list.get(0);
        System.out.println(ele1);

        //set operation
        list.set(0, 9);

        System.out.println(list);

        //delete operation
        list.remove(0);
        System.out.println(list);

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //size 
        int size=list.size();
        System.out.println(size);

        //loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
    
}
