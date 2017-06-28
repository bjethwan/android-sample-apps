package com.bjethwan.br6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class FirstReceiver extends BroadcastReceiver {

    private static String TAG = FirstReceiver.class.getName();
    private static String msg = "This is from 1st Receiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        int x = (int) intent.getIntExtra("x", 0);
        float y = (float) intent.getFloatExtra("y", 0f);
        Log.i(TAG, msg+", x = "+x +" y = "+y);
        Toast.makeText(context, msg+", x = "+x +" y = "+y, Toast.LENGTH_SHORT).show();
    }
}
