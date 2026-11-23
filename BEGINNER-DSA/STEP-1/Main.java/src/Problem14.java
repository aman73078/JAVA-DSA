// https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            arr.add(scanner.nextInt());
        }
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;

        for(int i=0; i<arr.size(); i++){
            int sum = 0;
            int length_count = 0;
            for(int j=i; j<j+m; j++){
                if(j >= arr.size() || sum>=d){
                    break;
                }

                sum = sum + arr.get(j);
                length_count++;
            }
            if(sum==d && m==length_count){
                count++;
            }
        }
        System.out.println(count);
    }
}
