import java.util.Scanner;

public class PatternLecture1 {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int rows = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int cols = scanner.nextInt();

        pattern1(rows,cols);
        pattern2(rows);
    }

    /*
1.create  the given pattern
000000
000000
000000
000000
    * */
    public static void pattern1(int rows, int cols){
        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                System.out.print("0");
            }
            System.out.println();
        }
    }

    /*
* 2.create the given pattern
0
00
000
0000
*/
    public static void pattern2(int rows){
        for(int row=0; row<rows; row++){
            for(int col=0; col<=row; col++){
                System.out.print("0");
            }
            System.out.println();
        }
    }
}