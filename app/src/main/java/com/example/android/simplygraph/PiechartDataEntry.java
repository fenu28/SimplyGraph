package com.example.android.simplygraph;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

public class PiechartDataEntry extends AppCompatActivity {
    static ArrayList<PieEntry> yvalues = new ArrayList<>();
    ActionBar actionBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTitle(R.string.pie_chart_title);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piechart_dataentry);
        actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        final EditText tagEntry = (EditText)(findViewById(R.id.tag_entry));
        final EditText valueEntry = (EditText)(findViewById(R.id.value_entry));
        Button addValue = findViewById(R.id.add_values);
        addValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tagEntry.length()==0 || valueEntry.length()==0)
                {
                    Toast.makeText(v.getContext(), R.string.input_not_filled, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String tag = tagEntry.getText().toString();
                    float value = Float.parseFloat(valueEntry.getText().toString());
                    yvalues.add(new PieEntry(value,tag.toUpperCase()));
                    tagEntry.setText("");
                    valueEntry.setText("");
                }

            }
        });
        Button plotGraph = findViewById(R.id.plot_graph);
        plotGraph.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Piechart.class);
                startActivity(intent);
            }
        });
        Button resetGraph = findViewById(R.id.reset_graph);
        resetGraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yvalues = new ArrayList<>();
            }
        });
    }
    public ArrayList<PieEntry> getPieEntry()
    {
        return yvalues;
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
