package model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBhelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "DBRegistration.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_TABLE_REGISTRATION = "CREATE TABLE PEOPLE(ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, NAME TEXT NOT NULL, SOCIALNAME TEXT NOT NULL, GENRE TEXT NOT NULL, FATHER TEXT NOT NULL, MOTHER TEXT NOT NULL, INCOME TEXT NOT NULL)";

    public DBhelper (@Nullable Context ctx){
        super(ctx, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_REGISTRATION );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
