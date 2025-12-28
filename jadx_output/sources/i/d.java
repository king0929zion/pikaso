package I;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d implements Iterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final o[] f1363d;

    /* renamed from: e, reason: collision with root package name */
    public int f1364e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1365f = true;

    public d(n nVar, o[] oVarArr) {
        this.f1363d = oVarArr;
        oVarArr[0].a(nVar.f1384d, Integer.bitCount(nVar.f1381a) * 2, 0);
        this.f1364e = 0;
        a();
    }

    public final void a() {
        int i3 = this.f1364e;
        o[] oVarArr = this.f1363d;
        o oVar = oVarArr[i3];
        if (oVar.f1387f < oVar.f1386e) {
            return;
        }
        while (-1 < i3) {
            int b3 = b(i3);
            if (b3 == -1) {
                o oVar2 = oVarArr[i3];
                int i4 = oVar2.f1387f;
                Object[] objArr = oVar2.f1385d;
                if (i4 < objArr.length) {
                    int length = objArr.length;
                    oVar2.f1387f = i4 + 1;
                    b3 = b(i3);
                }
            }
            if (b3 != -1) {
                this.f1364e = b3;
                return;
            }
            if (i3 > 0) {
                o oVar3 = oVarArr[i3 - 1];
                int i5 = oVar3.f1387f;
                int length2 = oVar3.f1385d.length;
                oVar3.f1387f = i5 + 1;
            }
            oVarArr[i3].a(n.f1380e.f1384d, 0, 0);
            i3--;
        }
        this.f1365f = false;
    }

    public final int b(int i3) {
        o[] oVarArr = this.f1363d;
        o oVar = oVarArr[i3];
        int i4 = oVar.f1387f;
        if (i4 < oVar.f1386e) {
            return i3;
        }
        Object[] objArr = oVar.f1385d;
        if (i4 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i4];
        p2.g.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        n nVar = (n) obj;
        if (i3 == 6) {
            o oVar2 = oVarArr[i3 + 1];
            Object[] objArr2 = nVar.f1384d;
            oVar2.a(objArr2, objArr2.length, 0);
        } else {
            oVarArr[i3 + 1].a(nVar.f1384d, Integer.bitCount(nVar.f1381a) * 2, 0);
        }
        return b(i3 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1365f;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f1365f) {
            throw new NoSuchElementException();
        }
        Object next = this.f1363d[this.f1364e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
