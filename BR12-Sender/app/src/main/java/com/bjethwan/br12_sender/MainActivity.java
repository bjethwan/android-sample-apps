package com.bjethwan.br12_sender;
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

    public void broadcastNow(View view)
    {
        Intent bcastIntent = new Intent("com.bjethwan.action.broadcastnow");
        sendBroadcast(bcastIntent, "com.bjethwan.permission.broadcast");
    }
}

