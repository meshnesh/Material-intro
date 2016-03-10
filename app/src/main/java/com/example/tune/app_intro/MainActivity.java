package com.example.tune.app_intro;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

public class MainActivity extends IntroActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        addSlide(new FragmentSlide.Builder()
                .background(R.color.background_2)
                .backgroundDark(R.color.background_dark_2)
                .fragment(R.layout.fragment_2, R.style.FragmentTheme)
                .build());


        addSlide(new FragmentSlide.Builder()
                .background(R.color.background_3)
                .backgroundDark(R.color.background_dark_3)
                .fragment(R.layout.fragment_3, R.style.FragmentTheme)
                .build());


        /* Enable/disable fullscreen */
        setFullscreen(true);

        /* Enable/disable skip button */
        setSkipEnabled(false);

        /* Enable/disable finish button */
        setFinishEnabled(false);

        /* Add your own page change listeners */
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
//            private void finishIfNeeded() {
//                if (positionOffset == 0 && position == adapter.getCount()) {
//                    finish();
//                    overridePendingTransition(0, 0);
//                }
//            }
        });
    }
}
