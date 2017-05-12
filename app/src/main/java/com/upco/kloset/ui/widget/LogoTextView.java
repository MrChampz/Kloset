package com.upco.kloset.ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.upco.kloset.util.FontCache;

/**
 * Created by Felipe Maciel on 11/05/2017.
 */
public class LogoTextView extends android.support.v7.widget.AppCompatTextView {

    public LogoTextView(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public LogoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }

    public LogoTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("Pacifico-Regular.ttf", context);
        setTypeface(customFont);
    }
}
