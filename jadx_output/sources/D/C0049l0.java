package D;

/* renamed from: D.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049l0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0047k0 f782a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f783b;

    /* renamed from: c, reason: collision with root package name */
    public final H0 f784c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f785d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f786e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f787f = true;

    public C0049l0(AbstractC0047k0 abstractC0047k0, Object obj, boolean z3, H0 h02, boolean z4) {
        this.f782a = abstractC0047k0;
        this.f783b = z3;
        this.f784c = h02;
        this.f785d = z4;
        this.f786e = obj;
    }

    public final Object a() {
        if (this.f783b) {
            return null;
        }
        Object obj = this.f786e;
        if (obj != null) {
            return obj;
        }
        C0032d.s("Unexpected form of a provided value");
        throw null;
    }
}
