package D;

import n.AbstractC0376C;
import n.C0403w;

/* loaded from: classes.dex */
public final class B extends N.A {
    public static final Object h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f642c;

    /* renamed from: d, reason: collision with root package name */
    public int f643d;

    /* renamed from: e, reason: collision with root package name */
    public C0403w f644e;

    /* renamed from: f, reason: collision with root package name */
    public Object f645f;

    /* renamed from: g, reason: collision with root package name */
    public int f646g;

    public B() {
        C0403w c0403w = AbstractC0376C.f4965a;
        p2.g.c(c0403w, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f644e = c0403w;
        this.f645f = h;
    }

    @Override // N.A
    public final void a(N.A a3) {
        p2.g.c(a3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        B b3 = (B) a3;
        this.f644e = b3.f644e;
        this.f645f = b3.f645f;
        this.f646g = b3.f646g;
    }

    @Override // N.A
    public final N.A b() {
        return new B();
    }

    public final boolean c(D d3, N.h hVar) {
        boolean z3;
        boolean z4;
        Object obj = N.o.f1756b;
        synchronized (obj) {
            z3 = true;
            if (this.f642c == hVar.d()) {
                if (this.f643d == hVar.h()) {
                    z4 = false;
                }
            }
            z4 = true;
        }
        if (this.f645f == h || (z4 && this.f646g != d(d3, hVar))) {
            z3 = false;
        }
        if (z3 && z4) {
            synchronized (obj) {
                this.f642c = hVar.d();
                this.f643d = hVar.h();
            }
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [o2.a, p2.h] */
    public final int d(D d3, N.h hVar) {
        C0403w c0403w;
        int i3;
        int i4;
        int i5;
        int i6;
        N.A j3;
        synchronized (N.o.f1756b) {
            c0403w = this.f644e;
        }
        char c3 = 7;
        if (c0403w.f5048e == 0) {
            return 7;
        }
        F.d v3 = C0032d.v();
        int i7 = v3.f1160f;
        int i8 = 1;
        if (i7 > 0) {
            Object[] objArr = v3.f1158d;
            int i9 = 0;
            do {
                ((C0050m) objArr[i9]).b();
                i9++;
            } while (i9 < i7);
        }
        try {
            Object[] objArr2 = c0403w.f5045b;
            int[] iArr = c0403w.f5046c;
            long[] jArr = c0403w.f5044a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 7;
                int i11 = 0;
                while (true) {
                    long j4 = jArr[i11];
                    if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j4 & 255) < 128) {
                                int i15 = (i11 << 3) + i14;
                                N.y yVar = (N.y) objArr2[i15];
                                if (iArr[i15] == i8) {
                                    if (yVar instanceof D) {
                                        D d4 = (D) yVar;
                                        i3 = 0;
                                        try {
                                            j3 = d4.g((B) N.o.j(d4.f664f, hVar), hVar, false, d4.f663e);
                                        } catch (Throwable th) {
                                            th = th;
                                            int i16 = v3.f1160f;
                                            if (i16 > 0) {
                                                Object[] objArr3 = v3.f1158d;
                                                int i17 = i3;
                                                do {
                                                    ((C0050m) objArr3[i17]).a();
                                                    i17++;
                                                } while (i17 < i16);
                                            }
                                            throw th;
                                        }
                                    } else {
                                        i3 = 0;
                                        j3 = N.o.j(yVar.b(), hVar);
                                    }
                                    i10 = (((i10 * 31) + System.identityHashCode(j3)) * 31) + j3.f1700a;
                                }
                                i6 = 8;
                            } else {
                                i6 = i12;
                            }
                            j4 >>= i6;
                            i14++;
                            i12 = i6;
                            i8 = 1;
                        }
                        i4 = 0;
                        if (i13 != i12) {
                            break;
                        }
                    } else {
                        i4 = 0;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    c3 = 7;
                    i8 = 1;
                }
                i5 = i10;
            } else {
                i4 = 0;
                i5 = 7;
            }
            int i18 = v3.f1160f;
            if (i18 <= 0) {
                return i5;
            }
            Object[] objArr4 = v3.f1158d;
            int i19 = i4;
            do {
                ((C0050m) objArr4[i19]).a();
                i19++;
            } while (i19 < i18);
            return i5;
        } catch (Throwable th2) {
            th = th2;
            i3 = 0;
        }
    }
}
