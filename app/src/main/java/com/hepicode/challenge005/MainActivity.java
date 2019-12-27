package com.hepicode.challenge005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int buttonId;
    TextView text;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textview);
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                if (checkedId == R.id.rb_one){
                    text.setText("You have selected first button");
                }else if (checkedId == R.id.rb_two){
                    text.setText("You have selected second button");
                }else if (checkedId == R.id.rb_three){
                    text.setText("You have selected third button");
                }else if (checkedId == R.id.rb_four){
                    text.setText("You have selected fourth button");
                }
            }
        });

    }

    /*
    1. On app launch, Activity A page will appear on the screen with GroupRadio and a TextView Widget
    2. The RadioButton widgets will be layout horizontally.
    3. Wire an event handle to the RadioGroup
    4. When a single RadioButton is selected, it will display its position on a TextView.
     */
}
