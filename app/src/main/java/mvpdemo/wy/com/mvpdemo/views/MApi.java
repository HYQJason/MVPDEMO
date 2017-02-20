package mvpdemo.wy.com.mvpdemo.views;

import io.reactivex.Observable;
import mvpdemo.wy.com.mvpdemo.userinfomodel.User;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by WY on 2017/2/10.
 */

public interface MApi {

    @GET("/users/{user}")
    Observable<User> user(@Path("user") String user);
}
