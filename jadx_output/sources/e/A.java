package E;

import D.C0032d;
import D.C0059s;
import D.D0;
import d2.AbstractC0239j;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class A extends r2.a {

    /* renamed from: c, reason: collision with root package name */
    public int f1096c;

    /* renamed from: e, reason: collision with root package name */
    public int f1098e;

    /* renamed from: g, reason: collision with root package name */
    public int f1100g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f1101i;

    /* renamed from: b, reason: collision with root package name */
    public y[] f1095b = new y[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f1097d = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f1099f = new Object[16];

    public static final int f0(A a3, int i3) {
        a3.getClass();
        if (i3 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i3);
    }

    public final void g0() {
        this.f1096c = 0;
        this.f1098e = 0;
        AbstractC0239j.c0(this.f1099f, 0, this.f1100g);
        this.f1100g = 0;
    }

    public final void h0(B0.a aVar, D0 d02, C0059s c0059s) {
        A a3;
        int i3;
        if (j0()) {
            z zVar = new z(this);
            do {
                a3 = (A) zVar.f1146d;
                y yVar = a3.f1095b[zVar.f1143a];
                p2.g.b(yVar);
                yVar.a(zVar, aVar, d02, c0059s);
                int i4 = zVar.f1143a;
                if (i4 >= a3.f1096c) {
                    break;
                }
                y yVar2 = a3.f1095b[i4];
                p2.g.b(yVar2);
                zVar.f1144b += yVar2.f1141a;
                zVar.f1145c += yVar2.f1142b;
                i3 = zVar.f1143a + 1;
                zVar.f1143a = i3;
            } while (i3 < a3.f1096c);
        }
        g0();
    }

    public final boolean i0() {
        return this.f1096c == 0;
    }

    public final boolean j0() {
        return this.f1096c != 0;
    }

    public final y k0() {
        y yVar = this.f1095b[this.f1096c - 1];
        p2.g.b(yVar);
        return yVar;
    }

    public final void l0(y yVar) {
        int i3 = yVar.f1141a;
        int i4 = yVar.f1142b;
        if (i3 == 0 && i4 == 0) {
            m0(yVar);
            return;
        }
        C0032d.H("Cannot push " + yVar + " without arguments because it expects " + i3 + " ints and " + i4 + " objects.");
        throw null;
    }

    public final void m0(y yVar) {
        this.h = 0;
        this.f1101i = 0;
        int i3 = this.f1096c;
        y[] yVarArr = this.f1095b;
        if (i3 == yVarArr.length) {
            Object[] copyOf = Arrays.copyOf(yVarArr, i3 + (i3 > 1024 ? 1024 : i3));
            p2.g.d(copyOf, "copyOf(this, newSize)");
            this.f1095b = (y[]) copyOf;
        }
        int i4 = this.f1098e + yVar.f1141a;
        int[] iArr = this.f1097d;
        int length = iArr.length;
        if (i4 > length) {
            int i5 = length + (length > 1024 ? 1024 : length);
            if (i5 >= i4) {
                i4 = i5;
            }
            int[] copyOf2 = Arrays.copyOf(iArr, i4);
            p2.g.d(copyOf2, "copyOf(this, newSize)");
            this.f1097d = copyOf2;
        }
        int i6 = this.f1100g;
        int i7 = yVar.f1142b;
        int i8 = i6 + i7;
        Object[] objArr = this.f1099f;
        int length2 = objArr.length;
        if (i8 > length2) {
            int i9 = length2 + (length2 <= 1024 ? length2 : 1024);
            if (i9 >= i8) {
                i8 = i9;
            }
            Object[] copyOf3 = Arrays.copyOf(objArr, i8);
            p2.g.d(copyOf3, "copyOf(this, newSize)");
            this.f1099f = copyOf3;
        }
        y[] yVarArr2 = this.f1095b;
        int i10 = this.f1096c;
        this.f1096c = i10 + 1;
        yVarArr2[i10] = yVar;
        this.f1098e += yVar.f1141a;
        this.f1100g += i7;
    }
}
