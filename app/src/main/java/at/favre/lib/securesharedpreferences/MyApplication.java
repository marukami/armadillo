package at.favre.lib.securesharedpreferences;

import android.app.Application;
import android.util.Log;

import com.facebook.stetho.Stetho;

public class MyApplication extends Application {

    public void onCreate() {
        super.onCreate();
        Log.d("MyApplication", "onCreate: was called");
        Stetho.initializeWithDefaults(this);
    }
}
