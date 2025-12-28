package T;

import c2.C0174m;
import l0.n;
import l0.o;
import p2.h;

/* loaded from: classes.dex */
public final class b extends h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f2324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(o oVar, int i3) {
        super(1);
        this.f2323e = i3;
        this.f2324f = oVar;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f2323e) {
            case 0:
                n.f((n) obj, this.f2324f, 0, 0);
                break;
            case 1:
                n.g((n) obj, this.f2324f);
                break;
            case 2:
                n.f((n) obj, this.f2324f, 0, 0);
                break;
            case 3:
                n.f((n) obj, this.f2324f, 0, 0);
                break;
            case 4:
                n.f((n) obj, this.f2324f, 0, 0);
                break;
            case 5:
                n.d((n) obj, this.f2324f, 0, 0);
                break;
            default:
                n.d((n) obj, this.f2324f, 0, 0);
                break;
        }
        return C0174m.f3840a;
    }
}
