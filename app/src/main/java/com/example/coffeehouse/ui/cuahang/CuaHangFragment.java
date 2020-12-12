package com.example.coffeehouse.ui.cuahang;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.coffeehouse.R;
import com.google.android.gms.maps.SupportMapFragment;

public class CuaHangFragment extends Fragment {
private  MyMapFragment myMapFragment;
    private CuaHangViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(CuaHangViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cuahang, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.fragment_map) ;
//
//        FragmentManager fragmentManager = this.getSupportFragmentManager();
       // this.myMapFragment = (MyMapFragment) fragmentManager.findFragmentById(R.id.fragment_map);
        return root;
    }


}