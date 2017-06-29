package com.bjethwan.br11;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private TextView textView;
    private int count;
    private TimeTickReceiver timeTickReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = 1;
        textView = (TextView)findViewById(R.id.textView);
        timeTickReceiver = new TimeTickReceiver();
    }
    public void registerBroadcastReceiver(View view) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_TIME_TICK);
        registerReceiver(timeTickReceiver, intentFilter);
    }
    public void unregisterBroadcastReceiver(View view) {
        unregisterReceiver(timeTickReceiver);
    }
    private class TimeTickReceiver extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            textView.setText(count + "minutes over");
            count++;
            Toast.makeText(context, "This is from TimeTickReceiver", Toast.LENGTH_SHORT).show();
        }
    }
}

