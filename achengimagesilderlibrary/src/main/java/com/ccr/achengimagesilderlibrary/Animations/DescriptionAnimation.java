package com.ccr.achengimagesilderlibrary.Animations;

/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-06-03 17:39
 * @Version: V1.0 <描述当前版本功能>
 */

import android.view.View;

import com.ccr.achengimagesilderlibrary.R;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.view.ViewHelper;



public class DescriptionAnimation implements BaseAnimationInterface {
    private boolean misShow=false;

    public DescriptionAnimation(boolean isShow) {
        this.misShow = isShow;
    }

    @Override
    public void onPrepareCurrentItemLeaveScreen(View current) {
        View descriptionLayout = current.findViewById(R.id.description_layout);
        if (descriptionLayout != null) {
            current.findViewById(R.id.description_layout).setVisibility(View.INVISIBLE);
        }
    }

    /**
     * When next item is coming to show, let's hide the description layout.
     *
     * @param next
     */
    @Override
    public void onPrepareNextItemShowInScreen(View next) {
        View descriptionLayout = next.findViewById(R.id.description_layout);
        if (descriptionLayout != null) {
            next.findViewById(R.id.description_layout).setVisibility(View.INVISIBLE);
        }
    }


    @Override
    public void onCurrentItemDisappear(View view) {

    }

    /**
     * When next item show in ViewPagerEx, let's make an animation to show the
     * description layout.
     *
     * @param view
     */

    @Override
    public void onNextItemAppear(View view) {
        View descriptionLayout = view.findViewById(R.id.description_layout);
        if (descriptionLayout != null) {
            float layoutY = ViewHelper.getY(descriptionLayout);
            if(misShow) {
                view.findViewById(R.id.description_layout).setVisibility(View.VISIBLE);
            }else{
                view.findViewById(R.id.description_layout).setVisibility(View.GONE);
            }
            ValueAnimator animator = ObjectAnimator.ofFloat(
                    descriptionLayout, "y", layoutY + descriptionLayout.getHeight(),
                    layoutY).setDuration(500);
            animator.start();
        }

    }
}
