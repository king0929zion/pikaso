package p2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f5954a = new Object[0];

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        g(nullPointerException, g.class.getName());
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        g(nullPointerException, g.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        g(nullPointerException, g.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = g.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            g(nullPointerException, g.class.getName());
            throw nullPointerException;
        }
    }

    public static int f(int i3, int i4) {
        if (i3 < i4) {
            return -1;
        }
        return i3 == i4 ? 0 : 1;
    }

    public static void g(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i3 = -1;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(stackTrace[i4].getClassName())) {
                i3 = i4;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3 + 1, length));
    }

    public static void h(String str) {
        B1.c cVar = new B1.c("lateinit property " + str + " has not been initialized");
        g(cVar, g.class.getName());
        throw cVar;
    }

    public static final Object[] i(Collection collection) {
        e(collection, "collection");
        int size = collection.size();
        Object[] objArr = f5954a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            objArr2[i3] = it.next();
            if (i4 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i5 = ((i4 * 3) + 1) >>> 1;
                if (i5 <= i4) {
                    i5 = 2147483645;
                    if (i4 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i5);
                d(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i4);
                d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i3 = i4;
        }
    }

    public static final Object[] j(Collection collection, Object[] objArr) {
        Object[] objArr2;
        e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i3 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i4 = i3 + 1;
            objArr2[i3] = it.next();
            if (i4 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i5 = ((i4 * 3) + 1) >>> 1;
                if (i5 <= i4) {
                    i5 = 2147483645;
                    if (i4 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i5);
                d(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i4] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i4);
                d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i3 = i4;
        }
    }
}
