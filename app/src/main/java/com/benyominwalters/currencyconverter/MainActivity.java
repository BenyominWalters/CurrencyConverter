package com.benyominwalters.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        Log.i("Info:", "convert me!");

        TextView amount = (TextView) findViewById(R.id.amountEditText);
        Double convertedAmount = Double.valueOf(amount.getText().toString()) * 3.63;

        Toast.makeText(MainActivity.this, convertedAmount.toString() + " Shekels", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
