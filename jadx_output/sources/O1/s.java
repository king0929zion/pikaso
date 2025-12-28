package o1;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f5802a;

    /* renamed from: b, reason: collision with root package name */
    public v f5803b;

    public s(int i3) {
        this.f5802a = new SparseArray(i3);
    }

    public final void a(v vVar, int i3, int i4) {
        int a3 = vVar.a(i3);
        SparseArray sparseArray = this.f5802a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(a3);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(vVar.a(i3), sVar);
        }
        if (i4 > i3) {
            sVar.a(vVar, i3 + 1, i4);
        } else {
            sVar.f5803b = vVar;
        }
    }
}
