package p;

/* renamed from: p.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527F {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0531J f5839a;

    /* renamed from: b, reason: collision with root package name */
    public final B2.i f5840b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparable f5841c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5842d;

    /* renamed from: e, reason: collision with root package name */
    public final n f5843e;

    /* renamed from: f, reason: collision with root package name */
    public final n f5844f;

    /* renamed from: g, reason: collision with root package name */
    public final n f5845g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public n f5846i;

    /* JADX WARN: Type inference failed for: r1v3, types: [o2.c, p2.h] */
    public C0527F(InterfaceC0539h interfaceC0539h, B2.i iVar, Object obj, Comparable comparable, n nVar) {
        this.f5839a = interfaceC0539h.a(iVar);
        this.f5840b = iVar;
        this.f5841c = comparable;
        this.f5842d = obj;
        ?? r12 = (p2.h) iVar.f316e;
        this.f5843e = (n) r12.i(obj);
        this.f5844f = (n) r12.i(comparable);
        this.f5845g = nVar != null ? AbstractC0536e.d(nVar) : ((n) r12.i(obj)).c();
        this.h = -1L;
    }

    public final long a() {
        if (this.h < 0) {
            this.h = this.f5839a.c(this.f5843e, this.f5844f, this.f5845g);
        }
        return this.h;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [o2.c, p2.h] */
    public final Object b(long j3) {
        if (j3 >= a()) {
            return this.f5841c;
        }
        n f3 = this.f5839a.f(j3, this.f5843e, this.f5844f, this.f5845g);
        int b3 = f3.b();
        for (int i3 = 0; i3 < b3; i3++) {
            if (Float.isNaN(f3.a(i3))) {
                throw new IllegalStateException("AnimationVector cannot contain a NaN. " + f3 + ". Animation: " + this + ", playTimeNanos: " + j3);
            }
        }
        return ((p2.h) this.f5840b.f317f).i(f3);
    }

    public final n c(long j3) {
        if (j3 < a()) {
            return this.f5839a.e(j3, this.f5843e, this.f5844f, this.f5845g);
        }
        n nVar = this.f5846i;
        if (nVar != null) {
            return nVar;
        }
        n a3 = this.f5839a.a(this.f5843e, this.f5844f, this.f5845g);
        this.f5846i = a3;
        return a3;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f5842d + " -> " + this.f5841c + ",initial velocity: " + this.f5845g + ", duration: " + (a() / 1000000) + " ms,animationSpec: " + this.f5839a;
    }
}
