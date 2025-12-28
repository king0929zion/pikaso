package y2;

import java.util.concurrent.CancellationException;

/* renamed from: y2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6799a;

    /* renamed from: b, reason: collision with root package name */
    public final D f6800b;

    /* renamed from: c, reason: collision with root package name */
    public final o2.c f6801c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6802d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f6803e;

    public C0679l(Object obj, D d3, o2.c cVar, Object obj2, Throwable th) {
        this.f6799a = obj;
        this.f6800b = d3;
        this.f6801c = cVar;
        this.f6802d = obj2;
        this.f6803e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0679l a(C0679l c0679l, D d3, CancellationException cancellationException, int i3) {
        Object obj = c0679l.f6799a;
        if ((i3 & 2) != 0) {
            d3 = c0679l.f6800b;
        }
        D d4 = d3;
        o2.c cVar = c0679l.f6801c;
        Object obj2 = c0679l.f6802d;
        CancellationException cancellationException2 = cancellationException;
        if ((i3 & 16) != 0) {
            cancellationException2 = c0679l.f6803e;
        }
        c0679l.getClass();
        return new C0679l(obj, d4, cVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0679l)) {
            return false;
        }
        C0679l c0679l = (C0679l) obj;
        return p2.g.a(this.f6799a, c0679l.f6799a) && p2.g.a(this.f6800b, c0679l.f6800b) && p2.g.a(this.f6801c, c0679l.f6801c) && p2.g.a(this.f6802d, c0679l.f6802d) && p2.g.a(this.f6803e, c0679l.f6803e);
    }

    public final int hashCode() {
        Object obj = this.f6799a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        D d3 = this.f6800b;
        int hashCode2 = (hashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        o2.c cVar = this.f6801c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Object obj2 = this.f6802d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f6803e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f6799a + ", cancelHandler=" + this.f6800b + ", onCancellation=" + this.f6801c + ", idempotentResume=" + this.f6802d + ", cancelCause=" + this.f6803e + ')';
    }

    public /* synthetic */ C0679l(Object obj, D d3, o2.c cVar, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : d3, (i3 & 4) != 0 ? null : cVar, (Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
