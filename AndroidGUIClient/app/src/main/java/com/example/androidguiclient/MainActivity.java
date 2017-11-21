package com.example.androidguiclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements userinterface.Userinterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Update the message text area with a new message.
     * @param message The message to display.
     */
    public void update(String message) {
        TextView textView = findViewById(R.id.messageTextArea);
        textView.setText(message);
    }
}
