package H0;

import X1.e;
import java.util.Arrays;
import p2.g;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f1334a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1335b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f1334a = fArr;
        this.f1335b = fArr2;
    }

    @Override // H0.a
    public final float a(float f3) {
        return e.e(f3, this.f1335b, this.f1334a);
    }

    @Override // H0.a
    public final float b(float f3) {
        return e.e(f3, this.f1334a, this.f1335b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f1334a, cVar.f1334a) && Arrays.equals(this.f1335b, cVar.f1335b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1335b) + (Arrays.hashCode(this.f1334a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f1334a);
        g.d(arrays, "toString(this)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f1335b);
        g.d(arrays2, "toString(this)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
