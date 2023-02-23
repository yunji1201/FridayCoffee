package com.fridayCoffee._43_morse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Morse {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
//        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(solution.solution(".--. -.-- - .... --- -."));
    }
}

class Solution {
    public String solution(String letter) {
        String answer = "";
        ArrayList strAnswer = new ArrayList<>();
        String[] morse = {".--.", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (String s : letter.split(" ")) {
            for (int i = 0; i < morse.length; i++) {
                if (s.equals(morse[i])) {
                    answer += (char) (((Integer) i).intValue() + 97);
                }
            }
        }
//        strAnswer.stream(e -> (char)e+97).collect(Collectors.joining());
        return answer;
    }
}

class Solution2 {
    public String solution(String letter) {
        String morseStr = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',"
                + "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',"
                + "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',"
                + "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',"
                + "'-.--':'y','--..':'z'";
        String[] morseArr = morseStr.split(",");
        String[] letterArr = letter.split(" ");
        HashMap<String, String> morse = new HashMap<String, String>();

        for (int i = 0; i < morseArr.length; i++) {
            morseArr[i] = morseArr[i].replace("'", "");
            int idx = morseArr[i].indexOf(":");
            morse.put(morseArr[i].substring(0, idx), morseArr[i].substring(idx + 1));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letterArr.length; i++) {
            sb.append(morse.get(letterArr[i]));
        }
        return sb.toString();
    }
}


class Solution3 {
    public String solution(String letter) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String[] s = letter.split(" ");

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (s[i].equals(morse[j])) {
                    answer.append((char) (j + 'a'));
                    break;
                }
            }
        }
        return answer.toString();
    }
}


class Solution4 {
    Map<String, String> dictionary = new HashMap<>() {{
        put(".-", "a");
        put("-...", "b");
        put("-.-.", "c");
        put("-..", "d");
        put(".", "e");
        put("..-.", "f");
        put("--.", "g");
        put("....", "h");
        put("..", "i");
        put(".---", "j");
        put("-.-", "k");
        put(".-..", "l");
        put("--", "m");
        put("-.", "n");
        put("---", "o");
        put(".--.", "p");
        put("--.-", "q");
        put(".-.", "r");
        put("...", "s");
        put("-", "t");
        put("..-", "u");
        put("...-", "v");
        put(".--", "w");
        put("-..-", "x");
        put("-.--", "y");
        put("--..", "z");
    }};

    public String solution(String letter) {
        return Arrays.stream(letter.split(" "))
                .map(dictionary::get)
                .collect(Collectors.joining());
    }
}


class Solution5 {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] word = letter.split(" ");

        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (word[i].equals(morse[j])) answer += (char) (j + 97);
            }
        }
        return answer;
    }
}