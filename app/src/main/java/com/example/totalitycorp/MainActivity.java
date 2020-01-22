package com.example.totalitycorp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.TextView;

import com.agilie.RotatableAutofitEditText;

public class MainActivity extends AppCompatActivity {

    RotatableAutofitEditText edttxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edttxt=findViewById(R.id.edttxt);
        edttxt.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
        edttxt.setHint(R.string.type_something);



    }


}
