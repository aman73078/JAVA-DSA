import java.util.Scanner;

public class PatternLecture3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int rows = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int cols = scanner.nextInt();
        pattern1(rows);
        pattern2(rows);
    }

    /*
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
B C
C D E
D E F G
     */

    public static void pattern1(int rows){

        for(int row=0; row<rows; row++){
            for(int col=0; col<=row; col++){
                char uppercase = (char) ('A' + row + col);
                System.out.print(uppercase+" ");
            }
            System.out.println();
        }
    }

    /*
Q2.Print the following pattern for the given number of rows.
Pattern for N = 5
E
D E
C D E
B C D E
A B C D E
*/

    public static void pattern2(int rows){
        for(int row=0; row<rows; row++){
            for(int col=0; col<=row; col++){
                char uppercase = (char) ('A' + (rows-row-1) + col);
                System.out.print(uppercase + " ");
            }
            System.out.println();
        }
    }
}
