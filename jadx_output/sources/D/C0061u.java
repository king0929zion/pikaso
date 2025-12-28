package D;

import c2.C0174m;
import java.util.Arrays;
import o0.C0507u;

/* renamed from: D.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061u extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L.a f891f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f892g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061u(L.a aVar, Object obj, int i3) {
        super(2);
        this.f890e = 2;
        this.f891f = aVar;
        this.h = obj;
        this.f892g = i3;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        switch (this.f890e) {
            case 0:
                ((Number) obj2).intValue();
                C0049l0[] c0049l0Arr = (C0049l0[]) this.h;
                C0049l0[] c0049l0Arr2 = (C0049l0[]) Arrays.copyOf(c0049l0Arr, c0049l0Arr.length);
                int J2 = C0032d.J(this.f892g | 1);
                C0032d.b(c0049l0Arr2, this.f891f, (C0052n) obj, J2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int J3 = C0032d.J(this.f892g | 1);
                L.a aVar = this.f891f;
                C0032d.a((C0049l0) this.h, aVar, (C0052n) obj, J3);
                break;
            case 2:
                ((Number) obj2).intValue();
                int J4 = C0032d.J(this.f892g) | 1;
                this.f891f.b(this.h, (C0052n) obj, J4);
                break;
            default:
                ((Number) obj2).intValue();
                int J5 = C0032d.J(this.f892g | 1);
                o0.S.a((C0507u) this.h, this.f891f, (C0052n) obj, J5);
                break;
        }
        return C0174m.f3840a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0061u(Object obj, L.a aVar, int i3, int i4) {
        super(2);
        this.f890e = i4;
        this.h = obj;
        this.f891f = aVar;
        this.f892g = i3;
    }
}
