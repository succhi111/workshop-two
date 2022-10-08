import java.util.*;

public class ArraySort {

    static void printOrder(int[] arr, int n) {

        Arrays.sort(arr);
        for (int j = n - 1; j >= n / 2; j--)

             System.out.print(arr[j] + " ");

        for (int i = 0; i < n / 2; i++)

              System.out.print(arr[i] + " ");

    }
    public static void main(String[] args){

            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int n = arr.length;
            printOrder(arr , n);

        }
    }
