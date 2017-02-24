package com.example.ankit.tablayouts;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by Ankit on 2/23/2017.
 */
public class GamePagerAdapter extends FragmentPagerAdapter {
    Context mContext;
    public static final String LOG_TAG = GamePagerAdapter.class.getName();
    public static final int COUNT = 3;
    public static final int PRACTICE_SCREEN = 0;
    public static final int PLAY_SCREEN = 1;
    public static final int STATISTICS_SCREEN = 2;

    String titleArray[] = {"Hi 1", "HI 2", "HI 3"};

    public GamePagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case PRACTICE_SCREEN:
                Log.e(LOG_TAG, "Creating Practice Fragment");
                return new PracticeFragment();
            case PLAY_SCREEN:
                Log.e(LOG_TAG, "Creating Play Fragment");
                return new PlayFragment();
            case STATISTICS_SCREEN:
                new StatisticsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "SECTION 1";
            case 1:
                return "SECTION 2";
            case 2:
                return "SECTION 3";
        }
        return null;
    }
}
