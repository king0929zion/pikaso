package x;

import a.AbstractC0090a;
import v0.C0613B;
import v0.C0616a;
import z0.InterfaceC0721e;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642g {

    /* renamed from: a, reason: collision with root package name */
    public String f6601a;

    /* renamed from: b, reason: collision with root package name */
    public C0613B f6602b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0721e f6603c;

    /* renamed from: d, reason: collision with root package name */
    public int f6604d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6605e;

    /* renamed from: f, reason: collision with root package name */
    public int f6606f;

    /* renamed from: g, reason: collision with root package name */
    public int f6607g;

    /* renamed from: i, reason: collision with root package name */
    public G0.b f6608i;

    /* renamed from: j, reason: collision with root package name */
    public C0616a f6609j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6610k;

    /* renamed from: m, reason: collision with root package name */
    public C0639d f6612m;

    /* renamed from: n, reason: collision with root package name */
    public v0.m f6613n;

    /* renamed from: o, reason: collision with root package name */
    public G0.f f6614o;
    public long h = AbstractC0636a.f6577a;

    /* renamed from: l, reason: collision with root package name */
    public long f6611l = r2.a.d(0, 0);

    /* renamed from: p, reason: collision with root package name */
    public long f6615p = AbstractC0090a.q(0, 0, 0, 0);

    public C0642g(String str, C0613B c0613b, InterfaceC0721e interfaceC0721e, int i3, boolean z3, int i4, int i5) {
        this.f6601a = str;
        this.f6602b = c0613b;
        this.f6603c = interfaceC0721e;
        this.f6604d = i3;
        this.f6605e = z3;
        this.f6606f = i4;
        this.f6607g = i5;
    }

    public final void a(G0.b bVar) {
        long j3;
        G0.b bVar2 = this.f6608i;
        if (bVar != null) {
            int i3 = AbstractC0636a.f6578b;
            j3 = AbstractC0636a.a(bVar.n(), bVar.f());
        } else {
            j3 = AbstractC0636a.f6577a;
        }
        if (bVar2 == null) {
            this.f6608i = bVar;
            this.h = j3;
            return;
        }
        if (bVar == null || this.h != j3) {
            this.f6608i = bVar;
            this.h = j3;
            this.f6609j = null;
            this.f6613n = null;
            this.f6614o = null;
            this.f6615p = AbstractC0090a.q(0, 0, 0, 0);
            this.f6611l = r2.a.d(0, 0);
            this.f6610k = false;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f6609j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j3 = this.h;
        int i3 = AbstractC0636a.f6578b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j3 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j3 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
