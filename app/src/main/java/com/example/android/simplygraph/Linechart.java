package com.example.android.simplygraph;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.OnChartGestureListener;

import java.util.ArrayList;

public class Linechart extends AppCompatActivity {
    LineChart lChart;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Line Chart");
        actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);
        lChart = findViewById(R.id.line_chart);
        lChart.setDragEnabled(true);
        lChart.setScaleEnabled(false);

        lChart.getAxisRight().setEnabled(false);
        LineChartDataEntry obj = new LineChartDataEntry();
        ArrayList<Entry> yValues = obj.getValueSet();
        LineDataSet set = new LineDataSet(yValues,"Data set");
        set.setFillAlpha(110);
        set.setColor(Color.RED);
        set.setLineWidth(3f);
        set.setValueTextSize(10f);

        ArrayList<ILineDataSet> dataSet = new ArrayList<>();
        dataSet.add(set);
        LineData lineData = new LineData(dataSet);
        String[] xString ={"Jan", "Feb", "Mar", "Apr", "May", "June", "July","August","September","October","November"
                ,"December"};
        XAxis xAxis = lChart.getXAxis();
        xAxis.setValueFormatter(new MyXAxisValueFormatter(xString));
        xAxis.setDrawGridLines(true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setGranularity(1);
        lChart.setData(lineData);


    }
    @Override
    public boolean onSupportNavigateUp()
    {
        finish();
        return true;
    }
}
