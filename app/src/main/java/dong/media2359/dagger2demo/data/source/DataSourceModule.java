package dong.media2359.dagger2demo.data.source;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dong.media2359.dagger2demo.data.source.local.SharedPrefItemDataSource;
import dong.media2359.dagger2demo.data.source.remote.RemoteItemDataSource;
import dong.media2359.dagger2demo.di.ApplicationScope;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Module
public abstract class DataSourceModule {

    // we need to use qualifier when there're 2 or more methods that return the same type

    @ApplicationScope
    @Binds
    @Local
    abstract ItemDataSource bindsLocalDataSource(SharedPrefItemDataSource dataSource);

    @ApplicationScope
    @Binds
    @Remote
    abstract ItemDataSource bindsRemoteDataSource(RemoteItemDataSource dataSource);

    @ApplicationScope
    @Provides
    static ItemRepository providesItemRepository(@Local ItemDataSource localDataSource, @Remote ItemDataSource remoteDataSource) {
        return new ItemRepository(localDataSource, remoteDataSource);
    }
}
