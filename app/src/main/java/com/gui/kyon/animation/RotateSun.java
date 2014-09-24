package com.gui.kyon.animation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.view.View;

import com.gui.kyon.utils.KResourceUtil;

/**
 * Created by slynero on 14-9-24.
 * Copyright (c) 2014 FineSoft. All rights reserved.
 */
public class RotateSun extends View {
    private int currentAngle = 0;
    private int viewSize;
    private static Bitmap bitmap;
    private PaintFlagsDrawFilter paintFlagsDrawFilter;

    public RotateSun(Context context) {
        super(context);
        initRes(context);
    }

    private void initRes(Context context) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 2;
        bitmap = BitmapFactory.decodeResource(getResources(), KResourceUtil.getDrawableId(context, "sun"), options);
        paintFlagsDrawFilter = new PaintFlagsDrawFilter(0, Paint.ANTI_ALIAS_FLAG | Paint.FILTER_BITMAP_FLAG);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (currentAngle > 359) {
            currentAngle = 0;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        canvas.clipRect(0, 0, width, height);
        canvas.save();
        canvas.setDrawFilter(paintFlagsDrawFilter);
        canvas.rotate(currentAngle++, width / 2, height / 2);//旋转角度＋1，旋转中心点
        canvas.drawBitmap(bitmap, 0, 0, null);

        canvas.restore();
        postInvalidateDelayed(30);//每100ms画一次
    }

}
