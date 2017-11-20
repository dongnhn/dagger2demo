package dong.media2359.dagger2demo.itemlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;
import dong.media2359.dagger2demo.R;
import dong.media2359.dagger2demo.util.LogUtil;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/10/17.
 */

public class ItemListFragment extends DaggerFragment {

    @Inject
    ItemListPresenter itemListPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list_item, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LogUtil.logDependencies(this);
    }

    @Override
    public String toString() {
        return "ItemListFragment{" +
                "itemListPresenter=" + itemListPresenter +
                '}';
    }
}
