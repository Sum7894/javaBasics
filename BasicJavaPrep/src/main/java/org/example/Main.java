package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String inputSt = sin.nextLine();
        Main m = new Main();
        m.countOcc(inputSt);
        m.countWords(inputSt);

    }

    /** Count occurrences of charcters in a string
     * for eg : ababeu -  a = 2 , b = 2, e = 1, u = 1
     *
     * **/
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

    /** Count occurrences of words in a string using HashMap
     * for eg :   Input: ab cd ab
     *              O/P: - Occurrences of Words: ab = 2, cd = 1
     *
     * **/
    public void countWords(String str){
        String[] wordsArr = str.split(" ");
        Map<String, Integer> counterMap = new HashMap<>();
        for(String st : wordsArr ){
            if(counterMap.containsKey(st)) {
                int count = counterMap.get(st);
                counterMap.put(st, count + 1);
            } else{
                counterMap.put(st,1);
            }
        }

        System.out.println("Occurrences of Words in String : "+counterMap);
    }
}