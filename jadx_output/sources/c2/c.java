package C2;

import D2.AbstractC0071a;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC0271d[] f585a = new InterfaceC0271d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final D2.w f586b = new D2.w("NULL", 0);

    public static final Object a(InterfaceC0276i interfaceC0276i, Object obj, Object obj2, o2.e eVar, InterfaceC0271d interfaceC0271d) {
        Object m2 = AbstractC0071a.m(interfaceC0276i, obj2);
        try {
            y yVar = new y(interfaceC0271d, interfaceC0276i);
            p2.r.c(2, eVar);
            return eVar.h(obj, yVar);
        } finally {
            AbstractC0071a.g(interfaceC0276i, m2);
        }
    }
}
