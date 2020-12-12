package com.example.coffeehouse.ui.dathang;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.coffeehouse.GioHangActivity;
import com.example.coffeehouse.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class PhoBienFragment extends Fragment {
    Dialog dialogthemgh454;
    ImageView dathang454;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pho_bien, container, false);

        dialogthemgh454 = new Dialog(getActivity());
        dathang454 = (ImageView) v.findViewById(R.id.add_gh_454);
        dathang454.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendialog();
            }
        });



        return v;
    }

    private void opendialog() {
        dialogthemgh454.setContentView(R.layout.dialog_xemsp);
        Button themsp454 = dialogthemgh454.findViewById(R.id.themgh_454);
        themsp454.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), GioHangActivity.class);
                startActivity(intent);
            }
        });
        dialogthemgh454.show();
    }
}
