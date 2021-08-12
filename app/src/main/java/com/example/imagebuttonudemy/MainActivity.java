package com.example.imagebuttonudemy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    AutoCompleteTextView autoCompleteTextView;
    EditText keyEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /********************* SPINNER ******************************/
        spinner = findViewById(R.id.spinner);
        String[] spinnerArray = new String[]{"Hey", "No", "Yes"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spinnerArray);
        spinner.setAdapter(adapter);

        /******************** LONG CLICKS *******************************/

        spinner.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                spinner.setBackgroundColor(Color.parseColor("#ff4d4d"));
                return true;
            }
        });

        /************************ AUTO COMPLETE TEXT VIEW ***************************/

        autoCompleteTextView = findViewById(R.id.auto);
        String[] data = {"apple", "samsung", "hawawi", "lenovo"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, data);
        autoCompleteTextView.setAdapter(arrayAdapter);


    }

    /****************** KEY EVENTS *********************************/
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_HOME:
                //Key home is clicked
                break;

            case KeyEvent.KEYCODE_DPAD_CENTER:
                //center is pressed
                break;

        }
        
        return super.onKeyDown(keyCode, event);
    }
}