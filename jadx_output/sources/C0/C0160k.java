package c0;

import A.AbstractC0000a;

/* renamed from: c0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160k extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3786c;

    public C0160k(float f3) {
        super(3, false, false);
        this.f3786c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0160k) && Float.compare(this.f3786c, ((C0160k) obj).f3786c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3786c);
    }

    public final String toString() {
        return AbstractC0000a.f(new StringBuilder("HorizontalTo(x="), this.f3786c, ')');
    }
}
