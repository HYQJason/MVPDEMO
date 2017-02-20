package mvpdemo.wy.com.mvpdemo.presenter;

import java.util.List;

import mvpdemo.wy.com.mvpdemo.iview.Imagelistinfo;

/**
 * Created by WY on 2017/2/10.
 */

public class ImagePresenter {
   private Imagelistinfo imagelistinfo;


  public    ImagePresenter(Imagelistinfo imagelistinfo){
      this.imagelistinfo=imagelistinfo;

  }


    public void loadData(){
        List<String> userId = imagelistinfo.loadUserId();



        imagelistinfo.showLoading();//接口请求前显示loading
        imagelistinfo.showUserInfo(userId);

    }

}
