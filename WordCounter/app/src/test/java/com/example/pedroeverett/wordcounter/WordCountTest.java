package com.example.pedroeverett.wordcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pedroeverett on 04/07/2017.
 */

public class WordCountTest {

    WordCount count;

    @Test
    public void checkWordCount() {
        count = new WordCount();
        String words = "hello here i am";
        assertEquals(4, count.wordCount(words));
    }


}
