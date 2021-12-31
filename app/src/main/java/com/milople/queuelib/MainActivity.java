package com.milople.queuelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.milople.queue.Queue;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Queue.toasty(this,"Bhoomi");

    }
}