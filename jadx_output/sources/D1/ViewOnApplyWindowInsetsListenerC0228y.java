package d1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* renamed from: d1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0228y implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public l0 f4242a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0218o f4244c;

    public ViewOnApplyWindowInsetsListenerC0228y(View view, InterfaceC0218o interfaceC0218o) {
        this.f4243b = view;
        this.f4244c = interfaceC0218o;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        l0 d3 = l0.d(view, windowInsets);
        int i3 = Build.VERSION.SDK_INT;
        InterfaceC0218o interfaceC0218o = this.f4244c;
        if (i3 < 30) {
            AbstractC0229z.a(windowInsets, this.f4243b);
            if (d3.equals(this.f4242a)) {
                return interfaceC0218o.b(view, d3).c();
            }
        }
        this.f4242a = d3;
        l0 b3 = interfaceC0218o.b(view, d3);
        if (i3 >= 30) {
            return b3.c();
        }
        Field field = AbstractC0189K.f4150a;
        AbstractC0227x.c(view);
        return b3.c();
    }
}
