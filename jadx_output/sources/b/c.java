package B;

import D.C0032d;
import D.C0052n;
import c2.C0174m;
import o2.e;
import p2.h;
import v0.C0613B;

/* loaded from: classes.dex */
public final class c extends h implements e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0613B f267f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ L.a f268g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j3, C0613B c0613b, L.a aVar, int i3) {
        super(2);
        this.f266e = j3;
        this.f267f = c0613b;
        this.f268g = aVar;
        this.h = i3;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int J2 = C0032d.J(this.h | 1);
        L.a aVar = this.f268g;
        a.a(this.f266e, this.f267f, aVar, (C0052n) obj, J2);
        return C0174m.f3840a;
    }
}
