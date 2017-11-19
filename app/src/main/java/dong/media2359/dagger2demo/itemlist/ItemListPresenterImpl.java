package dong.media2359.dagger2demo.itemlist;

import javax.inject.Inject;

import dong.media2359.dagger2demo.data.source.ItemRepository;
import dong.media2359.dagger2demo.util.IdUtil;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/7/17.
 */

public class ItemListPresenterImpl implements ItemListPresenter {
    private final int id;
    private ItemRepository itemRepository;

    @Inject
    public ItemListPresenterImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
        this.id = IdUtil.randomId();
    }

    @Override
    public void loadItems() {
        itemRepository.getItems();
    }

    @Override
    public String toString() {
        return "ItemListPresenterImpl{" +
                "id=" + id +
                ", itemRepository=" + itemRepository +
                '}';
    }
}
