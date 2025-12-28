package B2;

import g2.InterfaceC0271d;
import y2.C0673f;

/* loaded from: classes.dex */
public final class x extends C2.d {

    /* renamed from: a, reason: collision with root package name */
    public long f366a;

    /* renamed from: b, reason: collision with root package name */
    public C0673f f367b;

    @Override // C2.d
    public final boolean a(C2.b bVar) {
        v vVar = (v) bVar;
        if (this.f366a >= 0) {
            return false;
        }
        long j3 = vVar.f359l;
        if (j3 < vVar.f360m) {
            vVar.f360m = j3;
        }
        this.f366a = j3;
        return true;
    }

    @Override // C2.d
    public final InterfaceC0271d[] b(C2.b bVar) {
        long j3 = this.f366a;
        this.f366a = -1L;
        this.f367b = null;
        return ((v) bVar).v(j3);
    }
}
