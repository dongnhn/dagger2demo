package dong.media2359.dagger2demo.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dong.media2359.dagger2demo.home.HomeComponent;
import dong.media2359.dagger2demo.imageloader.ImageLoader;
import dong.media2359.dagger2demo.imageloader.ImageLoaderImpl;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Module(subcomponents = {HomeComponent.class})
public abstract class AppModule {
    // provides the dependencies that're used in whole app

    // Application has been provided when creating component, so we don't need the constructor here anymore.
    // AppModule can be an abstract class now

    @ApplicationScope
    @Binds
    abstract Context bindsContext(Application application);

    @ApplicationScope
    @Binds
    // now HomeActivity and ItemListFragment2 will use the same ImageLoader instance
    abstract ImageLoader providesImageLoader(ImageLoaderImpl imageLoader);

    @ApplicationScope
    @Provides
    static SharedPreferences providesSharedPreferences(Context context) {
        return context.getSharedPreferences("data-pref", Context.MODE_PRIVATE);
    }
}
