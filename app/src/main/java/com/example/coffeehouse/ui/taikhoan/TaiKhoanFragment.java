package com.example.coffeehouse.ui.taikhoan;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.coffeehouse.CaiDatActivity;
import com.example.coffeehouse.HelpActivity;
import com.example.coffeehouse.LichSuActivity;
import com.example.coffeehouse.Login;
import com.example.coffeehouse.ProfileActivity;
import com.example.coffeehouse.R;
import com.example.coffeehouse.ThongTinTVActivity;

public class TaiKhoanFragment extends Fragment {
Button dxuat454;
ImageView img454;
TextView name454;
TextView tttv454, tttk454,lichsu454,help454,caidat454;
    Dialog dialogdangxuat454;
    private TaiKhoanViewModel taiKhoanViewModel;

private static final String ARG_PARAM1 = "param1";
private static final String ARG_PARAM2 = "param2";

// TODO: Rename and change types of parameters
private String mParam1;
private String mParam2;



public static TaiKhoanFragment newInstance(String param1, String param2) {
    TaiKhoanFragment fragment = new TaiKhoanFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;

        }

@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        mParam1 = getArguments().getString(ARG_PARAM1);
        mParam2 = getArguments().getString(ARG_PARAM2);
        }
        }

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_taikhoan, container, false);


        dxuat454 = (Button)v.findViewById(R.id.btn_dangxuat_454);
    dxuat454.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), Login.class);
                in.putExtra("some","some data");
                startActivity(in);
            }
        });
img454 = (ImageView)v.findViewById(R.id.img_454);
img454.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getActivity(), ProfileActivity.class);
        intent.putExtra("some","some data");
        startActivity(intent);
    }
});


            name454 = (TextView) v.findViewById(R.id.tv_name_454);
    name454.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getActivity(), ProfileActivity.class);
            intent.putExtra("some","some data");
            startActivity(intent);
        }
    });

    tttv454 = (TextView) v.findViewById(R.id.tttv_454);
    tttv454.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getActivity(), ThongTinTVActivity.class);
            intent.putExtra("some","some data");
            startActivity(intent);
        }
    });
    tttk454 = (TextView) v.findViewById(R.id.tttk_454);
    tttk454.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getActivity(), ProfileActivity.class);
            intent.putExtra("some","some data");
            startActivity(intent);
        }
    });
    lichsu454 = (TextView) v.findViewById(R.id.lichsu_454);
    lichsu454.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getActivity(), LichSuActivity.class);
            intent.putExtra("some","some data");
            startActivity(intent);
        }
    });
    help454 = (TextView) v.findViewById(R.id.help_454);
    help454.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getActivity(), HelpActivity.class);
            intent.putExtra("some","some data");
            startActivity(intent);
        }
    });
    caidat454 = (TextView) v.findViewById(R.id.caidat_454);
    caidat454.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getActivity(), CaiDatActivity.class);
            intent.putExtra("some","some data");
            startActivity(intent);
        }
    });

    dialogdangxuat454 = new Dialog(getActivity());
    dxuat454 = (Button) v.findViewById(R.id.btn_dangxuat_454);
    dxuat454.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            opendialog();
        }
    });



    return v;
}

    private void opendialog() {
        dialogdangxuat454.setContentView(R.layout.dialog_dangxuat);
        Button btyes454 = dialogdangxuat454.findViewById(R.id.dia_yes);
        Button btno454 = dialogdangxuat454.findViewById(R.id.dia_no);
        btyes454.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Login.class);
                startActivity(intent);
            }
        });
        btno454.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dialogdangxuat454.dismiss();
            }
        });
        dialogdangxuat454.show();
    }
    }

