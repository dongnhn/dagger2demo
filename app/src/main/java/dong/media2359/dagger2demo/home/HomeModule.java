package dong.media2359.dagger2demo.home;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import dong.media2359.dagger2demo.di.ActivityScope;
import dong.media2359.dagger2demo.itemlist.ItemListComponent;
import dong.media2359.dagger2demo.itemlist.ItemListComponent2;
import dong.media2359.dagger2demo.itemlist.ItemListFragment;
import dong.media2359.dagger2demo.itemlist.ItemListFragment2;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Module(subcomponents = {ItemListComponent.class, ItemListComponent2.class})
public abstract class HomeModule {

    // only need to provide HomePresenter
    // ImageLoader has already been provided in AppModule

    // HomeActivity is provided when creating HomeComponent, the constructor can be removed.

    // the HomeActivity provision method can be removed too.

    @ActivityScope
    @Binds
    abstract HomePresenter providesHomePresenter(HomePresenterImpl presenter);

    @Binds
    @IntoMap
    // notice the @FragmentKey for android support package
    @FragmentKey(ItemListFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindItemListBuilder(ItemListComponent.Builder builder);

    @Binds
    @IntoMap
    // notice the @FragmentKey for android support package
    @FragmentKey(ItemListFragment2.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindItemListBuilder2(ItemListComponent2.Builder builder);
}
