package n0;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422c implements U.i {

    /* renamed from: a, reason: collision with root package name */
    public static final C0422c f5233a = new C0422c();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f5234b;

    @Override // U.i
    public final boolean a() {
        Boolean bool = f5234b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Z0.d.T("canFocus is read before it is written");
        throw null;
    }

    @Override // U.i
    public final void b(boolean z3) {
        f5234b = Boolean.valueOf(z3);
    }
}
