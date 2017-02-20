package mvpdemo.wy.com.mvpdemo.presenter;

import android.os.Handler;

import mvpdemo.wy.com.mvpdemo.iview.IUserInfoView;
import mvpdemo.wy.com.mvpdemo.userinfomodel.UserInfoModel;

/**
 * Created by WY on 2017/2/10.
 */

public class UserInfoPresenter {

    private IUserInfoView iUserInfoView;

    public UserInfoPresenter(IUserInfoView iUserInfoView) {
        this.iUserInfoView = iUserInfoView;
    }

    public void loadUserInfo() {
        String userId = iUserInfoView.loadUserId();
        iUserInfoView.showLoading();//接口请求前显示loading
        //这里模拟接口请求回调-
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //模拟接口返回的json，并转换为javaBean
                UserInfoModel userInfoModel = new UserInfoModel("小宝", 1, "杭州");
                iUserInfoView.showUserInfo(userInfoModel);
                iUserInfoView.dismissLoading();
            }
        }, 3000);
    }

}
