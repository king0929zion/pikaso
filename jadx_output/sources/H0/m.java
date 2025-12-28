package h0;

import A.AbstractC0000a;
import java.util.ArrayList;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f4379a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4380b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4381c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4382d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4383e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4384f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4385g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4386i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4387j;

    /* renamed from: k, reason: collision with root package name */
    public final long f4388k;

    public m(long j3, long j4, long j5, long j6, boolean z3, float f3, int i3, boolean z4, ArrayList arrayList, long j7, long j8) {
        this.f4379a = j3;
        this.f4380b = j4;
        this.f4381c = j5;
        this.f4382d = j6;
        this.f4383e = z3;
        this.f4384f = f3;
        this.f4385g = i3;
        this.h = z4;
        this.f4386i = arrayList;
        this.f4387j = j7;
        this.f4388k = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Z0.d.s(this.f4379a, mVar.f4379a) && this.f4380b == mVar.f4380b && V.c.a(this.f4381c, mVar.f4381c) && V.c.a(this.f4382d, mVar.f4382d) && this.f4383e == mVar.f4383e && Float.compare(this.f4384f, mVar.f4384f) == 0 && this.f4385g == mVar.f4385g && this.h == mVar.h && this.f4386i.equals(mVar.f4386i) && V.c.a(this.f4387j, mVar.f4387j) && V.c.a(this.f4388k, mVar.f4388k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4388k) + AbstractC0000a.b((this.f4386i.hashCode() + ((Boolean.hashCode(this.h) + AbstractC0000a.a(this.f4385g, AbstractC0537f.a(this.f4384f, (Boolean.hashCode(this.f4383e) + AbstractC0000a.b(AbstractC0000a.b(AbstractC0000a.b(Long.hashCode(this.f4379a) * 31, 31, this.f4380b), 31, this.f4381c), 31, this.f4382d)) * 31, 31), 31)) * 31)) * 31, 31, this.f4387j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) ("PointerId(value=" + this.f4379a + ')'));
        sb.append(", uptime=");
        sb.append(this.f4380b);
        sb.append(", positionOnScreen=");
        sb.append((Object) V.c.g(this.f4381c));
        sb.append(", position=");
        sb.append((Object) V.c.g(this.f4382d));
        sb.append(", down=");
        sb.append(this.f4383e);
        sb.append(", pressure=");
        sb.append(this.f4384f);
        sb.append(", type=");
        int i3 = this.f4385g;
        sb.append((Object) (i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.f4386i);
        sb.append(", scrollDelta=");
        sb.append((Object) V.c.g(this.f4387j));
        sb.append(", originalEventPosition=");
        sb.append((Object) V.c.g(this.f4388k));
        sb.append(')');
        return sb.toString();
    }
}
