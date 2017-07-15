package com.ccr.achengimagesilderlibrary.Transformers;

import android.view.View;

import com.nineoldandroids.view.ViewHelper;

/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-06-03 17:48
 * @Version: V1.0 <描述当前版本功能>
 */

public class CubeInTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
        // Rotate the fragment on the left or right edge
        ViewHelper.setPivotX(view, position > 0 ? 0 : view.getWidth());
        ViewHelper.setPivotY(view, 0);
        ViewHelper.setRotation(view, -90f * position);
    }

    @Override
    public boolean isPagingEnabled() {
        return true;
    }
}
