package D1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public o f1020d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f1021e;

    /* JADX WARN: Removed duplicated region for block: B:118:0x01e6 A[EDGE_INSN: B:118:0x01e6->B:119:0x01e6 BREAK  A[LOOP:1: B:17:0x0087->B:29:0x01de], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.r.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f1021e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = s.f1024c;
        ViewGroup viewGroup2 = this.f1021e;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) s.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((o) it.next()).v(viewGroup2);
            }
        }
        this.f1020d.h(true);
    }
}
