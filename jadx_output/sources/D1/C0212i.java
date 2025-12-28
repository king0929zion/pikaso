package d1;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: d1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f4218a;

    public C0212i(DisplayCutout displayCutout) {
        this.f4218a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0212i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f4218a, ((C0212i) obj).f4218a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f4218a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f4218a + "}";
    }
}
