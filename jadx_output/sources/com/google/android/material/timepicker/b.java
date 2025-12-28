package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f4127d;

    public b(ClockFaceView clockFaceView) {
        this.f4127d = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f4127d;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f4107v.f4115g) - clockFaceView.f4100D;
        if (height != clockFaceView.f4130t) {
            clockFaceView.f4130t = height;
            clockFaceView.f();
            int i3 = clockFaceView.f4130t;
            ClockHandView clockHandView = clockFaceView.f4107v;
            clockHandView.f4122o = i3;
            clockHandView.invalidate();
        }
        return true;
    }
}
