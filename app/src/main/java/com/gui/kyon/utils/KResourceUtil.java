package com.gui.kyon.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by slynero at ÏÂÎç2:23 on 14-7-18.
 * Copyright (c) 2014 FineSoft. All rights reserved.
 */
public class KResourceUtil {
    public static int getLayoutId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "layout",
                paramContext.getPackageName());
    }

    public static Drawable getDrawableById(Context paramContext, String paramString) {
        return paramContext.getResources().getDrawable(getDrawableId(paramContext, paramString));
    }

    public static int getStringId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "string",
                paramContext.getPackageName());
    }

    public static int getDrawableId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "drawable", paramContext.getPackageName());
    }

    public static int getStyleId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "style", paramContext.getPackageName());
    }

    public static int getId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "id", paramContext.getPackageName());
    }

    public static int getColorId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "color", paramContext.getPackageName());
    }

    public static int getAnimId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "anim", paramContext.getPackageName());
    }

    public static int getRowId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "row", paramContext.getPackageName());
    }

    public static int getValuesId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "values", paramContext.getPackageName());
    }
}
