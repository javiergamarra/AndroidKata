package com.nhpatt.androidkata.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main extends Activity implements View.OnClickListener {
    //Using interface OnClickListener to handle buttons.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FIXME why use a broadcast receiver?
        //FIXME why use a broadcast receiver inside an activity?
        //FIXME Advantages vs...
        //TODO goAsync() ?
        //TODO uses in globalmobile...

        //Setting listeners to buttons.
        findViewById(R.id.buttonSameActivity).setOnClickListener(this);
        findViewById(R.id.buttonOtherActivity).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        //Getting view ID to know what button was pressed.
        switch (view.getId()) {
            case R.id.buttonSameActivity:
                //Changing Button text if buttonSameActivity was pressed.
                ((Button) view).setText("Broadcast clicked!");
                break;
            case R.id.buttonOtherActivity:
                //Changing Activity when clicked.
                startActivity(new Intent(this, SecondActivity.class));
                break;
            default:
        }
    }
}
