package com.bjethwan.br13;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class IncomingReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        if(state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
            Toast.makeText(context, "BR13 Demoapp: Phone is ringing.", Toast.LENGTH_LONG).show();
        }else if(state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)){
            Toast.makeText(context, "BR13 Demoapp: Call has been received.", Toast.LENGTH_LONG).show();
        }else if(state.equals(TelephonyManager.EXTRA_STATE_IDLE)){
            Toast.makeText(context, "BR13 Demoapp: Phone in idle state.", Toast.LENGTH_LONG).show();
        }
    }
}
