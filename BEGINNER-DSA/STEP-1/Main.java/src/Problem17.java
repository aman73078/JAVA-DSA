// https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> bill = new ArrayList<>();
        for(int i=0; i<n; i++){
            bill.add(scanner.nextInt());
        }
        int bCharged = scanner.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            if(i != k){
                sum += bill.get(i);
            }
        }
        int bActual = sum/2;
        int overCharged = bCharged-bActual;
        if(overCharged > 0){
            System.out.println(overCharged);
        }else{
            System.out.println("Bon Appetit");
        }
    }
}
