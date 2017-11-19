package dong.media2359.dagger2demo.itemlist;

import dagger.Subcomponent;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Subcomponent(modules = {ItemListModule.class})
public interface ItemListComponent {
    void inject(ItemListFragment itemListFragment);
}
