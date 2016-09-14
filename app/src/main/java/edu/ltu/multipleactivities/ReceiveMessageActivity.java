package edu.ltu.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String Extra_MESSAGE = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent MyIntent = getIntent();

        String ReceivedMessage = MyIntent.getStringExtra(Extra_MESSAGE);

        TextView MyTextView = (TextView)findViewById(R.id.textViewInReceivedActivity);
        MyTextView.setText(ReceivedMessage);
    }
}
