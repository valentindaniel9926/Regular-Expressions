package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I" , "You");
        System.out.println(yourString);
        String alphanumeric =  "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));
        String secondString =  "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee","YYY"));
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiijkl99z"));
        System.out.println(alphanumeric.replaceAll("ijkl99z$","THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]","X"));
        System.out.println(alphanumeric.replaceAll("[aei]","I replaced a letter here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));
        System.out.println("Harry".replaceAll("[Hh]arry","Harry"));

        String newAlphanumeric =  "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]","X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]","X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]","X"));
        System.out.println(newAlphanumeric.replaceAll("\\d","X"));
        System.out.println(newAlphanumeric.replaceAll("\\D","X"));

        String hasWhiteSpace = "I have blanks and\ta tab, and also a new line\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\S",""));
        System.out.println(hasWhiteSpace.replaceAll("\\w","X"));
        System.out.println(alphanumeric.replaceAll("\\w","X"));
        System.out.println(hasWhiteSpace.replaceAll("\\W","X"));
        System.out.println(hasWhiteSpace.replaceAll("\\b","X"));

        String thirdAlphaNumericString ="abcDeeeF12Ghhiiiijkl99z";

        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe{3}","YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe+","YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe*","YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("^abcDe{2,5}","YYY"));
        System.out.println(thirdAlphaNumericString.replaceAll("h+i*j", "y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something. </p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<.*h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

    }
}

