package com.example.android.simplygraph;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
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
    long i =1;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linechart_data_entry);
        actionBar = getSupportActionBar();
        assert actionBar !=null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        this.setTitle("Line Chart");
        final EditText yInput = findViewById(R.id.input_ycoordinate);
        Button addValues = findViewById(R.id.add_values_line);
        Button plotGraph = findViewById(R.id.plot_graph_line);
        Button resetGraph = findViewById(R.id.reset_graph_line);

        addValues.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(yInput.length()==0)
                {
                    Toast.makeText(getBaseContext(),R.string.input_not_filled,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    float yInputFloat = Float.parseFloat(yInput.getText().toString());
                    valueSet.add(new Entry(i,yInputFloat));
                    i++;
                    Log.v("Length",""+valueSet.size());
                    yInput.setText("");
                }

            }
        });

        plotGraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valueSet.isEmpty())
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
                i = 1;
            }
        });
    }

    public ArrayList<Entry> getValueSet()
    {
        return valueSet;
    }

    @Override
    public boolean onSupportNavigateUp()
    {
        finish();
        return true;
    }

}


