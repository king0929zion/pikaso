package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.ai.assistance.operit.provider.R;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283b extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public int f4416a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f4417b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f4418c;

    /* renamed from: d, reason: collision with root package name */
    public Resources f4419d;

    public final void a() {
        if (this.f4417b == null) {
            this.f4417b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4417b.setTo(theme);
            }
        }
        this.f4417b.applyStyle(this.f4416a, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f4419d == null) {
            this.f4419d = super.getResources();
        }
        return this.f4419d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4418c == null) {
            this.f4418c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f4418c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f4417b;
        if (theme != null) {
            return theme;
        }
        if (this.f4416a == 0) {
            this.f4416a = R.style.Theme_AppCompat_Light;
        }
        a();
        return this.f4417b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i3) {
        if (this.f4416a != i3) {
            this.f4416a = i3;
            a();
        }
    }
}
