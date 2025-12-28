package D;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f714a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f715b;

    public O(Integer num, Object obj) {
        this.f714a = num;
        this.f715b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o3 = (O) obj;
        return this.f714a.equals(o3.f714a) && p2.g.a(this.f715b, o3.f715b);
    }

    public final int hashCode() {
        int hashCode = this.f714a.hashCode() * 31;
        Object obj = this.f715b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f714a + ", right=" + this.f715b + ')';
    }
}
