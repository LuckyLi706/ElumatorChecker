package com.lucky.elumatorchecker;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.lucky.dangerchecker.DangerProtector;
import com.lucky.dangerchecker.model.EmulatorInfo;
import com.lucky.dangerchecker.utils.LogUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogUtil.setDebug(false);

        TextView textView = findViewById(R.id.tv_show);

        findViewById(R.id.btn_check).setOnClickListener(v -> {
            EmulatorInfo emulator = DangerProtector.isEmulator(MainActivity.this, 2);
            boolean debug = DangerProtector.isDebug(MainActivity.this);
            boolean root = DangerProtector.isRoot(MainActivity.this);
            boolean isXposed = DangerProtector.isXposedExist(MainActivity.this);

            textView.append("模拟器：" + emulator.toString() + "\n");
            textView.append("debug: " + debug + "\n");
            textView.append("root: " + root + "\n");
            textView.append("isXposed: " + isXposed + "\n");
        });
    }
}