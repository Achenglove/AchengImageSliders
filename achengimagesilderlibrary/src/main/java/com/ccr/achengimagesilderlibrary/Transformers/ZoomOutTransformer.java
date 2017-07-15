package com.ccr.achengimagesilderlibrary.Transformers;

import android.view.View;

import com.nineoldandroids.view.ViewHelper;

/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-06-03 17:47
 * @Version: V1.0 <描述当前版本功能>
 */

public class ZoomOutTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
        final float scale = 1f + Math.abs(position);
        ViewHelper.setScaleX(view, scale);
        ViewHelper.setScaleY(view, scale);
        ViewHelper.setPivotX(view, view.getWidth() * 0.5f);
        ViewHelper.setPivotY(view, view.getWidth() * 0.5f);
        ViewHelper.setAlpha(view, position < -1f || position > 1f ? 0f : 1f - (scale - 1f));
        if (position < -0.9) {
            //-0.9 to prevent a small bug
            ViewHelper.setTranslationX(view, view.getWidth() * position);
        }
    }

}
