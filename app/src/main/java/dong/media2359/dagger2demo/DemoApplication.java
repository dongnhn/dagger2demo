package dong.media2359.dagger2demo;

import android.app.Application;

import dong.media2359.dagger2demo.di.AppComponent;
import dong.media2359.dagger2demo.di.AppModule;
import dong.media2359.dagger2demo.di.DaggerAppComponent;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 6/9/17.
 */

public class DemoApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
