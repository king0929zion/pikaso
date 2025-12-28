package B2;

import y2.C0673f;

/* loaded from: classes.dex */
public final class t implements y2.C {

    /* renamed from: d, reason: collision with root package name */
    public final v f346d;

    /* renamed from: e, reason: collision with root package name */
    public final long f347e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f348f;

    /* renamed from: g, reason: collision with root package name */
    public final C0673f f349g;

    public t(v vVar, long j3, Object obj, C0673f c0673f) {
        this.f346d = vVar;
        this.f347e = j3;
        this.f348f = obj;
        this.f349g = c0673f;
    }

    @Override // y2.C
    public final void d() {
        v vVar = this.f346d;
        synchronized (vVar) {
            if (this.f347e < vVar.n()) {
                return;
            }
            Object[] objArr = vVar.f358k;
            p2.g.b(objArr);
            long j3 = this.f347e;
            if (objArr[((int) j3) & (objArr.length - 1)] != this) {
                return;
            }
            w.a(objArr, j3, w.f363a);
            vVar.h();
        }
    }
}
