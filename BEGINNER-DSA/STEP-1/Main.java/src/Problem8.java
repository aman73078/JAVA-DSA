// Problem 8
// https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
// https://ideone.com/9qgpjx

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Problem8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int count = countOfCandles(arr);
        System.out.println(count);
    }

    static int countOfCandles(int[] arr){
        int tallest = arr[arr.length-1];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            count += tallest == arr[i] ? 1 : 0;
        }
        return count;
    }
}