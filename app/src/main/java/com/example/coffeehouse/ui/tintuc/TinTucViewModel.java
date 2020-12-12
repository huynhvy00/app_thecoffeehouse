package com.example.coffeehouse.ui.tintuc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TinTucViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TinTucViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}