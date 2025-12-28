package m;

import java.util.HashMap;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363a extends C0368f {
    public final HashMap h = new HashMap();

    @Override // m.C0368f
    public final C0365c a(Object obj) {
        return (C0365c) this.h.get(obj);
    }

    @Override // m.C0368f
    public final Object b(Object obj) {
        Object b3 = super.b(obj);
        this.h.remove(obj);
        return b3;
    }
}
