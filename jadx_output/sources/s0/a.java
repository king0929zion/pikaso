package s0;

import A.AbstractC0000a;
import p2.h;

/* loaded from: classes.dex */
public final class a extends h implements o2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final a f6120f = new a(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final a f6121g = new a(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i3, int i4) {
        super(i3);
        this.f6122e = i4;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f6122e) {
            case 0:
                throw null;
            default:
                AbstractC0000a.j(obj);
                throw null;
        }
    }
}
