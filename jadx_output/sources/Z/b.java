package Z;

import D.C0052n;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import c2.C0172k;
import c2.C0173l;
import c2.C0175n;
import c2.InterfaceC0165d;
import com.ai.assistance.operit.provider.R;
import d2.AbstractC0240k;
import d2.AbstractC0241l;
import d2.C0248s;
import g0.C0263a;
import g2.C0272e;
import g2.C0277j;
import g2.InterfaceC0271d;
import g2.InterfaceC0273f;
import g2.InterfaceC0276i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k.C0338u0;
import l1.C0362a;
import n0.AbstractC0419M;
import n0.C0444z;
import n0.Y;
import o0.S;
import v0.C0613B;
import v0.C0616a;
import z0.InterfaceC0721e;

/* loaded from: classes.dex */
public abstract class b {
    public static boolean A(EditText editText) {
        return editText.getInputType() != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC0165d B(o2.a aVar) {
        C0173l c0173l = C0173l.f3839a;
        C0175n c0175n = new C0175n();
        c0175n.f3841d = (p2.h) aVar;
        c0175n.f3842e = c0173l;
        return c0175n;
    }

    public static C0172k C(o2.a aVar) {
        p2.g.e(aVar, "initializer");
        return new C0172k(aVar);
    }

    public static List D(Object obj) {
        List singletonList = Collections.singletonList(obj);
        p2.g.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static void E(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float F(EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return j1.e.c(edgeEffect, f3, f4);
        }
        j1.d.a(edgeEffect, f3, f4);
        return f3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 v0.B, still in use, count: 2, list:
          (r2v0 v0.B) from 0x00d0: MOVE (r24v0 v0.B) = (r2v0 v0.B)
          (r2v0 v0.B) from 0x007f: MOVE (r24v2 v0.B) = (r2v0 v0.B)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final v0.C0613B K(v0.C0613B r26, G0.f r27) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.b.K(v0.B, G0.f):v0.B");
    }

    public static u2.b N(u2.d dVar) {
        p2.g.e(dVar, "<this>");
        return new u2.b(dVar.f6300d, dVar.f6301e, dVar.f6302f > 0 ? 2 : -2);
    }

    public static final String O(int i3, C0052n c0052n) {
        c0052n.k(S.f5493a);
        return ((Context) c0052n.k(S.f5494b)).getResources().getString(i3);
    }

    public static final double Q(long j3) {
        return ((j3 >>> 11) * 2048) + (j3 & 2047);
    }

    public static u2.d R(int i3, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new u2.d(i3, i4 - 1, 1);
        }
        u2.d dVar = u2.d.f6307g;
        return u2.d.f6307g;
    }

    public static final long a(int i3) {
        long j3 = (i3 << 32) | (0 & 4294967295L);
        int i4 = C0263a.f4323n;
        return j3;
    }

    public static C0616a b(String str, C0613B c0613b, long j3, G0.b bVar, InterfaceC0721e interfaceC0721e, int i3) {
        C0248s c0248s = C0248s.f4255d;
        return new C0616a(new C0.d(str, c0613b, c0248s, c0248s, interfaceC0721e, bVar), i3, false, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [d2.s] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean c(ArrayList arrayList) {
        ?? r02;
        long j3;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            r02 = C0248s.f4255d;
        } else {
            r02 = new ArrayList();
            Object obj = arrayList.get(0);
            int T2 = AbstractC0241l.T(arrayList);
            int i3 = 0;
            while (i3 < T2) {
                i3++;
                Object obj2 = arrayList.get(i3);
                t0.k kVar = (t0.k) obj2;
                t0.k kVar2 = (t0.k) obj;
                r02.add(new V.c(r2.a.f(Math.abs(V.c.b(kVar2.e().a()) - V.c.b(kVar.e().a())), Math.abs(V.c.c(kVar2.e().a()) - V.c.c(kVar.e().a())))));
                obj = obj2;
            }
        }
        if (r02.size() == 1) {
            j3 = ((V.c) AbstractC0240k.a0(r02)).f2444a;
        } else {
            if (r02.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object a02 = AbstractC0240k.a0(r02);
            int T3 = AbstractC0241l.T(r02);
            if (1 <= T3) {
                int i4 = 1;
                while (true) {
                    a02 = new V.c(V.c.f(((V.c) a02).f2444a, ((V.c) r02.get(i4)).f2444a));
                    if (i4 == T3) {
                        break;
                    }
                    i4++;
                }
            }
            j3 = ((V.c) a02).f2444a;
        }
        return V.c.c(j3) < V.c.b(j3);
    }

    public static final int d(float f3) {
        return Math.round((float) Math.ceil(f3));
    }

    public static void e(boolean z3, String str) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void f(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static double j(double d3, double d4, double d5) {
        if (d4 <= d5) {
            return d3 < d4 ? d4 : d3 > d5 ? d5 : d3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d5 + " is less than minimum " + d4 + '.');
    }

    public static int k(int i3, int i4, int i5) {
        if (i4 <= i5) {
            return i3 < i4 ? i4 : i3 > i5 ? i5 : i3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i5 + " is less than minimum " + i4 + '.');
    }

    public static int l(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o1.r m(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            o1.c r0 = new o1.c
            r1 = 22
            r0.<init>(r1)
            goto L15
        Le:
            X1.e r0 = new X1.e
            r1 = 22
            r0.<init>(r1)
        L15:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            g(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2e
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2e
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2e
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 != 0) goto L4f
        L4d:
            r1 = r5
            goto L7e
        L4f:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            android.content.pm.Signature[] r0 = r0.g(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
        L5d:
            if (r3 >= r6) goto L6b
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r3 = r3 + 1
            goto L5d
        L6b:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            a1.c r1 = new a1.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            goto L7e
        L77:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L4d
        L7e:
            if (r1 != 0) goto L81
            goto L8b
        L81:
            o1.r r5 = new o1.r
            o1.q r0 = new o1.q
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.b.m(android.content.Context):o1.r");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC0271d n(InterfaceC0271d interfaceC0271d, InterfaceC0271d interfaceC0271d2, o2.e eVar) {
        p2.g.e(eVar, "<this>");
        if (eVar instanceof i2.a) {
            return ((i2.a) eVar).f(interfaceC0271d2, interfaceC0271d);
        }
        InterfaceC0276i o3 = interfaceC0271d2.o();
        return o3 == C0277j.f4334d ? new h2.b(interfaceC0271d2, interfaceC0271d, eVar) : new h2.c(interfaceC0271d2, o3, eVar, interfaceC0271d);
    }

    public static final boolean o(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean p(int i3, int i4) {
        return i3 == i4;
    }

    public static float q(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return j1.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable r(Context context, int i3) {
        return C0338u0.b().c(context, i3);
    }

    public static Set s() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final Object u(t0.g gVar, t0.q qVar) {
        Object obj = gVar.f6230d.get(qVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static final C0362a v(View view) {
        C0362a c0362a = (C0362a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c0362a != null) {
            return c0362a;
        }
        C0362a c0362a2 = new C0362a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c0362a2);
        return c0362a2;
    }

    public static final AbstractC0419M w(AbstractC0419M abstractC0419M) {
        C0444z c0444z = abstractC0419M.f5168n.f5217n;
        while (true) {
            C0444z k3 = c0444z.k();
            C0444z c0444z2 = null;
            if ((k3 != null ? k3.f5302f : null) == null) {
                AbstractC0419M o02 = ((Y) c0444z.f5319x.f855d).o0();
                p2.g.b(o02);
                return o02;
            }
            C0444z k4 = c0444z.k();
            if (k4 != null) {
                c0444z2 = k4.f5302f;
            }
            p2.g.b(c0444z2);
            C0444z k5 = c0444z.k();
            p2.g.b(k5);
            c0444z = k5.f5302f;
            p2.g.b(c0444z);
        }
    }

    public static InterfaceC0271d z(InterfaceC0271d interfaceC0271d) {
        p2.g.e(interfaceC0271d, "<this>");
        i2.c cVar = interfaceC0271d instanceof i2.c ? (i2.c) interfaceC0271d : null;
        if (cVar == null) {
            return interfaceC0271d;
        }
        InterfaceC0271d interfaceC0271d2 = cVar.f4462f;
        if (interfaceC0271d2 != null) {
            return interfaceC0271d2;
        }
        InterfaceC0273f interfaceC0273f = (InterfaceC0273f) cVar.o().n(C0272e.f4333d);
        InterfaceC0271d gVar = interfaceC0273f != null ? new D2.g((y2.r) interfaceC0273f, cVar) : cVar;
        cVar.f4462f = gVar;
        return gVar;
    }

    public void G(View view, int i3) {
    }

    public abstract void H(int i3);

    public abstract void I(View view, int i3, int i4);

    public abstract void J(View view, float f3, float f4);

    public abstract void L(boolean z3);

    public abstract void M(boolean z3);

    public abstract boolean P(View view, int i3);

    public abstract int h(View view, int i3);

    public abstract int i(View view, int i3);

    public abstract InputFilter[] t(InputFilter[] inputFilterArr);

    public int x(View view) {
        return 0;
    }

    public int y() {
        return 0;
    }
}
