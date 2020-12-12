package com.example.coffeehouse.ui.tintuc;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.coffeehouse.DetailActivity;
import com.example.coffeehouse.KhuyenmaiActivity;
import com.example.coffeehouse.R;
import com.example.coffeehouse.TichdiemActivity;

public class TinTucFragment extends Fragment {

    private TinTucViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(TinTucViewModel.class);
        View v = inflater.inflate(R.layout.fragment_tintuc, container, false);



            Button chitiet454 = (Button)v.findViewById(R.id.chitiet_454);
        chitiet454.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(getActivity(), DetailActivity.class);
                    in.putExtra("some","some data");
                    startActivity(in);
                }
            });
        ImageView td454 = (ImageView) v.findViewById(R.id.tichdiem454);
        td454.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), TichdiemActivity.class);
                in.putExtra("some","some data");
                startActivity(in);
            }
        });
//        ImageView gh454 = (ImageView) v.findViewById(R.id.ghaohang454);
//        gh454.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent in = new Intent(getActivity(), DatHangFragment.class);
//                in.putExtra("some","some data");
//                startActivity(in);
//            }
//        });
        ImageView km454 = (ImageView) v.findViewById(R.id.khuyenmai454);
        km454.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), KhuyenmaiActivity.class);
                in.putExtra("some","some data");
                startActivity(in);
            }
        });

        return v;
    }
}
