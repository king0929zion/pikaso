package i2;

import g2.InterfaceC0271d;
import p2.p;
import p2.q;

/* loaded from: classes.dex */
public abstract class j extends c implements p2.e {

    /* renamed from: g, reason: collision with root package name */
    public final int f4469g;

    public j(int i3, InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        this.f4469g = i3;
    }

    @Override // p2.e
    public final int e() {
        return this.f4469g;
    }

    @Override // i2.a
    public final String toString() {
        if (this.f4459d != null) {
            return super.toString();
        }
        p.f5961a.getClass();
        String a3 = q.a(this);
        p2.g.d(a3, "renderLambdaToString(...)");
        return a3;
    }
}
