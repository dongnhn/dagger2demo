package dong.media2359.dagger2demo.data.source;

import java.util.List;

import javax.inject.Inject;

import dong.media2359.dagger2demo.data.Item;
import dong.media2359.dagger2demo.di.ApplicationScope;
import dong.media2359.dagger2demo.util.IdUtil;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/7/17.
 */

@ApplicationScope /* notice the scope here */
public class ItemRepository implements ItemDataSource {

    private final int id;

    private ItemDataSource localDataSource;

    private ItemDataSource remoteDataSource;

    @Inject
    public ItemRepository(/* remember to use qualifier */ @Local ItemDataSource localDataSource, @Remote ItemDataSource remoteDataSource) {
        this.id = IdUtil.randomId();
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }

    @Override
    public List<Item> getItems() {
        return null;
    }

    @Override
    public String toString() {
        return "ItemRepository{" +
                "id=" + id +
                ", localDataSource=" + localDataSource +
                ", remoteDataSource=" + remoteDataSource +
                '}';
    }
}
