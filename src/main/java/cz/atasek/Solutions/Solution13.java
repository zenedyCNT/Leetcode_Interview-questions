package cz.atasek.Solutions;
/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution13 {
    public int romanToInt(String s) {
        int output = 0;
        Character lastChar = Character.MAX_VALUE;
        char[] romanIndividual = s.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();

        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        for (int i = 0; i < romanIndividual.length;i++)
        {

            String loopCharacters = "" + lastChar + romanIndividual[i];
            switch (loopCharacters)
            {
                case "IV" :
                case "IX":
                case "XL":
                case "XC":
                case "CD":
                case "CM": output += hashMap.get(romanIndividual[i]) -  hashMap.get(lastChar) - hashMap.get(lastChar) ;
                    break;

                default: output += hashMap.get(romanIndividual[i]);
            }


            lastChar = romanIndividual[i];
        }

        return output;
    }
}
