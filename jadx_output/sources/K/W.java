package k;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f4732a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f4733b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f4734c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4735d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f4732a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f4733b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f4734c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f4735d = true;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        }
    }
}
