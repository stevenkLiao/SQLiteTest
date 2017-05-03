package com.example.stevenliao.sqlitetest;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private MyDBHelper helper;
    private EditText edName;
    private EditText edNumbewr;
    private Button AddBtn;
    private Button DisBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName = (EditText) findViewById(R.id.editText1);
        edNumbewr = (EditText) findViewById(R.id.editText2);
        AddBtn = (Button) findViewById(R.id.button);
        DisBtn = (Button) findViewById(R.id.button2);
        helper = MyDBHelper.getInstance(this);
        Log.d("Create db", "Success");
        AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
                Log.d("Add1", "Success");

            }
        });
    }

    public void add () {
        String cName = edName.getText().toString();
        String cNumber = edNumbewr.getText().toString();
        ContentValues values = new ContentValues();
        values.put("Name", cName);
        values.put("Number", cNumber);
        helper.getWritableDatabase().insert("exp", null, values);
    }

}
