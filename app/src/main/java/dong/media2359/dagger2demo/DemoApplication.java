package dong.media2359.dagger2demo;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import dong.media2359.dagger2demo.di.DaggerAppComponent;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 6/9/17.
 */

public class DemoApplication extends DaggerApplication { // notice that we use DaggerApplication from dagger.android.support

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder()
                .bindsApplication(this)
                .build();
    }
}
