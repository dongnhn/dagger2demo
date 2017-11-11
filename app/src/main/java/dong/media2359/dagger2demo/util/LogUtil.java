package dong.media2359.dagger2demo.util;

import android.util.Log;

/**
 * Created by Dong (nguyen.dong@2359media.com) on 11/10/17.
 */

public class LogUtil {
    public static void logDependencies(Object o) {
        Log.i("Dependencies", String.valueOf(o));
    }
}
