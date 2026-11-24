// https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true
import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int totalFipl = Math.abs(n/2);
        int flipFromFirstPage = p/2;
        int flipFromLastPage = totalFipl - flipFromFirstPage;
        System.out.println(Math.min(flipFromFirstPage, flipFromLastPage));
    }
}
