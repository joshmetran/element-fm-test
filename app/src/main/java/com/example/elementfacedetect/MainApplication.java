package com.example.elementfacedetect;

import android.app.Application;

import com.element.camera.ElementFaceSDK;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ElementFaceSDK.initSDK(this);
        ElementFaceSDK.enableDebugMode(getBaseContext(), true);
    }
}
