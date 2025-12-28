package d2;

import java.util.AbstractList;
import java.util.List;

/* renamed from: d2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0235f extends AbstractList implements List, q2.c {
    public abstract int a();

    public abstract Object b(int i3);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i3) {
        return b(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
