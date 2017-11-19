package dong.media2359.dagger2demo.home;

import dagger.Subcomponent;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Subcomponent(modules = {HomeModule.class})
public interface HomeComponent {
    void inject(HomeActivity homeActivity);
}
