package com.bjethwan.br5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class FirstReceiver extends BroadcastReceiver {

    private static String TAG = FirstReceiver.class.getName();
    private static String msg = "This is from 1st Receiver - ";

    @Override
    public void onReceive(Context context, Intent intent)
    {
        Log.i(TAG, msg+Thread.currentThread().getName());
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        int a = 1;
        while(true) {
            a++;
        }
    }
}
