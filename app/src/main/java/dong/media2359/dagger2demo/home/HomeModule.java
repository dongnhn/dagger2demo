package dong.media2359.dagger2demo.home;

import dagger.Module;
import dagger.Provides;
import dong.media2359.dagger2demo.di.ActivityScope;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Module
public class HomeModule {

    // only need to provide HomePresenter
    // ImageLoader has already been provided in AppModule

    // HomeActivity is provided when creating HomeComponent, the constructor can be removed.

    // the HomeActivity provision method can be removed too.

    @ActivityScope
    @Provides
    static HomePresenter providesHomePresenter(HomeActivity activity) {
        return new HomePresenterImpl(activity);
    }
}
