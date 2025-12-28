package x;

import a.AbstractC0090a;
import v0.C0613B;
import z0.InterfaceC0721e;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639d {
    public static C0639d h;

    /* renamed from: a, reason: collision with root package name */
    public final G0.f f6579a;

    /* renamed from: b, reason: collision with root package name */
    public final C0613B f6580b;

    /* renamed from: c, reason: collision with root package name */
    public final G0.b f6581c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0721e f6582d;

    /* renamed from: e, reason: collision with root package name */
    public final C0613B f6583e;

    /* renamed from: f, reason: collision with root package name */
    public float f6584f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f6585g = Float.NaN;

    public C0639d(G0.f fVar, C0613B c0613b, G0.b bVar, InterfaceC0721e interfaceC0721e) {
        this.f6579a = fVar;
        this.f6580b = c0613b;
        this.f6581c = bVar;
        this.f6582d = interfaceC0721e;
        this.f6583e = Z.b.K(c0613b, fVar);
    }

    public final long a(long j3, int i3) {
        int i4;
        float f3 = this.f6585g;
        float f4 = this.f6584f;
        if (Float.isNaN(f3) || Float.isNaN(f4)) {
            float b3 = Z.b.b(AbstractC0640e.f6586a, this.f6583e, AbstractC0090a.b(0, 0, 15), this.f6581c, this.f6582d, 1).b();
            float b4 = Z.b.b(AbstractC0640e.f6587b, this.f6583e, AbstractC0090a.b(0, 0, 15), this.f6581c, this.f6582d, 2).b() - b3;
            this.f6585g = b3;
            this.f6584f = b4;
            f4 = b4;
            f3 = b3;
        }
        if (i3 != 1) {
            int round = Math.round((f4 * (i3 - 1)) + f3);
            i4 = round >= 0 ? round : 0;
            int g3 = G0.a.g(j3);
            if (i4 > g3) {
                i4 = g3;
            }
        } else {
            i4 = G0.a.i(j3);
        }
        return AbstractC0090a.a(G0.a.j(j3), G0.a.h(j3), i4, G0.a.g(j3));
    }
}
