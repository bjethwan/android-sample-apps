package com.bjethwan.br9;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ResultReceiver extends BroadcastReceiver {

    private static String TAG = ResultReceiver.class.getName();
    private static String msg = "This is from Result Receiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        if(isOrderedBroadcast()){

            Log.i(TAG, msg);
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

            int resultCode = getResultCode();
            String resultData = getResultData();
            Bundle resultExtraBundle = getResultExtras(true);
            String resultExtraString = resultExtraBundle.getString("Title");

            Log.i(TAG, "resultCode: " + resultCode);
            Log.i(TAG, "resultData: " + resultData);
            Log.i(TAG, "resultExtraString: " + resultExtraString);
        }

    }
}
