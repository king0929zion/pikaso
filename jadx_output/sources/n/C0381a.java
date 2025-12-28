package n;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381a extends AbstractSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0386f f4974d;

    public C0381a(C0386f c0386f) {
        this.f4974d = c0386f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0384d(this.f4974d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4974d.f4970f;
    }
}
