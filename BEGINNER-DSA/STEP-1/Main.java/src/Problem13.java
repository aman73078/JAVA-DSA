// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];

        for(int i=0; i<n; i++){
            scores[i] = scanner.nextInt();
        }
        int maxInteger = scores[0];
        int minInteger = scores[0];
        int maxIntegerCount = 0;
        int minIntegerCount = 0;
        for(int i=0; i<scores.length; i++){
            if(scores[i] > maxInteger){
                maxInteger = scores[i];
                maxIntegerCount++;
            }
            if(scores[i]<minInteger){
                minInteger = scores[i];
                minIntegerCount++;
            }
        }
        System.out.println(maxIntegerCount+" "+minIntegerCount);
    }
}
