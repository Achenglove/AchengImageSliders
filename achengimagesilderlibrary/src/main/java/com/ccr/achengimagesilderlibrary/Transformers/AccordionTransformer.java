package com.ccr.achengimagesilderlibrary.Transformers;

import android.view.View;

import com.nineoldandroids.view.ViewHelper;

/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-06-03 17:46
 * @Version: V1.0 <描述当前版本功能>
 */

public class AccordionTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
        ViewHelper.setPivotX(view, position < 0 ? 0 : view.getWidth());
        ViewHelper.setScaleX(view, position < 0 ? 1f + position : 1f - position);
    }
}
