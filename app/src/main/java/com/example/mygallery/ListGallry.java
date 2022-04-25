package com.example.mygallery;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class ListGallry extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_list_gallery);
    }
}
