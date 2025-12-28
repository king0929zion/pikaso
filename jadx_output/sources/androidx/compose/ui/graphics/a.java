package androidx.compose.ui.graphics;

import P.l;
import W.D;
import W.H;
import W.K;
import W.x;

/* loaded from: classes.dex */
public abstract class a {
    public static l a(l lVar, float f3, H h, boolean z3, int i3) {
        float f4 = (i3 & 32) != 0 ? 0.0f : f3;
        long j3 = K.f2530a;
        H h3 = (i3 & 2048) != 0 ? D.f2484a : h;
        boolean z4 = (i3 & 4096) != 0 ? false : z3;
        long j4 = x.f2570a;
        return lVar.c(new GraphicsLayerElement(1.0f, 1.0f, 1.0f, 0.0f, 0.0f, f4, 0.0f, 0.0f, 0.0f, 8.0f, j3, h3, z4, j4, j4, 0));
    }
}
