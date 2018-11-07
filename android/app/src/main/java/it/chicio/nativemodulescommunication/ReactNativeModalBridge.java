package it.chicio.nativemodulescommunication;

import android.app.Activity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ReactNativeModalBridge extends ReactContextBaseJavaModule {

    public ReactNativeModalBridge(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @ReactMethod
    public void closeModal() {
        final Activity currentActivity = getCurrentActivity();
        currentActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ((NativeModulesApplication) currentActivity.getApplication())
                        .getBus()
                        .post(new CloseModalEvent());
            }
        });
    }

    public class CloseModalEvent { }
}
