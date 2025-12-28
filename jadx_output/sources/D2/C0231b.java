package d2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0231b implements Iterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4245d;

    /* renamed from: e, reason: collision with root package name */
    public int f4246e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4247f;

    public /* synthetic */ C0231b(int i3, Object obj) {
        this.f4245d = i3;
        this.f4247f = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4245d) {
            case 0:
                if (this.f4246e < ((AbstractC0233d) this.f4247f).a()) {
                }
                break;
            default:
                if (this.f4246e < ((Object[]) this.f4247f).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4245d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f4246e;
                this.f4246e = i3 + 1;
                return ((AbstractC0233d) this.f4247f).get(i3);
            default:
                try {
                    Object[] objArr = (Object[]) this.f4247f;
                    int i4 = this.f4246e;
                    this.f4246e = i4 + 1;
                    return objArr[i4];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f4246e--;
                    throw new NoSuchElementException(e3.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4245d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
