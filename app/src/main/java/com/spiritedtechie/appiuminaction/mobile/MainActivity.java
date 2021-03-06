package com.spiritedtechie.appiuminaction.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et_name = (EditText) findViewById(R.id.et_name);
        Button btn_submit = (Button) findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acceptedIntent = new Intent(MainActivity.this, AcceptedActivity.class);
                acceptedIntent.putExtra("NAME", et_name.getText().toString());
                startActivity(acceptedIntent);
                finish();
            }
        });
    }
}
