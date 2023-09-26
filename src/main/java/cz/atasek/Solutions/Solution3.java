package cz.atasek.Solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {

        int finalLength =0;
        int currentLength = 0;
        char [] stringCharacters = s.toCharArray();
        List<Character> substring = new ArrayList<>();

        for (int i = 0; i < stringCharacters.length; i++)
        {
             if (substring.contains(stringCharacters[i]))
                 {
                     if (substring.get(substring.size()-1) == stringCharacters[i])
                     {
                         substring.clear();
                     }
                    System.out.println("New substring" + String.valueOf(substring));



                    substring.add(stringCharacters[i]);
                 }
             else
                 {
                     substring.add(stringCharacters[i]);
                     System.out.println("added new character: " + String.valueOf(stringCharacters[i]));

                 }
            currentLength = substring.size();
            finalLength = Math.max(currentLength, finalLength);
        }


        System.out.println(String.valueOf(finalLength) + " Lenght");
        return  finalLength;
    }
}
