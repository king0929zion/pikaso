package o0;

import android.view.accessibility.AccessibilityEvent;
import c2.C0174m;

/* renamed from: o0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453C extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0455E f5381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0453C(C0455E c0455e, int i3) {
        super(1);
        this.f5380e = i3;
        this.f5381f = c0455e;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f5380e) {
            case 0:
                C0455E c0455e = this.f5381f;
                return Boolean.valueOf(c0455e.f5398d.getParent().requestSendAccessibilityEvent(c0455e.f5398d, (AccessibilityEvent) obj));
            default:
                C0518z0 c0518z0 = (C0518z0) obj;
                C0455E c0455e2 = this.f5381f;
                c0455e2.getClass();
                if (c0518z0.f5759e.contains(c0518z0)) {
                    c0455e2.f5398d.getSnapshotObserver().a(c0518z0, c0455e2.f5397K, new A0.c(c0518z0, c0455e2));
                }
                return C0174m.f3840a;
        }
    }
}
