package lab4.com.classapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txtMsg;
    String msg1, msg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtMsg = (TextView)findViewById(R.id.txtMessage);

        Intent secondIntent = getIntent();
        msg1 = secondIntent.getStringExtra("Extra1");
        msg2 = secondIntent.getStringExtra("Extra2");
        if(msg1!= null && msg2!= null)
            txtMsg.setText(msg1 + " " + msg2);
        else
            txtMsg.setText("Welcome!");
    }
}
