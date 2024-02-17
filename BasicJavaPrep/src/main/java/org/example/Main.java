package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** Count occurrences of charcters in a string
 * for eg : ababeu -  a = 2 , b = 2, e = 1, u = 1
 *
 * **/



public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String inputSt = sin.nextLine();
        Main m = new Main();
        m.countOcc(inputSt.trim());

    }

    public void countOcc(String str){
        Map<Character, Integer> counterMap = new HashMap<>();
        char[] chArr = str.toCharArray();

        for(char ch : chArr){
            if(counterMap.containsKey(ch)) {
                int prev = counterMap.get(ch);
                counterMap.put(ch, prev+1);
            }else{
                counterMap.put(ch,1);
            }
        }
         counterMap.remove(' ');
         System.out.println("MAP  : "+counterMap);
    }
}