package o0;

import D.AbstractC0058q;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.ai.assistance.operit.provider.R;
import java.util.LinkedHashMap;
import k1.C0348a;

/* loaded from: classes.dex */
public abstract class X0 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f5532a = new LinkedHashMap();

    public static final B2.E a(Context context) {
        B2.E e3;
        LinkedHashMap linkedHashMap = f5532a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    A2.b a3 = A2.i.a(-1, 0, 6);
                    A.t tVar = new A.t(new W0(contentResolver, uriFor, new C0348a(a3, Z0.d.p(Looper.getMainLooper())), a3, context, null));
                    y2.i0 i0Var = new y2.i0(null);
                    F2.d dVar = y2.B.f6749a;
                    obj = B2.w.e(tVar, new D2.d(Z0.d.K(i0Var, D2.o.f1078a)), new B2.D(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                e3 = (B2.E) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e3;
    }

    public static final AbstractC0058q b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC0058q) {
            return (AbstractC0058q) tag;
        }
        return null;
    }
}
