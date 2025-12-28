package D;

import c2.C0174m;
import g2.InterfaceC0271d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import n.C0375B;

/* loaded from: classes.dex */
public final class u0 extends i2.j implements o2.f {
    public List h;

    /* renamed from: i, reason: collision with root package name */
    public List f893i;

    /* renamed from: j, reason: collision with root package name */
    public List f894j;

    /* renamed from: k, reason: collision with root package name */
    public C0375B f895k;

    /* renamed from: l, reason: collision with root package name */
    public C0375B f896l;

    /* renamed from: m, reason: collision with root package name */
    public C0375B f897m;

    /* renamed from: n, reason: collision with root package name */
    public Set f898n;

    /* renamed from: o, reason: collision with root package name */
    public C0375B f899o;

    /* renamed from: p, reason: collision with root package name */
    public int f900p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ V f901q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v0 f902r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, InterfaceC0271d interfaceC0271d) {
        super(3, interfaceC0271d);
        this.f902r = v0Var;
    }

    public static final void n(v0 v0Var, List list, List list2, List list3, C0375B c0375b, C0375B c0375b2, C0375B c0375b3, C0375B c0375b4) {
        synchronized (v0Var.f908b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0060t c0060t = (C0060t) list3.get(i3);
                    c0060t.a();
                    v0Var.m(c0060t);
                }
                list3.clear();
                Object[] objArr = c0375b.f4961b;
                long[] jArr = c0375b.f4960a;
                int length = jArr.length - 2;
                long j3 = -9187201950435737472L;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j4 = jArr[i4];
                        long[] jArr2 = jArr;
                        if ((((~j4) << 7) & j4 & j3) != j3) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j4 & 255) < 128) {
                                    C0060t c0060t2 = (C0060t) objArr[(i4 << 3) + i6];
                                    c0060t2.a();
                                    v0Var.m(c0060t2);
                                }
                                j4 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        jArr = jArr2;
                        j3 = -9187201950435737472L;
                    }
                }
                c0375b.b();
                Object[] objArr2 = c0375b2.f4961b;
                long[] jArr3 = c0375b2.f4960a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j5 = jArr3[i7];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length2)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((j5 & 255) < 128) {
                                    ((C0060t) objArr2[(i7 << 3) + i9]).g();
                                }
                                j5 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i7 == length2) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                c0375b2.b();
                c0375b3.b();
                Object[] objArr3 = c0375b4.f4961b;
                long[] jArr4 = c0375b4.f4960a;
                int length3 = jArr4.length - 2;
                if (length3 >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j6 = jArr4[i10];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length3)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j6 & 255) < 128) {
                                    C0060t c0060t3 = (C0060t) objArr3[(i10 << 3) + i12];
                                    c0060t3.a();
                                    v0Var.m(c0060t3);
                                }
                                j6 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length3) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                c0375b4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void p(List list, v0 v0Var) {
        list.clear();
        synchronized (v0Var.f908b) {
            try {
                ArrayList arrayList = v0Var.f915j;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    list.add((X) arrayList.get(i3));
                }
                v0Var.f915j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o2.f
    public final Object a(Object obj, Object obj2, Serializable serializable) {
        u0 u0Var = new u0(this.f902r, (InterfaceC0271d) serializable);
        u0Var.f901q = (V) obj2;
        u0Var.l(C0174m.f3840a);
        return h2.a.f4407d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x014c -> B:6:0x0153). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01fa -> B:24:0x0094). Please report as a decompilation issue!!! */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.u0.l(java.lang.Object):java.lang.Object");
    }
}
