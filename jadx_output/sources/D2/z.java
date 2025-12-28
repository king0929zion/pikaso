package D2;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import y2.G;
import y2.H;

/* loaded from: classes.dex */
public class z {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1093b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public G[] f1094a;

    public final void a(G g3) {
        g3.b((H) this);
        G[] gArr = this.f1094a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1093b;
        if (gArr == null) {
            gArr = new G[4];
            this.f1094a = gArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= gArr.length) {
            Object[] copyOf = Arrays.copyOf(gArr, atomicIntegerFieldUpdater.get(this) * 2);
            p2.g.d(copyOf, "copyOf(this, newSize)");
            gArr = (G[]) copyOf;
            this.f1094a = gArr;
        }
        int i3 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i3 + 1);
        gArr[i3] = g3;
        g3.f6757e = i3;
        c(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y2.G b(int r9) {
        /*
            r8 = this;
            y2.G[] r0 = r8.f1094a
            p2.g.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = D2.z.f1093b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            p2.g.b(r4)
            r5 = r0[r2]
            p2.g.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            y2.G[] r5 = r8.f1094a
            p2.g.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            p2.g.b(r6)
            r7 = r5[r4]
            p2.g.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            p2.g.b(r4)
            r5 = r5[r2]
            p2.g.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            p2.g.b(r9)
            r2 = 0
            r9.b(r2)
            r9.f6757e = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.z.b(int):y2.G");
    }

    public final void c(int i3) {
        while (i3 > 0) {
            G[] gArr = this.f1094a;
            p2.g.b(gArr);
            int i4 = (i3 - 1) / 2;
            G g3 = gArr[i4];
            p2.g.b(g3);
            G g4 = gArr[i3];
            p2.g.b(g4);
            if (g3.compareTo(g4) <= 0) {
                return;
            }
            d(i3, i4);
            i3 = i4;
        }
    }

    public final void d(int i3, int i4) {
        G[] gArr = this.f1094a;
        p2.g.b(gArr);
        G g3 = gArr[i4];
        p2.g.b(g3);
        G g4 = gArr[i3];
        p2.g.b(g4);
        gArr[i3] = g3;
        gArr[i4] = g4;
        g3.f6757e = i3;
        g4.f6757e = i4;
    }
}
