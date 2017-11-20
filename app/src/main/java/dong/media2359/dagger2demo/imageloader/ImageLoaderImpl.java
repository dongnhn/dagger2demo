package dong.media2359.dagger2demo.imageloader;

import android.content.Context;

import javax.inject.Inject;

import dong.media2359.dagger2demo.util.IdUtil;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 6/10/17.
 */

public class ImageLoaderImpl implements ImageLoader {

    private final int id;
    private Context context;

    @Inject
    public ImageLoaderImpl(Context context) {
        this.context = context;
        this.id = IdUtil.randomId();
    }

    @Override
    public void load(String url) {
    }

    @Override
    public String toString() {
        return "ImageLoaderImpl{" +
                "id=" + id +
                '}';
    }
}
