// Problem 11
// https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Problem11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        ArrayList<Integer> d1 = new ArrayList<>();
        ArrayList<Integer> d2 = new ArrayList<>();
        int appleInsideHouse = 0;
        int orangeInsideHouse = 0;

        for(int i=0; i<m; i++){
            d1.add(scanner.nextInt());
        }

        for(int i=0; i<n; i++){
            d2.add(scanner.nextInt());
        }

        for(int i=0; i<d1.size(); i++){
            int dist = a + d1.get(i);
            if(dist >= s && dist <= t){
                appleInsideHouse++;
            }
        }

        for(int i=0; i<d2.size(); i++){
            int dist = b + d2.get(i);
            if(dist >= s && dist <= t){
                orangeInsideHouse++;
            }
        }
        System.out.println(appleInsideHouse);
        System.out.println(orangeInsideHouse);
    }
}