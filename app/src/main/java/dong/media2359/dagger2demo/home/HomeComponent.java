package dong.media2359.dagger2demo.home;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dong.media2359.dagger2demo.di.ActivityScope;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@ActivityScope
@Subcomponent(modules = {HomeModule.class})
public interface HomeComponent extends AndroidInjector<HomeActivity> {
    // inject(HomeActivity) is already defined in AndroidInjector

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeActivity> {
        // build() is already defined in AndroidInjector.Builder

        // seedInstance(HomeActivity) is defined in AndroidInjector.Builder, don't need
        // to provide another method
    }
}
