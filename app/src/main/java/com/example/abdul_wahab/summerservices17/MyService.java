package com.example.abdul_wahab.summerservices17;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MyService extends Service {
    private static final String TAG = "MTAG";

    public MyService() {
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Long Running Task
            }
        });

        //publish event
        EventBus.getDefault().post(new HelloWorldEvent("Hello EventBus!"));




        for (int i = 0; i < 23; i++) {

            // task
        }

        // stopSelf();

        return super.onStartCommand(intent, flags, startId);
    }



    // Unbound Service
    //StartService
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }
}
