package com.example.temi.searchcal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // initiate a Switch
    Switch aSwitch = (Switch) findViewById(R.id.switch1);

    // check current state of a Switch (true or false).
    Boolean switchState = aSwitch.isChecked();

    public void onClick(View view){
    if (aSwitch.isChecked()){
        Intent intent = new Intent(MainActivity.this,Calendar.class);//changing screens from MainActivity to Unlock screen
        startActivityForResult(intent,1);
    }
}


}
