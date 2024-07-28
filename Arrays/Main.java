//objects are in heap memory
//heap objects are not continuous
//Dynamic memory allocation
//array object in java may not be continuous it depends on jvm
//by default all reference variable point to null

public class Main{
    public static void main(String[] args) {
//        int[] rollno= new int[5];

        //directly
//        int[] rno={23,6,65,8,56};

        //int[](datatype), arr(reference variable) ,{this happens at COMPILE TIME}
        // new(new is used to create an object) int[5] (creating the object in heap memory at RUNTIME and this is known as dynamic memory allocation)
        int[] arr;//declaration of array, ros is getting defined in the stack
        arr= new int[5];//Initialisation, actually here object is being created in heap memory
        System.out.println(arr[1]);

        String[] var= new String[4];
        System.out.println(var[1]);
    }

}