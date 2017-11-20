package dong.media2359.dagger2demo.home;

import javax.inject.Inject;

import dong.media2359.dagger2demo.util.IdUtil;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/19/17.
 */

public class HomePresenterImpl implements HomePresenter {
    private final int id;
    private HomeActivity activity;

    @Inject
    public HomePresenterImpl(HomeActivity activity) {
        this.activity = activity;
        id = IdUtil.randomId();
    }

    @Override
    public String toString() {
        return "HomePresenterImpl{" +
                "id=" + id +
                ", activity=" + activity.getClass().getName() +
                '}';
    }
}
