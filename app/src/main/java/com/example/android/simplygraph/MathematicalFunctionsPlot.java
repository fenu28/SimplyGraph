package com.example.android.simplygraph;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.softmoore.android.graphlib.*;
import com.softmoore.android.graphlib.Graph;
import com.softmoore.android.graphlib.GraphView;

public class MathematicalFunctionsPlot extends AppCompatActivity {
    private static int viewID;
    Graph[] graph;
    GraphView graphView;
    TextView graphLabel;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematical_function_plot);
        actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        this.setTitle("Math Functions");
        graphView = findViewById(R.id.graphview);
        graphView.setBackgroundColor(Color.WHITE);
        graphLabel = findViewById(R.id.graph_label);
        graphLabel.setText("");
        graph = new Graph[1];
        graph[0] = new Graph.Builder().build();
        switch (viewID) {

            case R.id.sinx: {
                graph[0] = new Graph.Builder().addFunction(x -> Math.sin(x), Color.rgb(98,0,238))
                        .setWorldCoordinates(-10, 10, -5, 5)
                        .setYTicks(new double[]{-1,-0.5,0,0.5,1})
                        .setXTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .build();
                graphLabel.setText("Graph of sinx");
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.cosx: {
                graph[0] = new Graph.Builder().addFunction(x -> Math.cos(x), Color.rgb(98,0,238))
                        .setWorldCoordinates(-10, 10, -5, 5)
                        .setXTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .setYTicks(new double[]{-1,-0.5,0,0.5,1})
                        .build();
                graphLabel.setText("Graph of cosx");
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.tanx: {
                graph[0] = new Graph.Builder().addFunction(x -> Math.tan(x), Color.rgb(98,0,238))
                        .setWorldCoordinates(-20,20,-20,20)
                        .setXTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .setYTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .build();
                graphLabel.setText("Graph of tanx");
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.cotx:
            {
                graph[0] = new Graph.Builder().addFunction(x -> 1/Math.tan(x),Color.rgb(98,0,238))
                        .setWorldCoordinates(-20,20,-20,20)
                        .setXTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .setYTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .build();
                graphLabel.setText("Graph of cotx");
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.secx:
            {
                graph[0] = new Graph.Builder().addFunction(x -> 1/Math.cos(x),Color.rgb(98,0,238))
                        .setWorldCoordinates(-10,10,-10,10)
                        .setXTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .setYTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .build();
                graphLabel.setText("Graph of secx");
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.cosecx:
            {
                Log.v("tag",""+viewID);
                graph[0] = new Graph.Builder().addFunction(x -> 1/(Math.sin(x)),Color.rgb(98,0,238))
                        .setWorldCoordinates(-10,10,-10,10)
                        .setXTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .setYTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .build();
                graphLabel.setText("Graph of cosecx");
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.xsinx:
            {
                graph[0] = new Graph.Builder().addFunction(x -> x*Math.sin(x),Color.rgb(98,0,238))
                        .setWorldCoordinates(-10,10,-10,10)
                        .setXTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .setYTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .build();
                graphLabel.setText("Graph of xsinx");
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.xcosx:
            {
                graph[0] = new Graph.Builder().addFunction(x -> x*Math.cos(x),Color.rgb(98,0,238))
                        .setWorldCoordinates(-10,10,-10,10)
                        .setXTicks(new double[]{-8,-6,-4,-2,0,2,4,6,8})
                        .setYTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .build();

                graphLabel.setText("Graph of xcosx");
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.xtanx:
            {
                graph[0] = new Graph.Builder().addFunction(x -> x*Math.tan(x),Color.rgb(98,0,238))
                        .setWorldCoordinates(-10,10,-10,10)
                        .setXTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .setYTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .build();
                graphLabel.setText("Graph of xtanx");
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.xsecx:
            {
                graph[0] = new Graph.Builder().addFunction(x -> x*(1/Math.cos(x)),Color.rgb(98,0,238))
                        .setWorldCoordinates(-10,10,-10,10)
                        .setXTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .setYTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .build();
                graphLabel.setText("Graph of xsecx");
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.sinxcosx:
            {
                graph[0] = new Graph.Builder().addFunction(x -> Math.sin(x) * Math.cos(x),Color.rgb(98,0,238))
                        .setWorldCoordinates(-10, 10, -1, 1)
                        .setXTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .setYTicks(new double[]{-1,-0.5,0,0.5,1})
                        .build();
                graphLabel.setText("Graph of sinx*cosx");
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.sinxx:
            {
                graph[0] = new Graph.Builder().addFunction(x -> Math.sin(x)/x,Color.rgb(98,0,238))
                        .setWorldCoordinates(-25, 25, -1, 1)
                        .setXTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .setYTicks(new double[]{-10,-8,-6,-4,-2,2,4,6,8,10})
                        .build();
                graphLabel.setText("Graph of sinx/x");
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.logx:
            {
                graph[0] = new Graph.Builder().addFunction(x-> Math.log(x),Color.rgb(98,0,238))
                        .setWorldCoordinates(-10,10,-10,10)
                        .setXTicks(new double[] {-10,-8,-6,-4,-2,2,4,6,8,10})
                        .setYTicks(new double[] {-10,-8,-6,-4,-2,2,4,6,8,10})
                        .build();
                graphView.setGraph(graph[0]);
                break;
            }
            case R.id.xlogx:
            {
                graph[0] = new Graph.Builder().addFunction(x-> x*Math.log(x),Color.rgb(98,0,238))
                        .setWorldCoordinates(-10,10,-10,10)
                        .setXTicks(new double[] {-10,-8,-6,-4,-2,2,4,6,8,10})
                        .setYTicks(new double[] {-1,-0.5,0,0.5,1})
                        .build();
                graphView.setGraph(graph[0]);
                break;
            }

        }
    }
    public void setViewID(int passedViewID)
    {
        viewID = passedViewID;
    }
    @Override
    public boolean onSupportNavigateUp()
    {
        finish();
        return true;
    }
}
