package com.example.shivanika.dhobirite;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import static android.R.id.message;

public class order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        EditText editName = (EditText)findViewById(R.id.editName);
        if( editName.getText().toString().length() == 0 )
            editName.setError( " Name is required!" );

        EditText editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        if( editTextEmail.getText().toString().length() == 0 )
            editTextEmail.setError( "Email is required!" );

        EditText editTextPhone = (EditText)findViewById(R.id.editTextPhone);
        if( editTextPhone.getText().toString().length() == 0 )
            editTextPhone.setError( "Phone Number is required!" );

        EditText editTextService = (EditText)findViewById(R.id.editTextService);
        if( editTextService.getText().toString().length() == 0 )
            editTextService.setError( " Service is required!" );



    }

    public void click2(View v) {
        Log.i("clicks", "You Clicked B2");

        EditText editName = (EditText)findViewById(R.id.editName);
        if( editName.getText().toString().length() == 0 )
            editName.setError( " Name is required!" );

        EditText editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        if( editTextEmail.getText().toString().length() == 0 )
            editTextEmail.setError( "Email is required!" );

        EditText editTextPhone = (EditText)findViewById(R.id.editTextPhone);
        if( editTextPhone.getText().toString().length() == 0 )
            editTextPhone.setError( "Phone Number is required!" );

        EditText editTextService = (EditText)findViewById(R.id.editTextService);
        if( editTextService.getText().toString().length() == 0 )
            editTextService.setError( " Service is required!" );

        if (editName.getText().toString().length() != 0 &&
        editTextEmail.getText().toString().length() != 0 &&
        editTextPhone.getText().toString().length() != 0 &&
        editTextService.getText().toString().length() != 0) {
            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto", "dverma1193@gmail.com", null));

            char subject = 0;
            intent.putExtra(Intent.EXTRA_SUBJECT, "DhobiRite Service");
            intent.putExtra(Intent.EXTRA_TEXT, "Name : \t "+ editName.getText() + "\n phone Number : \t" + editTextPhone.getText() + "\n Service Ordered : \t" + editTextService.getText());
            startActivity(Intent.createChooser(intent, "Choose an Email client :"));
        }
    }

    public void click3(View v) {
        Log.i("clicks","You Clicked B3");
        Intent i=new Intent(order.this,Main3Activity.class);
        startActivity(i);
    }

}
