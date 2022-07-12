package com.lucky.elumatorchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.lucky.dangerchecker.DangerProtector;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File file = new File("/system/priv-app/ldAppStore/");
        Log.d("ddd",file.isDirectory()+"");

        findViewById(R.id.btn_check).setOnClickListener(v -> {
            Log.d("ddd", DangerProtector.isEmulator(this, 2).toString());
        });
    }
}