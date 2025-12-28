package h0;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4356a;

    /* renamed from: b, reason: collision with root package name */
    public int f4357b;

    public f(List list, B2.i iVar) {
        this.f4356a = list;
        MotionEvent motionEvent = iVar != null ? (MotionEvent) ((B2.i) iVar.f317f).f317f : null;
        int i3 = 0;
        if (motionEvent != null) {
            motionEvent.getButtonState();
        }
        MotionEvent motionEvent2 = iVar != null ? (MotionEvent) ((B2.i) iVar.f317f).f317f : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = iVar != null ? (MotionEvent) ((B2.i) iVar.f317f).f317f : null;
        int i4 = 1;
        if (motionEvent3 == null) {
            int size = list.size();
            while (true) {
                if (i3 >= size) {
                    i4 = 3;
                    break;
                }
                k kVar = (k) list.get(i3);
                if (Z0.d.n(kVar)) {
                    i4 = 2;
                    break;
                } else if (Z0.d.m(kVar)) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i3 = 6;
                                break;
                            case 9:
                                i3 = 4;
                                break;
                            case 10:
                                i3 = 5;
                                break;
                        }
                        i4 = i3;
                    }
                    i3 = 3;
                    i4 = i3;
                }
                i3 = 2;
                i4 = i3;
            }
            i3 = 1;
            i4 = i3;
        }
        this.f4357b = i4;
    }
}
