package com.test.amirelkayam.smallbusinessstock.activity.activity;

import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.test.amirelkayam.smallbusinessstock.R;

public class MainActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {    // Start
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void onClick(View v) {    // lehitsa al kaftorim bemasah harashi

        switch (v.getId()) {

            case R.id.inventoryBtn:

                Intent intent = new Intent(this, Inventory.class);
                Toast.makeText(MainActivity.this, "Inventory", Toast.LENGTH_SHORT).show(); // hodaa  "Inventory"
                startActivity(intent);  // ptiha shel halon hadash
                break;


            case R.id.saleBtn:

                Intent intent1 = new Intent(this, Sale.class);
                Toast.makeText(MainActivity.this, "Sale", Toast.LENGTH_SHORT).show(); // hodaa "Sale"
                startActivity(intent1); // ptiha shel halon hadash
                break;


            case R.id.customersBtn:

                Intent intent2 = new Intent(this, Customers.class);
                Toast.makeText(MainActivity.this, "Customers", Toast.LENGTH_SHORT).show();  // hodaa "Customers"
                startActivity(intent2);
                break;


            case  R.id.suppliersBtn:

                Intent intent3 = new Intent(this, Suppliers.class);
                Toast.makeText(MainActivity.this, "Suppliers", Toast.LENGTH_SHORT).show();  // hodaa "Suppliers"
                startActivity(intent3);
                break;


            default:
                break;
        }
    }

}
