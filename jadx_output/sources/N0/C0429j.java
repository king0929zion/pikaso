package n0;

import java.util.LinkedHashMap;

/* renamed from: n0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429j extends p2.h implements o2.a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0429j f5259f = new C0429j(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0429j f5260g = new C0429j(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0429j(int i3, int i4) {
        super(i3);
        this.f5261e = i4;
    }

    @Override // o2.a
    public final Object c() {
        switch (this.f5261e) {
            case 0:
                return new LinkedHashMap();
            default:
                return new C0444z(3, 0, false);
        }
    }
}
