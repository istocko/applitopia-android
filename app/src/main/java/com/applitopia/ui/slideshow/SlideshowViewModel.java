package com.applitopia.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("https://www.youtube.com/embed/GvEn8iOOE5g");
    }

    public LiveData<String> getText() {
        return mText;
    }
}