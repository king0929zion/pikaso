package L0;

import D1.w;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public b f1468d;

    /* renamed from: a, reason: collision with root package name */
    public j f1465a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f1466b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1467c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f1469e = false;

    public c(w wVar) {
        this.f1468d = new a(this, wVar);
    }

    public final void a(e eVar, int i3) {
        this.f1468d.b(eVar.i(i3), 1.0f);
        this.f1468d.b(eVar.i(i3), -1.0f);
    }

    public final void b(j jVar, j jVar2, j jVar3, int i3) {
        boolean z3 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z3 = true;
            }
            this.f1466b = i3;
        }
        if (z3) {
            this.f1468d.b(jVar, 1.0f);
            this.f1468d.b(jVar2, -1.0f);
            this.f1468d.b(jVar3, -1.0f);
        } else {
            this.f1468d.b(jVar, -1.0f);
            this.f1468d.b(jVar2, 1.0f);
            this.f1468d.b(jVar3, 1.0f);
        }
    }

    public final void c(j jVar, j jVar2, j jVar3, int i3) {
        boolean z3 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z3 = true;
            }
            this.f1466b = i3;
        }
        if (z3) {
            this.f1468d.b(jVar, 1.0f);
            this.f1468d.b(jVar2, -1.0f);
            this.f1468d.b(jVar3, 1.0f);
        } else {
            this.f1468d.b(jVar, -1.0f);
            this.f1468d.b(jVar2, 1.0f);
            this.f1468d.b(jVar3, -1.0f);
        }
    }

    public j d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final j e(boolean[] zArr, j jVar) {
        int i3;
        int k3 = this.f1468d.k();
        j jVar2 = null;
        float f3 = 0.0f;
        for (int i4 = 0; i4 < k3; i4++) {
            float a3 = this.f1468d.a(i4);
            if (a3 < 0.0f) {
                j f4 = this.f1468d.f(i4);
                if ((zArr == null || !zArr[f4.f1495b]) && f4 != jVar && (((i3 = f4.f1504l) == 3 || i3 == 4) && a3 < f3)) {
                    f3 = a3;
                    jVar2 = f4;
                }
            }
        }
        return jVar2;
    }

    public final void f(j jVar) {
        j jVar2 = this.f1465a;
        if (jVar2 != null) {
            this.f1468d.b(jVar2, -1.0f);
            this.f1465a = null;
        }
        float c3 = this.f1468d.c(jVar, true) * (-1.0f);
        this.f1465a = jVar;
        if (c3 == 1.0f) {
            return;
        }
        this.f1466b /= c3;
        this.f1468d.i(c3);
    }

    public final void g(j jVar, boolean z3) {
        if (jVar.f1499f) {
            float d3 = this.f1468d.d(jVar);
            this.f1466b = (jVar.f1498e * d3) + this.f1466b;
            this.f1468d.c(jVar, z3);
            if (z3) {
                jVar.b(this);
            }
        }
    }

    public void h(c cVar, boolean z3) {
        float h = this.f1468d.h(cVar, z3);
        this.f1466b = (cVar.f1466b * h) + this.f1466b;
        if (z3) {
            cVar.f1465a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            L0.j r0 = r10.f1465a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            L0.j r1 = r10.f1465a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = A.AbstractC0000a.e(r0, r1)
            float r1 = r10.f1466b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f1466b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            L0.b r5 = r10.f1468d
            int r5 = r5.k()
        L40:
            if (r4 >= r5) goto La0
            L0.b r6 = r10.f1468d
            L0.j r6 = r6.f(r4)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            L0.b r7 = r10.f1468d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = A.AbstractC0000a.e(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = A.AbstractC0000a.e(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = A.AbstractC0000a.e(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = A.AbstractC0000a.e(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r3
        L9d:
            int r4 = r4 + 1
            goto L40
        La0:
            if (r1 != 0) goto La8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = A.AbstractC0000a.e(r0, r1)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.toString():java.lang.String");
    }
}
