package com.ccr.achengimagesilderlibrary.Transformers;

import android.view.View;

import com.nineoldandroids.view.ViewHelper;

/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-06-03 17:52
 * @Version: V1.0 <描述当前版本功能>
 */

public class FlipHorizontalTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
        final float rotation = 180f * position;
        ViewHelper.setAlpha(view, rotation > 90f || rotation < -90f ? 0 : 1);
        ViewHelper.setPivotY(view, view.getHeight() * 0.5f);
        ViewHelper.setPivotX(view, view.getWidth() * 0.5f);
        ViewHelper.setRotationY(view, rotation);
    }
}
