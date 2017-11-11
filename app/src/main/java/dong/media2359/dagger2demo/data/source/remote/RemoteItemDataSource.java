package dong.media2359.dagger2demo.data.source.remote;

import java.util.List;

import dong.media2359.dagger2demo.data.Item;
import dong.media2359.dagger2demo.data.source.ItemDataSource;
import dong.media2359.dagger2demo.util.IdUtil;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/7/17.
 */

public class RemoteItemDataSource implements ItemDataSource {

    private final int id;

    public RemoteItemDataSource() {
        this.id = IdUtil.randomId();
    }

    @Override
    public List<Item> getItems() {
        return null;
    }

    @Override
    public String toString() {
        return "RemoteItemDataSource{" +
                "id=" + id +
                '}';
    }
}
