package com.example.coffeehouse.ui.taikhoan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TaiKhoanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TaiKhoanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}