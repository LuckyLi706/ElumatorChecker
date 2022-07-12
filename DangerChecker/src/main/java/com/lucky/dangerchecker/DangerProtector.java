package com.lucky.dangerchecker;

import android.content.Context;

import com.lucky.dangerchecker.model.EmulatorInfo;
import com.lucky.dangerchecker.recognite.Debug;
import com.lucky.dangerchecker.recognite.Emulator;
import com.lucky.dangerchecker.recognite.Root;
import com.lucky.dangerchecker.recognite.Xposed;

public class DangerProtector {


    /**
     * 识别模拟器
     *
     * @param context   上下文对象
     * @param MAX_INDEX 最大的阈值
     * @return
     */
    public static EmulatorInfo isEmulator(Context context, int MAX_INDEX) {
        return Emulator.getInstance().distinguishVM(context, MAX_INDEX);
    }

    public static boolean isRoot(Context context) {
        return Root.getInstance().isRoot(context);
    }

    public static boolean isXposedExist(Context context) {
        return Xposed.getInstance().isXposed(context);
    }

    public static boolean isMultipleApp(Context context) {
        //return MultipleApp.getInstance().isMultiApp(context);
        return false;
    }

    public static boolean isDebug(Context context) {
        return Debug.getInstance().isDebug(context);
    }
}
