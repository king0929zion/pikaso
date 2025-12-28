package p2;

import c2.C0168g;
import d2.AbstractC0241l;
import d2.AbstractC0242m;
import d2.AbstractC0251v;
import d2.C0249t;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements v2.b, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f5949b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f5950c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f5951a;

    static {
        List U2 = AbstractC0241l.U(o2.a.class, o2.c.class, o2.e.class, o2.f.class, o2.g.class, L.a.class, L.a.class, L.a.class, L.a.class, L.a.class, L.a.class, L.a.class, o2.b.class, L.a.class, L.a.class, L.a.class, L.a.class, L.a.class, L.a.class, L.a.class, L.a.class, L.a.class, o2.d.class);
        ArrayList arrayList = new ArrayList(AbstractC0242m.W(U2));
        int i3 = 0;
        for (Object obj : U2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C0168g((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        Map map = C0249t.f4256d;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(AbstractC0251v.X(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0168g c0168g = (C0168g) it.next();
                    map.put(c0168g.f3833d, c0168g.f3834e);
                }
            } else {
                C0168g c0168g2 = (C0168g) arrayList.get(0);
                g.e(c0168g2, "pair");
                map = Collections.singletonMap(c0168g2.f3833d, c0168g2.f3834e);
                g.d(map, "singletonMap(...)");
            }
        }
        f5949b = map;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        g.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            g.b(str);
            sb.append(x2.j.o(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f5949b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0251v.X(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), x2.j.o((String) entry2.getValue()));
        }
        f5950c = linkedHashMap;
    }

    public d(Class cls) {
        g.e(cls, "jClass");
        this.f5951a = cls;
    }

    @Override // p2.c
    public final Class a() {
        return this.f5951a;
    }

    public final String b() {
        String str;
        Class cls = this.f5951a;
        g.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = f5950c;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return x2.j.n(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return x2.j.n(simpleName, enclosingConstructor.getName() + '$');
        }
        int i3 = x2.j.i(simpleName, '$', 0, false, 6);
        if (i3 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(i3 + 1, simpleName.length());
        g.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && Z0.d.x(this).equals(Z0.d.x((v2.b) obj));
    }

    public final int hashCode() {
        return Z0.d.x(this).hashCode();
    }

    public final String toString() {
        return this.f5951a.toString() + " (Kotlin reflection is not available)";
    }
}
