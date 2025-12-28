package k;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: k.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334s0 extends AbstractC0323m0 implements InterfaceC0325n0 {

    /* renamed from: C, reason: collision with root package name */
    public static final Method f4870C;

    /* renamed from: B, reason: collision with root package name */
    public A.t f4871B;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f4870C = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // k.InterfaceC0325n0
    public final void d(j.i iVar, j.j jVar) {
        A.t tVar = this.f4871B;
        if (tVar != null) {
            tVar.d(iVar, jVar);
        }
    }

    @Override // k.InterfaceC0325n0
    public final void n(j.i iVar, j.j jVar) {
        A.t tVar = this.f4871B;
        if (tVar != null) {
            tVar.n(iVar, jVar);
        }
    }
}
