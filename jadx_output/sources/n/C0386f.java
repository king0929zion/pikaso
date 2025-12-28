package n;

import d2.AbstractC0239j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386f extends C0379F implements Map {

    /* renamed from: g, reason: collision with root package name */
    public C0381a f4985g;
    public C0383c h;

    /* renamed from: i, reason: collision with root package name */
    public C0385e f4986i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0386f(C0379F c0379f) {
        super(0);
        int i3 = c0379f.f4970f;
        b(this.f4970f + i3);
        if (this.f4970f != 0) {
            for (int i4 = 0; i4 < i3; i4++) {
                put(c0379f.f(i4), c0379f.i(i4));
            }
        } else if (i3 > 0) {
            AbstractC0239j.X(0, 0, i3, c0379f.f4968d, this.f4968d);
            AbstractC0239j.Y(c0379f.f4969e, this.f4969e, 0, 0, i3 << 1);
            this.f4970f = i3;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0381a c0381a = this.f4985g;
        if (c0381a != null) {
            return c0381a;
        }
        C0381a c0381a2 = new C0381a(this);
        this.f4985g = c0381a2;
        return c0381a2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i3 = this.f4970f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i3 != this.f4970f;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0383c c0383c = this.h;
        if (c0383c != null) {
            return c0383c;
        }
        C0383c c0383c2 = new C0383c(this);
        this.h = c0383c2;
        return c0383c2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f4970f);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0385e c0385e = this.f4986i;
        if (c0385e != null) {
            return c0385e;
        }
        C0385e c0385e2 = new C0385e(this);
        this.f4986i = c0385e2;
        return c0385e2;
    }
}
