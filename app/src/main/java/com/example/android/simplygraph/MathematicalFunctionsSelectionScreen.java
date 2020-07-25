package com.example.android.simplygraph;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MathematicalFunctionsSelectionScreen extends AppCompatActivity implements View.OnClickListener {
    private MathematicalFunctionsPlot obj;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematical_functions_selection_screen);
        actionBar = getSupportActionBar();
        assert  actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);
        this.setTitle("Math Functions");
        Button sinx = findViewById(R.id.sinx);
        Button cosx = findViewById(R.id.cosx);
        Button tanx = findViewById(R.id.tanx);
        Button cotx = findViewById(R.id.cotx);
        Button secx = findViewById(R.id.secx);
        Button cosecx = findViewById(R.id.cosecx);
        Button xsinx = findViewById(R.id.xsinx);
        Button xcosx = findViewById(R.id.xcosx);
        Button xtanx = findViewById(R.id.xtanx);
        Button xsecx = findViewById(R.id.xsecx);
        Button sinxx = findViewById(R.id.sinxx);
        Button logx = findViewById(R.id.logx);
        Button xlogx = findViewById(R.id.xlogx);
        Button sinxcosx = findViewById(R.id.sinxcosx);
        obj = new MathematicalFunctionsPlot();
        sinx.setOnClickListener(this);
        cosx.setOnClickListener(this);
        tanx.setOnClickListener(this);
        cotx.setOnClickListener(this);
        secx.setOnClickListener(this);
        cosecx.setOnClickListener(this);
        xsinx.setOnClickListener(this);
        xcosx.setOnClickListener(this);
        xtanx.setOnClickListener(this);
        xsecx.setOnClickListener(this);
        sinxx.setOnClickListener(this);
        logx.setOnClickListener(this);
        xlogx.setOnClickListener(this);
        sinxcosx.setOnClickListener(this);

        Intent intent = new Intent(getBaseContext(),MathematicalFunctionsPlot.class);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.sinx:
            {
                obj.setViewID(R.id.sinx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.cosx:
            {
                obj.setViewID(R.id.cosx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.secx:
            {
                obj.setViewID(R.id.secx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.cosecx:
            {
                Log.v("Tag","Clicked");
                obj.setViewID(R.id.cosecx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.tanx:
            {
                obj.setViewID(R.id.tanx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.cotx:
            {
                obj.setViewID(R.id.cotx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.xsinx: {
                obj.setViewID(R.id.xsinx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.xcosx:
            {
                obj.setViewID(R.id.xcosx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.xtanx:
            {
                obj.setViewID(R.id.xtanx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.xsecx:
            {
                obj.setViewID(R.id.xsecx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.sinxx:
            {
                obj.setViewID(R.id.sinxx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.logx:
            {
                obj.setViewID(R.id.logx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.xlogx:
            {
                obj.setViewID(R.id.xlogx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
                break;
            }
            case R.id.sinxcosx:
            {
                obj.setViewID(R.id.sinxcosx);
                startActivity(new Intent(getBaseContext(),MathematicalFunctionsPlot.class));
            }
        }
    }
    @Override
    public boolean onSupportNavigateUp()
    {
        finish();
        return true;
    }
}
