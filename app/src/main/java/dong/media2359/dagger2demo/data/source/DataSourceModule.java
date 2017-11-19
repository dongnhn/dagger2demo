package dong.media2359.dagger2demo.data.source;

import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;
import dong.media2359.dagger2demo.data.source.local.SharedPrefItemDataSource;
import dong.media2359.dagger2demo.data.source.remote.RemoteItemDataSource;
import dong.media2359.dagger2demo.di.ApplicationScope;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Module
public class DataSourceModule {

    // we need to use qualifier when there're 2 or more methods that return the same type

    @ApplicationScope
    @Provides
    @Local
    static ItemDataSource providesLocalDataSource(SharedPreferences sharePref) {
        return new SharedPrefItemDataSource(sharePref);
    }

    @ApplicationScope
    @Provides
    @Remote
    static ItemDataSource providesRemoteDataSource() {
        return new RemoteItemDataSource();
    }

    @ApplicationScope
    @Provides
    static ItemRepository providesItemRepository(@Local ItemDataSource localDataSource, @Remote ItemDataSource remoteDataSource) {
        return new ItemRepository(localDataSource, remoteDataSource);
    }
}
