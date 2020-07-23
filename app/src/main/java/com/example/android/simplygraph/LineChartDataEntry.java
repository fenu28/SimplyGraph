package com.example.android.simplygraph;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.DefaultAxisValueFormatter;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;

import java.util.ArrayList;

public class LineChartDataEntry extends AppCompatActivity {
    private static ArrayList<Entry> valueSet = new ArrayList<>();
    private static ArrayList<String> xString = new ArrayList<>();
    long i =1;
    @Override
    protected void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linechart_data_entry);
        final EditText xInput = findViewById(R.id.input_xcoordinate);
        final EditText yInput = findViewById(R.id.input_ycoordinate);
        Button addValues = findViewById(R.id.add_values_line);
        Button plotGraph = findViewById(R.id.plot_graph_line);
        Button resetGraph = findViewById(R.id.reset_graph_line);

        addValues.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(xInput.length()==0 || yInput.length()==0)
                {
                    Toast.makeText(getBaseContext(),R.string.input_not_filled,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String xInputString = xInput.getText().toString();
                    float yInputFloat = Float.parseFloat(yInput.getText().toString());
                    xString.add(xInputString);
                    valueSet.add(new Entry(i,yInputFloat));
                    i++;
                    Log.v("Length",""+valueSet.size());
                    Log.v("Length",""+xString.size());
                    xInput.setText("");
                    yInput.setText("");
                }

            }
        });

        plotGraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valueSet.isEmpty() || xString.isEmpty())
                {
                    Toast.makeText(getBaseContext(),R.string.data_empty,Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    Intent intent = new Intent(getApplicationContext(),Linechart.class);
                    startActivity(intent);
                }

            }
        });

        resetGraph.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                valueSet = new ArrayList<>();
                xString = new ArrayList<>();
                i = 1;
            }
        });
    }

    public ArrayList<Entry> getValueSet()
    {
        return valueSet;
    }

    public ArrayList<String> getXString()
    {
        return xString;
    }
}


