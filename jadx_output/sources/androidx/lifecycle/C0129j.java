package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129j {
    public static l a(m mVar) {
        p2.g.e(mVar, "state");
        int ordinal = mVar.ordinal();
        if (ordinal == 1) {
            return l.ON_CREATE;
        }
        if (ordinal == 2) {
            return l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return l.ON_RESUME;
    }
}
