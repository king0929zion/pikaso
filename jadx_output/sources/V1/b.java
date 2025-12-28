package v1;

import android.graphics.Rect;
import android.view.View;
import java.util.LinkedHashMap;
import z1.C0741o;
import z1.w;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6483a;

    public b() {
        this.f6483a = new LinkedHashMap();
    }

    public static b a(w wVar, int i3) {
        if (i3 == 0) {
            return new C0741o(wVar, 0);
        }
        if (i3 == 1) {
            return new C0741o(wVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public b(w wVar) {
        new Rect();
        this.f6483a = wVar;
    }
}
