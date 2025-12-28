package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0122c f3466c = new C0122c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3467a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3468b = new HashMap();

    public static void b(HashMap hashMap, C0121b c0121b, l lVar, Class cls) {
        l lVar2 = (l) hashMap.get(c0121b);
        if (lVar2 == null || lVar == lVar2) {
            if (lVar2 == null) {
                hashMap.put(c0121b, lVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0121b.f3465b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + lVar2 + ", new value " + lVar);
    }

    public final C0120a a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f3467a;
        if (superclass != null) {
            C0120a c0120a = (C0120a) hashMap2.get(superclass);
            if (c0120a == null) {
                c0120a = a(superclass, null);
            }
            hashMap.putAll(c0120a.f3463b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0120a c0120a2 = (C0120a) hashMap2.get(cls2);
            if (c0120a2 == null) {
                c0120a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0120a2.f3463b.entrySet()) {
                b(hashMap, (C0121b) entry.getKey(), (l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e3) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            w wVar = (w) method.getAnnotation(w.class);
            if (wVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                l value = wVar.value();
                if (parameterTypes.length > 1) {
                    if (!l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0121b(i3, method), value, cls);
                z3 = true;
            }
        }
        C0120a c0120a3 = new C0120a(hashMap);
        hashMap2.put(cls, c0120a3);
        this.f3468b.put(cls, Boolean.valueOf(z3));
        return c0120a3;
    }
}
