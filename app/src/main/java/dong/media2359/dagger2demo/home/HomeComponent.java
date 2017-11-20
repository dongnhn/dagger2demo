package dong.media2359.dagger2demo.home;

import dagger.BindsInstance;
import dagger.Subcomponent;
import dong.media2359.dagger2demo.di.ActivityScope;
import dong.media2359.dagger2demo.itemlist.ItemListComponent;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@ActivityScope
@Subcomponent(modules = {HomeModule.class})
public interface HomeComponent {
    void inject(HomeActivity homeActivity);

    ItemListComponent.Builder itemListBuilder();

    @Subcomponent.Builder
    interface Builder {
        // this method is required
        HomeComponent build();

        @BindsInstance
        Builder bindsHomeActivity(HomeActivity activity);
    }
}
