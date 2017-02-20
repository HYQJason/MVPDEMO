package mvpdemo.wy.com.mvpdemo.views;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;

import mvpdemo.wy.com.mvpdemo.utils.ImageLoadingConfig;

/**
 * Created by WY on 2017/2/10.
 */

public class MApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AutoLayoutConifg.getInstance().useDeviceSize().init(this);


        ImageLoadingConfig.initImageLoader(this);

    }
}
