package dong.media2359.dagger2demo.home;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dong.media2359.dagger2demo.di.ActivityScope;
import dong.media2359.dagger2demo.di.FragmentScope;
import dong.media2359.dagger2demo.itemlist.ItemListFragment;
import dong.media2359.dagger2demo.itemlist.ItemListFragment2;
import dong.media2359.dagger2demo.itemlist.ItemListModule;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Module
public abstract class HomeModule {

    // only need to provide HomePresenter
    // ImageLoader has already been provided in AppModule

    // HomeActivity is provided when creating HomeComponent, the constructor can be removed.

    // the HomeActivity provision method can be removed too.

    @ActivityScope
    @Binds
    abstract HomePresenter providesHomePresenter(HomePresenterImpl presenter);

    @FragmentScope // move the scope from ItemListComponent to this
    @ContributesAndroidInjector(modules = {ItemListModule.class})
    abstract ItemListFragment contributeItemListFragmentInjector();

    @FragmentScope // move the scope from ItemListComponent2 to this
    @ContributesAndroidInjector(modules = {ItemListModule.class})
    abstract ItemListFragment2 contributeItemListFragment2Injector();
}
