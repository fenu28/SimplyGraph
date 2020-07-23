package com.example.android.simplygraph;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class MultiBarChartDataEntry extends AppCompatActivity implements View.OnClickListener {
    public static ArrayList<BarEntry> barEntries;
    private EditText yInput;
    private Button add_value;
    private Button plot_graph;
    private Button reset_graph;
    private long i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multibarchart_dataentry);
         yInput  = (EditText)findViewById(R.id.barchart_y_input);
         add_value = (Button)findViewById(R.id.bar_add_values);
         plot_graph = (Button)findViewById(R.id.bar_plot_graph);
         reset_graph = (Button)findViewById(R.id.bar_reset_graph);
         barEntries = new ArrayList<>();

        add_value.setOnClickListener(this);
        plot_graph.setOnClickListener(this);
        reset_graph.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int ID = v.getId();
        switch(ID)
        {
            case R.id.bar_add_values: {
                if (yInput.length() == 0) {
                    Toast.makeText(getApplicationContext(), R.string.input_not_filled, Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    float yValues = Float.parseFloat((yInput.getText().toString()));
                    barEntries.add(new BarEntry(i, yValues));
                    i++;
                    yInput.setText("");
                    Log.v("Size",""+barEntries.size());
                }
                break;
            }
            case R.id.bar_plot_graph:
            {

                if(barEntries.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),R.string.data_empty,Toast.LENGTH_SHORT).show();
                    return;
                }
                startActivity(new Intent(getApplicationContext(),Multibarchart.class));
                break;
            }
            case R.id.bar_reset_graph:
            {
                barEntries = new ArrayList<>();
                i = 0;
                break;
            }
        }
    }
    public ArrayList<BarEntry> getBarEntries()
    {
        return barEntries;
    }
}
