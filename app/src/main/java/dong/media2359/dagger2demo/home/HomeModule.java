package dong.media2359.dagger2demo.home;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Module
public class HomeModule {

    // only need to provide HomePresenter
    // ImageLoader has already been provided in AppModule

    private HomeActivity homeActivity;

    public HomeModule(HomeActivity homeActivity) {
        // same reason as AppModule
        this.homeActivity = homeActivity;
    }

    @Provides
    HomeActivity providesHomeActivity() {
        return this.homeActivity;
    }

    @Provides
    HomePresenter providesHomePresenter(HomeActivity activity) {
        return new HomePresenterImpl(activity);
    }
}