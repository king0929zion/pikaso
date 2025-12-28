package E;

import A.AbstractC0000a;
import D.C0032d;
import D.C0052n;
import D.K0;
import D.M;
import a.AbstractC0090a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0052n f1103a;

    /* renamed from: b, reason: collision with root package name */
    public C0072a f1104b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1105c;

    /* renamed from: f, reason: collision with root package name */
    public int f1108f;

    /* renamed from: g, reason: collision with root package name */
    public int f1109g;

    /* renamed from: l, reason: collision with root package name */
    public int f1113l;

    /* renamed from: d, reason: collision with root package name */
    public final M f1106d = new M();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1107e = true;
    public final K0 h = new K0();

    /* renamed from: i, reason: collision with root package name */
    public int f1110i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f1111j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f1112k = -1;

    public b(C0052n c0052n, C0072a c0072a) {
        this.f1103a = c0052n;
        this.f1104b = c0072a;
    }

    public final void a() {
        c();
        K0 k0 = this.h;
        if (k0.f706a.isEmpty()) {
            this.f1109g++;
        } else {
            k0.f706a.remove(r0.size() - 1);
        }
    }

    public final void b() {
        b bVar = this;
        int i3 = bVar.f1109g;
        int i4 = 0;
        if (i3 > 0) {
            C0072a c0072a = bVar.f1104b;
            x xVar = x.f1140c;
            A a3 = c0072a.f1102b;
            a3.m0(xVar);
            AbstractC0090a.c0(a3, 0, i3);
            int i5 = a3.h;
            int i6 = xVar.f1141a;
            int f02 = A.f0(a3, i6);
            int i7 = xVar.f1142b;
            if (i5 != f02 || a3.f1101i != A.f0(a3, i7)) {
                StringBuilder sb = new StringBuilder();
                int i8 = 0;
                while (i8 < i6) {
                    int i9 = i6;
                    if (((1 << i8) & a3.h) != 0) {
                        if (i4 > 0) {
                            sb.append(", ");
                        }
                        sb.append(xVar.b(i8));
                        i4++;
                    }
                    i8++;
                    i6 = i9;
                }
                String sb2 = sb.toString();
                StringBuilder g3 = AbstractC0000a.g(sb2, "StringBuilder().apply(builderAction).toString()");
                int i10 = 0;
                int i11 = 0;
                while (i11 < i7) {
                    int i12 = i7;
                    if (((1 << i11) & a3.f1101i) != 0) {
                        if (i4 > 0) {
                            g3.append(", ");
                        }
                        g3.append(xVar.c(i11));
                        i10++;
                    }
                    i11++;
                    i7 = i12;
                }
                String sb3 = g3.toString();
                p2.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(xVar);
                sb4.append(". Not all arguments were provided. Missing ");
                AbstractC0000a.k(sb4, i4, " int arguments (", sb2, ") and ");
                AbstractC0000a.l(sb4, i10, " object arguments (", sb3, ").");
                throw null;
            }
            bVar.f1109g = 0;
        } else {
            bVar = this;
        }
        K0 k0 = bVar.h;
        if (k0.f706a.isEmpty()) {
            return;
        }
        C0072a c0072a2 = bVar.f1104b;
        ArrayList arrayList = k0.f706a;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i13 = 0; i13 < size; i13++) {
            objArr[i13] = arrayList.get(i13);
        }
        if (size != 0) {
            f fVar = f.f1118c;
            A a4 = c0072a2.f1102b;
            a4.m0(fVar);
            AbstractC0090a.d0(a4, 0, objArr);
            int i14 = a4.h;
            int i15 = fVar.f1141a;
            int f03 = A.f0(a4, i15);
            int i16 = fVar.f1142b;
            if (i14 != f03 || a4.f1101i != A.f0(a4, i16)) {
                StringBuilder sb5 = new StringBuilder();
                int i17 = 0;
                for (int i18 = 0; i18 < i15; i18++) {
                    if (((1 << i18) & a4.h) != 0) {
                        if (i17 > 0) {
                            sb5.append(", ");
                        }
                        sb5.append(fVar.b(i18));
                        i17++;
                    }
                }
                String sb6 = sb5.toString();
                StringBuilder g4 = AbstractC0000a.g(sb6, "StringBuilder().apply(builderAction).toString()");
                int i19 = 0;
                int i20 = 0;
                while (i19 < i16) {
                    int i21 = i16;
                    if (((1 << i19) & a4.f1101i) != 0) {
                        if (i17 > 0) {
                            g4.append(", ");
                        }
                        g4.append(fVar.c(i19));
                        i20++;
                    }
                    i19++;
                    i16 = i21;
                }
                String sb7 = g4.toString();
                p2.g.d(sb7, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb8 = new StringBuilder("Error while pushing ");
                sb8.append(fVar);
                sb8.append(". Not all arguments were provided. Missing ");
                AbstractC0000a.k(sb8, i17, " int arguments (", sb6, ") and ");
                AbstractC0000a.l(sb8, i20, " object arguments (", sb7, ").");
                throw null;
            }
        }
        arrayList.clear();
    }

    public final void c() {
        int i3 = this.f1113l;
        if (i3 > 0) {
            int i4 = this.f1110i;
            if (i4 >= 0) {
                b();
                C0072a c0072a = this.f1104b;
                c0072a.getClass();
                s sVar = s.f1135c;
                A a3 = c0072a.f1102b;
                a3.m0(sVar);
                AbstractC0090a.c0(a3, 0, i4);
                AbstractC0090a.c0(a3, 1, i3);
                int i5 = a3.h;
                int i6 = sVar.f1141a;
                int f02 = A.f0(a3, i6);
                int i7 = sVar.f1142b;
                if (i5 != f02 || a3.f1101i != A.f0(a3, i7)) {
                    StringBuilder sb = new StringBuilder();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < i6) {
                        int i10 = i6;
                        if (((1 << i8) & a3.h) != 0) {
                            if (i9 > 0) {
                                sb.append(", ");
                            }
                            sb.append(sVar.b(i8));
                            i9++;
                        }
                        i8++;
                        i6 = i10;
                    }
                    String sb2 = sb.toString();
                    StringBuilder g3 = AbstractC0000a.g(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i11 = 0;
                    int i12 = 0;
                    while (i12 < i7) {
                        int i13 = i7;
                        if (((1 << i12) & a3.f1101i) != 0) {
                            if (i9 > 0) {
                                g3.append(", ");
                            }
                            g3.append(sVar.c(i12));
                            i11++;
                        }
                        i12++;
                        i7 = i13;
                    }
                    String sb3 = g3.toString();
                    p2.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(sVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    AbstractC0000a.k(sb4, i9, " int arguments (", sb2, ") and ");
                    AbstractC0000a.l(sb4, i11, " object arguments (", sb3, ").");
                    throw null;
                }
                this.f1110i = -1;
            } else {
                int i14 = this.f1112k;
                int i15 = this.f1111j;
                b();
                C0072a c0072a2 = this.f1104b;
                c0072a2.getClass();
                p pVar = p.f1132c;
                A a4 = c0072a2.f1102b;
                a4.m0(pVar);
                AbstractC0090a.c0(a4, 1, i14);
                AbstractC0090a.c0(a4, 0, i15);
                AbstractC0090a.c0(a4, 2, i3);
                int i16 = a4.h;
                int i17 = pVar.f1141a;
                int f03 = A.f0(a4, i17);
                int i18 = pVar.f1142b;
                if (i16 != f03 || a4.f1101i != A.f0(a4, i18)) {
                    int i19 = 0;
                    StringBuilder sb5 = new StringBuilder();
                    for (int i20 = 0; i20 < i17; i20++) {
                        if (((1 << i20) & a4.h) != 0) {
                            if (i19 > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(pVar.b(i20));
                            i19++;
                        }
                    }
                    String sb6 = sb5.toString();
                    StringBuilder g4 = AbstractC0000a.g(sb6, "StringBuilder().apply(builderAction).toString()");
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i18) {
                        int i23 = i18;
                        if (((1 << i21) & a4.f1101i) != 0) {
                            if (i19 > 0) {
                                g4.append(", ");
                            }
                            g4.append(pVar.c(i21));
                            i22++;
                        }
                        i21++;
                        i18 = i23;
                    }
                    String sb7 = g4.toString();
                    p2.g.d(sb7, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb8 = new StringBuilder("Error while pushing ");
                    sb8.append(pVar);
                    sb8.append(". Not all arguments were provided. Missing ");
                    AbstractC0000a.k(sb8, i19, " int arguments (", sb6, ") and ");
                    AbstractC0000a.l(sb8, i22, " object arguments (", sb7, ").");
                    throw null;
                }
                this.f1111j = -1;
                this.f1112k = -1;
            }
            this.f1113l = 0;
        }
    }

    public final void d(boolean z3) {
        C0052n c0052n = this.f1103a;
        int i3 = z3 ? c0052n.f796D.f636i : c0052n.f796D.f635g;
        int i4 = i3 - this.f1108f;
        if (!(i4 >= 0)) {
            C0032d.r("Tried to seek backward");
            throw null;
        }
        if (i4 > 0) {
            C0072a c0072a = this.f1104b;
            c0072a.getClass();
            d dVar = d.f1116c;
            A a3 = c0072a.f1102b;
            a3.m0(dVar);
            AbstractC0090a.c0(a3, 0, i4);
            int i5 = a3.h;
            int i6 = dVar.f1141a;
            int f02 = A.f0(a3, i6);
            int i7 = dVar.f1142b;
            if (i5 == f02 && a3.f1101i == A.f0(a3, i7)) {
                this.f1108f = i3;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i8 = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                if (((1 << i9) & a3.h) != 0) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(dVar.b(i9));
                    i8++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder g3 = AbstractC0000a.g(sb2, "StringBuilder().apply(builderAction).toString()");
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                if (((1 << i11) & a3.f1101i) != 0) {
                    if (i8 > 0) {
                        g3.append(", ");
                    }
                    g3.append(dVar.c(i11));
                    i10++;
                }
            }
            String sb3 = g3.toString();
            p2.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(dVar);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0000a.k(sb4, i8, " int arguments (", sb2, ") and ");
            AbstractC0000a.l(sb4, i10, " object arguments (", sb3, ").");
            throw null;
        }
    }

    public final void e(int i3, int i4) {
        if (i4 > 0) {
            if (!(i3 >= 0)) {
                C0032d.r("Invalid remove index " + i3);
                throw null;
            }
            if (this.f1110i == i3) {
                this.f1113l += i4;
                return;
            }
            c();
            this.f1110i = i3;
            this.f1113l = i4;
        }
    }
}
