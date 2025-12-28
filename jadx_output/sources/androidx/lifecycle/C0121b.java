package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3464a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3465b;

    public C0121b(int i3, Method method) {
        this.f3464a = i3;
        this.f3465b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0121b)) {
            return false;
        }
        C0121b c0121b = (C0121b) obj;
        return this.f3464a == c0121b.f3464a && this.f3465b.getName().equals(c0121b.f3465b.getName());
    }

    public final int hashCode() {
        return this.f3465b.getName().hashCode() + (this.f3464a * 31);
    }
}
