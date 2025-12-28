package U0;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f2398a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f2399b;

    public m(Resources resources, Resources.Theme theme) {
        this.f2398a = resources;
        this.f2399b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2398a.equals(mVar.f2398a) && Objects.equals(this.f2399b, mVar.f2399b);
    }

    public final int hashCode() {
        return Objects.hash(this.f2398a, this.f2399b);
    }
}
