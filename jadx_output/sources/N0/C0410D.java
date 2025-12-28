package n0;

import a2.ViewOnAttachStateChangeListenerC0115n;
import c2.C0174m;
import o0.AbstractC0468a;

/* renamed from: n0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410D extends p2.h implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5081g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0410D(Object obj, Object obj2, Object obj3, int i3) {
        super(0);
        this.f5079e = i3;
        this.f5080f = obj;
        this.f5081g = obj2;
        this.h = obj3;
    }

    @Override // o2.a
    public final Object c() {
        C0174m c0174m = C0174m.f3840a;
        Object obj = this.f5080f;
        Object obj2 = this.h;
        Object obj3 = this.f5081g;
        switch (this.f5079e) {
            case 0:
                C0412F c0412f = (C0412F) obj;
                C0415I c0415i = c0412f.f5102z;
                c0415i.f5138i = 0;
                F.d n2 = c0415i.f5131a.n();
                int i3 = n2.f1160f;
                if (i3 > 0) {
                    Object[] objArr = n2.f1158d;
                    int i4 = 0;
                    do {
                        C0412F c0412f2 = ((C0444z) objArr[i4]).f5320y.f5147r;
                        p2.g.b(c0412f2);
                        c0412f2.f5086j = c0412f2.f5087k;
                        c0412f2.f5087k = Integer.MAX_VALUE;
                        if (c0412f2.f5088l == 2) {
                            c0412f2.f5088l = 3;
                        }
                        i4++;
                    } while (i4 < i3);
                }
                C0415I c0415i2 = c0412f.f5102z;
                F.d n3 = c0415i2.f5131a.n();
                int i5 = n3.f1160f;
                if (i5 > 0) {
                    Object[] objArr2 = n3.f1158d;
                    int i6 = 0;
                    do {
                        C0412F c0412f3 = ((C0444z) objArr2[i6]).f5320y.f5147r;
                        p2.g.b(c0412f3);
                        c0412f3.f5095s.getClass();
                        i6++;
                    } while (i6 < i5);
                }
                C0434o c0434o = c0412f.A().f5276L;
                C0415I c0415i3 = (C0415I) obj2;
                if (c0434o != null) {
                    boolean z3 = c0434o.f5164j;
                    F.a aVar = (F.a) c0415i3.f5131a.h();
                    int i7 = aVar.f1152d.f1160f;
                    for (int i8 = 0; i8 < i7; i8++) {
                        AbstractC0419M o02 = ((Y) ((C0444z) aVar.get(i8)).f5319x.f855d).o0();
                        if (o02 != null) {
                            o02.f5164j = z3;
                        }
                    }
                }
                ((C0434o) obj3).X().g();
                if (c0412f.A().f5276L != null) {
                    F.a aVar2 = (F.a) c0415i3.f5131a.h();
                    int i9 = aVar2.f1152d.f1160f;
                    for (int i10 = 0; i10 < i9; i10++) {
                        AbstractC0419M o03 = ((Y) ((C0444z) aVar2.get(i10)).f5319x.f855d).o0();
                        if (o03 != null) {
                            o03.f5164j = false;
                        }
                    }
                }
                C0444z c0444z = c0415i2.f5131a;
                F.d n4 = c0444z.n();
                int i11 = n4.f1160f;
                if (i11 > 0) {
                    Object[] objArr3 = n4.f1158d;
                    int i12 = 0;
                    do {
                        C0412F c0412f4 = ((C0444z) objArr3[i12]).f5320y.f5147r;
                        p2.g.b(c0412f4);
                        int i13 = c0412f4.f5086j;
                        int i14 = c0412f4.f5087k;
                        if (i13 != i14 && i14 == Integer.MAX_VALUE) {
                            c0412f4.N();
                        }
                        i12++;
                    } while (i12 < i11);
                }
                F.d n5 = c0444z.n();
                int i15 = n5.f1160f;
                if (i15 > 0) {
                    Object[] objArr4 = n5.f1158d;
                    int i16 = 0;
                    do {
                        C0412F c0412f5 = ((C0444z) objArr4[i16]).f5320y.f5147r;
                        p2.g.b(c0412f5);
                        C0407A c0407a = c0412f5.f5095s;
                        c0407a.getClass();
                        c0407a.f5071c = false;
                        i16++;
                    } while (i16 < i15);
                }
                break;
            case 1:
                W.F f3 = Y.f5207G;
                ((Y) obj).k0((W.o) obj3, (Z.d) obj2);
                break;
            case 2:
                AbstractC0468a abstractC0468a = (AbstractC0468a) obj;
                abstractC0468a.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC0115n) obj3);
                X.d dVar = (X.d) obj2;
                p2.g.e(dVar, "listener");
                Z.b.v(abstractC0468a).f4939a.remove(dVar);
                break;
            default:
                C0408B c0408b = (C0408B) obj2;
                ((p2.o) obj).f5960d = ((q.j) obj3).f5998t.b(c0408b.f5076d.L(), c0408b.getLayoutDirection(), c0408b);
                break;
        }
        return c0174m;
    }
}
