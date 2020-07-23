package com.example.android.simplygraph;

import android.widget.Toast;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.DefaultAxisValueFormatter;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;

import java.util.ArrayList;

public class MyXAxisValueFormatter extends ValueFormatter{

    private static String[] mValues;
    public MyXAxisValueFormatter(String[] values)
    {
        mValues = values;
    }

    @Override
    public String getAxisLabel(float value, AxisBase axis) {
        return mValues[(int)value];
    }
}
