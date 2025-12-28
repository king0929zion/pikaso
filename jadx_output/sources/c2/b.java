package C2;

import c2.C0174m;
import g2.InterfaceC0271d;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public d[] f581d;

    /* renamed from: e, reason: collision with root package name */
    public int f582e;

    /* renamed from: f, reason: collision with root package name */
    public int f583f;

    /* renamed from: g, reason: collision with root package name */
    public z f584g;

    public final d a() {
        d dVar;
        z zVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f581d;
                if (dVarArr == null) {
                    dVarArr = d();
                    this.f581d = dVarArr;
                } else if (this.f582e >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    p2.g.d(copyOf, "copyOf(this, newSize)");
                    this.f581d = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i3 = this.f583f;
                do {
                    dVar = dVarArr[i3];
                    if (dVar == null) {
                        dVar = c();
                        dVarArr[i3] = dVar;
                    }
                    i3++;
                    if (i3 >= dVarArr.length) {
                        i3 = 0;
                    }
                } while (!dVar.a(this));
                this.f583f = i3;
                this.f582e++;
                zVar = this.f584g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zVar != null) {
            zVar.w(1);
        }
        return dVar;
    }

    public abstract d c();

    public abstract d[] d();

    public final void e(d dVar) {
        z zVar;
        int i3;
        InterfaceC0271d[] b3;
        synchronized (this) {
            try {
                int i4 = this.f582e - 1;
                this.f582e = i4;
                zVar = this.f584g;
                if (i4 == 0) {
                    this.f583f = 0;
                }
                p2.g.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b3 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC0271d interfaceC0271d : b3) {
            if (interfaceC0271d != null) {
                interfaceC0271d.t(C0174m.f3840a);
            }
        }
        if (zVar != null) {
            zVar.w(-1);
        }
    }

    public final z f() {
        z zVar;
        synchronized (this) {
            zVar = this.f584g;
            if (zVar == null) {
                int i3 = this.f582e;
                zVar = new z(1, Integer.MAX_VALUE, 2);
                zVar.q(Integer.valueOf(i3));
                this.f584g = zVar;
            }
        }
        return zVar;
    }
}
