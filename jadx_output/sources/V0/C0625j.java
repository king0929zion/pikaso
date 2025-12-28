package v0;

import a1.C0095c;
import d2.AbstractC0241l;
import java.util.ArrayList;

/* renamed from: v0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0625j extends p2.h implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0095c f6358f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0625j(C0095c c0095c, int i3) {
        super(0);
        this.f6357e = i3;
        this.f6358f = c0095c;
    }

    @Override // o2.a
    public final Object c() {
        Object obj;
        Object obj2;
        switch (this.f6357e) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f6358f.f2930f;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float b3 = ((l) obj3).f6366a.f559i.b();
                    int T2 = AbstractC0241l.T(arrayList);
                    int i3 = 1;
                    if (1 <= T2) {
                        while (true) {
                            Object obj4 = arrayList.get(i3);
                            float b4 = ((l) obj4).f6366a.f559i.b();
                            if (Float.compare(b3, b4) < 0) {
                                obj3 = obj4;
                                b3 = b4;
                            }
                            if (i3 != T2) {
                                i3++;
                            }
                        }
                    }
                    obj = obj3;
                }
                l lVar = (l) obj;
                return Float.valueOf(lVar != null ? lVar.f6366a.f559i.b() : 0.0f);
            default:
                ArrayList arrayList2 = (ArrayList) this.f6358f.f2930f;
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    Object obj5 = arrayList2.get(0);
                    float c3 = ((l) obj5).f6366a.c();
                    int T3 = AbstractC0241l.T(arrayList2);
                    int i4 = 1;
                    if (1 <= T3) {
                        while (true) {
                            Object obj6 = arrayList2.get(i4);
                            float c4 = ((l) obj6).f6366a.c();
                            if (Float.compare(c3, c4) < 0) {
                                obj5 = obj6;
                                c3 = c4;
                            }
                            if (i4 != T3) {
                                i4++;
                            }
                        }
                    }
                    obj2 = obj5;
                }
                l lVar2 = (l) obj2;
                return Float.valueOf(lVar2 != null ? lVar2.f6366a.c() : 0.0f);
        }
    }
}
