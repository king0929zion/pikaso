package d0;

import A.t;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import p2.g;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlResourceParser f4138a;

    /* renamed from: b, reason: collision with root package name */
    public int f4139b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final t f4140c;

    public C0177a(XmlResourceParser xmlResourceParser) {
        this.f4138a = xmlResourceParser;
        t tVar = new t(17, false);
        tVar.f175e = new float[64];
        this.f4140c = tVar;
    }

    public final float a(TypedArray typedArray, String str, int i3, float f3) {
        if (U0.b.c(this.f4138a, str)) {
            f3 = typedArray.getFloat(i3, f3);
        }
        b(typedArray.getChangingConfigurations());
        return f3;
    }

    public final void b(int i3) {
        this.f4139b = i3 | this.f4139b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0177a)) {
            return false;
        }
        C0177a c0177a = (C0177a) obj;
        return g.a(this.f4138a, c0177a.f4138a) && this.f4139b == c0177a.f4139b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4139b) + (this.f4138a.hashCode() * 31);
    }

    public final String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f4138a + ", config=" + this.f4139b + ')';
    }
}
