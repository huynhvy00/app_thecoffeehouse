package com.example.coffeehouse.ui.dathang;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    int mNoOfTabke;

    public  ViewPagerAdapter(FragmentManager fm, int Num)
    {
        super(fm);
        this.mNoOfTabke=Num;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PhoBienFragment pb=new PhoBienFragment();
                return pb;
            case 1:
                ThucUongFragment tu=new ThucUongFragment();
                return tu;
            case 2:
                DoAnFragment da=new DoAnFragment();
                return da;

//                return null;
//            case 2:
//                DonNhap donNhap=new DonNhap();
//
//                return donNhap;
            default:return new PhoBienFragment();
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabke;
    }
}