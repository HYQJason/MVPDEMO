package mvpdemo.wy.com.mvpdemo.views;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;

import com.zhy.autolayout.config.AutoLayoutConifg;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import mvpdemo.wy.com.mvpdemo.R;
import mvpdemo.wy.com.mvpdemo.adapter.base.CommonAdapter;
import mvpdemo.wy.com.mvpdemo.adapter.base.ViewHolder;
import mvpdemo.wy.com.mvpdemo.iview.Imagelistinfo;
import mvpdemo.wy.com.mvpdemo.presenter.ImagePresenter;
import mvpdemo.wy.com.mvpdemo.userinfomodel.ImageModel;
import mvpdemo.wy.com.mvpdemo.userinfomodel.User;
import mvpdemo.wy.com.mvpdemo.utils.ImageLoadingConfig;

public class ImageActivity extends Activity implements Imagelistinfo {

    ListView listView;
    CommonAdapter commonAdapter;
    ImagePresenter imagePresenter;
    private List<String> Datas = new ArrayList<String>();

    private List<String> urllist=new ArrayList<>();










    MApi mapi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

      listView= (ListView) findViewById(R.id.imagelistview);
        setadapter();
        imagePresenter=new ImagePresenter(this);
        imagePresenter.loadData();
mapi=MService.createGithubService();

        mapi.user("").subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new DisposableObserver<User>() {
            @Override
            public void onNext(User value) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

       // DisposableObserver

    }

    @Override
    public List<String> loadUserId() {
        urllist.add("http://img3.duitang.com/uploads/item/201608/06/20160806091136_253BA.jpeg");
        urllist.add("http://img1.3lian.com/img013/v4/96/d/45.jpg");
        urllist.add("http://img1.imgtn.bdimg.com/it/u=2182277056,2656834999&fm=23&gp=0.jpg");
        urllist.add("http://pic6.wed114.cn/20150304/2015030410270882644051.jpg");
        urllist.add("http://pic75.nipic.com/file/20150814/13154091_170951424000_2.jpg");
        urllist.add("http://img2.imgtn.bdimg.com/it/u=2679297709,1421413045&fm=21&gp=0.jpg");
        urllist.add("http://img4.imgtn.bdimg.com/it/u=1084681976,1737762884&fm=23&gp=0.jpg");
        urllist.add("http://pic3.nipic.com/20090610/2036169_131951057_2.jpg");
        urllist.add("http://pic17.nipic.com/20111026/3631203_111238646000_2.jpg");
        urllist.add("http://pic.baike.soso.com/p/20110505/bki-20110505023143-2085807902.jpg");
        urllist.add("http://pic36.nipic.com/20131130/4499633_223342288000_2.jpg");
        return urllist;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void showUserInfo(List<String> imageModel) {
        Datas.addAll(imageModel);
        Log.i("TAG","========daxiao"+imageModel.size());
        commonAdapter.notifyDataSetChanged();


    }

    private void setadapter(){

        commonAdapter=new CommonAdapter(this,R.layout.imageitem,Datas) {
            @Override
            protected void convert(ViewHolder viewHolder, Object item, int position) {
             String imageurl= (String) item;
                Log.i("TAG","============================="+imageurl);
              ImageView  imageView= viewHolder.getView(R.id.imageview);

                ImageLoadingConfig.displayImage(imageurl,imageView,  ImageLoadingConfig. generateDisplayImageOptions());
            }
        };
        listView.setAdapter(commonAdapter);

    }
}
