package z0;

import A.AbstractC0000a;
import d2.AbstractC0241l;

/* loaded from: classes.dex */
public final class l implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final l f6928e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f6929f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f6930g;
    public static final l h;

    /* renamed from: d, reason: collision with root package name */
    public final int f6931d;

    static {
        l lVar = new l(100);
        l lVar2 = new l(200);
        l lVar3 = new l(300);
        l lVar4 = new l(400);
        l lVar5 = new l(500);
        l lVar6 = new l(600);
        f6928e = lVar6;
        l lVar7 = new l(700);
        l lVar8 = new l(800);
        l lVar9 = new l(900);
        f6929f = lVar4;
        f6930g = lVar5;
        h = lVar7;
        AbstractC0241l.U(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9);
    }

    public l(int i3) {
        this.f6931d = i3;
        if (1 > i3 || i3 >= 1001) {
            throw new IllegalArgumentException(AbstractC0000a.c("Font weight can be in range [1, 1000]. Current value: ", i3).toString());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return p2.g.f(this.f6931d, ((l) obj).f6931d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f6931d == ((l) obj).f6931d;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6931d;
    }

    public final String toString() {
        return "FontWeight(weight=" + this.f6931d + ')';
    }
}
