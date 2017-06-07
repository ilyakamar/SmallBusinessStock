package com.test.amirelkayam.smallbusinessstock.activity.activity;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.test.amirelkayam.smallbusinessstock.R;
import com.test.amirelkayam.smallbusinessstock.activity.DBHelper;

import static android.R.attr.onClick;

public class Customers extends Activity {
    /// etsirat mishtanim betoh Class
    EditText editText_customers;
    ImageView imageView;
    Button newCustomers;
    Button button_findCustomers;

  /////////////  DBHelper dbHelper;   /// etirat mishtane shel db

    private static final String TAG = "myLogs";   ////// LOG create

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //Start
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers);



        // metsia shel View elements
        Log.d(TAG, "naidyom View - elements");
        editText_customers = (EditText)findViewById(R.id.editText_customers);
        imageView = (ImageView)findViewById(R.id.imageView);
        newCustomers = (Button)findViewById(R.id.newCustomers);
        button_findCustomers = (Button)findViewById(R.id.button_findCustomers);

    //////////    dbHelper = new DBHelper(this);  //////DB


        View.OnClickListener oclAction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
   /////////////             SQLiteDatabase database = dbHelper.getWritableDatabase(); /////// DB

                switch (v.getId()){
                    case R.id.editText_customers:
                        Toast.makeText(Customers.this, "1", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "naidyom 1");
                        break;
                    case R.id.imageView:
                        Toast.makeText(Customers.this, "2", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "naidyom 2");
                        break;
                    case R.id.newCustomers:
                        Toast.makeText(Customers.this, "3", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "naidyom 3");
                        break;
                    case R.id.button_findCustomers:
                        Toast.makeText(Customers.this, "4", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, "naidyom 4");
                        break;

                }

            }
        };

        editText_customers.setOnClickListener(oclAction);
        imageView.setOnClickListener(oclAction);
        newCustomers.setOnClickListener(oclAction);
        button_findCustomers.setOnClickListener(oclAction);



/*
        /// itsirat mazinim
        View.OnClickListener oc_editText_customers =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Toast.makeText(Customers.this, "ocBtn_findSuppliers", Toast.LENGTH_SHORT).show();
            }
        };


        View.OnClickListener oc_ImageView =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Toast.makeText(Customers.this, "ocBtn_newSuppliers", Toast.LENGTH_SHORT).show();
            }
        };

        View.OnClickListener oc_newCustomers =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Toast.makeText(Customers.this, "oc_imageView", Toast.LENGTH_SHORT).show();
            }
        };

        View.OnClickListener oc_button_findCustomers =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Toast.makeText(Customers.this, "oc_editText_findSuppliers", Toast.LENGTH_SHORT).show();
            } */















    }
}
