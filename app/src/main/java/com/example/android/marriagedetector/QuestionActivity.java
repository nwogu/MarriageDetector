package com.example.android.marriagedetector;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.string.no;
import static android.R.string.yes;
import static com.example.android.marriagedetector.R.id.partner;
import static com.example.android.marriagedetector.R.id.question2;

public class QuestionActivity extends MainActivity {


    // Created a global counter variable for 26 questions and set them to 0
    int counter1 = 0;
    int counter2 = 0;
    int counter3 = 0;
    int counter4 = 0;
    int counter5 = 0;
    int counter6 = 0;
    int counter7 = 0;
    int counter8 = 0;
    int counter9 = 0;
    int counter10 = 0;
    int counter11 = 0;
    int counter12 = 0;
    int counter13 = 0;
    int counter14 = 0;
    int counter15 = 0;
    int counter16 = 0;
    int counter17 = 0;
    int counter18 = 0;
    int counter19 = 0;
    int counter20 = 0;
    int counter21 = 0;
    int counter22 = 0;
    int counter23 = 0;
    int counter24 = 0;
    int counter25 = 0;
    int counter26 = 0;

    //Created a global variable called "qes" to hold points for each question response
    int qes1 = 0;
    int qes2 = 0;
    int qes3 = 0;
    int qes4 = 0;
    int qes5 = 0;
    int qes6 = 0;
    int qes7 = 0;
    int qes8 = 0;
    int qes9 = 0;
    int qes10 = 0;
    int qes11 = 0;
    int qes12 = 0;
    int qes13 = 0;
    int qes14 = 0;
    int qes15 = 0;
    int qes16 = 0;
    int qes17 = 0;
    int qes18 = 0;
    int qes19 = 0;
    int qes20 = 0;
    int qes21 = 0;
    int qes22 = 0;
    int qes23 = 0;
    int qes24 = 0;
    int qes25 = 0;
    int qes26 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_main);
        setQuestion();

    }

    /**
     * The method setQuestion, gets the bundle saved in MainActivity(User/PartnerName), saves the variables in strings called
     * Person and partner, and uses this string to set the textView for the 26 questions.
     */
    public void setQuestion() {
        Bundle bundle = getIntent().getExtras();
        String Person = bundle.getString("stuff2");
        String partner = bundle.getString("stuff");
        String question01 = "Are you ready to be with " + partner + "?";
        String question02 = "Can you trust " + partner + " to defend your honour when you are not there?";
        String question03 = "Can " + partner + " trust you?";
        String question04 = "Do you really need " + partner + "?";
        String question05 = "Do you make " + partner + " better?";
        String question06 = "Does " + partner + " make you better?";
        String question07 = "Should I hold out for a better person?";
        String question08 = "Will time change everything?";
        String question09 = "Are you stuck on someone from the past?";
        String question010 = "Can you financially afford to be in this relationship now?";
        String question011 = "Are you willing to relocate?";
        String question012 = "Can you put your goals on hold to help achieve the goals of " + partner + "?";
        String question013 = "Will you always forgive " + partner + "?";
        String question014 = "Do you think of other people sometimes, wondering what it’ll be like to be with them?";
        String question015 = "Do you notice others more than you notice " + partner + "?";
        String question016 = "Will you get tired of sharing your space with " + partner + "?";
        String question017 = "Are you comfortable with " + partner + "\'s family?";
        String question018 = "Do you fit into " + partner + "\'s plans?";
        String question019 = "Will " + partner + " always listen to you, wholehearted?";
        String question020 = "Are you patient enough for " + partner;
        String question021 = "Can " + partner + " look after you when you are sick and you want to vomit and all?";
        String question022 = "Do you feel respected by " + partner + "?";
        String question023 = "Are you comfortable with " + partner + " having the last say?";
        String question024 = "Will " + partner + " be proud of your family?";
        String question025 = "Are you brave enough to tell " + partner + " everything? Even the things you are deeply ashamed of?";
        String question026 = "Will " + partner + " ever lie to you?";
        TextView question_1 = (TextView) findViewById(R.id.question1);
        TextView question_2 = (TextView) findViewById(R.id.question2);
        TextView question_3 = (TextView) findViewById(R.id.question3);
        TextView question_4 = (TextView) findViewById(R.id.question4);
        TextView question_5 = (TextView) findViewById(R.id.question5);
        TextView question_6 = (TextView) findViewById(R.id.question6);
        TextView question_7 = (TextView) findViewById(R.id.question7);
        TextView question_8 = (TextView) findViewById(R.id.question8);
        TextView question_9 = (TextView) findViewById(R.id.question9);
        TextView question_10 = (TextView) findViewById(R.id.question10);
        TextView question_11 = (TextView) findViewById(R.id.question11);
        TextView question_12 = (TextView) findViewById(R.id.question12);
        TextView question_13 = (TextView) findViewById(R.id.question13);
        TextView question_14 = (TextView) findViewById(R.id.question14);
        TextView question_15 = (TextView) findViewById(R.id.question15);
        TextView question_16 = (TextView) findViewById(R.id.question16);
        TextView question_17 = (TextView) findViewById(R.id.question17);
        TextView question_18 = (TextView) findViewById(R.id.question18);
        TextView question_19 = (TextView) findViewById(R.id.question19);
        TextView question_20 = (TextView) findViewById(R.id.question20);
        TextView question_21 = (TextView) findViewById(R.id.question21);
        TextView question_22 = (TextView) findViewById(R.id.question22);
        TextView question_23 = (TextView) findViewById(R.id.question23);
        TextView question_24 = (TextView) findViewById(R.id.question24);
        TextView question_25 = (TextView) findViewById(R.id.question25);
        TextView question_26 = (TextView) findViewById(R.id.question26);
        question_1.setText(question01);
        question_2.setText(question02);
        question_3.setText(question03);
        question_4.setText(question04);
        question_5.setText(question05);
        question_6.setText(question06);
        question_7.setText(question07);
        question_8.setText(question08);
        question_9.setText(question09);
        question_10.setText(question010);
        question_11.setText(question011);
        question_12.setText(question012);
        question_13.setText(question013);
        question_14.setText(question014);
        question_15.setText(question015);
        question_16.setText(question016);
        question_17.setText(question017);
        question_18.setText(question018);
        question_19.setText(question019);
        question_20.setText(question020);
        question_21.setText(question021);
        question_22.setText(question022);
        question_23.setText(question023);
        question_24.setText(question024);
        question_25.setText(question025);
        question_26.setText(question026);


    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked and assign a value to the qes and counter variables
        switch (view.getId()) {
            case R.id.yesQuestion1:
                if (checked) {
                    qes1 = 2;
                    counter1 = 1;
                }

                break;
            case R.id.noQuestion1:
                if (checked) {
                    qes1 = 0;
                    counter1 = 1;
                }
                break;
            case R.id.yesQuestion2:
                if (checked) {
                    qes2 = 2;
                    counter2 = 1;
                }

                break;
            case R.id.noQuestion2:
                if (checked) {
                    qes2 = 1;
                    counter2 = 1;
                }

                break;
            case R.id.yesQuestion3:
                if (checked) {
                    qes3 = 2;
                    counter3 = 1;
                }

                break;
            case R.id.noQuestion3:
                if (checked) {
                    qes3 = 0;
                    counter3 = 1;
                }
                break;
            case R.id.yesQuestion4:
                if (checked) {
                    qes4 = 2;
                    counter4 = 1;
                }

                break;
            case R.id.noQuestion4:
                if (checked) {
                    qes4 = 1;
                    counter4 = 1;
                }

                break;
            case R.id.yesQuestion5:
                if (checked) {
                    qes5 = 2;
                    counter5 = 1;
                }

                break;
            case R.id.noQuestion5:
                if (checked) {
                    qes5 = 1;
                    counter5 = 1;
                }

                break;
            case R.id.yesQuestion6:
                if (checked) {
                    qes6 = 2;
                    counter6 = 1;
                }

                break;
            case R.id.noQuestion6:
                if (checked) {
                    qes6 = 0;
                    counter6 = 1;
                }
                break;
            case R.id.yesQuestion7:
                if (checked) {
                    qes7 = 1;
                    counter7 = 1;
                }

                break;
            case R.id.noQuestion7:
                if (checked) {
                    qes7 = 2;
                    counter7 = 1;
                }

                break;
            case R.id.yesQuestion8:
                if (checked) {
                    qes8 = 0;
                    counter8 = 1;
                }
                break;
            case R.id.noQuestion8:
                if (checked) {
                    qes8 = 1;
                    counter8 = 1;
                }

                break;
            case R.id.yesQuestion9:
                if (checked) {
                    qes9 = 0;
                    counter9 = 1;
                }
                break;
            case R.id.noQuestion9:
                if (checked) {
                    qes9 =1;
                    counter9 = 1;
                }

                break;
            case R.id.yesQuestion10:
                if (checked) {
                    qes10 = 2;
                    counter10 = 1;
                }

                break;
            case R.id.noQuestion10:
                if (checked) {
                    qes10 = 1;
                    counter10 = 1;
                }

                break;
            case R.id.yesQuestion11:
                if (checked) {
                    qes11 = 3;
                    counter11 = 1;
                }

                break;
            case R.id.noQuestion11:
                if (checked) {
                    qes11 = 0;
                    counter11 = 1;
                }
                break;
            case R.id.yesQuestion12:
                if (checked) {
                    qes12 = 3;
                    counter12 = 1;
                }

                break;
            case R.id.noQuestion12:
                if (checked) {
                    qes12 = 0;
                    counter12 = 1;
                }
                break;
            case R.id.yesQuestion13:
                if (checked) {
                    qes13 = 2;
                    counter13 = 1;
                }

                break;
            case R.id.noQuestion13:
                if (checked) {
                    qes13 = 1;
                    counter13 = 1;
                }

                break;
            case R.id.yesQuestion14:
                if (checked) {
                    qes14 = 1;
                    counter14 = 1;
                }

                break;
            case R.id.noQuestion14:
                if (checked) {
                    qes14 = 2;
                    counter14 = 1;
                }

                break;
            case R.id.yesQuestion15:
                if (checked) {
                    qes15 = 1;
                    counter15 = 1;
                }

                break;
            case R.id.noQuestion15:
                if (checked) {
                    qes15 = 2;
                    counter15 = 1;
                }

                break;
            case R.id.yesQuestion16:
                if (checked) {
                    qes16 = 0;
                    counter16 = 1;
                }
                break;
            case R.id.noQuestion16:
                if (checked) {
                    qes16 = 2;
                    counter16 = 1;
                }

                break;
            case R.id.yesQuestion17:
                if (checked) {
                    qes17 = 1;
                    counter17 = 1;
                }

                break;
            case R.id.noQuestion17:
                if (checked) {
                    qes17 = 0;
                    counter17 = 1;
                }
                break;
            case R.id.yesQuestion18:
                if (checked) {
                    qes18 = 3;
                    counter18 = 1;
                }

                break;
            case R.id.noQuestion18:
                if (checked) {
                    qes18 = 1;
                    counter18 = 1;
                }

                break;
            case R.id.yesQuestion19:
                if (checked) {
                    qes19 = 3;
                    counter19 = 1;
                }

                break;
            case R.id.noQuestion19:
                if (checked) {
                    qes19 = 1;
                    counter19 = 1;
                }

                break;
            case R.id.yesQuestion20:
                if (checked) {
                    qes20 = 2;
                    counter20 = 1;
                }

                break;
            case R.id.noQuestion20:
                if (checked) {
                    qes20 = 1;
                    counter20 = 1;
                }

                break;
            case R.id.yesQuestion21:
                if (checked) {
                    qes21 = 2;
                    counter21 = 1;
                }

                break;
            case R.id.noQuestion21:
                if (checked) {
                    qes21 = 1;
                    counter21 = 1;
                }

                break;
            case R.id.yesQuestion22:
                if (checked) {
                    qes22 = 2;
                    counter22 = 1;
                }

                break;
            case R.id.noQuestion22:
                if (checked) {
                    qes22 = 1;
                    counter22 = 1;
                }

                break;
            case R.id.yesQuestion23:
                if (checked) {
                    qes23 = 1;
                    counter23 = 1;
                }

                break;
            case R.id.noQuestion23:
                if (checked) {
                    qes23 = 0;
                    counter23 = 1;
                }
                break;
            case R.id.yesQuestion24:
                if (checked) {
                    qes24 = 1;
                    counter24 = 1;
                }

                break;
            case R.id.noQuestion24:
                if (checked) {
                    qes24 = 0;
                    counter24 = 1;
                }
                break;
            case R.id.yesQuestion25:
                if (checked) {
                    qes25 = 1;
                    counter25 = 1;
                }

                break;
            case R.id.noQuestion25:
                if (checked) {
                    qes25 = 0;
                    counter25 = 1;
                }
                break;
            case R.id.yesQuestion26:
                if (checked) {
                    qes26 = 1;
                    counter26 = 1;
                }

                break;
            case R.id.noQuestion26:
                if (checked) {
                    qes26 = 0;
                    counter26 = 1;
                }
                break;

        }
    }
/**
 * The Method startAnswers is called when the Finish button is clicked.
 */
    public void startAnswers(View view) {
        //creates an int variable to take the total sum of counter.
        int counterTotal = (counter1 + counter2 + counter3 + counter4 + counter5 + counter6 + counter7 + counter8 + counter9 + counter10
                + counter11 + counter12 + counter13 + counter14 + counter15 + counter16 + counter17 + counter18 + counter19 + counter20
                + counter21 + counter22 + counter23 + counter24 + counter25 + counter26);
        //creates an int variable to take the total sum of ques.
        int total = (qes1 + qes2 + qes3 + qes4 + qes5 + qes6 + qes7 + qes8 + qes9 + qes10 + qes11 + qes12 + qes13 + qes14
                + qes15 + qes16 + qes17 + qes18 + qes19 + qes20 + qes21 + qes22 + qes23 + qes24 + qes25 + qes26);
        //Displays a toast message, if the counterTotal is less than 26 (the total number of questions)
        if (counterTotal < 26) {
            Context context = getApplicationContext();
            CharSequence text = "Hey, Answer all Questions!";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            //Gets the bundle and puts the value for total in it, then starts the AnswerActivity
            Bundle bundle = getIntent().getExtras();
            String Person = bundle.getString("stuff2");
            String partner = bundle.getString("stuff");
            Intent in = new Intent(this, AnswerActivity.class);
            bundle.putInt("stuff3", total);
            Bundle bundle2 = new Bundle();
            bundle2.putString("stuff", partner);
            bundle2.putString("stuff2", Person);
            bundle2.putInt("stuff3", total);
            in.putExtras(bundle);

            startActivity(in);
        }
    }
}

