package androidx.compose.ui.semantics;

import P.j;
import P.k;
import n0.P;
import o2.c;
import p2.g;
import t0.C0600b;

/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends P implements j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3344a;

    /* renamed from: b, reason: collision with root package name */
    public final c f3345b;

    public AppendedSemanticsElement(c cVar, boolean z3) {
        this.f3344a = z3;
        this.f3345b = cVar;
    }

    @Override // n0.P
    public final k d() {
        C0600b c0600b = new C0600b();
        c0600b.f6200q = this.f3344a;
        c0600b.f6201r = this.f3345b;
        return c0600b;
    }

    @Override // n0.P
    public final void e(k kVar) {
        C0600b c0600b = (C0600b) kVar;
        c0600b.f6200q = this.f3344a;
        c0600b.f6201r = this.f3345b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f3344a == appendedSemanticsElement.f3344a && g.a(this.f3345b, appendedSemanticsElement.f3345b);
    }

    public final int hashCode() {
        return this.f3345b.hashCode() + (Boolean.hashCode(this.f3344a) * 31);
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f3344a + ", properties=" + this.f3345b + ')';
    }
}
