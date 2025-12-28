package X1;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f2706a;

    public h(float f3) {
        this.f2706a = f3;
    }

    @Override // X1.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f2706a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f2706a == ((h) obj).f2706a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2706a)});
    }
}
