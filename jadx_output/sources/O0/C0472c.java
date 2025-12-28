package o0;

import java.text.BreakIterator;
import java.util.ArrayList;
import v0.C0616a;
import v0.C0624i;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472c extends AbstractC0470b {

    /* renamed from: e, reason: collision with root package name */
    public static C0472c f5555e;

    /* renamed from: f, reason: collision with root package name */
    public static C0472c f5556f;

    /* renamed from: g, reason: collision with root package name */
    public static C0472c f5557g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5558c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5559d;

    public /* synthetic */ C0472c(int i3) {
        this.f5558c = i3;
    }

    @Override // o0.AbstractC0470b
    public final int[] a(int i3) {
        int i4;
        switch (this.f5558c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i3 >= length) {
                    return null;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f5559d;
                    if (breakIterator == null) {
                        p2.g.h("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i3)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f5559d;
                        if (breakIterator2 == null) {
                            p2.g.h("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i3);
                        if (following == -1) {
                            return null;
                        }
                        return b(i3, following);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f5559d;
                    if (breakIterator3 == null) {
                        p2.g.h("impl");
                        throw null;
                    }
                    i3 = breakIterator3.following(i3);
                } while (i3 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i3 >= c().length()) {
                    return null;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                while (!h(i3) && (!h(i3) || (i3 != 0 && h(i3 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f5559d;
                    if (breakIterator4 == null) {
                        p2.g.h("impl");
                        throw null;
                    }
                    i3 = breakIterator4.following(i3);
                    if (i3 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f5559d;
                if (breakIterator5 == null) {
                    p2.g.h("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i3);
                if (following2 == -1 || !g(following2)) {
                    return null;
                }
                return b(i3, following2);
            default:
                if (c().length() <= 0 || i3 >= c().length()) {
                    return null;
                }
                if (i3 < 0) {
                    v0.y yVar = (v0.y) this.f5559d;
                    if (yVar == null) {
                        p2.g.h("layoutResult");
                        throw null;
                    }
                    i4 = yVar.a(0);
                } else {
                    v0.y yVar2 = (v0.y) this.f5559d;
                    if (yVar2 == null) {
                        p2.g.h("layoutResult");
                        throw null;
                    }
                    int a3 = yVar2.a(i3);
                    i4 = e(a3, 2) == i3 ? a3 : a3 + 1;
                }
                v0.y yVar3 = (v0.y) this.f5559d;
                if (yVar3 == null) {
                    p2.g.h("layoutResult");
                    throw null;
                }
                if (i4 >= yVar3.f6473b.f6355f) {
                    return null;
                }
                return b(e(i4, 2), e(i4, 1) + 1);
        }
    }

    @Override // o0.AbstractC0470b
    public final int[] d(int i3) {
        int i4;
        switch (this.f5558c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i3 <= 0) {
                    return null;
                }
                if (i3 > length) {
                    i3 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f5559d;
                    if (breakIterator == null) {
                        p2.g.h("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i3)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f5559d;
                        if (breakIterator2 == null) {
                            p2.g.h("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i3);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i3);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f5559d;
                    if (breakIterator3 == null) {
                        p2.g.h("impl");
                        throw null;
                    }
                    i3 = breakIterator3.preceding(i3);
                } while (i3 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i3 <= 0) {
                    return null;
                }
                if (i3 > length2) {
                    i3 = length2;
                }
                while (i3 > 0 && !h(i3 - 1) && !g(i3)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f5559d;
                    if (breakIterator4 == null) {
                        p2.g.h("impl");
                        throw null;
                    }
                    i3 = breakIterator4.preceding(i3);
                    if (i3 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f5559d;
                if (breakIterator5 == null) {
                    p2.g.h("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i3);
                if (preceding2 == -1 || !h(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !h(preceding2 - 1)) {
                    return b(preceding2, i3);
                }
                return null;
            default:
                if (c().length() <= 0 || i3 <= 0) {
                    return null;
                }
                if (i3 > c().length()) {
                    v0.y yVar = (v0.y) this.f5559d;
                    if (yVar == null) {
                        p2.g.h("layoutResult");
                        throw null;
                    }
                    i4 = yVar.a(c().length());
                } else {
                    v0.y yVar2 = (v0.y) this.f5559d;
                    if (yVar2 == null) {
                        p2.g.h("layoutResult");
                        throw null;
                    }
                    int a3 = yVar2.a(i3);
                    i4 = e(a3, 1) + 1 == i3 ? a3 : a3 - 1;
                }
                if (i4 < 0) {
                    return null;
                }
                return b(e(i4, 2), e(i4, 1) + 1);
        }
    }

    public int e(int i3, int i4) {
        v0.y yVar = (v0.y) this.f5559d;
        if (yVar == null) {
            p2.g.h("layoutResult");
            throw null;
        }
        int c3 = yVar.c(i3);
        v0.y yVar2 = (v0.y) this.f5559d;
        if (yVar2 == null) {
            p2.g.h("layoutResult");
            throw null;
        }
        if (i4 != yVar2.e(c3)) {
            v0.y yVar3 = (v0.y) this.f5559d;
            if (yVar3 != null) {
                return yVar3.c(i3);
            }
            p2.g.h("layoutResult");
            throw null;
        }
        v0.y yVar4 = (v0.y) this.f5559d;
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

    public void f(String str) {
        switch (this.f5558c) {
            case 0:
                this.f5547a = str;
                BreakIterator breakIterator = (BreakIterator) this.f5559d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    p2.g.h("impl");
                    throw null;
                }
            default:
                this.f5547a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f5559d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    p2.g.h("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i3) {
        return i3 > 0 && h(i3 + (-1)) && (i3 == c().length() || !h(i3));
    }

    public boolean h(int i3) {
        if (i3 < 0 || i3 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i3));
    }
}
