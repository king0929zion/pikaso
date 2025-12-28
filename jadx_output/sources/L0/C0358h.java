package l0;

import n0.AbstractC0418L;
import o0.C0507u;

/* renamed from: l0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358h extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4922a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4923b;

    public /* synthetic */ C0358h(int i3, Object obj) {
        this.f4922a = i3;
        this.f4923b = obj;
    }

    @Override // l0.n
    public final G0.f b() {
        switch (this.f4922a) {
            case 0:
                return ((AbstractC0418L) this.f4923b).getLayoutDirection();
            default:
                return ((C0507u) this.f4923b).getLayoutDirection();
        }
    }

    @Override // l0.n
    public final int c() {
        switch (this.f4922a) {
            case 0:
                return ((AbstractC0418L) this.f4923b).D();
            default:
                return ((C0507u) this.f4923b).getRoot().f5320y.f5146q.f4927d;
        }
    }
}
