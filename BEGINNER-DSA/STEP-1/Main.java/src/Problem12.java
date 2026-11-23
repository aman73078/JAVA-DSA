// https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();

        String result = isSameLocation(x1,v1,x2,v2);
        System.out.println(result);
    }

    static String isSameLocation(int x1, int v1, int x2, int v2){
        if(v1 > v2 && (x2-x1) % (v1-v2) == 0){
            return "Yes";
        }
        return "No";
    }
}
