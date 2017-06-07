package com.test.amirelkayam.smallbusinessstock.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.test.amirelkayam.smallbusinessstock.R;
import com.test.amirelkayam.smallbusinessstock.activity.activity.Inventory;
import com.test.amirelkayam.smallbusinessstock.activity.activity.MainActivity;
import com.test.amirelkayam.smallbusinessstock.activity.activity.Registration;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import static android.R.attr.onClick;

public class Login extends Activity {// LOGIN start Class

    Button buttonRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // onCreate Start
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      /*
      *
      *
      *  buttonRegistration = (Button)findViewById(R.id.btnRegistration);

        Intent intentRegistration = new Intent(getApplicationContext(), Registration.class); //Intent >>>> .class
        startActivity(intentRegistration);
*/





    }// onCreate END


    public void Login(View view) { // Login constructor S

        EditText username = (EditText) findViewById(R.id.etUsername);
        EditText password = (EditText) findViewById(R.id.etPassword);
        String user = username.getText().toString();
        String pass = password.getText().toString();

        buttonRegistration = (Button)findViewById(R.id.btnRegistrationFromLoginActivity);



        View.OnClickListener oc_Registration =new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //TODO som Action
                Intent intentRegistration = new Intent(getApplicationContext(), Registration.class); //Intent >>>> Registration.class
                startActivity(intentRegistration);

            }
        };

        buttonRegistration.setOnClickListener(oc_Registration);

        SharedPreferences preferences;
        preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("user", user);
        editor.putString("pass", pass);
        editor.apply();

        new LoginTask().execute("http://small-business-stock.eu.pn/login.php",
                username.getText().toString(),
                password.getText().toString());
    } /// Login constructor End

    private class LoginTask extends AsyncTask<String, Void, String> { // LoginTask - Start
        HttpURLConnection urlConnection;

        @Override
        protected String doInBackground(String... params) {
            String result = "";
            try {
                URL url = new URL(params[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setDoOutput(true);
                urlConnection.setRequestMethod("POST");

                String postParameters = "username=" + params[1] + "&password=" + params[2];     // hack   ' or 1=1 limit 1;#
                urlConnection.setFixedLengthStreamingMode(postParameters.getBytes().length);
                PrintWriter out = new PrintWriter(urlConnection.getOutputStream());
                out.print(postParameters);
                out.close();

                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                result = reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                urlConnection.disconnect();
            }
            return result;

        }
        @Override
        protected void onPostExecute(String result) {// onPostExecute - Start
            super.onPostExecute(result);

            if(result.toString().contains("permission"))
            {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Permission Denied", Toast.LENGTH_LONG).show();
            }
        }// onPostExecute - End

    }//LoginTask - End




}
