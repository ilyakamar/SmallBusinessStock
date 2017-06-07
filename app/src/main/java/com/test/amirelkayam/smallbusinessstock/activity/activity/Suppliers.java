package com.test.amirelkayam.smallbusinessstock.activity.activity;

import android.app.Activity;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.test.amirelkayam.smallbusinessstock.R;

public class Suppliers extends Activity {
    /// etsirat mishtanim betoh Class
    Button button_findSuppliers;
    Button button_newSuppliers;
    ImageView imageView;
    EditText editText_findSuppliers;

    private Handler suppliersHandler = new Handler();


    private Runnable update = new Runnable() {
        @Override
        public void run() {
            new getSuppliers().execute
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {//
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suppliers);

        // metsia shel View elements
        button_findSuppliers = (Button) findViewById(R.id.button_findSuppliers);
        button_newSuppliers = (Button) findViewById(R.id.button_newSuppliers);
        imageView = (ImageView)findViewById(R.id.imageView);
        editText_findSuppliers = (EditText)findViewById(R.id.editText_findSuppliers);


        /// itsirat mazinim
        View.OnClickListener ocBtn_findSuppliers =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Toast.makeText(Suppliers.this, "ocBtn_findSuppliers", Toast.LENGTH_SHORT).show();
            }
        };


        View.OnClickListener ocBtn_newSuppliers =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Toast.makeText(Suppliers.this, "ocBtn_newSuppliers", Toast.LENGTH_SHORT).show();
            }
        };

        View.OnClickListener oc_imageView =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Toast.makeText(Suppliers.this, "oc_imageView", Toast.LENGTH_SHORT).show();
            }
        };

        View.OnClickListener oc_editText_findSuppliers =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Toast.makeText(Suppliers.this, "oc_editText_findSuppliers", Toast.LENGTH_SHORT).show();
            }
        };

            /// afalat hakaftorim
        button_findSuppliers.setOnClickListener(ocBtn_findSuppliers);
        button_newSuppliers.setOnClickListener(ocBtn_newSuppliers);
        imageView.setOnClickListener(oc_imageView);
        editText_findSuppliers.setOnClickListener(oc_editText_findSuppliers);
    }
}
