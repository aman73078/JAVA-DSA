// Problem 7
// https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
// https://ideone.com/JlS2Uv

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Problem7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 5;
        ArrayList<Long> arr = new ArrayList<Long>();
        long sum = 0;
        for(int i = 0; i<n; i++){
            arr.add(scanner.nextLong());
        }

        //        arr.sort((a,b) -> a - b);  ----> Dynamic Array

        Collections.sort(arr);      // ----------> Dynamic Array

        //        Arrays.sort(arr) --> Fixed Array

        for(int i=0; i<arr.size(); i++){
            sum += arr.get(i);
        }

        long maximum = sum - arr.get(0);
        long minimum = sum - arr.get(arr.size()-1);
        System.out.println(minimum+" "+maximum);
    }
}
