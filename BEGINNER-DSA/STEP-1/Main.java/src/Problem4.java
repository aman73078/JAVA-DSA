import java.util.*;

public class Problem4 {
    static int diagonalDifference(ArrayList<ArrayList<Integer>> array2d){
        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for(int i=0; i<array2d.size(); i++){
            for(int j=0; j<array2d.get(0).size(); j++){
                if(i == j){
                    leftDiagonal += array2d.get(i).get(j);
                }

                if(i+j == array2d.size()-1){
                    rightDiagonal += array2d.get(i).get(j);
                }
            }
        }

//       ---------------- OR ---------------
//        for(int i=0; i<array2d.size(); i++){
//            leftDiagonal += array2d.get(i).get(i);
//            rightDiagonal += array2d.get(i).get(array2d.size() - 1 - i);
//        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> array2d = new ArrayList<>();

        for(int i=0; i<n; i++){
            ArrayList<Integer> innerArray = new ArrayList<>();
            for(int j=0; j<n; j++){
                innerArray.add(scanner.nextInt());
            }
            array2d.add(innerArray);
        }

        int difference = diagonalDifference(array2d);
        System.out.println(difference);
    }
}
