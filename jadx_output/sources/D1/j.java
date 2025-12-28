package D1;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j extends o {

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f985A = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: z, reason: collision with root package name */
    public final int f986z;

    public j(int i3) {
        this();
        this.f986z = i3;
    }

    public static void F(v vVar) {
        int visibility = vVar.f1029b.getVisibility();
        HashMap hashMap = vVar.f1028a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = vVar.f1029b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static D1.C H(D1.v r8, D1.v r9) {
        /*
            D1.C r0 = new D1.C
            r0.<init>()
            r1 = 0
            r0.f951a = r1
            r0.f952b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f1028a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f953c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f955e = r6
            goto L33
        L2f:
            r0.f953c = r3
            r0.f955e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f1028a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f954d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f956f = r2
            goto L56
        L52:
            r0.f954d = r3
            r0.f956f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f953c
            int r9 = r0.f954d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f955e
            android.view.ViewGroup r4 = r0.f956f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f952b = r1
            r0.f951a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f952b = r2
            r0.f951a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f956f
            if (r8 != 0) goto L81
            r0.f952b = r1
            r0.f951a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f955e
            if (r8 != 0) goto L9f
            r0.f952b = r2
            r0.f951a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f954d
            if (r8 != 0) goto L95
            r0.f952b = r2
            r0.f951a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f953c
            if (r8 != 0) goto L9f
            r0.f952b = r1
            r0.f951a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.j.H(D1.v, D1.v):D1.C");
    }

    public final ObjectAnimator G(View view, float f3, float f4) {
        int i3 = 0;
        if (f3 == f4) {
            return null;
        }
        x.f1035a.e0(view, f3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, x.f1036b, f4);
        ofFloat.addListener(new i(view));
        a(new h(i3, view));
        return ofFloat;
    }

    @Override // D1.o
    public final void c(v vVar) {
        F(vVar);
    }

    @Override // D1.o
    public final void f(v vVar) {
        F(vVar);
        vVar.f1028a.put("android:fade:transitionAlpha", Float.valueOf(x.f1035a.M(vVar.f1029b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (H(m(r3, false), p(r3, false)).f951a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f9  */
    @Override // D1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator j(android.view.ViewGroup r23, D1.v r24, D1.v r25) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.j.j(android.view.ViewGroup, D1.v, D1.v):android.animation.Animator");
    }

    @Override // D1.o
    public final String[] o() {
        return f985A;
    }

    @Override // D1.o
    public final boolean q(v vVar, v vVar2) {
        if (vVar == null && vVar2 == null) {
            return false;
        }
        if (vVar != null && vVar2 != null && vVar2.f1028a.containsKey("android:visibility:visibility") != vVar.f1028a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C H2 = H(vVar, vVar2);
        if (H2.f951a) {
            return H2.f953c == 0 || H2.f954d == 0;
        }
        return false;
    }

    public j() {
        this.f986z = 3;
    }
}
