package com.example.android.simplygraph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        },SPLASH_DISPLAY_LENGTH);
        /*Button pieChart = findViewById(R.id.plot_pie_chart);
        Button lineChart = findViewById(R.id.plot_line_chart);
        Button barChart = findViewById(R.id.plot_bar_chart);
        Button mathFunctions = findViewById(R.id.math_functions);

        pieChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this,PiechartDataEntry.class);
                startActivity(intent);
            }
        });

        lineChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LineChartDataEntry.class);
                startActivity(intent);
            }
        });

        barChart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MultiBarChartDataEntry.class);
                startActivity(intent);
            }
        });

        mathFunctions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MathematicalFunctionsSelectionScreen.class);
                startActivity(intent);
            }
        });
        */
    }
}
