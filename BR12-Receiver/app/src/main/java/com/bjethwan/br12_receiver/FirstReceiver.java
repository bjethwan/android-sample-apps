package com.bjethwan.br12_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class FirstReceiver extends BroadcastReceiver {

    private static String TAG = FirstReceiver.class.getName();
    private static String msg = "BR12-Receiver App - This is from 1st Receiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, msg);
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
