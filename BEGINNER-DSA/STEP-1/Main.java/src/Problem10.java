import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> originalGrade = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            originalGrade.add(scanner.nextInt());
        }
        ArrayList<Integer> finalGrade = gradingStudents(originalGrade);
        for(int i=0; i<finalGrade.size(); i++){
            System.out.println(finalGrade.get(i));
        }
    }

    static ArrayList<Integer> gradingStudents(ArrayList<Integer> originalGrade){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<originalGrade.size(); i++){
            int num = originalGrade.get(i);
            if(num>= 38 && num%5>=3){
                num = num+5-num%5;
            }
            result.add(num);
        }
        return result;
    }
}
