package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText text;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         text =findViewById(R.id.edit_message);
         send = (Button) findViewById(R.id.send_button);

        sendMessage();
    }
    public void sendMessage(){

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message= text.getText().toString();
                Intent intent = new Intent(MainActivity.this,DisplayMessageActivity.class);
                intent.putExtra("Message",message);
                startActivity(intent);
            }
        });
    }
}