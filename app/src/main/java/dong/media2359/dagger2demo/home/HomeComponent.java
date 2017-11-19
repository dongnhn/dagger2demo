package dong.media2359.dagger2demo.home;

import dagger.Subcomponent;
import dong.media2359.dagger2demo.itemlist.ItemListComponent;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Subcomponent(modules = {HomeModule.class})
public interface HomeComponent {
    void inject(HomeActivity homeActivity);

    // Declare ItemListComponent as a subcomponent of HomeComponent
    // Dagger can create ItemListModule, so don't need to provide it here
    ItemListComponent itemListComponent();
}
