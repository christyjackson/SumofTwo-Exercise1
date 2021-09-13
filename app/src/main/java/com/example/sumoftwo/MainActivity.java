package com.example.sumoftwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add_number(View v) {
        EditText et_num1 = (EditText)findViewById(R.id.editText_num1);
        EditText et_num2 = (EditText)findViewById(R.id.editText_num2);
        Button bt_add = (Button)findViewById(R.id.button_add);
        TextView tv_output = (TextView)findViewById(R.id.textView_output);
        int number1 = Integer.parseInt(et_num1.getText().toString());
        int number2 = Integer.parseInt(et_num2.getText().toString());
        int sum = number1 + number2;
        tv_output.setText(String.valueOf(sum));
    }

}
