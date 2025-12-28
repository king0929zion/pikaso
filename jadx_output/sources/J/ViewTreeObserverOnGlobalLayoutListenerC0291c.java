package j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import k.C0334s0;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0291c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f4481e;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0291c(k kVar, int i3) {
        this.f4480d = i3;
        this.f4481e = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f4480d) {
            case 0:
                f fVar = (f) this.f4481e;
                if (fVar.h()) {
                    ArrayList arrayList = fVar.f4497k;
                    if (arrayList.size() > 0 && !((e) arrayList.get(0)).f4486a.f4841x) {
                        View view = fVar.f4504r;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((e) it.next()).f4486a.b();
                            }
                            break;
                        } else {
                            fVar.e();
                            break;
                        }
                    }
                }
                break;
            default:
                s sVar = (s) this.f4481e;
                if (sVar.h()) {
                    C0334s0 c0334s0 = sVar.f4582k;
                    if (!c0334s0.f4841x) {
                        View view2 = sVar.f4587p;
                        if (view2 != null && view2.isShown()) {
                            c0334s0.b();
                            break;
                        } else {
                            sVar.e();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
