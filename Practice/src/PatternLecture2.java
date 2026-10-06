import java.util.Scanner;

public class PatternLecture2 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int rows = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int cols = scanner.nextInt();

        pattern3(rows);
        pattern4(rows);
    }

/*
Question 1.
for n=3
pattern is
1
2 2
3 3 3
    * */

    public static void pattern3(int rows){
        for(int row=1; row<=rows; row++){
            for(int col=1; col<=row; col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }

/*
Print the following pattern for the given N number of rows.
Pattern for N = 3
A
BB
CCC
 */

    public static void pattern4(int rows){
        for(int row=0; row<rows; row++){
            for(int col=0; col<=row; col++){
                char line = (char) ('A' + row);
                System.out.print(line+" ");
            }
            System.out.println();
        }
    }

}
