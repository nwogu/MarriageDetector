package com.example.android.marriagedetector;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.marriagedetector.R.id.partner;
import static com.example.android.marriagedetector.R.id.question1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This function gets the name of the user/partner and saves them as variables Person/partnerName
     * Saves the variables in a bundle, and starts the QuestionActivity if the username and partner name fields
     * are not empty: if empty, displays a toast.
     */
    public void startQuestion(View view) {
        EditText name = (EditText) findViewById((R.id.name));
        String Person = name.getText().toString();
        EditText partnerName = (EditText) findViewById((partner));
        String partner = partnerName.getText().toString();
        Context context = getApplicationContext();
        CharSequence text = "Hey, Fill The Fields Before You Continue";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        if ((Person.length() == 0) || (partner.length() == 0)) {
            toast.show();
        } else {
            Intent i = new Intent(this, QuestionActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("stuff", partner);
            bundle.putString("stuff2", Person);
            i.putExtras(bundle);

            startActivity(i);
        }
    }

}