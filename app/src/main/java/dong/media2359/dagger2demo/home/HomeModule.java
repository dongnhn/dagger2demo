package dong.media2359.dagger2demo.home;

import dagger.Binds;
import dagger.Module;
import dong.media2359.dagger2demo.di.ActivityScope;
import dong.media2359.dagger2demo.itemlist.ItemListComponent;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Module(subcomponents = {ItemListComponent.class})
public abstract class HomeModule {

    // only need to provide HomePresenter
    // ImageLoader has already been provided in AppModule

    // HomeActivity is provided when creating HomeComponent, the constructor can be removed.

    // the HomeActivity provision method can be removed too.

    @ActivityScope
    @Binds
    abstract HomePresenter providesHomePresenter(HomePresenterImpl presenter);
}
