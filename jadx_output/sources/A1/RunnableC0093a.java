package a1;

import A.t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0093a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2921d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f2922e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2923f;

    public RunnableC0093a(t tVar, int i3) {
        this.f2923f = tVar;
        this.f2922e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2921d) {
            case 0:
                U0.b bVar = (U0.b) ((t) this.f2923f).f175e;
                if (bVar != null) {
                    bVar.g(this.f2922e);
                    break;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f2923f;
                int size = arrayList.size();
                int i3 = 0;
                if (this.f2922e == 1) {
                    while (i3 < size) {
                        ((o1.g) arrayList.get(i3)).b();
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((o1.g) arrayList.get(i3)).a();
                        i3++;
                    }
                    break;
                }
        }
    }

    public RunnableC0093a(List list, int i3, Throwable th) {
        Z.b.g(list, "initCallbacks cannot be null");
        this.f2923f = new ArrayList(list);
        this.f2922e = i3;
    }
}
