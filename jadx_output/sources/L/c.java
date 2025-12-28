package L;

import p2.g;
import x.AbstractC0637b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f1446a;

    public c(int i3) {
        this.f1446a = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f1446a);
        sb.append(")@");
        int hashCode = hashCode();
        AbstractC0637b.a(16);
        String num = Integer.toString(hashCode, 16);
        g.d(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }
}
