package D2;

import a1.C0097e;
import android.graphics.Typeface;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d1.AbstractC0189K;
import g2.C0277j;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0306e;
import k.C0312h;
import k.N0;
import n1.C0449e;
import y2.AbstractC0688v;
import y2.C0673f;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1058d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1060f;

    public /* synthetic */ h(int i3, Object obj, Object obj2, boolean z3) {
        this.f1058d = i3;
        this.f1059e = obj;
        this.f1060f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar;
        A.t tVar;
        N0 n02;
        C0306e c0306e;
        int i3 = 0;
        Object obj = this.f1060f;
        switch (this.f1058d) {
            case 0:
                break;
            case 1:
                C0449e c0449e = ((SwipeDismissBehavior) obj).f3869a;
                if (c0449e == null || !c0449e.f()) {
                    return;
                }
                Field field = AbstractC0189K.f4150a;
                ((View) this.f1059e).postOnAnimation(this);
                return;
            case 2:
                U0.b bVar = (U0.b) ((A.t) this.f1059e).f175e;
                if (bVar != null) {
                    bVar.h((Typeface) obj);
                    return;
                }
                return;
            case 3:
                ((C0097e) this.f1059e).a(obj);
                return;
            case 4:
                C0312h c0312h = (C0312h) obj;
                j.i iVar2 = c0312h.f4779f;
                if (iVar2 != null && (tVar = iVar2.f4523e) != null && (n02 = ((ActionMenuView) tVar.f175e).f3154w) != null) {
                    Toolbar toolbar = n02.f4696a;
                    C0312h c0312h2 = toolbar.f3230d.f3153v;
                    if (c0312h2 == null || (c0306e = c0312h2.f4793u) == null || !c0306e.b()) {
                        Iterator it = ((CopyOnWriteArrayList) toolbar.f3220J.f175e).iterator();
                        if (it.hasNext()) {
                            it.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                }
                ActionMenuView actionMenuView = c0312h.f4782j;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0306e c0306e2 = (C0306e) this.f1059e;
                    if (!c0306e2.b()) {
                        if (c0306e2.f4571e != null) {
                            c0306e2.d(0, 0, false, false);
                        }
                    }
                    c0312h.f4793u = c0306e2;
                }
                c0312h.f4795w = null;
                return;
            default:
                ((C0673f) this.f1059e).E((z2.c) obj);
                return;
        }
        do {
            try {
                ((Runnable) this.f1059e).run();
            } catch (Throwable th) {
                AbstractC0688v.h(C0277j.f4334d, th);
            }
            iVar = (i) obj;
            Runnable j3 = iVar.j();
            if (j3 == null) {
                return;
            }
            this.f1059e = j3;
            i3++;
        } while (i3 < 16);
        F2.l lVar = iVar.f1062f;
        lVar.getClass();
        lVar.d(iVar, this);
    }

    public /* synthetic */ h(Object obj, int i3, Object obj2) {
        this.f1058d = i3;
        this.f1060f = obj;
        this.f1059e = obj2;
    }

    public h(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z3) {
        this.f1058d = 1;
        this.f1060f = swipeDismissBehavior;
        this.f1059e = view;
    }
}
