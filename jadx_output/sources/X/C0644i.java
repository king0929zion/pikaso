package x;

import A.t;
import W.r;
import c2.C0174m;
import java.util.List;
import n0.AbstractC0409C;
import v0.C0613B;
import v0.C0618c;
import v0.x;
import v0.y;
import z0.InterfaceC0721e;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644i extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0645j f6621f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0644i(C0645j c0645j, int i3) {
        super(1);
        this.f6620e = i3;
        this.f6621f = c0645j;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        y yVar;
        switch (this.f6620e) {
            case 0:
                List list = (List) obj;
                C0645j c0645j = this.f6621f;
                y yVar2 = c0645j.f0().f6600n;
                if (yVar2 != null) {
                    x xVar = yVar2.f6472a;
                    C0618c c0618c = xVar.f6463a;
                    C0613B c0613b = c0645j.f6629r;
                    t tVar = c0645j.f6622A;
                    yVar = new y(new x(c0618c, C0613B.d(c0613b, tVar != null ? tVar.z() : r.f2562f, 0L, null, null, null, 0L, null, 0, 0L, 16777214), xVar.f6465c, xVar.f6466d, xVar.f6467e, xVar.f6468f, xVar.f6469g, xVar.h, xVar.f6470i, xVar.f6471j), yVar2.f6473b, yVar2.f6474c);
                    list.add(yVar);
                } else {
                    yVar = null;
                }
                break;
            case 1:
                C0618c c0618c2 = (C0618c) obj;
                C0645j c0645j2 = this.f6621f;
                C0643h c0643h = c0645j2.f6627F;
                if (c0643h == null) {
                    C0643h c0643h2 = new C0643h(c0645j2.f6628q, c0618c2);
                    C0641f c0641f = new C0641f(c0618c2, c0645j2.f6629r, c0645j2.f6630s, c0645j2.f6632u, c0645j2.f6633v, c0645j2.f6634w, c0645j2.f6635x, c0645j2.f6636y);
                    c0641f.a(c0645j2.f0().f6597k);
                    c0643h2.f6619d = c0641f;
                    c0645j2.f6627F = c0643h2;
                } else if (!p2.g.a(c0618c2, c0643h.f6617b)) {
                    c0643h.f6617b = c0618c2;
                    C0641f c0641f2 = c0643h.f6619d;
                    if (c0641f2 != null) {
                        C0613B c0613b2 = c0645j2.f6629r;
                        InterfaceC0721e interfaceC0721e = c0645j2.f6630s;
                        int i3 = c0645j2.f6632u;
                        boolean z3 = c0645j2.f6633v;
                        int i4 = c0645j2.f6634w;
                        int i5 = c0645j2.f6635x;
                        List list2 = c0645j2.f6636y;
                        c0641f2.f6588a = c0618c2;
                        c0641f2.f6589b = c0613b2;
                        c0641f2.f6590c = interfaceC0721e;
                        c0641f2.f6591d = i3;
                        c0641f2.f6592e = z3;
                        c0641f2.f6593f = i4;
                        c0641f2.f6594g = i5;
                        c0641f2.h = list2;
                        c0641f2.f6598l = null;
                        c0641f2.f6600n = null;
                        C0174m c0174m = C0174m.f3840a;
                    }
                }
                AbstractC0409C.m(c0645j2);
                AbstractC0409C.l(c0645j2);
                AbstractC0409C.k(c0645j2);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C0645j c0645j3 = this.f6621f;
                C0643h c0643h3 = c0645j3.f6627F;
                if (c0643h3 != null) {
                    o2.c cVar = c0645j3.f6623B;
                    if (cVar != null) {
                        cVar.i(c0643h3);
                    }
                    C0643h c0643h4 = c0645j3.f6627F;
                    if (c0643h4 != null) {
                        c0643h4.f6618c = booleanValue;
                    }
                    AbstractC0409C.m(c0645j3);
                    AbstractC0409C.l(c0645j3);
                    AbstractC0409C.k(c0645j3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
