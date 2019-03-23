package com.cocoabuttercoder.clambers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scramble(View view){
        EditText editText = (EditText)findViewById(R.id.input);
        String string = editText.getText().toString();
        TextView textView = (TextView)findViewById(R.id.scrambled_text);
        ArrayList<Character> letters = new ArrayList<>();

        for(int i = 0; i < string.length(); i++){
            letters.add(string.charAt(i));
        }

        Random rng = new Random();
        String scrambled_string = "";

        while (letters.size() > 0){
            int position = rng.nextInt(letters.size());
            scrambled_string += letters.get(position);
            letters.remove(position);
        }

        textView.setText(scrambled_string);
    }
}
