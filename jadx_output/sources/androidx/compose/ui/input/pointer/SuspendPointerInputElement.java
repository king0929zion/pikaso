package androidx.compose.ui.input.pointer;

import P.k;
import h0.r;
import i2.j;
import java.util.Arrays;
import n0.P;
import o2.e;
import p2.g;
import x.AbstractC0637b;

/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3339a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3340b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f3341c;

    /* renamed from: d, reason: collision with root package name */
    public final j f3342d;

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendPointerInputElement(Object obj, AbstractC0637b abstractC0637b, e eVar, int i3) {
        abstractC0637b = (i3 & 2) != 0 ? null : abstractC0637b;
        this.f3339a = obj;
        this.f3340b = abstractC0637b;
        this.f3341c = null;
        this.f3342d = (j) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i2.j, o2.e] */
    @Override // n0.P
    public final k d() {
        return new r(this.f3339a, this.f3340b, this.f3341c, this.f3342d);
    }

    @Override // n0.P
    public final void e(k kVar) {
        r rVar = (r) kVar;
        Object obj = rVar.f4397q;
        Object obj2 = this.f3339a;
        boolean z3 = !g.a(obj, obj2);
        rVar.f4397q = obj2;
        Object obj3 = rVar.f4398r;
        Object obj4 = this.f3340b;
        if (!g.a(obj3, obj4)) {
            z3 = true;
        }
        rVar.f4398r = obj4;
        Object[] objArr = rVar.f4399s;
        Object[] objArr2 = this.f3341c;
        if (objArr != null && objArr2 == null) {
            z3 = true;
        }
        if (objArr == null && objArr2 != null) {
            z3 = true;
        }
        boolean z4 = (objArr == null || objArr2 == null || Arrays.equals(objArr2, objArr)) ? z3 : true;
        rVar.f4399s = objArr2;
        if (z4) {
            rVar.g0();
        }
        rVar.f4400t = this.f3342d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!g.a(this.f3339a, suspendPointerInputElement.f3339a) || !g.a(this.f3340b, suspendPointerInputElement.f3340b)) {
            return false;
        }
        Object[] objArr = suspendPointerInputElement.f3341c;
        Object[] objArr2 = this.f3341c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.f3342d == suspendPointerInputElement.f3342d;
    }

    public final int hashCode() {
        Object obj = this.f3339a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f3340b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f3341c;
        return this.f3342d.hashCode() + ((hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }
}
