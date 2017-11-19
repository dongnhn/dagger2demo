package dong.media2359.dagger2demo.data.source;

import dagger.Binds;
import dagger.Module;
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

    /**
     * ItemRepository can be created by dagger, so we don't need to provide manually here
     * see @{@link ItemRepository}
     */
}
