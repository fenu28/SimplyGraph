package com.example.android.simplygraph;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    ActionBar actionBar;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pieChart = findViewById(R.id.plot_pie_chart);
        Button lineChart = findViewById(R.id.plot_line_chart);
        Button barChart = findViewById(R.id.plot_bar_chart);
        Button mathFunctions = findViewById(R.id.math_functions);

        pieChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(SecondActivity.this,PiechartDataEntry.class);
                startActivity(intent);
            }
        });

        lineChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,LineChartDataEntry.class);
                startActivity(intent);
            }
        });

        barChart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,MultiBarChartDataEntry.class);
                startActivity(intent);
            }
        });

        mathFunctions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,MathematicalFunctionsSelectionScreen.class);
                startActivity(intent);
            }
        });

    }
}
