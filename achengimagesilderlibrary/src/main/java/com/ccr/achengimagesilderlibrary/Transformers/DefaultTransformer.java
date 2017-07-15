package com.ccr.achengimagesilderlibrary.Transformers;

import android.view.View;

/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-06-03 17:48
 * @Version: V1.0 <描述当前版本功能>
 */

public class DefaultTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
    }

    @Override
    public boolean isPagingEnabled() {
        return true;
    }
}
