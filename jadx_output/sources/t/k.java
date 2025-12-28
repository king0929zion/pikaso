package t;

import c2.C0174m;
import n0.AbstractC0418L;

/* loaded from: classes.dex */
public final class k extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.o[] f6169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f6170f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6171g;
    public final /* synthetic */ AbstractC0418L h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int[] f6172i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l0.o[] oVarArr, l lVar, int i3, AbstractC0418L abstractC0418L, int[] iArr) {
        super(1);
        this.f6169e = oVarArr;
        this.f6170f = lVar;
        this.f6171g = i3;
        this.h = abstractC0418L;
        this.f6172i = iArr;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        l0.n nVar = (l0.n) obj;
        l0.o[] oVarArr = this.f6169e;
        int length = oVarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            l0.o oVar = oVarArr[i3];
            int i5 = i4 + 1;
            p2.g.b(oVar);
            oVar.o();
            G0.f layoutDirection = this.h.getLayoutDirection();
            l lVar = this.f6170f;
            lVar.getClass();
            int i6 = this.f6171g - oVar.f4927d;
            P.b bVar = lVar.f6173a;
            float f3 = i6 / 2.0f;
            G0.f fVar = G0.f.f1258d;
            float f4 = bVar.f2078a;
            if (layoutDirection != fVar) {
                f4 *= -1;
            }
            l0.n.d(nVar, oVar, Math.round((1 + f4) * f3), this.f6172i[i4]);
            i3++;
            i4 = i5;
        }
        return C0174m.f3840a;
    }
}
