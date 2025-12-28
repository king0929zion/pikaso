package t;

import c2.C0174m;
import java.util.List;
import l0.InterfaceC0360j;
import n0.AbstractC0418L;

/* loaded from: classes.dex */
public final class h extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.o[] f6161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f6162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0418L f6163g;
    public final /* synthetic */ p2.n h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p2.n f6164i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f6165j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l0.o[] oVarArr, List list, AbstractC0418L abstractC0418L, p2.n nVar, p2.n nVar2, i iVar) {
        super(1);
        this.f6161e = oVarArr;
        this.f6162f = list;
        this.f6163g = abstractC0418L;
        this.h = nVar;
        this.f6164i = nVar2;
        this.f6165j = iVar;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        l0.n nVar = (l0.n) obj;
        l0.o[] oVarArr = this.f6161e;
        int length = oVarArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            l0.o oVar = oVarArr[i4];
            p2.g.c(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            e.a(nVar, oVar, (InterfaceC0360j) this.f6162f.get(i3), this.f6163g.getLayoutDirection(), this.h.f5959d, this.f6164i.f5959d, this.f6165j.f6166a);
            i4++;
            i3++;
        }
        return C0174m.f3840a;
    }
}
