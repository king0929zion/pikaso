package R;

import a.AbstractC0090a;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import java.util.List;
import java.util.function.Consumer;
import o0.B0;
import p2.g;
import t0.k;
import t0.n;
import v0.C0618c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2201a = new c();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        r0 = r0.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r0 = r0.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(R.e r5, android.util.LongSparseArray r6) {
        /*
            r0 = 0
        L1:
            int r1 = r6.size()
            if (r0 >= r1) goto L5d
            int r1 = r0 + 1
            long r2 = r6.keyAt(r0)
            java.lang.Object r0 = r6.get(r2)
            android.view.translation.ViewTranslationResponse r0 = M1.a.m(r0)
            if (r0 == 0) goto L5b
            android.view.translation.TranslationResponseValue r0 = M1.a.j(r0)
            if (r0 == 0) goto L5b
            java.lang.CharSequence r0 = M1.a.n(r0)
            if (r0 == 0) goto L5b
            n.r r4 = r5.g()
            int r2 = (int) r2
            java.lang.Object r2 = r4.f(r2)
            o0.B0 r2 = (o0.B0) r2
            if (r2 == 0) goto L5b
            t0.k r2 = r2.f5378a
            if (r2 == 0) goto L5b
            t0.q r3 = t0.f.f6213i
            t0.g r2 = r2.f6239d
            java.util.LinkedHashMap r2 = r2.f6230d
            java.lang.Object r2 = r2.get(r3)
            r3 = 0
            if (r2 != 0) goto L42
            r2 = r3
        L42:
            t0.a r2 = (t0.C0599a) r2
            if (r2 == 0) goto L5b
            c2.c r2 = r2.f6199b
            o2.c r2 = (o2.c) r2
            if (r2 == 0) goto L5b
            v0.c r4 = new v0.c
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r3, r3, r3)
            java.lang.Object r0 = r2.i(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L5b:
            r0 = r1
            goto L1
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R.c.a(R.e, android.util.LongSparseArray):void");
    }

    public final void b(e eVar, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        k kVar;
        String A3;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j3 : jArr) {
            B0 b02 = (B0) eVar.g().f((int) j3);
            if (b02 != null && (kVar = b02.f5378a) != null) {
                M1.a.o();
                ViewTranslationRequest.Builder k3 = M1.a.k(eVar.f2206d.getAutofillId(), kVar.f6242g);
                Object obj = kVar.f6239d.f6230d.get(n.f6275s);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                if (list != null && (A3 = AbstractC0090a.A(list, "\n")) != null) {
                    forText = TranslationRequestValue.forText(new C0618c(A3, null, null, null));
                    k3.setValue("android:text", forText);
                    build = k3.build();
                    consumer.accept(build);
                }
            }
        }
    }

    public final void c(e eVar, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (g.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(eVar, longSparseArray);
        } else {
            eVar.f2206d.post(new b(eVar, 0, longSparseArray));
        }
    }
}
