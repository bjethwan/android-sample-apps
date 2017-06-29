package com.bjethwan.br9;

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

        int resultCode = Activity.RESULT_OK;
        String resultData = "Android";

        Bundle bundle = new Bundle();
        bundle.putString("Title", "Smart Developer");

        Intent bcastIntent = new Intent("com.bjethwan.action.broadcastnow");

        sendOrderedBroadcast(bcastIntent,null, null, null, resultCode, resultData, bundle);
        //sendOrderedBroadcast(bcastIntent, null, new ResultReceiver(), null, resultCode, resultData, bundle);
    }

    public static class ThirdReceiver extends BroadcastReceiver {

        private static String TAG = ThirdReceiver.class.getName();
        private static String msg = "This is from 3rd Receiver";

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

                resultExtraBundle.putString("Title", "Wise Developer");

                setResult(17, "iOS", resultExtraBundle );
            }


        }
    }
}
