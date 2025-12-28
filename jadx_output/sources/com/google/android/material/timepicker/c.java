package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ai.assistance.operit.provider.R;
import d1.C0205b;
import e1.j;

/* loaded from: classes.dex */
public final class c extends C0205b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f4128d;

    public c(ClockFaceView clockFaceView) {
        this.f4128d = clockFaceView;
    }

    @Override // d1.C0205b
    public final void d(View view, j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4187a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f4278a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f4128d.f4111z.get(intValue - 1));
        }
        jVar.i(e1.i.a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        jVar.b(e1.e.f4264e);
    }

    @Override // d1.C0205b
    public final boolean g(View view, int i3, Bundle bundle) {
        if (i3 != 16) {
            return super.g(view, i3, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f4128d;
        view.getHitRect(clockFaceView.f4108w);
        float centerX = clockFaceView.f4108w.centerX();
        float centerY = clockFaceView.f4108w.centerY();
        clockFaceView.f4107v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f4107v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
