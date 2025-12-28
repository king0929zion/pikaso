package N;

import D.C0032d;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1771a = new Object();

    public static final void a(int i3, int i4) {
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException("index (" + i3 + ") is out of bound of [0, " + i4 + ')');
        }
    }

    public static final int b(int[] iArr, int i3) {
        int length = iArr.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (i4 + length) >>> 1;
            int i6 = iArr[i5];
            if (i3 > i6) {
                i4 = i5 + 1;
            } else {
                if (i3 >= i6) {
                    return i5;
                }
                length = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static Object c(o2.c cVar, o2.a aVar) {
        h d3;
        if (cVar == null) {
            return aVar.c();
        }
        h hVar = (h) o.f1755a.i();
        if (hVar instanceof D) {
            D d4 = (D) hVar;
            if (d4.f1713t == C0032d.u()) {
                o2.c cVar2 = d4.f1711r;
                o2.c cVar3 = d4.f1712s;
                try {
                    ((D) hVar).f1711r = o.l(cVar, cVar2, true);
                    ((D) hVar).f1712s = o.b(null, cVar3);
                    return aVar.c();
                } finally {
                    d4.f1711r = cVar2;
                    d4.f1712s = cVar3;
                }
            }
        }
        if (hVar == null || (hVar instanceof C0075c)) {
            d3 = new D(hVar instanceof C0075c ? (C0075c) hVar : null, cVar, null, true, false);
        } else {
            if (cVar == null) {
                return aVar.c();
            }
            d3 = hVar.t(cVar);
        }
        try {
            h j3 = d3.j();
            try {
                return aVar.c();
            } finally {
                h.p(j3);
            }
        } finally {
            d3.c();
        }
    }

    public static void d(h hVar, h hVar2, o2.c cVar) {
        if (hVar != hVar2) {
            hVar2.getClass();
            h.p(hVar);
            hVar2.c();
        } else if (hVar instanceof D) {
            ((D) hVar).f1711r = cVar;
        } else if (hVar instanceof E) {
            ((E) hVar).f1716g = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + hVar).toString());
        }
    }

    public static final void e() {
        throw new UnsupportedOperationException();
    }
}
