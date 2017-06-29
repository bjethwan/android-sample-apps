package com.bjethwan.br9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class FirstReceiver extends BroadcastReceiver {

    private static String TAG = FirstReceiver.class.getName();
    private static String msg = "This is from 1st Receiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i(TAG, msg);
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

        if(isOrderedBroadcast()){
            int resultCode = getResultCode();
            String resultData = getResultData();
            Bundle resultExtraBundle = getResultExtras(true);
            String resultExtraString = resultExtraBundle.getString("Title");

            Log.i(TAG, "resultCode: " + resultCode);
            Log.i(TAG, "resultData: " + resultData);
            Log.i(TAG, "resultExtraString: " + resultExtraString);

            setResultCode(83);
            setResultData("Blackberry");
            resultExtraBundle.putString("Title", "Lazy Developer");
            setResultExtras(resultExtraBundle);
        }



    }
}
