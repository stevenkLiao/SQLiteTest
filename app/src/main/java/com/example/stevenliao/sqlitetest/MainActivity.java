package com.example.stevenliao.sqlitetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private MyDBHelper helper;
    private EditText edName;
    private EditText edNumbewr;
    private Button SqlBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName = (EditText) findViewById(R.id.editText1);
        edNumbewr = (EditText) findViewById(R.id.editText2);
        helper = new MyDBHelper(this, "expense.db", null, 1);
        SqlBtn = (Button) findViewById(R.id.button);


        SqlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}
