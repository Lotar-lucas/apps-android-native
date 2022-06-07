package com.appVendas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText value = (EditText)findViewById(R.id.editvalue);
        EditText discount = (EditText)findViewById(R.id.editDiscont);
        EditText qtd = (EditText)findViewById(R.id.editQtd);
        Button btnCalculate = (Button)findViewById(R.id.buttonSubmit);
        EditText resultAll = (EditText)findViewById(R.id.editResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double valueUnit = Double.parseDouble(value.getText().toString());
                double percentageDiscount = Double.parseDouble(discount.getText().toString());
                double quantity = Double.parseDouble(qtd.getText().toString());


                double total =  valueUnit * quantity;
                if (percentageDiscount > 0) {

                    double valuePercentage = (total * percentageDiscount) /100;
                    resultAll.setText( String.valueOf( total - valuePercentage));
                } else {
                    resultAll.setText( String.valueOf(total));
                }
            }
        });

    }
}