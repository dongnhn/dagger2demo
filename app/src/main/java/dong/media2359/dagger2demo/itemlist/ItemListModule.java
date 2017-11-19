package dong.media2359.dagger2demo.itemlist;

import dagger.Module;
import dagger.Provides;
import dong.media2359.dagger2demo.data.source.ItemRepository;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Module
public class ItemListModule {
    @Provides
    ItemListPresenter providesItemListPresenter(ItemRepository itemRepository) {
        return new ItemListPresenterImpl(itemRepository);
    }
}
