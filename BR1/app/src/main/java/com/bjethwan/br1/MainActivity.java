package com.bjethwan.br1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void broadcastNow(View view)
    {
        Intent broadcastIntent = new Intent(this, FirstReceiver.class);
        sendBroadcast(broadcastIntent);
    }
}
