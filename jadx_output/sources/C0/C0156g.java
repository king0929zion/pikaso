package c0;

import W.C0086i;
import W.C0087j;
import android.graphics.Path;
import d2.C0248s;

/* renamed from: c0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156g extends AbstractC0142B {

    /* renamed from: b, reason: collision with root package name */
    public W.D f3756b;

    /* renamed from: c, reason: collision with root package name */
    public float f3757c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public Object f3758d;

    /* renamed from: e, reason: collision with root package name */
    public float f3759e;

    /* renamed from: f, reason: collision with root package name */
    public float f3760f;

    /* renamed from: g, reason: collision with root package name */
    public W.D f3761g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f3762i;

    /* renamed from: j, reason: collision with root package name */
    public float f3763j;

    /* renamed from: k, reason: collision with root package name */
    public float f3764k;

    /* renamed from: l, reason: collision with root package name */
    public float f3765l;

    /* renamed from: m, reason: collision with root package name */
    public float f3766m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3767n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3768o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3769p;

    /* renamed from: q, reason: collision with root package name */
    public Y.g f3770q;

    /* renamed from: r, reason: collision with root package name */
    public final C0086i f3771r;

    /* renamed from: s, reason: collision with root package name */
    public C0086i f3772s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f3773t;

    public C0156g() {
        int i3 = AbstractC0146F.f3689a;
        this.f3758d = C0248s.f4255d;
        this.f3759e = 1.0f;
        this.h = 0;
        this.f3762i = 0;
        this.f3763j = 4.0f;
        this.f3765l = 1.0f;
        this.f3767n = true;
        this.f3768o = true;
        C0086i f3 = W.D.f();
        this.f3771r = f3;
        this.f3772s = f3;
        this.f3773t = Z.b.B(C0155f.f3753f);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // c0.AbstractC0142B
    public final void a(Y.d dVar) {
        if (this.f3767n) {
            AbstractC0151b.c(this.f3758d, this.f3771r);
            e();
        } else if (this.f3769p) {
            e();
        }
        this.f3767n = false;
        this.f3769p = false;
        W.D d3 = this.f3756b;
        if (d3 != null) {
            Y.d.T(dVar, this.f3772s, d3, this.f3757c, null, 56);
        }
        W.D d4 = this.f3761g;
        if (d4 != null) {
            Y.g gVar = this.f3770q;
            if (this.f3768o || gVar == null) {
                gVar = new Y.g(this.f3760f, this.f3763j, this.h, this.f3762i, 16);
                this.f3770q = gVar;
                this.f3768o = false;
            }
            Y.d.T(dVar, this.f3772s, d4, this.f3759e, gVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [c2.d, java.lang.Object] */
    public final void e() {
        Path path;
        float f3 = this.f3764k;
        C0086i c0086i = this.f3771r;
        if (f3 == 0.0f && this.f3765l == 1.0f) {
            this.f3772s = c0086i;
            return;
        }
        if (p2.g.a(this.f3772s, c0086i)) {
            this.f3772s = W.D.f();
        } else {
            int i3 = this.f3772s.f2545a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f3772s.f2545a.rewind();
            this.f3772s.c(i3);
        }
        ?? r02 = this.f3773t;
        C0087j c0087j = (C0087j) r02.getValue();
        if (c0086i != null) {
            c0087j.getClass();
            path = c0086i.f2545a;
        } else {
            path = null;
        }
        c0087j.f2548a.setPath(path, false);
        float length = ((C0087j) r02.getValue()).f2548a.getLength();
        float f4 = this.f3764k;
        float f5 = this.f3766m;
        float f6 = ((f4 + f5) % 1.0f) * length;
        float f7 = ((this.f3765l + f5) % 1.0f) * length;
        if (f6 <= f7) {
            ((C0087j) r02.getValue()).a(f6, f7, this.f3772s);
        } else {
            ((C0087j) r02.getValue()).a(f6, length, this.f3772s);
            ((C0087j) r02.getValue()).a(0.0f, f7, this.f3772s);
        }
    }

    public final String toString() {
        return this.f3771r.toString();
    }
}
