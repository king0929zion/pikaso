package p2;

/* loaded from: classes.dex */
public abstract class l extends b implements v2.c {

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5957j;

    public l(Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f5957j = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return d().equals(lVar.d()) && this.f5947g.equals(lVar.f5947g) && this.h.equals(lVar.h) && g.a(this.f5945e, lVar.f5945e);
        }
        if (obj instanceof v2.c) {
            return obj.equals(f());
        }
        return false;
    }

    public final v2.a f() {
        if (this.f5957j) {
            return this;
        }
        v2.a aVar = this.f5944d;
        if (aVar != null) {
            return aVar;
        }
        v2.a b3 = b();
        this.f5944d = b3;
        return b3;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.f5947g.hashCode() + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        v2.a f3 = f();
        if (f3 != this) {
            return f3.toString();
        }
        return "property " + this.f5947g + " (Kotlin reflection is not available)";
    }
}
