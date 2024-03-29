package com.tregz.miksing.base.foot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FootNavigation extends BottomNavigationView {
    private final String TAG = FootNavigation.class.getSimpleName();

    public boolean shown = true;

    public FootNavigation(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void hide() {
        shown = false;
        setTranslationY(getHeight());
    }

    public void show() {
        shown = true;
        setTranslationY(0);
    }
}
