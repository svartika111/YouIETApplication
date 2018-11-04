package com.example.vartikasharma.youiet;

import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class eventspage extends AppCompatActivity {




    /**
     * Created by xmuSistone on 2016/9/18.
     */


        private TextView indicatorTv;
        private View positionView;
        private ViewPager viewPager;
        private List<CommonFragment> fragments = new ArrayList<>(); // ViewPager
      //  private List<CommonFragment1> fragments1 = new ArrayList<>(); // ViewPager
        private final String[] imageArray = {"assets://me_goonj.png", "assets://me_hacksprint.png", "assets://me_udyami.png", "assets://me_izaad.png", "assets://me_legacy.png","assets://me_mun.png"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    getWindow().setStatusBarColor(Color.TRANSPARENT);
                    getWindow()
                            .getDecorView()
                            .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
                } else {
                    getWindow()
                            .setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                }
            }
            positionView = findViewById(R.id.position_view);
            dealStatusBar();

            // 2.ImageLoader
            initImageLoader();

            // 3. ViewPager
            fillViewPager();
        }

        /**
         ViewPager
         */
        private void fillViewPager() {
            indicatorTv = (TextView) findViewById(R.id.indicator_tv);
            viewPager = (ViewPager) findViewById(R.id.viewpager);

            viewPager.setPageTransformer(false, new CustPagerTransformer(this));

            //calling all the fragments individually
            fragments.add(new CommonFragment());
            fragments.add(new CommonFragment());
            fragments.add(new CommonFragment());
            fragments.add(new CommonFragment());
            fragments.add(new CommonFragment());
            fragments.add(new CommonFragment());


            viewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
                @Override
                public Fragment getItem(int position) {
                    CommonFragment fragment = fragments.get(position % 10);
                    fragment.bindData(imageArray[position % imageArray.length]);
                    return fragment;

                }

                @Override
                public int getCount() {
                    return 6;
                }

            });



            // 3. viewPager
            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                @Override
                public void onPageSelected(int position) {
                    updateIndicatorTv();
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });

            updateIndicatorTv();
        }

        private void updateIndicatorTv() {
            int totalNum = viewPager.getAdapter().getCount();
            int currentItem = viewPager.getCurrentItem() + 1;
            indicatorTv.setText(Html.fromHtml("<font color='#12edf0'>" + currentItem + "</font>  /  " + totalNum));
        }

        private void dealStatusBar() {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                int statusBarHeight = getStatusBarHeight();
                ViewGroup.LayoutParams lp = positionView.getLayoutParams();
                lp.height = statusBarHeight;
                positionView.setLayoutParams(lp);
            }
        }

        private int getStatusBarHeight() {
            Class<?> c = null;
            Object obj = null;
            Field field = null;
            int x = 0, statusBarHeight = 0;
            try {
                c = Class.forName("com.android.internal.R$dimen");
                obj = c.newInstance();
                field = c.getField("status_bar_height");
                x = Integer.parseInt(field.get(obj).toString());
                statusBarHeight = getResources().getDimensionPixelSize(x);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            return statusBarHeight;
        }

        @SuppressWarnings("deprecation")
        private void initImageLoader() {
            ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                    this)
                    .memoryCacheExtraOptions(480, 800)
                    // default = device screen dimensions
                    .threadPoolSize(3)
                    // default
                    .threadPriority(Thread.NORM_PRIORITY - 1)
                    // default
                    .tasksProcessingOrder(QueueProcessingType.FIFO)
                    // default
                    .denyCacheImageMultipleSizesInMemory()
                    .memoryCache(new LruMemoryCache(2 * 1024 * 1024))
                    .memoryCacheSize(2 * 1024 * 1024).memoryCacheSizePercentage(13) // default
                    .discCacheSize(50 * 1024 * 1024)
                    .discCacheFileCount(100)
                    .discCacheFileNameGenerator(new HashCodeFileNameGenerator()) // default
                    .imageDownloader(new BaseImageDownloader(this)) // default
                    .defaultDisplayImageOptions(DisplayImageOptions.createSimple()) // default
                    .writeDebugLogs().build();

            // ImageLoader
            ImageLoader imageLoader = ImageLoader.getInstance();
            imageLoader.init(config);
        }

    }


