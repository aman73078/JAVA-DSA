// https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem16 {
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
        int maxFreqType = arr.get(0);
        for(int type: hashMap.keySet()){
            if(hashMap.get(type) > hashMap.get(maxFreqType)){
                maxFreqType = type;
            }
        }
        System.out.println(maxFreqType);
    }
}
