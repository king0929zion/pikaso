package a2;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* renamed from: a2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116o {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f2997a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final C0117p f2998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2999c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3000d;

    public C0116o(C0117p c0117p, B0.a aVar) {
        this.f2998b = c0117p;
        TypedArray typedArray = (TypedArray) aVar.f272c;
        this.f2999c = typedArray.getResourceId(28, 0);
        this.f3000d = typedArray.getResourceId(52, 0);
    }
}
