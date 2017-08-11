package com.example.abdul_wahab.summerservices17;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, MyService.class);


        startService(intent);




        // stopservice



    }

    @Override
    protected void onStart() {
        super.onStart();

        // register eventbus
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void doThis(HelloWorldEvent event) {
        Log.d("MTAG", "doThis:   this is the event " + event);

    }

    @Override
    protected void onResume() {
        super.onResume();


    }
}
