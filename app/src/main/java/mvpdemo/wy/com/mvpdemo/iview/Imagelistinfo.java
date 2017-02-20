package mvpdemo.wy.com.mvpdemo.iview;

import java.util.List;

import mvpdemo.wy.com.mvpdemo.userinfomodel.ImageModel;

/**
 * Created by WY on 2017/2/10.
 */

public interface Imagelistinfo {





        List<String> loadUserId();//假设接口请求需要一个userId
        void showLoading();//展示加载框
        void dismissLoading();//取消加载框展示
        void showUserInfo(List<String> list);//将网络请求得到的用户信息回调







}
