package m;

import java.util.Map;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365c implements Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final Object f4944d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4945e;

    /* renamed from: f, reason: collision with root package name */
    public C0365c f4946f;

    /* renamed from: g, reason: collision with root package name */
    public C0365c f4947g;

    public C0365c(Object obj, Object obj2) {
        this.f4944d = obj;
        this.f4945e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0365c)) {
            return false;
        }
        C0365c c0365c = (C0365c) obj;
        return this.f4944d.equals(c0365c.f4944d) && this.f4945e.equals(c0365c.f4945e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4944d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4945e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4944d.hashCode() ^ this.f4945e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4944d + "=" + this.f4945e;
    }
}
