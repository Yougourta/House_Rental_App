package com.example.yougourta.projmob;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.yougourta.projmob.TabLayout.AppartementFragment;
import com.example.yougourta.projmob.TabLayout.BungalowsFragment;
import com.example.yougourta.projmob.TabLayout.DuplexFragment;
import com.example.yougourta.projmob.TabLayout.StudiosFragment;
import com.example.yougourta.projmob.TabLayout.VillasFragment;

/**
 * Created by Nadji AZRI on 24/03/2017.
 */

public class MyFragmentPageAdapter extends FragmentPagerAdapter {

    private String[] tabtitle = new String[]{"Appartements","Villas","Studios","Duplex","Bungalows"};
    Context context;
    private int pagecount = 5;

    public MyFragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                AppartementFragment appartementFragment = new AppartementFragment();
                return appartementFragment;
            case 1:
                VillasFragment villasFragment = new VillasFragment();
                return villasFragment;

            case 2:
                StudiosFragment studiosFragment = new StudiosFragment();
                return studiosFragment;

            case 3:
                DuplexFragment duplexFragment = new DuplexFragment();
                return duplexFragment;

            case 4:
                BungalowsFragment bungalowsFragment = new BungalowsFragment();
                return bungalowsFragment;

        }
        return null;
    }

    @Override
    public int getCount() {
        return pagecount ;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitle[position];
    }
}
