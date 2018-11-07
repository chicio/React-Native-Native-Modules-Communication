package it.chicio.nativemodulescommunication;

import android.app.Application;

import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.squareup.otto.Bus;

import java.util.Arrays;
import java.util.List;

public class NativeModulesApplication extends Application {
    private Bus bus;

    @Override
    public void onCreate() {
        super.onCreate();
        bus = new Bus();
    }

    public Bus getBus() {
        return bus;
    }
}
