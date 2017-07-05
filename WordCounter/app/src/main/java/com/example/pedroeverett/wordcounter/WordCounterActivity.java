package com.example.pedroeverett.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText wordsInput;
    TextView resultText;
    Button resultButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
        Log.d(getClass().toString(), "onCreate called");

        wordsInput = (EditText) findViewById(R.id.words);
        resultText = (TextView) findViewById(R.id.result_text);
        resultButton = (Button) findViewById(R.id.result_button);
    }

    public void onResultButtonClicked(View button) {
        Log.d(getClass().toString(), "onResultButtonClicked was called");
        String words = wordsInput.getText().toString();
        Log.d(getClass().toString(), "The string was  '" + words + "'");
        WordCount count = new WordCount();
        int numberWords = count.wordCount(words);
        resultText.setText(Integer.toString(numberWords));

    }
}
