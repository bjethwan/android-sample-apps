package com.bjethwan.br8;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void broadcastNow(View view) {
        Intent bcastIntent = new Intent("com.bjethwan.action.broadcastnow");
        sendOrderedBroadcast(bcastIntent,null);
    }

    public static class ThirdReceiver extends BroadcastReceiver {

        private static String TAG = ThirdReceiver.class.getName();
        private static String msg = "This is from 3rd Receiver";

        @Override
        public void onReceive(Context context, Intent intent) {
            Log.i(TAG, msg);
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }
    }
}
