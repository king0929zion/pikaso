package G;

import H.c;
import d2.AbstractC0233d;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends AbstractC0233d {

    /* renamed from: d, reason: collision with root package name */
    public final c f1248d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1249e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1250f;

    public a(c cVar, int i3, int i4) {
        this.f1248d = cVar;
        this.f1249e = i3;
        r2.a.n(i3, i4, cVar.a());
        this.f1250f = i4 - i3;
    }

    @Override // d2.AbstractC0230a
    public final int a() {
        return this.f1250f;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        r2.a.l(i3, this.f1250f);
        return this.f1248d.get(this.f1249e + i3);
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        r2.a.n(i3, i4, this.f1250f);
        int i5 = this.f1249e;
        return new a(this.f1248d, i3 + i5, i5 + i4);
    }
}
