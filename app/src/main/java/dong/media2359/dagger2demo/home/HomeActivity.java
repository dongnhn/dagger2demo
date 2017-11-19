package dong.media2359.dagger2demo.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import javax.inject.Inject;

import dong.media2359.dagger2demo.DemoApplication;
import dong.media2359.dagger2demo.R;
import dong.media2359.dagger2demo.di.AppComponent;
import dong.media2359.dagger2demo.imageloader.ImageLoader;
import dong.media2359.dagger2demo.itemlist.ItemListFragment;
import dong.media2359.dagger2demo.itemlist.ItemListFragment2;
import dong.media2359.dagger2demo.util.LogUtil;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/10/17.
 */

public class HomeActivity extends FragmentActivity {
    @Inject
    ImageLoader imageLoader;
    @Inject
    HomePresenter homePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AppComponent appComponent = ((DemoApplication) getApplication()).getAppComponent();
        HomeComponent homeComponent = appComponent.homeComponent(new HomeModule(this));
        // imageLoader and homePresenter should not be null after this line
        homeComponent.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.bt_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(ItemListFragment.class.getName());
            }
        });

        findViewById(R.id.bt_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(ItemListFragment2.class.getName());
            }
        });

        LogUtil.logDependencies(this);
    }

    private void showFragment(String className) {
        Fragment fragment = Fragment.instantiate(this, className);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_list_content, fragment)
                .commit();
    }

    @Override
    public String toString() {
        return "HomeActivity{" +
                "imageLoader=" + imageLoader +
                ", homePresenter=" + homePresenter +
                '}';
    }
}
