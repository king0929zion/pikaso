package z;

import android.content.Context;
import android.view.ViewGroup;
import com.ai.assistance.operit.provider.R;
import d2.AbstractC0241l;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: z.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715r extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final int f6891d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f6892e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6893f;

    /* renamed from: g, reason: collision with root package name */
    public final M.c f6894g;
    public int h;

    public C0715r(Context context) {
        super(context);
        this.f6891d = 5;
        ArrayList arrayList = new ArrayList();
        this.f6892e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f6893f = arrayList2;
        this.f6894g = new M.c();
        setClipChildren(false);
        t tVar = new t(context);
        addView(tVar);
        arrayList.add(tVar);
        arrayList2.add(tVar);
        this.h = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final t a(InterfaceC0716s interfaceC0716s) {
        M.c cVar = this.f6894g;
        t tVar = (t) cVar.f1517a.get(interfaceC0716s);
        if (tVar != null) {
            return tVar;
        }
        ArrayList arrayList = this.f6893f;
        p2.g.e(arrayList, "<this>");
        t tVar2 = (t) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = cVar.f1517a;
        LinkedHashMap linkedHashMap2 = cVar.f1518b;
        if (tVar2 == null) {
            int i3 = this.h;
            ArrayList arrayList2 = this.f6892e;
            if (i3 > AbstractC0241l.T(arrayList2)) {
                tVar2 = new t(getContext());
                addView(tVar2);
                arrayList2.add(tVar2);
            } else {
                tVar2 = (t) arrayList2.get(this.h);
                InterfaceC0716s interfaceC0716s2 = (InterfaceC0716s) linkedHashMap2.get(tVar2);
                if (interfaceC0716s2 != null) {
                    interfaceC0716s2.F();
                    t tVar3 = (t) linkedHashMap.get(interfaceC0716s2);
                    if (tVar3 != null) {
                    }
                    linkedHashMap.remove(interfaceC0716s2);
                    tVar2.c();
                }
            }
            int i4 = this.h;
            if (i4 < this.f6891d - 1) {
                this.h = i4 + 1;
            } else {
                this.h = 0;
            }
        }
        linkedHashMap.put(interfaceC0716s, tVar2);
        linkedHashMap2.put(tVar2, interfaceC0716s);
        return tVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
