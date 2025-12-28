package w;

import A.t;
import D.C0032d;
import D.C0052n;
import P.l;
import Z0.d;
import c2.C0174m;
import o2.e;
import p2.h;
import v0.C0613B;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627a extends h implements e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f6485f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0613B f6486g;
    public final /* synthetic */ o2.c h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6487i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f6488j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6489k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6490l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f6491m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6492n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0627a(String str, l lVar, C0613B c0613b, o2.c cVar, int i3, boolean z3, int i4, int i5, t tVar, int i6) {
        super(2);
        this.f6484e = str;
        this.f6485f = lVar;
        this.f6486g = c0613b;
        this.h = cVar;
        this.f6487i = i3;
        this.f6488j = z3;
        this.f6489k = i4;
        this.f6490l = i5;
        this.f6491m = tVar;
        this.f6492n = i6;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int J2 = C0032d.J(this.f6492n | 1);
        boolean z3 = this.f6488j;
        int i3 = this.f6489k;
        d.a(this.f6484e, this.f6485f, this.f6486g, this.h, this.f6487i, z3, i3, this.f6490l, this.f6491m, (C0052n) obj, J2);
        return C0174m.f3840a;
    }
}
