package dong.media2359.dagger2demo.itemlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import dong.media2359.dagger2demo.R;
import dong.media2359.dagger2demo.imageloader.ImageLoader;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/10/17.
 */

public class ItemListFragment2 extends ItemListFragment {

    // imageLoader is still null after parent fragment have done the injection.
    // this is because Dagger only injects the super class type.

    @Inject
    ImageLoader imageLoader;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list_item2, container, false);
    }

    @Override
    public String toString() {
        return "ItemListFragment2{" +
                "imageLoader=" + imageLoader +
                ", itemListPresenter=" + itemListPresenter +
                '}';
    }
}
