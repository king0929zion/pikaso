package k;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class G0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f4649a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4650b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f4651c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4652d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4653e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4654f;

    public G0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f4653e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f4650b = rect3;
        Rect rect4 = new Rect();
        this.f4652d = rect4;
        Rect rect5 = new Rect();
        this.f4651c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i3 = -scaledTouchSlop;
        rect4.inset(i3, i3);
        rect5.set(rect2);
        this.f4649a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z5 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z4 = this.f4654f;
                if (z4 && !this.f4652d.contains(x3, y3)) {
                    z5 = z4;
                    z3 = false;
                }
            } else {
                if (action == 3) {
                    z4 = this.f4654f;
                    this.f4654f = false;
                }
                z3 = true;
                z5 = false;
            }
            z5 = z4;
            z3 = true;
        } else {
            if (this.f4650b.contains(x3, y3)) {
                this.f4654f = true;
                z3 = true;
            }
            z3 = true;
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        Rect rect = this.f4651c;
        View view = this.f4649a;
        if (!z3 || rect.contains(x3, y3)) {
            motionEvent.setLocation(x3 - rect.left, y3 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
