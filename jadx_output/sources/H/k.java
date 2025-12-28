package H;

import a.AbstractC0090a;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: f, reason: collision with root package name */
    public int f1329f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f1330g;
    public boolean h;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i3, int i4, int i5) {
        super(i3, i4);
        this.f1329f = i5;
        Object[] objArr2 = new Object[i5];
        this.f1330g = objArr2;
        ?? r5 = i3 == i4 ? 1 : 0;
        this.h = r5;
        objArr2[0] = objArr;
        b(i3 - r5, 1);
    }

    public final Object a() {
        int i3 = this.f1303d & 31;
        Object obj = this.f1330g[this.f1329f - 1];
        p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i3];
    }

    public final void b(int i3, int i4) {
        int i5 = (this.f1329f - i4) * 5;
        while (i4 < this.f1329f) {
            Object[] objArr = this.f1330g;
            Object obj = objArr[i4 - 1];
            p2.g.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i4] = ((Object[]) obj)[AbstractC0090a.O(i3, i5)];
            i5 -= 5;
            i4++;
        }
    }

    public final void c(int i3) {
        int i4 = 0;
        while (AbstractC0090a.O(this.f1303d, i4) == i3) {
            i4 += 5;
        }
        if (i4 > 0) {
            b(this.f1303d, ((this.f1329f - 1) - (i4 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a3 = a();
        int i3 = this.f1303d + 1;
        this.f1303d = i3;
        if (i3 == this.f1304e) {
            this.h = true;
            return a3;
        }
        c(0);
        return a3;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f1303d--;
        if (this.h) {
            this.h = false;
            return a();
        }
        c(31);
        return a();
    }
}
