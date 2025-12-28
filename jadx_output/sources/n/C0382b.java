package n;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382b implements Iterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public int f4975d;

    /* renamed from: e, reason: collision with root package name */
    public int f4976e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4978g;
    public final /* synthetic */ Object h;

    public C0382b(int i3) {
        this.f4975d = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4976e < this.f4975d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f3;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f4976e;
        switch (this.f4978g) {
            case 0:
                f3 = ((C0386f) this.h).f(i3);
                break;
            case 1:
                f3 = ((C0386f) this.h).i(i3);
                break;
            default:
                f3 = ((C0387g) this.h).f4988e[i3];
                break;
        }
        this.f4976e++;
        this.f4977f = true;
        return f3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4977f) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i3 = this.f4976e - 1;
        this.f4976e = i3;
        switch (this.f4978g) {
            case 0:
                ((C0386f) this.h).g(i3);
                break;
            case 1:
                ((C0386f) this.h).g(i3);
                break;
            default:
                ((C0387g) this.h).a(i3);
                break;
        }
        this.f4975d--;
        this.f4977f = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0382b(C0387g c0387g) {
        this(c0387g.f4989f);
        this.f4978g = 2;
        this.h = c0387g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0382b(C0386f c0386f, int i3) {
        this(c0386f.f4970f);
        this.f4978g = i3;
        switch (i3) {
            case 1:
                this.h = c0386f;
                this(c0386f.f4970f);
                break;
            default:
                this.h = c0386f;
                break;
        }
    }
}
