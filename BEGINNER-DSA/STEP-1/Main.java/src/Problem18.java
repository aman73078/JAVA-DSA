// https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Problem18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<n; i++){
            arr.add(scanner.nextInt());
            int g = hashMap.getOrDefault(arr.get(i), 0);
            hashMap.put(arr.get(i), g+1);
        }
        int noOfPair = 0;
        for(Integer key: hashMap.keySet()){
            noOfPair += Math.abs(hashMap.get(key)/2);
        }
        System.out.println(noOfPair);
    }
}
