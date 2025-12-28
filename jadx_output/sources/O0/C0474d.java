package o0;

import java.util.ArrayList;
import v0.C0616a;
import v0.C0624i;

/* renamed from: o0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474d extends AbstractC0470b {

    /* renamed from: e, reason: collision with root package name */
    public static C0474d f5561e;

    /* renamed from: c, reason: collision with root package name */
    public v0.y f5562c;

    /* renamed from: d, reason: collision with root package name */
    public t0.k f5563d;

    @Override // o0.AbstractC0470b
    public final int[] a(int i3) {
        int i4;
        if (c().length() <= 0 || i3 >= c().length()) {
            return null;
        }
        try {
            t0.k kVar = this.f5563d;
            if (kVar == null) {
                p2.g.h("node");
                throw null;
            }
            int round = Math.round(kVar.e().b());
            if (i3 <= 0) {
                i3 = 0;
            }
            v0.y yVar = this.f5562c;
            if (yVar == null) {
                p2.g.h("layoutResult");
                throw null;
            }
            int a3 = yVar.a(i3);
            v0.y yVar2 = this.f5562c;
            if (yVar2 == null) {
                p2.g.h("layoutResult");
                throw null;
            }
            float d3 = yVar2.d(a3) + round;
            v0.y yVar3 = this.f5562c;
            if (yVar3 == null) {
                p2.g.h("layoutResult");
                throw null;
            }
            if (d3 < yVar3.d(yVar3.f6473b.f6355f - 1)) {
                v0.y yVar4 = this.f5562c;
                if (yVar4 == null) {
                    p2.g.h("layoutResult");
                    throw null;
                }
                i4 = yVar4.b(d3);
            } else {
                v0.y yVar5 = this.f5562c;
                if (yVar5 == null) {
                    p2.g.h("layoutResult");
                    throw null;
                }
                i4 = yVar5.f6473b.f6355f;
            }
            return b(i3, e(i4 - 1, 1) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // o0.AbstractC0470b
    public final int[] d(int i3) {
        int i4;
        if (c().length() <= 0 || i3 <= 0) {
            return null;
        }
        try {
            t0.k kVar = this.f5563d;
            if (kVar == null) {
                p2.g.h("node");
                throw null;
            }
            int round = Math.round(kVar.e().b());
            int length = c().length();
            if (length <= i3) {
                i3 = length;
            }
            v0.y yVar = this.f5562c;
            if (yVar == null) {
                p2.g.h("layoutResult");
                throw null;
            }
            int a3 = yVar.a(i3);
            v0.y yVar2 = this.f5562c;
            if (yVar2 == null) {
                p2.g.h("layoutResult");
                throw null;
            }
            float d3 = yVar2.d(a3) - round;
            if (d3 > 0.0f) {
                v0.y yVar3 = this.f5562c;
                if (yVar3 == null) {
                    p2.g.h("layoutResult");
                    throw null;
                }
                i4 = yVar3.b(d3);
            } else {
                i4 = 0;
            }
            if (i3 == c().length() && i4 < a3) {
                i4++;
            }
            return b(e(i4, 2), i3);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i3, int i4) {
        v0.y yVar = this.f5562c;
        if (yVar == null) {
            p2.g.h("layoutResult");
            throw null;
        }
        int c3 = yVar.c(i3);
        v0.y yVar2 = this.f5562c;
        if (yVar2 == null) {
            p2.g.h("layoutResult");
            throw null;
        }
        if (i4 != yVar2.e(c3)) {
            v0.y yVar3 = this.f5562c;
            if (yVar3 != null) {
                return yVar3.c(i3);
            }
            p2.g.h("layoutResult");
            throw null;
        }
        v0.y yVar4 = this.f5562c;
        if (yVar4 == null) {
            p2.g.h("layoutResult");
            throw null;
        }
        C0624i c0624i = yVar4.f6473b;
        c0624i.b(i3);
        ArrayList arrayList = c0624i.h;
        C0616a c0616a = ((v0.k) arrayList.get(Z0.d.u(i3, arrayList))).f6359a;
        return (c0616a.f6327d.e(i3 - r6.f6362d) + r6.f6360b) - 1;
    }
}
