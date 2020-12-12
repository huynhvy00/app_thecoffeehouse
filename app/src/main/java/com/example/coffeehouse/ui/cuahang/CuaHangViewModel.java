package com.example.coffeehouse.ui.cuahang;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CuaHangViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CuaHangViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}