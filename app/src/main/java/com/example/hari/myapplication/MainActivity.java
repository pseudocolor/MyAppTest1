package com.example.hari.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements Test1Fragment.Test1Listener{

    TextView totalTextView;
    EditText percentageText;
    EditText numberText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*
        totalTextView = (TextView) findViewById(R.id.totalTextView);
        percentageText = (EditText) findViewById(R.id.percentageText);
        numberText = (EditText) findViewById(R.id.numberText);

        Button calculateButton = (Button) findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                float percentage = Float.parseFloat(percentageText.getText().toString());
                float dec = percentage / 100;
                float total = dec * Float.parseFloat(numberText.getText().toString());

                totalTextView.setText(Float.toString(total));
            }
        });
        */

        /*
        Button btCliker = (Button) findViewById(R.id.btButton1);
        btCliker.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){

                        TextView txtChange = (TextView) findViewById(R.id.txtText1);
                        txtChange.setText("faaak");
                    }
                }
        );
        */



    }


    //this get called by the test1 fragment when user click button
    @Override
    public void changeText(String topText, String bottomText) {

        Bg1Fragment bgFragment = (Bg1Fragment) getSupportFragmentManager().findFragmentById(R.id.fragment6);
        bgFragment.setChangeText(topText, bottomText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
