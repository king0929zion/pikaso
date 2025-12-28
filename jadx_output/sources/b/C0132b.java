package b;

import android.window.BackEvent;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132b {

    /* renamed from: a, reason: collision with root package name */
    public final float f3577a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3578b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3579c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3580d;

    public C0132b(BackEvent backEvent) {
        p2.g.e(backEvent, "backEvent");
        C0131a c0131a = C0131a.f3576a;
        float d3 = c0131a.d(backEvent);
        float e3 = c0131a.e(backEvent);
        float b3 = c0131a.b(backEvent);
        int c3 = c0131a.c(backEvent);
        this.f3577a = d3;
        this.f3578b = e3;
        this.f3579c = b3;
        this.f3580d = c3;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f3577a + ", touchY=" + this.f3578b + ", progress=" + this.f3579c + ", swipeEdge=" + this.f3580d + '}';
    }
}
