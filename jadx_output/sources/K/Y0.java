package k;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class Y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f4739a;

    static {
        f4739a = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        Field field = AbstractC0189K.f4150a;
        return view.getLayoutDirection() == 1;
    }
}
