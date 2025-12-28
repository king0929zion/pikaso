package E;

import D.C0059s;
import D.D0;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f1141a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1142b;

    public y(int i3, int i4) {
        this.f1141a = i3;
        this.f1142b = i4;
    }

    public abstract void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s);

    public String b(int i3) {
        return "IntParameter(" + i3 + ')';
    }

    public String c(int i3) {
        return "ObjectParameter(" + i3 + ')';
    }

    public final String toString() {
        String b3 = p2.p.a(getClass()).b();
        return b3 == null ? "" : b3;
    }

    public /* synthetic */ y(int i3, int i4, int i5) {
        this((i5 & 1) != 0 ? 0 : i3, (i5 & 2) != 0 ? 0 : i4);
    }
}
