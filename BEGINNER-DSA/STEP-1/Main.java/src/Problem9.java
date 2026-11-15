// Problem 9
// https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
// https://ideone.com/Bor2KH

import java.io.*;
import java.util.Scanner;

public class Problem9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();

        String convertedTime = convertTimeInto24Hours(time);
        System.out.println(convertedTime);
    }

    static String convertTimeInto24Hours(String time){
        String extractedTime = time.substring(0,8);
        String[] portion = extractedTime.split(":");
        String result = "";
        if(time.charAt(8) == 'P'){
            if(portion[0].equals("12")){
                result += portion[0] + ":"+portion[1]+":"+portion[2];
            }else{
                result += String.valueOf(Integer.parseInt(portion[0])+12) + ":"+portion[1]+":"+portion[2];
            }
        }else{
            if(portion[0].equals("12")){
                result += "00:"+portion[1]+":"+portion[2];
            }else{
                result += portion[0]+":"+portion[1]+":"+portion[2];
            }
        }
        return result;
    }
}