package com.example.android.marriagedetector;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.y;
import static com.example.android.marriagedetector.R.id.partner;
import static com.example.android.marriagedetector.R.id.question1;
import static java.net.Proxy.Type.HTTP;

public class AnswerActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_main);
        setAnswers();

    }

    /**
     * This method setAnswers gets the bundle and save the values in an int and string variables. Then it sets the textView
     * of the answer_main.xml, depending on the value from the total question points.
     */
    public void setAnswers (){
        Bundle bundle = getIntent().getExtras();
        String userName = bundle.getString("stuff2");
        String partnerName = bundle.getString("stuff");
        int totally = bundle.getInt("stuff3");
        String perfect = userName + " and " + partnerName + "\n Your Relationship is Perfect. " +
                "\n Quick! Find a minister, and get married. You both are meant to be, like garri and groundnut!";
        String survive = userName + " and " + partnerName + "\n Your Relationship is risky." +
                "\n You both are not the perfect match, but hey, it MAY work out, if both of you can sacrifice.";
        String disaster = userName + " and " + partnerName + "\n Your Relationship is a disaster. " +
                "\n Quick! Breakup before it is too late. You both are not meant to be, like white rice and jollof!";

        TextView display = (TextView)findViewById(R.id.answer);


        if (totally == 48) {
            display.setText(perfect);
        }
        else if ((totally < 48) && (totally > 40)){
            display.setText(survive);
        }
        else {
            display.setText(disaster);
        }

    }

    /**
     * This method is called in the sendToWhatsapp method, when the share button is clicked and sends the param to whatsapp,
     * using an sms intent.
     * @param message displays the string value set as text in answer_main.xml
     */
    public void composeMessage(String message) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        //intent.setPackage("com.whatsapp");
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * This method is called using the onClick attribute in the buttonView of the answer_main.xml
     * @param view Used to call the method on the Button View, I think.
     */
    public void sendToWhatsap (View view){
        TextView display = (TextView)findViewById(R.id.answer);
        String message = display.getText().toString();
        composeMessage(message);
    }
}