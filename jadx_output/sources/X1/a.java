package X1;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f2664a;

    public a(float f3) {
        this.f2664a = f3;
    }

    @Override // X1.c
    public final float a(RectF rectF) {
        return this.f2664a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2664a == ((a) obj).f2664a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2664a)});
    }
}
