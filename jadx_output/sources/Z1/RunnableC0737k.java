package z1;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: z1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0737k implements Runnable {
    public static final ThreadLocal h = new ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public static final L0.g f7056i = new L0.g(4);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f7057d;

    /* renamed from: e, reason: collision with root package name */
    public long f7058e;

    /* renamed from: f, reason: collision with root package name */
    public long f7059f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f7060g;

    public final void a(RecyclerView recyclerView, int i3, int i4) {
        if (recyclerView.f3553p && this.f7058e == 0) {
            this.f7058e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        S1.m mVar = recyclerView.f3532a0;
        mVar.f2320a = i3;
        mVar.f2321b = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        r9 = r5.f3535d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00aa, code lost:
    
        r5.f3509A++;
        r9.g(r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
    
        if (r1.f() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bd, code lost:
    
        if (r1.g() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bf, code lost:
    
        r9.e(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c8, code lost:
    
        r5.v(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        r9.a(null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c3, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
    
        r5.v(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
    
        throw r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            java.util.ArrayList r2 = r12.f7057d
            int r3 = r2.size()
            r4 = r0
            r5 = r4
        La:
            if (r4 >= r3) goto L23
            java.lang.Object r6 = r2.get(r4)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            int r7 = r6.getWindowVisibility()
            if (r7 != 0) goto L20
            S1.m r7 = r6.f3532a0
            r7.a(r6, r0)
            int r6 = r7.f2322c
            int r5 = r5 + r6
        L20:
            int r4 = r4 + 1
            goto La
        L23:
            java.util.ArrayList r4 = r12.f7060g
            r4.ensureCapacity(r5)
            r5 = r0
        L29:
            if (r5 >= r3) goto L63
            java.lang.Object r6 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            int r7 = r6.getWindowVisibility()
            if (r7 == 0) goto L38
            goto L60
        L38:
            S1.m r6 = r6.f3532a0
            int r7 = r6.f2320a
            java.lang.Math.abs(r7)
            int r7 = r6.f2321b
            java.lang.Math.abs(r7)
            int r6 = r6.f2322c
            int r6 = r6 * 2
            if (r6 <= 0) goto L60
            int r13 = r4.size()
            if (r13 > 0) goto L59
            z1.j r13 = new z1.j
            r13.<init>()
            r4.add(r13)
            goto L5f
        L59:
            java.lang.Object r13 = r4.get(r0)
            z1.j r13 = (z1.C0736j) r13
        L5f:
            throw r1
        L60:
            int r5 = r5 + 1
            goto L29
        L63:
            L0.g r2 = z1.RunnableC0737k.f7056i
            java.util.Collections.sort(r4, r2)
            r2 = r0
        L69:
            int r3 = r4.size()
            if (r2 >= r3) goto Ldc
            java.lang.Object r3 = r4.get(r2)
            z1.j r3 = (z1.C0736j) r3
            androidx.recyclerview.widget.RecyclerView r5 = r3.f7054d
            if (r5 != 0) goto L7a
            goto Ldc
        L7a:
            boolean r6 = r3.f7051a
            if (r6 == 0) goto L84
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L85
        L84:
            r6 = r13
        L85:
            int r8 = r3.f7055e
            B0.a r9 = r5.f3541g
            int r9 = r9.t()
            r10 = r0
        L8e:
            if (r10 >= r9) goto La8
            B0.a r11 = r5.f3541g
            android.view.View r11 = r11.s(r10)
            androidx.recyclerview.widget.RecyclerView.r(r11)
            r1.getClass()
            if (r8 != 0) goto La5
            boolean r11 = r1.g()
            if (r11 != 0) goto La5
            goto Lcb
        La5:
            int r10 = r10 + 1
            goto L8e
        La8:
            z1.C r9 = r5.f3535d
            int r10 = r5.f3509A     // Catch: java.lang.Throwable -> Lc3
            int r10 = r10 + 1
            r5.f3509A = r10     // Catch: java.lang.Throwable -> Lc3
            r9.g(r6, r8)     // Catch: java.lang.Throwable -> Lc3
            boolean r6 = r1.f()     // Catch: java.lang.Throwable -> Lc3
            if (r6 == 0) goto Lc5
            boolean r6 = r1.g()     // Catch: java.lang.Throwable -> Lc3
            if (r6 != 0) goto Lc5
            r9.e(r1)     // Catch: java.lang.Throwable -> Lc3
            goto Lc8
        Lc3:
            r13 = move-exception
            goto Ld8
        Lc5:
            r9.a(r1, r0)     // Catch: java.lang.Throwable -> Lc3
        Lc8:
            r5.v(r0)
        Lcb:
            r3.f7051a = r0
            r3.f7052b = r0
            r3.f7053c = r0
            r3.f7054d = r1
            r3.f7055e = r0
            int r2 = r2 + 1
            goto L69
        Ld8:
            r5.v(r0)
            throw r13
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.RunnableC0737k.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i3 = Z0.e.f2904a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f7057d;
            if (arrayList.isEmpty()) {
                this.f7058e = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                if (recyclerView.getWindowVisibility() == 0) {
                    j3 = Math.max(recyclerView.getDrawingTime(), j3);
                }
            }
            if (j3 == 0) {
                this.f7058e = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f7059f);
                this.f7058e = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f7058e = 0L;
            int i5 = Z0.e.f2904a;
            Trace.endSection();
            throw th;
        }
    }
}
