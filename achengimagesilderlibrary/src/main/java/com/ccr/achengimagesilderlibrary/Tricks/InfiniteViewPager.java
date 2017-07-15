package com.ccr.achengimagesilderlibrary.Tricks;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.AttributeSet;

/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-06-03 17:44
 * @Version: V1.0 <描述当前版本功能>
 */

public class InfiniteViewPager extends ViewPagerEx {

    public InfiniteViewPager(Context context) {
        super(context);
    }

    public InfiniteViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setAdapter(PagerAdapter adapter) {
        super.setAdapter(adapter);
    }
}
