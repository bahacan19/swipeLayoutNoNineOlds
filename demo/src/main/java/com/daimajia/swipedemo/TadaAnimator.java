package com.daimajia.swipedemo;

import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by baha on 10/07/15.
 */
public class TadaAnimator extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "scaleX", 1, 0.9f, 0.9f, 1.1f, 1.1f, 1.1f, 1.1f, 1.1f, 1.1f, 1),
                ObjectAnimator.ofFloat(target, "scaleY", 1, 0.9f, 0.9f, 1.1f, 1.1f, 1.1f, 1.1f, 1.1f, 1.1f, 1),
                ObjectAnimator.ofFloat(target, "rotation", 0, -3, -3, 3, -3, 3, -3, 3, -3, 0)
        );
    }
}
