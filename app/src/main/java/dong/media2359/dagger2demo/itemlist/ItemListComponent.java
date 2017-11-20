package dong.media2359.dagger2demo.itemlist;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dong.media2359.dagger2demo.di.FragmentScope;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@FragmentScope
@Subcomponent(modules = {ItemListModule.class})
public interface ItemListComponent extends AndroidInjector<ItemListFragment> {
    void inject(ItemListFragment2 itemListFragment2);

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ItemListFragment> {
    }
}
