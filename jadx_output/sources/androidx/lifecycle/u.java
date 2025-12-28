package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f3490a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f3491b = new HashMap();

    public static void a(Constructor constructor, q qVar) {
        try {
            p2.g.d(constructor.newInstance(qVar), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        int h = x2.j.h(str, ".", 0, false);
        if (h >= 0) {
            int length = str.length();
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            int i3 = 0;
            do {
                sb2.append((CharSequence) str, i3, h);
                sb2.append("_");
                i3 = h + 1;
                if (h >= str.length()) {
                    break;
                }
                h = x2.j.h(str, ".", i3, false);
            } while (h > 0);
            sb2.append((CharSequence) str, i3, str.length());
            str = sb2.toString();
            p2.g.d(str, "toString(...)");
        }
        sb.append(str);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    public static int c(Class cls) {
        Constructor<?> constructor;
        boolean z3;
        HashMap hashMap = f3490a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i3 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                p2.g.d(name, "fullPackage");
                if (name.length() != 0) {
                    p2.g.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    p2.g.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                p2.g.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String b3 = b(canonicalName);
                if (name.length() != 0) {
                    b3 = name + '.' + b3;
                }
                constructor = Class.forName(b3).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            }
            HashMap hashMap2 = f3491b;
            if (constructor != null) {
                hashMap2.put(cls, Z.b.D(constructor));
            } else {
                C0122c c0122c = C0122c.f3466c;
                HashMap hashMap3 = c0122c.f3468b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z3 = false;
                                break;
                            }
                            if (((w) declaredMethods[i4].getAnnotation(w.class)) != null) {
                                c0122c.a(cls, declaredMethods);
                                z3 = true;
                                break;
                            }
                            i4++;
                        }
                    } catch (NoClassDefFoundError e4) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
                    }
                }
                if (!z3) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && q.class.isAssignableFrom(superclass)) {
                        p2.g.d(superclass, "superclass");
                        if (c(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            p2.g.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    p2.g.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length2) {
                            Class<?> cls2 = interfaces[i5];
                            if (cls2 != null && q.class.isAssignableFrom(cls2)) {
                                p2.g.d(cls2, "intrface");
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                p2.g.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i5++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i3 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i3));
        return i3;
    }
}
