package i2;

import g2.InterfaceC0271d;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a implements InterfaceC0271d, d, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0271d f4459d;

    public a(InterfaceC0271d interfaceC0271d) {
        this.f4459d = interfaceC0271d;
    }

    public InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public d j() {
        InterfaceC0271d interfaceC0271d = this.f4459d;
        if (interfaceC0271d instanceof d) {
            return (d) interfaceC0271d;
        }
        return null;
    }

    public StackTraceElement k() {
        int i3;
        String str;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v3 = eVar.v();
        if (v3 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v3 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i3 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i3 = -1;
        }
        int i4 = i3 >= 0 ? eVar.l()[i3] : -1;
        f fVar = g.f4467b;
        f fVar2 = g.f4466a;
        if (fVar == null) {
            try {
                f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                g.f4467b = fVar3;
                fVar = fVar3;
            } catch (Exception unused2) {
                g.f4467b = fVar2;
                fVar = fVar2;
            }
        }
        if (fVar != fVar2) {
            Method method = fVar.f4463a;
            Object invoke = method != null ? method.invoke(getClass(), null) : null;
            if (invoke != null) {
                Method method2 = fVar.f4464b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                if (invoke2 != null) {
                    Method method3 = fVar.f4465c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                    if (invoke3 instanceof String) {
                        str2 = (String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i4);
    }

    public abstract Object l(Object obj);

    public void m() {
    }

    @Override // g2.InterfaceC0271d
    public final void t(Object obj) {
        InterfaceC0271d interfaceC0271d = this;
        while (true) {
            a aVar = (a) interfaceC0271d;
            InterfaceC0271d interfaceC0271d2 = aVar.f4459d;
            p2.g.b(interfaceC0271d2);
            try {
                obj = aVar.l(obj);
                if (obj == h2.a.f4407d) {
                    return;
                }
            } catch (Throwable th) {
                obj = Z0.d.q(th);
            }
            aVar.m();
            if (!(interfaceC0271d2 instanceof a)) {
                interfaceC0271d2.t(obj);
                return;
            }
            interfaceC0271d = interfaceC0271d2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object k3 = k();
        if (k3 == null) {
            k3 = getClass().getName();
        }
        sb.append(k3);
        return sb.toString();
    }
}
