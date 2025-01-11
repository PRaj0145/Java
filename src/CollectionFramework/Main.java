package CollectionFramework;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList();
        List.add(25);
        List.add(85);
        List.add(90);
        List.add(10);
        List.add(20);

        List.set(2,50); // Replace the new element in index


       // List.trimToSize();// trim the array capacity (reduce the size)
//       List.remove(3); // Remove the element
//
//      List.add(2,45); // insert the element in index .
//
//


//        System.out.println(List.get(4));
//   System.out.println(List.size());
//
       // for(int i=0; i<List.size(); i++){
            //System.out.println(List.get(i));


        for(int x : List){

        System.out.println(x);

        }
//        System.out.println(List.contains(20));  // show the element exist or not in list.
//        System.out.println(List.contains(100));

    }

}