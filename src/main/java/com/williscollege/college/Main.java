package com.williscollege.college;

import java.util.List;

public class Main {
    //Main Function
    public static void main(String[] args) throws Exception {
        //Instantiate WordGenerator Class
        WordGenerator wg = new WordGenerator();

        //VK lines text filename
        String textFilename = "textFile.txt";

        //Gather VK Lines from text file
        List<String> textFileLines = wg.getLines(textFilename);

        //Create word document according to VK lines
        wg.createWord(textFileLines);
    }
}
