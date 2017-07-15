package com.ccr.achengimagesilderlibrary.Transformers;

import android.view.View;

import com.nineoldandroids.view.ViewHelper;

/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-06-03 17:51
 * @Version: V1.0 <描述当前版本功能>
 */

public class FadeTransformer extends BaseTransformer {
    @Override
    protected void onTransform(View view, float position) {

        // Page is not an immediate sibling, just make transparent
        if (position < -1 || position > 1) {
            ViewHelper.setAlpha(view, 0.6f);
        }
        // Page is sibling to left or right
        else if (position <= 0 || position <= 1) {

            // Calculate alpha.  Position is decimal in [-1,0] or [0,1]
            float alpha = (position <= 0) ? position + 1 : 1 - position;
            ViewHelper.setAlpha(view, alpha);

        }
        // Page is active, make fully visible
        else if (position == 0) {
            ViewHelper.setAlpha(view, 1);
        }
    }

}
