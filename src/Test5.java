import java.util.Arrays;

public class Test5 {

    public static void main(String[] args) {
        // arr = [8,7,5,4,7,9]
        //add 10 in the middle of the array
        int[] arr = {8,7,5,4,7,9};
        int element = 10;
        int positon = arr.length / 2;
        int[] newArr = new int[arr.length + 1];

        for(int i = 0; i < positon ; i++){
            newArr[i] =arr[i];
        }
        newArr[positon] = element;

        for(int i = positon ; i < arr.length ; i++){
            newArr[i + 1] = arr[i];
        }
        System.out.println("arr = "+ Arrays.toString(arr));
        System.out.println("newArr = "+ Arrays.toString(newArr));
    }

}
