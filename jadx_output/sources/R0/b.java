package r0;

import android.content.res.Resources;
import com.ai.assistance.operit.provider.R;
import p2.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f6109a;

    public b(Resources.Theme theme) {
        this.f6109a = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return g.a(this.f6109a, ((b) obj).f6109a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_launcher_foreground) + (this.f6109a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(theme=" + this.f6109a + ", id=2131165332)";
    }
}
