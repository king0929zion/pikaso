package androidx.compose.foundation.layout;

import P.l;
import t.p;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f3290a = new FillElement(2, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final FillElement f3291b = new FillElement(3, 1.0f);

    public static final l a(float f3, float f4) {
        return new UnspecifiedConstraintsElement(f3, f4);
    }

    public static final l b(l lVar, p pVar) {
        return lVar.c(new PaddingValuesElement(pVar));
    }

    public static final l c(float f3) {
        return new PaddingElement(f3, f3, f3, f3);
    }

    public static l d(l lVar, float f3) {
        float f4 = 0;
        return lVar.c(new PaddingElement(f3, f4, f3, f4));
    }

    public static l e(l lVar, float f3) {
        return lVar.c(new PaddingElement(0, f3, 0, 0));
    }

    public static final l f(float f3) {
        return new SizeElement(f3, f3, f3, f3);
    }
}
