package D;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class C0 implements Iterable, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final B0 f660d;

    /* renamed from: e, reason: collision with root package name */
    public final int f661e;

    /* renamed from: f, reason: collision with root package name */
    public final int f662f;

    public C0(B0 b02, int i3, int i4) {
        this.f660d = b02;
        this.f661e = i3;
        this.f662f = i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i3;
        ArrayList arrayList;
        int F3;
        B0 b02 = this.f660d;
        if (b02.f652j != this.f662f) {
            throw new ConcurrentModificationException();
        }
        HashMap hashMap = b02.f654l;
        C0030c c0030c = null;
        int i4 = this.f661e;
        if (hashMap != null) {
            if (b02.f651i) {
                C0032d.r("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i4 >= 0 && i4 < (i3 = b02.f648e) && (F3 = C0032d.F((arrayList = b02.f653k), i4, i3)) >= 0) {
                c0030c = (C0030c) arrayList.get(F3);
            }
            if (c0030c != null) {
            }
        }
        return new K(b02, i4 + 1, b02.f647d[(i4 * 5) + 3] + i4);
    }
}
