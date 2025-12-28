package c1;

import L0.f;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161a extends f {

    /* renamed from: d, reason: collision with root package name */
    public final Object f3829d;

    public C0161a() {
        super(12);
        this.f3829d = new Object();
    }

    @Override // L0.f
    public final Object a() {
        Object a3;
        synchronized (this.f3829d) {
            a3 = super.a();
        }
        return a3;
    }

    @Override // L0.f
    public final boolean c(Object obj) {
        boolean c3;
        synchronized (this.f3829d) {
            c3 = super.c(obj);
        }
        return c3;
    }
}
