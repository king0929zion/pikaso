package o0;

import c2.C0174m;
import m.C0368f;

/* renamed from: o0.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485i0 extends p2.h implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A1.e f5592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f5593g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0485i0(boolean z3, A1.e eVar, String str) {
        super(0);
        this.f5591e = z3;
        this.f5592f = eVar;
        this.f5593g = str;
    }

    @Override // o2.a
    public final Object c() {
        if (this.f5591e) {
            A1.e eVar = this.f5592f;
            eVar.getClass();
            String str = this.f5593g;
            p2.g.e(str, "key");
            ((C0368f) eVar.f213c).b(str);
        }
        return C0174m.f3840a;
    }
}
