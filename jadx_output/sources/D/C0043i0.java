package D;

import c2.C0172k;
import java.util.ArrayList;
import n.C0398r;

/* renamed from: D.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f771a;

    /* renamed from: b, reason: collision with root package name */
    public final int f772b;

    /* renamed from: c, reason: collision with root package name */
    public int f773c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f774d;

    /* renamed from: e, reason: collision with root package name */
    public final C0398r f775e;

    /* renamed from: f, reason: collision with root package name */
    public final C0172k f776f;

    public C0043i0(int i3, ArrayList arrayList) {
        this.f771a = arrayList;
        this.f772b = i3;
        if (!(i3 >= 0)) {
            C0032d.H("Invalid start index");
            throw null;
        }
        this.f774d = new ArrayList();
        C0398r c0398r = new C0398r();
        int size = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            P p3 = (P) this.f771a.get(i5);
            int i6 = p3.f718c;
            int i7 = p3.f719d;
            c0398r.i(i6, new J(i5, i4, i7));
            i4 += i7;
        }
        this.f775e = c0398r;
        this.f776f = Z.b.C(new A0.c(3, this));
    }

    public final boolean a(int i3, int i4) {
        int i5;
        C0398r c0398r = this.f775e;
        J j3 = (J) c0398r.f(i3);
        if (j3 == null) {
            return false;
        }
        int i6 = j3.f697b;
        int i7 = i4 - j3.f698c;
        j3.f698c = i4;
        if (i7 == 0) {
            return true;
        }
        Object[] objArr = c0398r.f5018c;
        long[] jArr = c0398r.f5016a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i8 = 0;
        while (true) {
            long j4 = jArr[i8];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j4) < 128) {
                        J j5 = (J) objArr[(i8 << 3) + i10];
                        if (j5.f697b >= i6 && !j5.equals(j3) && (i5 = j5.f697b + i7) >= 0) {
                            j5.f697b = i5;
                        }
                    }
                    j4 >>= 8;
                }
                if (i9 != 8) {
                    return true;
                }
            }
            if (i8 == length) {
                return true;
            }
            i8++;
        }
    }
}
