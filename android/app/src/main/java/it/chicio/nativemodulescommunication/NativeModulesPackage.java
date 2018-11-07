package it.chicio.nativemodulescommunication;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class NativeModulesPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
            List<NativeModule> modules = new ArrayList<>();
            modules.add(new ReactNativeModalBridge(reactContext));
            return modules;
        }

        @Override
        public List<ViewManager> createViewManagers (ReactApplicationContext reactContext){
            return emptyList();
        }
    }
