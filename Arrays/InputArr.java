import java.util.Arrays;
import java.util.Scanner;
public class InputArr {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr= new int[5];
//        arr[0]=23;
//        arr[1]=42;
//        arr[3]=31;
//        arr[4]=341;
//        System.out.println(arr[2]);

        //input using for loops
//        for(int i=0;i<arr.length;i++){
//            arr[i]= in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+ " ");
//        }
//
//        for(int num:arr){
//            System.out.println(num + " ");
//        }

        //arrays of objects
        String[] str= new String[5];
        for(int i=0 ;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
