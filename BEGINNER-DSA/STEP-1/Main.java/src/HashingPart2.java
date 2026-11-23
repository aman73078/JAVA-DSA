import java.util.Scanner;
import java.util.HashMap;

public class HashingPart2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, Integer> hasMap = new HashMap<>();
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
            int g = hasMap.getOrDefault(arr[i], 0);
            hasMap.put(arr[i], g + 1);
        }
        int q = scanner.nextInt();
        for(int i=0; i<q; i++){
            int query = scanner.nextInt();
            int count = hasMap.getOrDefault(query, 0);
            System.out.println(count);
        }
    }
}
