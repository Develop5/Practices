package com.simpleExamples;

public class JumbleText {

    public static void main(String[] args) {
        String jumbleString = "HelloI'mHereAndNoDoubt";
        createLogicalString(jumbleString);
    }

    /**
     * This method separate words in an original string by
     * inserting a space before each uppercase letter, except the first one
     * @param myJumbleString String object that contains all words together
     */
    private static void createLogicalString(String myJumbleString) {
        var simpleText = new StringBuilder(myJumbleString);
        for (int i = 0; i < simpleText.length() ; i++) {
            if( i != 0 && Character.isUpperCase(simpleText.charAt(i))) {
                simpleText.insert(i, " ");
                i++;
            }
        }
        System.out.println("Original text = " + myJumbleString);
        System.out.println("Final text = " + simpleText);

    }


}
