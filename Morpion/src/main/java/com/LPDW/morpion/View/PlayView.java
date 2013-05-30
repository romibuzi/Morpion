package com.LPDW.morpion.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.LPDW.morpion.R;

public class PlayView extends View
{
    public PlayView(Context context, AttributeSet attrs)
    {
        super(context);
    }

    public void changeImageCase(ImageView image, int Marker)
    {
        if (Marker == 1) {
            image.setImageResource(R.drawable.croix);
        } else if (Marker == 2) {
            image.setImageResource(R.drawable.rond);
        }
    }

    public void displayScores()
    {

    }


}