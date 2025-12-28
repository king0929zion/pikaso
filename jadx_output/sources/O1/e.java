package o1;

import a1.RunnableC0093a;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends Z0.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f5763c;

    public e(f fVar) {
        this.f5763c = fVar;
    }

    @Override // Z0.d
    public final void I(Throwable th) {
        this.f5763c.f5764a.e(th);
    }

    @Override // Z0.d
    public final void J(D1.w wVar) {
        f fVar = this.f5763c;
        fVar.f5766c = wVar;
        D1.w wVar2 = fVar.f5766c;
        i iVar = fVar.f5764a;
        fVar.f5765b = new B0.a(wVar2, iVar.f5775g, iVar.f5776i, Build.VERSION.SDK_INT >= 34 ? n.a() : Z.b.s());
        i iVar2 = fVar.f5764a;
        iVar2.getClass();
        ArrayList arrayList = new ArrayList();
        iVar2.f5769a.writeLock().lock();
        try {
            iVar2.f5771c = 1;
            arrayList.addAll(iVar2.f5770b);
            iVar2.f5770b.clear();
            iVar2.f5769a.writeLock().unlock();
            iVar2.f5772d.post(new RunnableC0093a(arrayList, iVar2.f5771c, null));
        } catch (Throwable th) {
            iVar2.f5769a.writeLock().unlock();
            throw th;
        }
    }
}
