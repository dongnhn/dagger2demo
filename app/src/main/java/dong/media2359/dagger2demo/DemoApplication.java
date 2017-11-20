package dong.media2359.dagger2demo;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dong.media2359.dagger2demo.di.AppComponent;
import dong.media2359.dagger2demo.di.DaggerAppComponent;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 6/9/17.
 */

public class DemoApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                // we don't need to create AppModule anymore, just provide the application
                .bindsApplication(this)
                .build();
        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
