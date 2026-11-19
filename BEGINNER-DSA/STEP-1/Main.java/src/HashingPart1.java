import java.io.*;
import java.util.Scanner;

public class HashingPart1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] hash = new int[51];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
            hash[arr[i]] = hash[arr[i]] + 1;
        }


        int q = scanner.nextInt();
        for(int i=0; i<q; i++){
            System.out.println(hash[scanner.nextInt()]);
        }
    }
}
