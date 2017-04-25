package com.hqc.demo.remoteservicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.hqc.demo.utils.Log;

public class remoteservice extends Service {

    private static final String TAG = "remoteservicedemo";

    public remoteservice() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG,"onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}
