package mvpdemo.wy.com.mvpdemo.views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import mvpdemo.wy.com.mvpdemo.R;
import mvpdemo.wy.com.mvpdemo.iview.IUserInfoView;
import mvpdemo.wy.com.mvpdemo.presenter.UserInfoPresenter;
import mvpdemo.wy.com.mvpdemo.userinfomodel.UserInfoModel;

public class MainActivity extends Activity implements IUserInfoView {

    private TextView tv_name;
    private TextView tv_age;
    private TextView tv_address;
    private UserInfoPresenter presenter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_age = (TextView) findViewById(R.id.tv_age);
        tv_address = (TextView) findViewById(R.id.tv_address);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ImageActivity.class));
            }
        });
        presenter = new UserInfoPresenter(this);
        presenter.loadUserInfo();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "正在加载", Toast.LENGTH_LONG).show();
    }

    @Override
    public void dismissLoading() {
        Toast.makeText(this, "加载完成", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showUserInfo(UserInfoModel userInfoModel) {
        if (userInfoModel != null) {
            tv_name.setText(userInfoModel.getName());
            tv_age.setText(String.valueOf(userInfoModel.getAge()));
            tv_address.setText(userInfoModel.getAddress());
        }
    }

    @Override
    public String loadUserId() {
        return "1000";//假设需要查询的用户信息的userId是1000
    }
}
