package com.example.androidguiclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity
        implements userinterface.Userinterface, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtonClickListeners();
    }

    @Override
    public void onClick(final View view) {
        switch (view.getId()) {
            case R.id.updateIPButton:
                update("IP Address Button Clicked.");
                break;
            case R.id.updatePortButton:
                update("Port Button Clicked.");
                break;
            case R.id.connectButton:
                update("Connect Button Clicked.");
                break;
            case R.id.disconnectButton:
                update("Disconnect Button Clicked.");
                break;
            case R.id.quitButton:
                update("Quit Button Clicked.");
                break;
            case R.id.tempButton:
                update("Temp Button Clicked.");
                break;
            case R.id.gpb1Button:
                update("GPB1 Button Clicked.");
                break;
            case R.id.gpb2Button:
                update("GPB2 Button Clicked.");
                break;
            case R.id.gpb3Button:
                update("GPB3 Button Clicked.");
                break;
        }
    }

    /**
     * Update the message text area with a new message.
     * @param message The message to display.
     */
    @Override
    public void update(String message) {
        TextView textView = findViewById(R.id.messageTextArea);
        textView.setText(message);
    }


    /**
     * Set the click listeners of all the Buttons to this.
     */
    private void setButtonClickListeners() {
        Button currentButton;

        currentButton = findViewById(R.id.updateIPButton);
        currentButton.setOnClickListener(this); // calling onClick() method
        currentButton = findViewById(R.id.updatePortButton);
        currentButton.setOnClickListener(this);
        currentButton = findViewById(R.id.connectButton);
        currentButton.setOnClickListener(this);
        currentButton = findViewById(R.id.disconnectButton);
        currentButton.setOnClickListener(this);
        currentButton = findViewById(R.id.quitButton);
        currentButton.setOnClickListener(this);

        // Set up temp button but disable it
        currentButton = findViewById(R.id.tempButton);
        currentButton.setOnClickListener(this);
        currentButton.setEnabled(false);

        currentButton = findViewById(R.id.gpb1Button);
        currentButton.setOnClickListener(this);
        currentButton = findViewById(R.id.gpb2Button);
        currentButton.setOnClickListener(this);
        currentButton = findViewById(R.id.gpb3Button);
        currentButton.setOnClickListener(this);
    }
}
