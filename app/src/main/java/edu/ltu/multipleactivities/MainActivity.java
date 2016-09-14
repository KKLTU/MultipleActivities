package edu.ltu.multipleactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view)
    {
        EditText EditTextOnMainActivity = (EditText)findViewById(R.id.editText);
        String MessageToPass = EditTextOnMainActivity.getText().toString();

        Intent MyIntent = new Intent(this, ReceiveMessageActivity.class);
        MyIntent.putExtra(ReceiveMessageActivity.Extra_MESSAGE, MessageToPass);

        startActivity(MyIntent);
    }
}
