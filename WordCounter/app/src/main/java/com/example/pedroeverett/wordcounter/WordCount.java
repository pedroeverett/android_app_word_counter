package com.example.pedroeverett.wordcounter;

/**
 * Created by pedroeverett on 04/07/2017.
 */

public class WordCount {

    public int wordCount(String words) {
        if (words == null) {
            return 0;
        }
        String userInput = words.trim();
        int count = userInput.isEmpty() ? 0 : userInput.split("\\s+").length;
        return count;
    }
}



