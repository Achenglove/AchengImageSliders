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

public class RotateUpTransformer extends BaseTransformer {
    private static final float ROT_MOD = -15f;

    @Override
    protected void onTransform(View view, float position) {
        final float width = view.getWidth();
        final float rotation = ROT_MOD * position;

        ViewHelper.setPivotX(view, width * 0.5f);
        ViewHelper.setPivotY(view, 0f);
        ViewHelper.setTranslationX(view, 0f);
        ViewHelper.setRotation(view, rotation);
    }

    @Override
    protected boolean isPagingEnabled() {
        return true;
    }

}
