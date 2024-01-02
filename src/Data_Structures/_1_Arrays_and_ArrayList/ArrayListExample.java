package Data_Structures._1_Arrays_and_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(74);
//        list.add(97);
//        list.add(57);
//
//        System.out.println(list);
//        System.out.println(list.contains(97));
//        list.set(0, 99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        System.out.println("Enter numbers: ");
        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }

        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);

    }
}
