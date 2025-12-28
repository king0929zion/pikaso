package o0;

import java.util.List;
import n.AbstractC0391k;
import n.C0398r;
import n.C0399s;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0.g f5371a;

    /* renamed from: b, reason: collision with root package name */
    public final C0399s f5372b;

    public A0(t0.k kVar, C0398r c0398r) {
        this.f5371a = kVar.f6239d;
        int[] iArr = AbstractC0391k.f4993a;
        this.f5372b = new C0399s();
        List h = t0.k.h(kVar, true, 4);
        int size = h.size();
        for (int i3 = 0; i3 < size; i3++) {
            t0.k kVar2 = (t0.k) h.get(i3);
            if (c0398r.b(kVar2.f6242g)) {
                this.f5372b.a(kVar2.f6242g);
            }
        }
    }
}
