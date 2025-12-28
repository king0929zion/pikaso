package d1;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: d1.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0202Y {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f4176a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f4177b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f4178c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4179d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f4176a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f4177b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f4178c = declaredField3;
            declaredField3.setAccessible(true);
            f4179d = true;
        } catch (ReflectiveOperationException e3) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e3.getMessage(), e3);
        }
    }
}
