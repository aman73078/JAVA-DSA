// PROBLEM LINK:- https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
// https://ideone.com/t2hVnL

import java.io.*;
import java.util.Scanner;

public class Problem6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int row=0; row<n; row++){
            for(int col=0; col<n-1-row; col++){
                System.out.print(" ");
            }
            for(int col=0; col<=row; col++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
