package o0;

import java.util.ArrayList;

/* renamed from: o0.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518z0 implements n0.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f5758d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5759e;

    public C0518z0(int i3, ArrayList arrayList) {
        this.f5758d = i3;
        this.f5759e = arrayList;
    }

    @Override // n0.f0
    public final boolean w() {
        return this.f5759e.contains(this);
    }
}
