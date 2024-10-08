package com.permutation_in_string_567;
import java.util.*;
public class solution {
    public static boolean permutation_String(String s1, String s2){
        if(s1.length() > s2.length()) return false;
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        //Count the frequency of characters in s1 and the first window of s2
        for(int i = 0; i < s1.length(); i++){
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        //slide the window over s2
        for(int i = 0; i < s2.length() - s1.length(); i++){
            if(matches(s1Count, s2Count)) return true;
            s2Count[s2.charAt(i) - 'a']--;
            s2Count[s2.charAt(i + s1.length()) - 'a']++;
        }
        return matches(s1Count, s2Count);
    }
    private static boolean matches(int[] s1Count, int[] s2Count){
        for(int i = 0; i < 26; i++){
            if(s1Count[i] != s2Count[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbtaooo";
        System.out.println(permutation_String(s1, s2));
    }
}
