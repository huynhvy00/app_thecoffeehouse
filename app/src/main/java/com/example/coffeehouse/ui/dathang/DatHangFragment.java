package com.example.coffeehouse.ui.dathang;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.example.coffeehouse.R;
import com.google.android.material.tabs.TabLayout;

public class DatHangFragment extends Fragment {
Dialog dialogtuychon454;
    private DatHangViewModel dathangViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dathangViewModel =
                new ViewModelProvider(this).get(DatHangViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dathang, container, false);
//==========================choose adapter=========================================*/
        TabLayout tabLayout=(TabLayout) root.findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Phổ biến"));
        tabLayout.addTab(tabLayout.newTab().setText("Thức uống"));
        tabLayout.addTab(tabLayout.newTab().setText("Đồ ăn"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager=(ViewPager) root.findViewById(R.id.viewpager);
        final ViewPagerAdapter adater =new ViewPagerAdapter(getFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adater);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return root;
    }
}