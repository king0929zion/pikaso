package B0;

import java.util.Locale;
import p2.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f274a;

    public b(Locale locale) {
        this.f274a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return g.a(this.f274a.toLanguageTag(), ((b) obj).f274a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f274a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f274a.toLanguageTag();
    }
}
