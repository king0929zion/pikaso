package U0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f2395a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f2396b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2397c;

    public l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f2395a = colorStateList;
        this.f2396b = configuration;
        this.f2397c = theme == null ? 0 : theme.hashCode();
    }
}
