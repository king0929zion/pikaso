package U;

import c2.C0174m;

/* loaded from: classes.dex */
public final class f extends p2.h implements o2.a {

    /* renamed from: f, reason: collision with root package name */
    public static final f f2340f = new f(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final f f2341g = new f(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i3, int i4) {
        super(i3);
        this.f2342e = i4;
    }

    @Override // o2.a
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.f2342e) {
            case 0:
                return Boolean.FALSE;
            default:
                return C0174m.f3840a;
        }
    }
}
