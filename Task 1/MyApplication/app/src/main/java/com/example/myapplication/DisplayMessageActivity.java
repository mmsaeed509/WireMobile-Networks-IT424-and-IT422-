package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;
import android.content.Intent;


public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        displayMessage();
    }

    private void displayMessage() {
        TextView display_text= (TextView) findViewById(R.id.display_text);
        Intent intent = getIntent();
        String message = intent.getStringExtra("Message");
        display_text.setText(message);
    }
}