package com.test.amirelkayam.smallbusinessstock.activity.activity;

        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.Toast;

        import com.test.amirelkayam.smallbusinessstock.R;

public class Inventory extends Activity {
    /// etsirat mishtanim betoh Class
    EditText editText_inventory;
    ImageView imageView;
    Button button_find;
    Button edd_inventory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //Start*********
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        // metsia shel View elements
        editText_inventory = (EditText)findViewById(R.id.editText_inventory);
        imageView = (ImageView)findViewById(R.id.imageView);
        button_find = (Button)findViewById(R.id.button_find);
        edd_inventory = (Button)findViewById(R.id.edd_inventory);


        /// itsirat mazinim
        View.OnClickListener oc_EditText_inventory =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Toast.makeText(Inventory.this, "ocBtn_findSuppliers", Toast.LENGTH_SHORT).show();
            }
        };


        View.OnClickListener oc_ImageView =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Toast.makeText(Inventory.this, "ocBtn_newSuppliers", Toast.LENGTH_SHORT).show();
            }
        };

        View.OnClickListener oc_button_find =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Toast.makeText(Inventory.this, "oc_imageView", Toast.LENGTH_SHORT).show();
            }
        };

        View.OnClickListener oc_edd_inventory =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Toast.makeText(Inventory.this, "oc_editText_findSuppliers", Toast.LENGTH_SHORT).show();
            }
        };


        /// afalat hakaftorim
        editText_inventory.setOnClickListener(oc_EditText_inventory);
        imageView.setOnClickListener(oc_ImageView);
        button_find.setOnClickListener(oc_button_find);
        edd_inventory.setOnClickListener(oc_edd_inventory);


    }
}
