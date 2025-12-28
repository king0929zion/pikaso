package C2;

import B2.C0019c;
import B2.InterfaceC0021e;
import B2.InterfaceC0022f;
import D2.AbstractC0071a;
import c2.C0174m;
import d2.AbstractC0240k;
import g2.C0272e;
import g2.C0277j;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import java.util.ArrayList;
import y2.AbstractC0688v;
import y2.C0682o;

/* loaded from: classes.dex */
public abstract class h implements q {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0276i f594d;

    /* renamed from: e, reason: collision with root package name */
    public final int f595e;

    /* renamed from: f, reason: collision with root package name */
    public final int f596f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0021e f597g;

    public h(InterfaceC0021e interfaceC0021e, InterfaceC0276i interfaceC0276i, int i3, int i4) {
        this.f594d = interfaceC0276i;
        this.f595e = i3;
        this.f596f = i4;
        this.f597g = interfaceC0021e;
    }

    public abstract h a(InterfaceC0276i interfaceC0276i, int i3, int i4);

    public InterfaceC0021e b() {
        return null;
    }

    public abstract Object c(InterfaceC0022f interfaceC0022f, i2.c cVar);

    public final String d() {
        ArrayList arrayList = new ArrayList(4);
        C0277j c0277j = C0277j.f4334d;
        InterfaceC0276i interfaceC0276i = this.f594d;
        if (interfaceC0276i != c0277j) {
            arrayList.add("context=" + interfaceC0276i);
        }
        int i3 = this.f595e;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        int i4 = this.f596f;
        if (i4 != 1) {
            arrayList.add("onBufferOverflow=".concat(i4 != 1 ? i4 != 2 ? i4 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + AbstractC0240k.d0(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override // C2.q
    public final InterfaceC0021e m(InterfaceC0276i interfaceC0276i, int i3, int i4) {
        InterfaceC0276i interfaceC0276i2 = this.f594d;
        InterfaceC0276i i5 = interfaceC0276i.i(interfaceC0276i2);
        int i6 = this.f596f;
        int i7 = this.f595e;
        if (i4 == 1) {
            if (i7 != -3) {
                if (i3 != -3) {
                    if (i7 != -2) {
                        if (i3 != -2) {
                            i3 += i7;
                            if (i3 < 0) {
                                i3 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i3 = i7;
            }
            i4 = i6;
        }
        return (p2.g.a(i5, interfaceC0276i2) && i3 == i7 && i4 == i6) ? this : a(i5, i3, i4);
    }

    @Override // B2.InterfaceC0021e
    public final Object o(InterfaceC0022f interfaceC0022f, InterfaceC0271d interfaceC0271d) {
        Object b3;
        C0174m c0174m = C0174m.f3840a;
        h2.a aVar = h2.a.f4407d;
        if (this.f595e == -3) {
            InterfaceC0276i o3 = interfaceC0271d.o();
            Boolean bool = Boolean.FALSE;
            C0682o c0682o = C0682o.f6810g;
            InterfaceC0276i interfaceC0276i = this.f594d;
            InterfaceC0276i i3 = !((Boolean) interfaceC0276i.l(bool, c0682o)).booleanValue() ? o3.i(interfaceC0276i) : AbstractC0688v.e(o3, interfaceC0276i, false);
            if (p2.g.a(i3, o3)) {
                b3 = c(interfaceC0022f, (i2.c) interfaceC0271d);
                if (b3 != aVar) {
                    return c0174m;
                }
            } else {
                C0272e c0272e = C0272e.f4333d;
                if (p2.g.a(i3.n(c0272e), o3.n(c0272e))) {
                    InterfaceC0276i o4 = interfaceC0271d.o();
                    if (!(interfaceC0022f instanceof x ? true : interfaceC0022f instanceof s)) {
                        interfaceC0022f = new C0019c(interfaceC0022f, o4);
                    }
                    b3 = c.a(i3, interfaceC0022f, AbstractC0071a.l(i3), new g(this, null), interfaceC0271d);
                    if (b3 != aVar) {
                        b3 = c0174m;
                    }
                    if (b3 != aVar) {
                        return c0174m;
                    }
                }
            }
            return b3;
        }
        b3 = AbstractC0688v.b(new e(interfaceC0022f, this, null), interfaceC0271d);
        if (b3 != aVar) {
            b3 = c0174m;
        }
        if (b3 != aVar) {
            return c0174m;
        }
        return b3;
    }

    public final String toString() {
        return this.f597g + " -> " + d();
    }
}
