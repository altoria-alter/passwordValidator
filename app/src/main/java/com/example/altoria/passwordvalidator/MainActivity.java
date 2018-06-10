package com.example.altoria.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void Validation(View view) {
        EditText editText = findViewById(R.id.editText);
        String password = editText.getText().toString();
        TextView textView = findViewById(R.id.textView);
        //Set the default feedback as good password
        String feedback = "Your password is good";
        //password is too simple
        if(Validator.PSWSTG2(password).contains("p")){
            feedback = "You can not use this password, it is too simple ";
        }
        //password is too short
        if(Validator.PSWSTG2(password).contains("8")){
            feedback = "Your password is too short";
        }
        //password does not contain a special character
        if(Validator.PSWSTG2(password).contains("s")){
            feedback = "Your password should include at least one special character";
        }
        //password does not contain a digit
        if(Validator.PSWSTG2(password).contains("d")){
            feedback = "Your password should include a digit";
        }
        //password does not contain a lower case
        if(Validator.PSWSTG2(password).contains("l")){
            feedback = "Your password should have lower case";
        }
        //password does not contain a upper case
        if(Validator.PSWSTG2(password).contains("u")){
            feedback = "Your password should have upper case";
        }
        textView.setText(feedback);
    }
}
