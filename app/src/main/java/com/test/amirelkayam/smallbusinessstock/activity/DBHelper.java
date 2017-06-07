package com.test.amirelkayam.smallbusinessstock.activity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.test.amirelkayam.smallbusinessstock.activity.activity.Customers;

/**
 * Created by User on 11/10/2016.
 * itsirat SQLiteOpenHelper
 * tsarih lilhots pamaim al nura aduma bisvil pam rishona lezamen shnei metodot ve pam shniya bishvil litsor konstructor
 */

public class DBHelper extends SQLiteOpenHelper {
    // itsirat mishtanim le DB
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "contactDb";
    public static final String TABEL_CONTACTS = "contacts";

    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_EMAIL = "mail";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {   /*etsirat tavla hadasha*/
        db.execSQL("create table "+TABEL_CONTACTS + "(" + KEY_ID
        + "integer primery key," + KEY_NAME + "text," + KEY_EMAIL + "text" + ")" );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exist " + TABEL_CONTACTS);
        onCreate(db);
    }
}
