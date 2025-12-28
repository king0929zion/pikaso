package D1;

import java.util.ArrayList;
import n.C0386f;

/* loaded from: classes.dex */
public final class q extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0386f f1018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1019b;

    public q(r rVar, C0386f c0386f) {
        this.f1019b = rVar;
        this.f1018a = c0386f;
    }

    @Override // D1.n
    public final void d(o oVar) {
        ((ArrayList) this.f1018a.get(this.f1019b.f1021e)).remove(oVar);
        oVar.u(this);
    }
}
