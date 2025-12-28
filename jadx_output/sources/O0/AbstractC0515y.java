package o0;

import android.R;
import java.util.LinkedHashMap;
import t0.C0599a;

/* renamed from: o0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0515y {
    public static final void a(e1.j jVar, t0.k kVar) {
        if (AbstractC0461K.a(kVar)) {
            t0.q qVar = t0.f.f6225u;
            LinkedHashMap linkedHashMap = kVar.f6239d.f6230d;
            Object obj = linkedHashMap.get(qVar);
            if (obj == null) {
                obj = null;
            }
            C0599a c0599a = (C0599a) obj;
            if (c0599a != null) {
                jVar.b(new e1.e(c0599a.f6198a, R.id.accessibilityActionPageUp));
            }
            Object obj2 = linkedHashMap.get(t0.f.f6227w);
            if (obj2 == null) {
                obj2 = null;
            }
            C0599a c0599a2 = (C0599a) obj2;
            if (c0599a2 != null) {
                jVar.b(new e1.e(c0599a2.f6198a, R.id.accessibilityActionPageDown));
            }
            Object obj3 = linkedHashMap.get(t0.f.f6226v);
            if (obj3 == null) {
                obj3 = null;
            }
            C0599a c0599a3 = (C0599a) obj3;
            if (c0599a3 != null) {
                jVar.b(new e1.e(c0599a3.f6198a, R.id.accessibilityActionPageLeft));
            }
            Object obj4 = linkedHashMap.get(t0.f.f6228x);
            C0599a c0599a4 = (C0599a) (obj4 != null ? obj4 : null);
            if (c0599a4 != null) {
                jVar.b(new e1.e(c0599a4.f6198a, R.id.accessibilityActionPageRight));
            }
        }
    }
}
