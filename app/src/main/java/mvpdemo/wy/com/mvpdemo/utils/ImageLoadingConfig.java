package mvpdemo.wy.com.mvpdemo.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;


public class ImageLoadingConfig {

	public static void displayImage(String url, ImageView imageView,
									DisplayImageOptions options) {

		ImageLoader.getInstance().displayImage(url, imageView, options);

	}

	public static void displayImage(String url, ImageView imageView) {

		ImageLoader.getInstance().displayImage(url, imageView);

	}

/*	options = new DisplayImageOptions.Builder()
			.showImageOnLoading(R.drawable.ic_launcher) // 设置图片下载期间显示的图片
	.showImageForEmptyUri(R.drawable.ic_launcher) // 设置图片Uri为空或是错误的时候显示的图片
	.showImageOnFail(R.drawable.ic_launcher) // 设置图片加载或解码过程中发生错误显示的图片
	.cacheInMemory(true) // 设置下载的图片是否缓存在内存中
	.cacheOnDisk(true) // 设置下载的图片是否缓存在SD卡中
	//	.displayer(new RoundedBitmapDisplayer(20)) // 设置成圆角图片
	.build(); // 构建完成*/

/*		.showImageOnLoading(R.drawable.ic_stub) // 设置图片下载期间显示的图片
                .showImageForEmptyUri(R.drawable.ic_empty) // 设置图片Uri为空或是错误的时候显示的图片
				.showImageOnFail(R.drawable.ic_error)*/

	//圆角列表
public static DisplayImageOptions CircleDisplayImageOptions(int drawableId) {
	DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
			.showImageOnLoading(drawableId).cacheInMemory(true)
			.cacheOnDisc(true).considerExifParams(true).displayer(new RoundedBitmapDisplayer(10))
			.imageScaleType(ImageScaleType.EXACTLY)
			.bitmapConfig(Bitmap.Config.RGB_565).build();

	return displayImageOptions;
}

	//圆型列表
	public static DisplayImageOptions CircleImageOptions(int drawableId) {
		DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
				.showImageOnLoading(drawableId).cacheInMemory(true)
				.cacheOnDisc(true).considerExifParams(true).displayer(new RoundedBitmapDisplayer(100))
				.showImageForEmptyUri(drawableId)
				.showImageOnFail(drawableId)
				.imageScaleType(ImageScaleType.EXACTLY)
				.bitmapConfig(Bitmap.Config.RGB_565).build();

		return displayImageOptions;
	}

	//圆型列表
	public static DisplayImageOptions CirclePhoto(int drawableId) {
		DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
				.showImageOnLoading(drawableId).cacheInMemory(true)
				.cacheOnDisc(true).considerExifParams(true)
				.showImageForEmptyUri(drawableId)
				.showImageOnFail(drawableId)
				.imageScaleType(ImageScaleType.EXACTLY)
				.bitmapConfig(Bitmap.Config.RGB_565).build();

		return displayImageOptions;
	}

	// 列表图片加载option
	public static DisplayImageOptions generateDisplayImageOptions(int drawableId) {
		DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
				.showImageOnLoading(drawableId).cacheInMemory(true)
				.cacheOnDisc(true).considerExifParams(true)
				.showImageForEmptyUri(drawableId)
				.showImageOnFail(drawableId)
				.imageScaleType(ImageScaleType.EXACTLY)
				.bitmapConfig(Bitmap.Config.RGB_565).build();

		return displayImageOptions;
	}

	// 大图加载option
	public static DisplayImageOptions generateDisplayImageOptions() {
		DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
				.resetViewBeforeLoading(true).cacheOnDisc(true)
				.cacheInMemory(true).imageScaleType(ImageScaleType.EXACTLY)
				.bitmapConfig(Bitmap.Config.RGB_565).considerExifParams(true)
				.build();

		return displayImageOptions;

	}

	//
	public static DisplayImageOptions bgDisplayImageOptions(int drawableId) {
		DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
				.showImageOnLoading(drawableId).cacheInMemory(true)
				.cacheOnDisc(true).considerExifParams(true)
				.imageScaleType(ImageScaleType.EXACTLY)
				.bitmapConfig(Bitmap.Config.RGB_565).build();

		return displayImageOptions;
	}

	// 图片上传部分 图片加载option
	public static DisplayImageOptions generateDisplayImageOptionsNoCatchDisc() {
		DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
				.cacheInMemory(false).cacheOnDisc(false)
				.considerExifParams(true)
				.imageScaleType(ImageScaleType.EXACTLY)
				.bitmapConfig(Bitmap.Config.RGB_565).build();

		return displayImageOptions;
	}
	
	// 大图加载option (供WhisperPublishActivityNew调用)
	public static DisplayImageOptions generateDisplayImageOptionsWithDefaultImg(
			int drawableId) {
		DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
				.showImageOnLoading(drawableId).resetViewBeforeLoading(true)
				.cacheOnDisc(true).cacheInMemory(true)
				.imageScaleType(ImageScaleType.EXACTLY)
				.bitmapConfig(Bitmap.Config.RGB_565).considerExifParams(true)
				.build();

		return displayImageOptions;

	}
	
	// 大图加载option (供WhisperPublishActivityNew调用)
	public static DisplayImageOptions generateDisplayImageOptionsWithNotClear() {
		DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
				.resetViewBeforeLoading(false).cacheOnDisc(true)
				.cacheInMemory(true).imageScaleType(ImageScaleType.EXACTLY)
				.bitmapConfig(Bitmap.Config.RGB_565).considerExifParams(true)
				.build();

		return displayImageOptions;

	}
	
	//启动图加载option
	public static DisplayImageOptions generateDisplayStartupImageOptions() {
		DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
				.resetViewBeforeLoading(true).cacheOnDisc(false)
				.cacheInMemory(true).imageScaleType(ImageScaleType.EXACTLY)
				.bitmapConfig(Bitmap.Config.RGB_565).considerExifParams(true)
				.build();

		return displayImageOptions;

	}

	//指定大小尺寸
	public static DisplayImageOptions generateDisplayStartupImageOptions(int w , int h) {
		DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
				.resetViewBeforeLoading(true).cacheOnDisc(false)
				.cacheInMemory(true).imageScaleType(ImageScaleType.EXACTLY)
				.bitmapConfig(Bitmap.Config.RGB_565).considerExifParams(true)
				.build();

		return displayImageOptions;

	}




	public static void initImageLoader(Context context)  {

		ImageLoaderConfiguration.Builder config = new ImageLoaderConfiguration.Builder(context);
		config.threadPriority(Thread.NORM_PRIORITY - 2);
		config.denyCacheImageMultipleSizesInMemory();
		config.diskCacheFileNameGenerator(new Md5FileNameGenerator());
		config.diskCacheSize(50 * 1024 * 1024); // 50 MiB
		config.tasksProcessingOrder(QueueProcessingType.LIFO);
		config.writeDebugLogs(); // Remove for release app
		// Initialize ImageLoader with configuration.
		ImageLoader.getInstance().init(config.build());

	/*	File cacheDir = StorageUtils.getCacheDirectory(context);  //缓存文件夹路径
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
				.memoryCacheExtraOptions(480, 800) // default = device screen dimensions 内存缓存文件的最大长宽
				//	.diskCacheExtraOptions(480, 800, null)  // 本地缓存的详细信息(缓存的最大长宽)，最好不要设置这个
				.threadPoolSize(3) // default  线程池内加载的数量
				.threadPriority(Thread.NORM_PRIORITY - 2) // default 设置当前线程的优先级
				.tasksProcessingOrder(QueueProcessingType.FIFO) // default
				.denyCacheImageMultipleSizesInMemory()
				.memoryCache(new LruMemoryCache(2 * 1024 * 1024)) //可以通过自己的内存缓存实现
				.memoryCacheSize(2 * 1024 * 1024)  // 内存缓存的最大值
				.memoryCacheSizePercentage(13) // default
				.diskCache(new UnlimitedDiscCache(cacheDir)) // default 可以自定义缓存路径
				.diskCacheSize(50 * 1024 * 1024) // 50 Mb sd卡(本地)缓存的最大值
				.diskCacheFileCount(100)  // 可以缓存的文件数量
				// default为使用HASHCODE对UIL进行加密命名， 还可以用MD5(new Md5FileNameGenerator())加密
				.diskCacheFileNameGenerator(new HashCodeFileNameGenerator())
				.imageDownloader(new BaseImageDownloader(context)) // default
				.imageDecoder(new BaseImageDecoder(false)) // default
				.defaultDisplayImageOptions(DisplayImageOptions.createSimple()) // default
				.writeDebugLogs() // 打印debug log
				.build(); //开始构建
		ImageLoader.getInstance().init(config);*/
	}

}
