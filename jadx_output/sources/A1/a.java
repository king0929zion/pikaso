package A1;

import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0127h;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import b.k;
import b.o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f208d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f209e;

    public /* synthetic */ a(int i3, Object obj) {
        this.f208d = i3;
        this.f209e = obj;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [A1.g, java.lang.Object] */
    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        switch (this.f208d) {
            case 0:
                if (lVar != l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                rVar.c().f(this);
                Bundle a3 = this.f209e.b().a("androidx.savedstate.Restarter");
                if (a3 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a3.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                Iterator<String> it = stringArrayList.iterator();
                if (it.hasNext()) {
                    String next = it.next();
                    try {
                        Class<? extends U> asSubclass = Class.forName(next, false, a.class.getClassLoader()).asSubclass(c.class);
                        p2.g.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                p2.g.d(declaredConstructor.newInstance(null), "{\n                constr…wInstance()\n            }");
                                throw new ClassCastException();
                            } catch (Exception e3) {
                                throw new RuntimeException("Failed to instantiate " + next, e3);
                            }
                        } catch (NoSuchMethodException e4) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                        }
                    } catch (ClassNotFoundException e5) {
                        throw new RuntimeException("Class " + next + " wasn't found", e5);
                    }
                }
                return;
            case 1:
                new HashMap();
                InterfaceC0127h[] interfaceC0127hArr = (InterfaceC0127h[]) this.f209e;
                if (interfaceC0127hArr.length > 0) {
                    InterfaceC0127h interfaceC0127h = interfaceC0127hArr[0];
                    throw null;
                }
                if (interfaceC0127hArr.length <= 0) {
                    return;
                }
                InterfaceC0127h interfaceC0127h2 = interfaceC0127hArr[0];
                throw null;
            case 2:
                if (lVar != l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lVar).toString());
                }
                rVar.c().f(this);
                F f3 = (F) this.f209e;
                if (f3.f3452b) {
                    return;
                }
                Bundle a4 = f3.f3451a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = f3.f3453c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (a4 != null) {
                    bundle.putAll(a4);
                }
                f3.f3453c = bundle;
                f3.f3452b = true;
                return;
            default:
                if (lVar != l.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                b.r rVar2 = ((k) this.f209e).f3603j;
                OnBackInvokedDispatcher a5 = b.h.a((k) rVar);
                rVar2.getClass();
                p2.g.e(a5, "invoker");
                rVar2.f3630e = a5;
                OnBackInvokedDispatcher onBackInvokedDispatcher = rVar2.f3630e;
                OnBackInvokedCallback onBackInvokedCallback = rVar2.f3629d;
                if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
                    return;
                }
                o oVar = o.f3620a;
                if (rVar2.f3631f) {
                    oVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                    rVar2.f3631f = false;
                    return;
                }
                return;
        }
    }
}
