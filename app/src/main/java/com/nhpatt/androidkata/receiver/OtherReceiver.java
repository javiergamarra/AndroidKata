package com.nhpatt.androidkata.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.nhpatt.androidkata.activity.SecondActivity;

public class OtherReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intentActivity = new Intent(context, SecondActivity.class);
        intentActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intentActivity);

       //FIXME

        //FIXME tests
    }
}
