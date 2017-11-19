package dong.media2359.dagger2demo.itemlist;

import dagger.Binds;
import dagger.Module;
import dong.media2359.dagger2demo.di.FragmentScope;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Module
public abstract class ItemListModule {

    // @Binds only applicable to abstract methods, therefore the module class must be an abstract class too.
    // So module with non-empty constructor can't use @Binds

    @FragmentScope
    @Binds
    abstract ItemListPresenter bindsItemListPresenter(ItemListPresenterImpl itemListPresenter);
}
