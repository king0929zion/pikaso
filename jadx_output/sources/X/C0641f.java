package x;

import a.AbstractC0090a;
import a1.C0095c;
import d2.C0248s;
import java.util.List;
import v0.C0613B;
import v0.C0618c;
import v0.C0624i;
import v0.x;
import v0.y;
import z0.InterfaceC0721e;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641f {

    /* renamed from: a, reason: collision with root package name */
    public C0618c f6588a;

    /* renamed from: b, reason: collision with root package name */
    public C0613B f6589b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0721e f6590c;

    /* renamed from: d, reason: collision with root package name */
    public int f6591d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6592e;

    /* renamed from: f, reason: collision with root package name */
    public int f6593f;

    /* renamed from: g, reason: collision with root package name */
    public int f6594g;
    public List h;

    /* renamed from: i, reason: collision with root package name */
    public C0639d f6595i;

    /* renamed from: j, reason: collision with root package name */
    public long f6596j = AbstractC0636a.f6577a;

    /* renamed from: k, reason: collision with root package name */
    public G0.b f6597k;

    /* renamed from: l, reason: collision with root package name */
    public C0095c f6598l;

    /* renamed from: m, reason: collision with root package name */
    public G0.f f6599m;

    /* renamed from: n, reason: collision with root package name */
    public y f6600n;

    public C0641f(C0618c c0618c, C0613B c0613b, InterfaceC0721e interfaceC0721e, int i3, boolean z3, int i4, int i5, List list) {
        this.f6588a = c0618c;
        this.f6589b = c0613b;
        this.f6590c = interfaceC0721e;
        this.f6591d = i3;
        this.f6592e = z3;
        this.f6593f = i4;
        this.f6594g = i5;
        this.h = list;
    }

    public final void a(G0.b bVar) {
        long j3;
        G0.b bVar2 = this.f6597k;
        if (bVar != null) {
            int i3 = AbstractC0636a.f6578b;
            j3 = AbstractC0636a.a(bVar.n(), bVar.f());
        } else {
            j3 = AbstractC0636a.f6577a;
        }
        if (bVar2 == null) {
            this.f6597k = bVar;
            this.f6596j = j3;
        } else if (bVar == null || this.f6596j != j3) {
            this.f6597k = bVar;
            this.f6596j = j3;
            this.f6598l = null;
            this.f6600n = null;
        }
    }

    public final y b(G0.f fVar, long j3, C0624i c0624i) {
        float min = Math.min(c0624i.f6350a.b(), c0624i.f6353d);
        C0618c c0618c = this.f6588a;
        C0613B c0613b = this.f6589b;
        List list = this.h;
        if (list == null) {
            list = C0248s.f4255d;
        }
        int i3 = this.f6593f;
        boolean z3 = this.f6592e;
        int i4 = this.f6591d;
        G0.b bVar = this.f6597k;
        p2.g.b(bVar);
        return new y(new x(c0618c, c0613b, list, i3, z3, i4, bVar, fVar, this.f6590c, j3), c0624i, AbstractC0090a.n(j3, r2.a.d(Z.b.d(min), Z.b.d(c0624i.f6354e))));
    }
}
