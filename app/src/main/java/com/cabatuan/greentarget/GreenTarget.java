package com.cabatuan.greentarget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cobalt on 10/8/15.
 */
public class GreenTarget extends View {

    public GreenTarget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint green = new Paint();
        green.setARGB(255, 0, 255, 0);

        Paint white = new Paint();
        white.setARGB(255, 255, 255, 255);

        // Get center
        int w = canvas.getWidth();
        int h = canvas.getHeight();
        int x = (w < h)? w : h;

        for (int i = 0; i < 11; i++) {
            canvas.drawCircle(w/2, h/2, x*(10-i)/20, i % 2 == 0 ? green : white);
        }
    }

}
