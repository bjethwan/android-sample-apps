package com.bjethwan.br7;

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
        bcastIntent.putExtra("x", 47);
        bcastIntent.putExtra("y", 2.9f);

        sendBroadcast(bcastIntent);
    }
}


