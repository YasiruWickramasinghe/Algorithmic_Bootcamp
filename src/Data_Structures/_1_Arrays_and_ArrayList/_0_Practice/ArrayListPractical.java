package Data_Structures._1_Arrays_and_ArrayList._0_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractical {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(15);
        arrayList.add(25);
        arrayList.add(35);
        arrayList.add(45);
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);

        arrayList.set(1,95);
        System.out.println(arrayList);
        System.out.println(arrayList);

        System.out.println(arrayList.contains(45));

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        for (int i=0; i<=5; i++ ){
            arrayList.add(sc.nextInt());
        }

        for (int i=0; i<=5; i++ ){
            System.out.println(arrayList.get(i));
        }
    }
}
