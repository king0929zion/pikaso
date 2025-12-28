package q;

import D.C0032d;
import D.C0052n;
import W.C0089l;
import b0.AbstractC0135b;
import c2.C0174m;
import l0.C0354d;

/* renamed from: q.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548A extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0135b f5962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P.l f5964g;
    public final /* synthetic */ P.d h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0354d f5965i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f5966j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0089l f5967k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5968l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0548A(AbstractC0135b abstractC0135b, String str, P.l lVar, P.d dVar, C0354d c0354d, float f3, C0089l c0089l, int i3) {
        super(2);
        this.f5962e = abstractC0135b;
        this.f5963f = str;
        this.f5964g = lVar;
        this.h = dVar;
        this.f5965i = c0354d;
        this.f5966j = f3;
        this.f5967k = c0089l;
        this.f5968l = i3;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int J2 = C0032d.J(this.f5968l | 1);
        P.d dVar = this.h;
        C0354d c0354d = this.f5965i;
        Z0.d.b(this.f5962e, this.f5963f, this.f5964g, dVar, c0354d, this.f5966j, this.f5967k, (C0052n) obj, J2);
        return C0174m.f3840a;
    }
}
