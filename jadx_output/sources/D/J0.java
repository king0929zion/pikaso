package D;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class J0 implements Iterable, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final B0 f699d;

    /* renamed from: e, reason: collision with root package name */
    public final int f700e;

    /* renamed from: f, reason: collision with root package name */
    public final C0032d f701f;

    public J0(B0 b02, int i3, L l3, C0032d c0032d) {
        this.f699d = b02;
        this.f700e = i3;
        this.f701f = c0032d;
        l3.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new K(this.f699d, this.f700e, null, this.f701f);
    }
}
