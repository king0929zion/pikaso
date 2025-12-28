package k;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class U0 implements T {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f4720a;

    /* renamed from: b, reason: collision with root package name */
    public int f4721b;

    /* renamed from: c, reason: collision with root package name */
    public View f4722c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f4723d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f4724e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4725f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4726g;
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f4727i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f4728j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f4729k;

    /* renamed from: l, reason: collision with root package name */
    public int f4730l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4731m;

    public final void a(int i3) {
        View view;
        int i4 = this.f4721b ^ i3;
        this.f4721b = i3;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                int i5 = this.f4721b & 4;
                Toolbar toolbar = this.f4720a;
                if (i5 != 0) {
                    Drawable drawable = this.f4725f;
                    if (drawable == null) {
                        drawable = this.f4731m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                c();
            }
            int i6 = i4 & 8;
            Toolbar toolbar2 = this.f4720a;
            if (i6 != 0) {
                if ((i3 & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.f4727i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f4722c) == null) {
                return;
            }
            if ((i3 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f4721b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f4728j);
            Toolbar toolbar = this.f4720a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f4730l);
            } else {
                toolbar.setNavigationContentDescription(this.f4728j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i3 = this.f4721b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) != 0) {
            drawable = this.f4724e;
            if (drawable == null) {
                drawable = this.f4723d;
            }
        } else {
            drawable = this.f4723d;
        }
        this.f4720a.setLogo(drawable);
    }
}
