package H;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: f, reason: collision with root package name */
    public final g f1324f;

    /* renamed from: g, reason: collision with root package name */
    public int f1325g;
    public k h;

    /* renamed from: i, reason: collision with root package name */
    public int f1326i;

    public i(g gVar, int i3) {
        super(i3, gVar.a());
        this.f1324f = gVar;
        this.f1325g = gVar.e();
        this.f1326i = -1;
        b();
    }

    public final void a() {
        if (this.f1325g != this.f1324f.e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // H.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i3 = this.f1303d;
        g gVar = this.f1324f;
        gVar.add(i3, obj);
        this.f1303d++;
        this.f1304e = gVar.a();
        this.f1325g = gVar.e();
        this.f1326i = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        g gVar = this.f1324f;
        Object[] objArr = gVar.f1319i;
        if (objArr == null) {
            this.h = null;
            return;
        }
        int i3 = (gVar.f1321k - 1) & (-32);
        int i4 = this.f1303d;
        if (i4 > i3) {
            i4 = i3;
        }
        int i5 = (gVar.f1318g / 5) + 1;
        k kVar = this.h;
        if (kVar == null) {
            this.h = new k(objArr, i4, i3, i5);
            return;
        }
        kVar.f1303d = i4;
        kVar.f1304e = i3;
        kVar.f1329f = i5;
        if (kVar.f1330g.length < i5) {
            kVar.f1330g = new Object[i5];
        }
        kVar.f1330g[0] = objArr;
        ?? r6 = i4 == i3 ? 1 : 0;
        kVar.h = r6;
        kVar.b(i4 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f1303d;
        this.f1326i = i3;
        k kVar = this.h;
        g gVar = this.f1324f;
        if (kVar == null) {
            Object[] objArr = gVar.f1320j;
            this.f1303d = i3 + 1;
            return objArr[i3];
        }
        if (kVar.hasNext()) {
            this.f1303d++;
            return kVar.next();
        }
        Object[] objArr2 = gVar.f1320j;
        int i4 = this.f1303d;
        this.f1303d = i4 + 1;
        return objArr2[i4 - kVar.f1304e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f1303d;
        this.f1326i = i3 - 1;
        k kVar = this.h;
        g gVar = this.f1324f;
        if (kVar == null) {
            Object[] objArr = gVar.f1320j;
            int i4 = i3 - 1;
            this.f1303d = i4;
            return objArr[i4];
        }
        int i5 = kVar.f1304e;
        if (i3 <= i5) {
            this.f1303d = i3 - 1;
            return kVar.previous();
        }
        Object[] objArr2 = gVar.f1320j;
        int i6 = i3 - 1;
        this.f1303d = i6;
        return objArr2[i6 - i5];
    }

    @Override // H.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i3 = this.f1326i;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f1324f;
        gVar.b(i3);
        int i4 = this.f1326i;
        if (i4 < this.f1303d) {
            this.f1303d = i4;
        }
        this.f1304e = gVar.a();
        this.f1325g = gVar.e();
        this.f1326i = -1;
        b();
    }

    @Override // H.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i3 = this.f1326i;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        g gVar = this.f1324f;
        gVar.set(i3, obj);
        this.f1325g = gVar.e();
        b();
    }
}
