package p1;

import X1.e;
import java.nio.ByteBuffer;

/* renamed from: p1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0547c {

    /* renamed from: a, reason: collision with root package name */
    public int f5939a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f5940b;

    /* renamed from: c, reason: collision with root package name */
    public int f5941c;

    /* renamed from: d, reason: collision with root package name */
    public int f5942d;

    public AbstractC0547c() {
        if (e.f2667e == null) {
            e.f2667e = new e(26);
        }
    }

    public final int a(int i3) {
        if (i3 < this.f5942d) {
            return this.f5940b.getShort(this.f5941c + i3);
        }
        return 0;
    }
}
