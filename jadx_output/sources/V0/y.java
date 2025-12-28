package v0;

import A.AbstractC0000a;
import a.AbstractC0090a;
import a1.C0095c;
import d2.AbstractC0240k;
import d2.AbstractC0241l;
import java.util.ArrayList;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final x f6472a;

    /* renamed from: b, reason: collision with root package name */
    public final C0624i f6473b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6474c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6475d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6476e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6477f;

    public y(x xVar, C0624i c0624i, long j3) {
        this.f6472a = xVar;
        this.f6473b = c0624i;
        this.f6474c = j3;
        ArrayList arrayList = c0624i.h;
        float f3 = 0.0f;
        this.f6475d = arrayList.isEmpty() ? 0.0f : ((k) arrayList.get(0)).f6359a.f6327d.c(0);
        if (!arrayList.isEmpty()) {
            k kVar = (k) AbstractC0240k.e0(arrayList);
            f3 = kVar.f6359a.f6327d.c(r4.f6543f - 1) + kVar.f6364f;
        }
        this.f6476e = f3;
        this.f6477f = c0624i.f6356g;
    }

    public final int a(int i3) {
        C0624i c0624i = this.f6473b;
        int length = ((C0618c) c0624i.f6350a.f2927c).f6334d.length();
        ArrayList arrayList = c0624i.h;
        k kVar = (k) arrayList.get(i3 >= length ? AbstractC0241l.T(arrayList) : i3 < 0 ? 0 : Z0.d.t(i3, arrayList));
        return kVar.f6359a.f6327d.f6542e.getLineForOffset(kVar.a(i3)) + kVar.f6362d;
    }

    public final int b(float f3) {
        ArrayList arrayList = this.f6473b.h;
        int i3 = 0;
        if (f3 > 0.0f) {
            if (f3 < ((k) AbstractC0240k.e0(arrayList)).f6365g) {
                int size = arrayList.size() - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > size) {
                        i3 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + size) >>> 1;
                    k kVar = (k) arrayList.get(i5);
                    char c3 = kVar.f6364f > f3 ? (char) 1 : kVar.f6365g <= f3 ? (char) 65535 : (char) 0;
                    if (c3 >= 0) {
                        if (c3 <= 0) {
                            i3 = i5;
                            break;
                        }
                        size = i5 - 1;
                    } else {
                        i4 = i5 + 1;
                    }
                }
            } else {
                i3 = AbstractC0241l.T(arrayList);
            }
        }
        k kVar2 = (k) arrayList.get(i3);
        int i6 = kVar2.f6361c - kVar2.f6360b;
        int i7 = kVar2.f6362d;
        if (i6 == 0) {
            return i7;
        }
        float f4 = f3 - kVar2.f6364f;
        w0.w wVar = kVar2.f6359a.f6327d;
        return i7 + wVar.f6542e.getLineForVertical(((int) f4) - wVar.f6544g);
    }

    public final int c(int i3) {
        C0624i c0624i = this.f6473b;
        c0624i.b(i3);
        ArrayList arrayList = c0624i.h;
        k kVar = (k) arrayList.get(Z0.d.u(i3, arrayList));
        C0616a c0616a = kVar.f6359a;
        return c0616a.f6327d.f6542e.getLineStart(i3 - kVar.f6362d) + kVar.f6360b;
    }

    public final float d(int i3) {
        C0624i c0624i = this.f6473b;
        c0624i.b(i3);
        ArrayList arrayList = c0624i.h;
        k kVar = (k) arrayList.get(Z0.d.u(i3, arrayList));
        C0616a c0616a = kVar.f6359a;
        return c0616a.f6327d.f(i3 - kVar.f6362d) + kVar.f6364f;
    }

    public final int e(int i3) {
        C0624i c0624i = this.f6473b;
        C0095c c0095c = c0624i.f6350a;
        if (i3 < 0 || i3 > ((C0618c) c0095c.f2927c).f6334d.length()) {
            throw new IllegalArgumentException(("offset(" + i3 + ") is out of bounds [0, " + ((C0618c) c0095c.f2927c).f6334d.length() + ']').toString());
        }
        int length = ((C0618c) c0624i.f6350a.f2927c).f6334d.length();
        ArrayList arrayList = c0624i.h;
        k kVar = (k) arrayList.get(i3 == length ? AbstractC0241l.T(arrayList) : Z0.d.t(i3, arrayList));
        C0616a c0616a = kVar.f6359a;
        int a3 = kVar.a(i3);
        w0.w wVar = c0616a.f6327d;
        return wVar.f6542e.getParagraphDirection(wVar.f6542e.getLineForOffset(a3)) == 1 ? 1 : 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p2.g.a(this.f6472a, yVar.f6472a) && this.f6473b.equals(yVar.f6473b) && AbstractC0090a.x(this.f6474c, yVar.f6474c) && this.f6475d == yVar.f6475d && this.f6476e == yVar.f6476e && p2.g.a(this.f6477f, yVar.f6477f);
    }

    public final int hashCode() {
        return this.f6477f.hashCode() + AbstractC0537f.a(this.f6476e, AbstractC0537f.a(this.f6475d, AbstractC0000a.b((this.f6473b.hashCode() + (this.f6472a.hashCode() * 31)) * 31, 31, this.f6474c), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f6472a + ", multiParagraph=" + this.f6473b + ", size=" + ((Object) AbstractC0090a.i0(this.f6474c)) + ", firstBaseline=" + this.f6475d + ", lastBaseline=" + this.f6476e + ", placeholderRects=" + this.f6477f + ')';
    }
}
