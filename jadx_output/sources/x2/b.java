package x2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements w2.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f6728a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6729b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6730c;

    /* renamed from: d, reason: collision with root package name */
    public final i f6731d;

    public b(String str, int i3, int i4, i iVar) {
        p2.g.e(str, "input");
        this.f6728a = str;
        this.f6729b = i3;
        this.f6730c = i4;
        this.f6731d = iVar;
    }

    @Override // w2.f
    public final Iterator iterator() {
        return new a(this);
    }
}
