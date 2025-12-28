package k;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: k.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0321l0 implements View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0323m0 f4813d;

    public ViewOnTouchListenerC0321l0(AbstractC0323m0 abstractC0323m0) {
        this.f4813d = abstractC0323m0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0343x c0343x;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        AbstractC0323m0 abstractC0323m0 = this.f4813d;
        if (action == 0 && (c0343x = abstractC0323m0.f4842y) != null && c0343x.isShowing() && x3 >= 0 && x3 < abstractC0323m0.f4842y.getWidth() && y3 >= 0 && y3 < abstractC0323m0.f4842y.getHeight()) {
            abstractC0323m0.f4838u.postDelayed(abstractC0323m0.f4834q, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        abstractC0323m0.f4838u.removeCallbacks(abstractC0323m0.f4834q);
        return false;
    }
}
