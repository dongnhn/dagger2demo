package dong.media2359.dagger2demo.data.source;

import java.util.List;

import dong.media2359.dagger2demo.data.Item;
import dong.media2359.dagger2demo.util.IdUtil;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/7/17.
 */

public class ItemRepository implements ItemDataSource {

    private final int id;

    private ItemDataSource localDataSource;

    private ItemDataSource remoteDataSource;

    public ItemRepository(ItemDataSource localDataSource, ItemDataSource remoteDataSource) {
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
