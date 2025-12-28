package o0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f5565a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o0.b1 a(o0.AbstractC0468a r6, D.AbstractC0058q r7, L.a r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = o0.AbstractC0493m0.f5610a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L41
            r0 = 6
            A2.b r0 = A2.i.a(r2, r1, r0)
            c2.k r2 = o0.W.f5514p
            java.lang.Object r2 = r2.getValue()
            g2.i r2 = (g2.InterfaceC0276i) r2
            D2.d r2 = y2.AbstractC0688v.a(r2)
            o0.l0 r4 = new o0.l0
            r4.<init>(r0, r3)
            r5 = 3
            y2.AbstractC0688v.l(r2, r3, r1, r4, r5)
            D.y r2 = new D.y
            r4 = 18
            r2.<init>(r4, r0)
            java.lang.Object r0 = N.o.f1756b
            monitor-enter(r0)
            java.lang.Object r4 = N.o.h     // Catch: java.lang.Throwable -> L3e
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r2 = d2.AbstractC0240k.h0(r4, r2)     // Catch: java.lang.Throwable -> L3e
            N.o.h = r2     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            N.o.a()
            goto L41
        L3e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L41:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L54
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof o0.C0507u
            if (r1 == 0) goto L52
            o0.u r0 = (o0.C0507u) r0
            goto L58
        L52:
            r0 = r3
            goto L58
        L54:
            r6.removeAllViews()
            goto L52
        L58:
            if (r0 != 0) goto L71
            o0.u r0 = new o0.u
            android.content.Context r1 = r6.getContext()
            r2 = r7
            D.v0 r2 = (D.v0) r2
            g2.i r2 = r2.f925t
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = o0.d1.f5565a
            r6.addView(r1, r2)
        L71:
            B0.a r6 = new B0.a
            n0.z r1 = r0.getRoot()
            r6.<init>(r1)
            D.t r1 = new D.t
            r1.<init>(r7, r6)
            android.view.View r6 = r0.getView()
            r2 = 2131231177(0x7f0801c9, float:1.8078428E38)
            java.lang.Object r6 = r6.getTag(r2)
            boolean r4 = r6 instanceof o0.b1
            if (r4 == 0) goto L91
            r3 = r6
            o0.b1 r3 = (o0.b1) r3
        L91:
            if (r3 != 0) goto L9f
            o0.b1 r3 = new o0.b1
            r3.<init>(r0, r1)
            android.view.View r6 = r0.getView()
            r6.setTag(r2, r3)
        L9f:
            r3.f(r8)
            g2.i r6 = r0.getCoroutineContext()
            D.v0 r7 = (D.v0) r7
            g2.i r7 = r7.f925t
            boolean r6 = p2.g.a(r6, r7)
            if (r6 != 0) goto Lb3
            r0.setCoroutineContext(r7)
        Lb3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.d1.a(o0.a, D.q, L.a):o0.b1");
    }
}
