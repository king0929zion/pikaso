package h0;

import d2.C0248s;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f4364a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4365b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4366c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4367d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4368e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4369f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4370g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4371i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4372j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4373k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4374l;

    /* renamed from: m, reason: collision with root package name */
    public C0278a f4375m;

    public k(long j3, long j4, long j5, boolean z3, float f3, long j6, long j7, boolean z4, boolean z5, int i3, long j8) {
        this.f4364a = j3;
        this.f4365b = j4;
        this.f4366c = j5;
        this.f4367d = z3;
        this.f4368e = f3;
        this.f4369f = j6;
        this.f4370g = j7;
        this.h = z4;
        this.f4371i = i3;
        this.f4372j = j8;
        this.f4374l = 0L;
        C0278a c0278a = new C0278a();
        c0278a.f4337a = z5;
        c0278a.f4338b = z5;
        this.f4375m = c0278a;
    }

    public final void a() {
        C0278a c0278a = this.f4375m;
        c0278a.f4338b = true;
        c0278a.f4337a = true;
    }

    public final boolean b() {
        C0278a c0278a = this.f4375m;
        return c0278a.f4338b || c0278a.f4337a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) ("PointerId(value=" + this.f4364a + ')'));
        sb.append(", uptimeMillis=");
        sb.append(this.f4365b);
        sb.append(", position=");
        sb.append((Object) V.c.g(this.f4366c));
        sb.append(", pressed=");
        sb.append(this.f4367d);
        sb.append(", pressure=");
        sb.append(this.f4368e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f4369f);
        sb.append(", previousPosition=");
        sb.append((Object) V.c.g(this.f4370g));
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i3 = this.f4371i;
        sb.append((Object) (i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f4373k;
        if (obj == null) {
            obj = C0248s.f4255d;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) V.c.g(this.f4372j));
        sb.append(')');
        return sb.toString();
    }

    public k(long j3, long j4, long j5, boolean z3, float f3, long j6, long j7, boolean z4, int i3, ArrayList arrayList, long j8, long j9) {
        this(j3, j4, j5, z3, f3, j6, j7, z4, false, i3, j8);
        this.f4373k = arrayList;
        this.f4374l = j9;
    }
}
