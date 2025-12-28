package p2;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class h implements e, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final int f5955d;

    public h(int i3) {
        this.f5955d = i3;
    }

    @Override // p2.e
    public final int e() {
        return this.f5955d;
    }

    public final String toString() {
        p.f5961a.getClass();
        String a3 = q.a(this);
        g.d(a3, "renderLambdaToString(...)");
        return a3;
    }
}
