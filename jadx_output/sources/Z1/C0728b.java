package z1;

/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728b {

    /* renamed from: a, reason: collision with root package name */
    public long f7007a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C0728b f7008b;

    public final void a(int i3) {
        if (i3 < 64) {
            this.f7007a &= ~(1 << i3);
            return;
        }
        C0728b c0728b = this.f7008b;
        if (c0728b != null) {
            c0728b.a(i3 - 64);
        }
    }

    public final int b(int i3) {
        C0728b c0728b = this.f7008b;
        if (c0728b == null) {
            return i3 >= 64 ? Long.bitCount(this.f7007a) : Long.bitCount(this.f7007a & ((1 << i3) - 1));
        }
        if (i3 < 64) {
            return Long.bitCount(this.f7007a & ((1 << i3) - 1));
        }
        return Long.bitCount(this.f7007a) + c0728b.b(i3 - 64);
    }

    public final void c() {
        if (this.f7008b == null) {
            this.f7008b = new C0728b();
        }
    }

    public final boolean d(int i3) {
        if (i3 < 64) {
            return (this.f7007a & (1 << i3)) != 0;
        }
        c();
        return this.f7008b.d(i3 - 64);
    }

    public final boolean e(int i3) {
        if (i3 >= 64) {
            c();
            return this.f7008b.e(i3 - 64);
        }
        long j3 = 1 << i3;
        long j4 = this.f7007a;
        boolean z3 = (j4 & j3) != 0;
        long j5 = j4 & (~j3);
        this.f7007a = j5;
        long j6 = j3 - 1;
        this.f7007a = (j5 & j6) | Long.rotateRight((~j6) & j5, 1);
        C0728b c0728b = this.f7008b;
        if (c0728b != null) {
            if (c0728b.d(0)) {
                g(63);
            }
            this.f7008b.e(0);
        }
        return z3;
    }

    public final void f() {
        this.f7007a = 0L;
        C0728b c0728b = this.f7008b;
        if (c0728b != null) {
            c0728b.f();
        }
    }

    public final void g(int i3) {
        if (i3 < 64) {
            this.f7007a |= 1 << i3;
        } else {
            c();
            this.f7008b.g(i3 - 64);
        }
    }

    public final String toString() {
        if (this.f7008b == null) {
            return Long.toBinaryString(this.f7007a);
        }
        return this.f7008b.toString() + "xx" + Long.toBinaryString(this.f7007a);
    }
}
