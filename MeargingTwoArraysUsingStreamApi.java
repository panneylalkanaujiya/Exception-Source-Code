import java.util.Arrays;
import java.util.stream.IntStream;

public class MeargingTwoArraysUsingStreamApi {
    public static void main(String args[])
    {
        int [] arr1= {12,32,3,44,5,56,67};
        int[] arr2={11,5,56,77,7,77,7334};
        int[] arr3= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(arr3));

    }
}
