package com.example.stevenliao.sqlitetest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by StevenLiao on 2017/4/21.
 */

public class MyDBHelper extends SQLiteOpenHelper {
    private static MyDBHelper instance = null;

    public static MyDBHelper getInstance(Context ctx) {
        if (instance == null) {
            instance = new MyDBHelper(ctx, "PhoneNumber.db", null, 1);
        }
        return instance;
    }

    public MyDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE  TABLE main.exp " +
                "(cName TEXT PRIMARY KEY  NOT NULL, " +
                "cNumber INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
