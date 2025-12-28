package c0;

import W.C0087j;
import android.graphics.PathMeasure;
import c2.C0174m;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155f extends p2.h implements o2.a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0155f f3753f = new C0155f(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0155f f3754g = new C0155f(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0155f(int i3, int i4) {
        super(i3);
        this.f3755e = i4;
    }

    @Override // o2.a
    public final Object c() {
        switch (this.f3755e) {
            case 0:
                return new C0087j(new PathMeasure());
            default:
                return C0174m.f3840a;
        }
    }
}
