package com.bjethwan.br6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class SecondReceiver extends BroadcastReceiver {

    private static String TAG = SecondReceiver.class.getName();
    private static String msg = "This is from 2nd Receiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, msg);
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
