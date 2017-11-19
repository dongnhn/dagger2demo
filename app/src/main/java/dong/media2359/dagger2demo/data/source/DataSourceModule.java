package dong.media2359.dagger2demo.data.source;

import android.content.SharedPreferences;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import dong.media2359.dagger2demo.data.source.local.SharedPrefItemDataSource;
import dong.media2359.dagger2demo.data.source.remote.RemoteItemDataSource;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Module
public class DataSourceModule {

    // we need to use qualifier when there're 2 or more methods that return the same type

    @Provides
    @Named("local")
    ItemDataSource providesLocalDataSource(SharedPreferences sharePref) {
        return new SharedPrefItemDataSource(sharePref);
    }

    @Provides
    @Named("remote")
    ItemDataSource providesRemoteDataSource() {
        return new RemoteItemDataSource();
    }

    @Provides
    ItemRepository providesItemRepository(@Named("local") ItemDataSource localDataSource, @Named("remote") ItemDataSource remoteDataSource) {
        return new ItemRepository(localDataSource, remoteDataSource);
    }
}
