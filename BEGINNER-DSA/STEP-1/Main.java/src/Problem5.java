// Problem 5
// https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
// https://ideone.com/edeSkP

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Problem5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n = scanner.nextInt();
        float pos = 0;
        float neg = 0;
        float zero = 0;
        for(int i=0; i<n; i++){
            arr.add(scanner.nextInt());
        }

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > 0){
                pos++;
            }else if(arr.get(i) < 0){
                neg++;
            }else{
                zero++;
            }
        }
        pos/=arr.size();
        neg/=arr.size();
        zero/=arr.size();
        System.out.println(String.format("%.6f",pos));
        System.out.println(String.format("%.6f",neg));
        System.out.println(String.format("%.6f",zero));
    }
}

