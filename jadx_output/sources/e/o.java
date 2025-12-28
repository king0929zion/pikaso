package E;

import D.C0030c;
import D.C0032d;
import D.C0059s;
import D.D0;
import d2.AbstractC0239j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o extends y {

    /* renamed from: c, reason: collision with root package name */
    public static final o f1131c = new o(1, 0, 2);

    @Override // E.y
    public final void a(z zVar, B0.a aVar, D0 d02, C0059s c0059s) {
        C0030c c0030c;
        int c3;
        int a3 = zVar.a(0);
        if (!(d02.f677n == 0)) {
            C0032d.r("Cannot move a group while inserting");
            throw null;
        }
        if (!(a3 >= 0)) {
            C0032d.r("Parameter offset is out of bounds");
            throw null;
        }
        if (a3 == 0) {
            return;
        }
        int i3 = d02.f682s;
        int i4 = d02.f684u;
        int i5 = d02.f683t;
        int i6 = i3;
        while (a3 > 0) {
            i6 += d02.f666b[(d02.p(i6) * 5) + 3];
            if (i6 > i5) {
                C0032d.r("Parameter offset is out of bounds");
                throw null;
            }
            a3--;
        }
        int i7 = d02.f666b[(d02.p(i6) * 5) + 3];
        int f3 = d02.f(d02.f666b, d02.p(d02.f682s));
        int f4 = d02.f(d02.f666b, d02.p(i6));
        int i8 = i6 + i7;
        int f5 = d02.f(d02.f666b, d02.p(i8));
        int i9 = f5 - f4;
        d02.s(i9, Math.max(d02.f682s - 1, 0));
        d02.r(i7);
        int[] iArr = d02.f666b;
        int p3 = d02.p(i8) * 5;
        AbstractC0239j.X(d02.p(i3) * 5, p3, (i7 * 5) + p3, iArr, iArr);
        if (i9 > 0) {
            Object[] objArr = d02.f667c;
            AbstractC0239j.Y(objArr, objArr, f3, d02.g(f4 + i9), d02.g(f5 + i9));
        }
        int i10 = f4 + i9;
        int i11 = i10 - f3;
        int i12 = d02.f674k;
        int i13 = d02.f675l;
        int length = d02.f667c.length;
        int i14 = d02.f676m;
        int i15 = i3 + i7;
        int i16 = i3;
        while (i16 < i15) {
            int p4 = d02.p(i16);
            int i17 = i15;
            int i18 = i11;
            iArr[(p4 * 5) + 4] = D0.h(D0.h(d02.f(iArr, p4) - i11, i14 < p4 ? 0 : i12, i13, length), d02.f674k, d02.f675l, d02.f667c.length);
            i16++;
            i11 = i18;
            i15 = i17;
            i12 = i12;
            i13 = i13;
        }
        int i19 = i8 + i7;
        int n2 = d02.n();
        int k3 = C0032d.k(d02.f668d, i8, n2);
        ArrayList arrayList = new ArrayList();
        if (k3 >= 0) {
            while (k3 < d02.f668d.size() && (c3 = d02.c((c0030c = (C0030c) d02.f668d.get(k3)))) >= i8 && c3 < i19) {
                arrayList.add(c0030c);
                d02.f668d.remove(k3);
            }
        }
        int i20 = i3 - i8;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            C0030c c0030c2 = (C0030c) arrayList.get(i21);
            int c4 = d02.c(c0030c2) + i20;
            if (c4 >= d02.f671g) {
                c0030c2.f739a = -(n2 - c4);
            } else {
                c0030c2.f739a = c4;
            }
            d02.f668d.add(C0032d.k(d02.f668d, c4, n2), c0030c2);
        }
        if (d02.z(i8, i7)) {
            C0032d.r("Unexpectedly removed anchors");
            throw null;
        }
        d02.l(i4, d02.f683t, i3);
        if (i9 > 0) {
            d02.A(i10, i9, i8 - 1);
        }
    }

    @Override // E.y
    public final String b(int i3) {
        return r2.a.t(i3, 0) ? "offset" : super.b(i3);
    }
}
