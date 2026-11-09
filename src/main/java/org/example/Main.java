package org.example; // У тебя здесь, скорее всего, org.example

import com.example.reverseletters.util.StringUtil;

public class Main {
    public static void main(String[] args) {
        String beforeReverseLetter = "J@va the be$t!123";

        StringUtil stringUtil = new StringUtil();

        String afterReverseLetter = stringUtil.reverseLetters(beforeReverseLetter);

        System.out.println(afterReverseLetter);
    }
}