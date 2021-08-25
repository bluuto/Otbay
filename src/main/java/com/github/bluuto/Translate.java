package com.github.bluuto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Translate {
    public void translator(String[] s, char c) {
        for (String element : s){
            if (element.equals(s[0])){
                System.out.print(capitalize(pigLatin(element.toLowerCase(), element.length())) + " ");
            }
            else if (element.equals(s[s.length - 1])){
                System.out.print(pigLatin(element.toLowerCase(), element.length()) +
                        c);
            }
            else {
                System.out.print(pigLatin(element.toLowerCase(), element.length()) + " ");
            }
        }
    }

    public String pigLatin (String s, int length){
        // Regex for vowels
        Pattern vowels = Pattern.compile("[aeiouAEIOU]");
        // Matchers/booleans check if first or last letters are vowels
        Matcher firstLetter = vowels.matcher(s.substring(0, 1)),
                lastLetter = vowels.matcher(s.substring(length-1, length));
        boolean firstLetterCheck = firstLetter.matches(),
                lastLetterCheck = lastLetter.matches();

        // If word begins with a vowel
        if (firstLetterCheck){
            // And word ends in vowel or is 'I'/'a'
            if (length == 1 || lastLetterCheck){
                return s + "yay";
            }
            // And word ends in consonant
            else {
                return s + "ay";
            }
        }
        // If word ends with a consonant
        else {
            return consonantTranslate(s);
        }
    }

    public String consonantTranslate(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.append(sb.charAt(0)).append("ay");
        sb.deleteCharAt(0);

        return sb.toString();
    }

    public String capitalize (String s){
        s = s.substring(0, 1).toUpperCase() + s.substring(1);
        return s;
    }

}