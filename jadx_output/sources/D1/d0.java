package d1;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f4195a;

    /* renamed from: b, reason: collision with root package name */
    public V0.c[] f4196b;

    public d0() {
        this(new l0());
    }

    public final void a() {
        V0.c[] cVarArr = this.f4196b;
        if (cVarArr != null) {
            V0.c cVar = cVarArr[0];
            V0.c cVar2 = cVarArr[1];
            l0 l0Var = this.f4195a;
            if (cVar2 == null) {
                cVar2 = l0Var.f4228a.f(2);
            }
            if (cVar == null) {
                cVar = l0Var.f4228a.f(1);
            }
            g(V0.c.a(cVar, cVar2));
            V0.c cVar3 = this.f4196b[4];
            if (cVar3 != null) {
                f(cVar3);
            }
            V0.c cVar4 = this.f4196b[5];
            if (cVar4 != null) {
                d(cVar4);
            }
            V0.c cVar5 = this.f4196b[6];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract l0 b();

    public void c(int i3, V0.c cVar) {
        char c3;
        if (this.f4196b == null) {
            this.f4196b = new V0.c[9];
        }
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                V0.c[] cVarArr = this.f4196b;
                if (i4 != 1) {
                    c3 = 2;
                    if (i4 == 2) {
                        c3 = 1;
                    } else if (i4 != 4) {
                        c3 = '\b';
                        if (i4 == 8) {
                            c3 = 3;
                        } else if (i4 == 16) {
                            c3 = 4;
                        } else if (i4 == 32) {
                            c3 = 5;
                        } else if (i4 == 64) {
                            c3 = 6;
                        } else if (i4 == 128) {
                            c3 = 7;
                        } else if (i4 != 256) {
                            throw new IllegalArgumentException(AbstractC0000a.c("type needs to be >= FIRST and <= LAST, type=", i4));
                        }
                    }
                } else {
                    c3 = 0;
                }
                cVarArr[c3] = cVar;
            }
        }
    }

    public void d(V0.c cVar) {
    }

    public abstract void e(V0.c cVar);

    public void f(V0.c cVar) {
    }

    public abstract void g(V0.c cVar);

    public void h(V0.c cVar) {
    }

    public d0(l0 l0Var) {
        this.f4195a = l0Var;
    }
}
