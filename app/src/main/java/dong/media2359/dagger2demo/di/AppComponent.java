package dong.media2359.dagger2demo.di;

import dagger.Component;
import dong.media2359.dagger2demo.imageloader.ImageLoader;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@Component(modules = {AppModule.class})
public interface AppComponent {
    ImageLoader getImageLoader();
}
