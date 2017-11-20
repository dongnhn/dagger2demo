package dong.media2359.dagger2demo.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;
import dong.media2359.dagger2demo.imageloader.ImageLoader;
import dong.media2359.dagger2demo.imageloader.ImageLoaderImpl;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Module
public class AppModule {
    // provides the dependencies that're used in whole app

    // Application has been provided when creating component, so we don't need the constructor here anymore.

    @ApplicationScope
    @Provides
    Context providesContext(Application application) {
        return application;
    }

    @ApplicationScope
    @Provides
    // now HomeActivity and ItemListFragment2 will use the same ImageLoader instance
    static ImageLoader providesImageLoader(Context context) {
        return new ImageLoaderImpl(context);
    }

    @ApplicationScope
    @Provides
    static SharedPreferences providesSharedPreferences(Context context) {
        return context.getSharedPreferences("data-pref", Context.MODE_PRIVATE);
    }
}
