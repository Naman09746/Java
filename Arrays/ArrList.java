import java.util.ArrayList;
import java.util.Scanner;
public class ArrList {
    public static void main(String[] args) {
        //Syntax = ArrayList<integer>=new ArrayList<>

        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in= new Scanner(System.in);
        list.add(12);
        list.add(412);
        list.add(12);
        list.add(4112);
        list.add(112);
        list.add(4412);
        list.add(512);
        list.add(3412);

        list.set(0,99);//set 0th index as 99
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

         //for input
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        //for get item at any index
        for (int i=0;i<5;i++){
            System.out.println(list.get(i)); //List[index] do not work here
        }

        System.out.println(list);
    }

}
