package dong.media2359.dagger2demo.di;

import dagger.Component;
import dong.media2359.dagger2demo.home.HomeComponent;
import dong.media2359.dagger2demo.imageloader.ImageLoader;
import dong.media2359.dagger2demo.home.HomeModule;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Component(modules = {AppModule.class})
public interface AppComponent {
    ImageLoader getImageLoader();
    // Dagger doesn't know how to create HomeModule, so we must provide it in constructor
    HomeComponent homeComponent(HomeModule homeModule);
}
