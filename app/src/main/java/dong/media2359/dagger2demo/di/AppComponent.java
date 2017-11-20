package dong.media2359.dagger2demo.di;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import dong.media2359.dagger2demo.DemoApplication;
import dong.media2359.dagger2demo.data.source.DataSourceModule;
import dong.media2359.dagger2demo.data.source.ItemRepository;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

@ApplicationScope
@Component(modules = {AppModule.class, DataSourceModule.class, AndroidSupportInjectionModule.class})
public interface AppComponent {
    ItemRepository getItemRepository();

    void inject(DemoApplication application);

    // replace Dagger auto-generated builder with our builder
    @Component.Builder
    interface Builder {
        // this method is required
        AppComponent build();

        /**
         * Provide the application when creating component
         * so that we don't need to pass it through AppModule constructor.
         * see @{@link AppModule}
         */
        @BindsInstance
        Builder bindsApplication(Application application);
    }
}
