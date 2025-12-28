package H;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1307f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1308g;

    public d(Object[] objArr, int i3, int i4) {
        super(i3, i4);
        this.f1308g = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1307f) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f1303d;
                this.f1303d = i3 + 1;
                return ((Object[]) this.f1308g)[i3];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f1303d++;
                return this.f1308g;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1307f) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f1303d - 1;
                this.f1303d = i3;
                return ((Object[]) this.f1308g)[i3];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f1303d--;
                return this.f1308g;
        }
    }

    public d(int i3, Object obj) {
        super(i3, 1);
        this.f1308g = obj;
    }
}
