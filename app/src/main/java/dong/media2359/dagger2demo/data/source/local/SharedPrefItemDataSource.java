package dong.media2359.dagger2demo.data.source.local;

import android.content.SharedPreferences;

import java.util.List;

import javax.inject.Inject;

import dong.media2359.dagger2demo.data.Item;
import dong.media2359.dagger2demo.data.source.ItemDataSource;
import dong.media2359.dagger2demo.util.IdUtil;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/7/17.
 */

public class SharedPrefItemDataSource implements ItemDataSource {

    private final int id;

    private SharedPreferences sharedPreferences;

    @Inject
    public SharedPrefItemDataSource(SharedPreferences sharedPreferences) {
        this.id = IdUtil.randomId();
        this.sharedPreferences = sharedPreferences;
    }

    @Override
    public List<Item> getItems() {
        return null;
    }

    @Override
    public String toString() {
        return "SharedPrefItemDataSource{" +
                "id=" + id +
                ", sharedPreferences=" + sharedPreferences +
                '}';
    }
}
