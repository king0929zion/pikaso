package D1;

import android.view.ViewGroup;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import n.C0386f;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final C0067a f1022a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f1023b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f1024c;

    static {
        C0067a c0067a = new C0067a();
        c0067a.f962z = new ArrayList();
        c0067a.f958A = true;
        c0067a.f960C = false;
        c0067a.f961D = 0;
        c0067a.f958A = false;
        c0067a.F(new j(2));
        c0067a.F(new g());
        c0067a.F(new j(1));
        f1022a = c0067a;
        f1023b = new ThreadLocal();
        f1024c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, o oVar) {
        ArrayList arrayList = f1024c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        Field field = AbstractC0189K.f4150a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (oVar == null) {
                oVar = f1022a;
            }
            o clone = oVar.clone();
            ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).t(viewGroup);
                }
            }
            if (clone != null) {
                clone.g(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                throw new ClassCastException();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (clone != null) {
                r rVar = new r();
                rVar.f1020d = clone;
                rVar.f1021e = viewGroup;
                viewGroup.addOnAttachStateChangeListener(rVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(rVar);
            }
        }
    }

    public static C0386f b() {
        C0386f c0386f;
        ThreadLocal threadLocal = f1023b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0386f = (C0386f) weakReference.get()) != null) {
            return c0386f;
        }
        C0386f c0386f2 = new C0386f(0);
        threadLocal.set(new WeakReference(c0386f2));
        return c0386f2;
    }
}
