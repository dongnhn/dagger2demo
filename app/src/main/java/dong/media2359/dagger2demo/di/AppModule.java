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

    private Application application;

    public AppModule(Application application) {
        // Dagger doesn't know how to create context/application, so we must provide it through constructor
        this.application = application;
    }

    @Provides
    Context providesContext() {
        return this.application;
    }

    @ApplicationScope
    @Provides
    // now HomeActivity and ItemListFragment2 will use the same ImageLoader instance
    ImageLoader providesImageLoader(Context context) {
        return new ImageLoaderImpl(context);
    }

    @Provides
    SharedPreferences providesSharedPreferences(Context context) {
        return context.getSharedPreferences("data-pref", Context.MODE_PRIVATE);
    }
}
