package q;

import c2.C0174m;

/* renamed from: q.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549B extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5970f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0549B(String str, int i3) {
        super(1);
        this.f5969e = i3;
        this.f5970f = str;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        C0174m c0174m = C0174m.f3840a;
        String str = this.f5970f;
        switch (this.f5969e) {
            case 0:
                t0.g gVar = (t0.g) obj;
                v2.c[] cVarArr = t0.p.f6284a;
                gVar.b(t0.n.f6258a, Z.b.D(str));
                t0.p.c(gVar, 5);
                return c0174m;
            case 1:
                v2.c[] cVarArr2 = t0.p.f6284a;
                ((t0.g) obj).b(t0.n.f6258a, Z.b.D(str));
                return c0174m;
            default:
                u2.d dVar = (u2.d) obj;
                p2.g.e(dVar, "it");
                p2.g.e(str, "<this>");
                return str.subSequence(dVar.f6300d, dVar.f6301e + 1).toString();
        }
    }
}
