package z1;

import android.util.SparseArray;

/* renamed from: z1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723B {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f6946a;

    /* renamed from: b, reason: collision with root package name */
    public int f6947b;

    public final C0722A a(int i3) {
        SparseArray sparseArray = this.f6946a;
        C0722A c0722a = (C0722A) sparseArray.get(i3);
        if (c0722a != null) {
            return c0722a;
        }
        C0722A c0722a2 = new C0722A();
        sparseArray.put(i3, c0722a2);
        return c0722a2;
    }
}
