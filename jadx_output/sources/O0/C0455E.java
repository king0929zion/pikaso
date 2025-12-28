package o0;

import a.AbstractC0090a;
import a2.ViewOnAttachStateChangeListenerC0115n;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import c2.C0174m;
import com.ai.assistance.operit.provider.R;
import d1.C0205b;
import d2.AbstractC0239j;
import d2.AbstractC0240k;
import d2.AbstractC0241l;
import d2.C0248s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import n.AbstractC0389i;
import n.AbstractC0390j;
import n.AbstractC0391k;
import n.C0380G;
import n.C0387g;
import n.C0396p;
import n.C0397q;
import n.C0398r;
import n.C0399s;
import n0.C0444z;
import n1.C0445a;
import t0.C0599a;
import u0.EnumC0604a;
import v0.C0612A;
import v0.C0618c;

/* renamed from: o0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455E extends C0205b {

    /* renamed from: L, reason: collision with root package name */
    public static final C0397q f5386L;

    /* renamed from: A, reason: collision with root package name */
    public final C0396p f5387A;

    /* renamed from: B, reason: collision with root package name */
    public final C0396p f5388B;

    /* renamed from: C, reason: collision with root package name */
    public final String f5389C;

    /* renamed from: D, reason: collision with root package name */
    public final String f5390D;

    /* renamed from: E, reason: collision with root package name */
    public final B0.a f5391E;

    /* renamed from: F, reason: collision with root package name */
    public final C0398r f5392F;

    /* renamed from: G, reason: collision with root package name */
    public A0 f5393G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f5394H;

    /* renamed from: I, reason: collision with root package name */
    public final R.a f5395I;

    /* renamed from: J, reason: collision with root package name */
    public final ArrayList f5396J;

    /* renamed from: K, reason: collision with root package name */
    public final C0453C f5397K;

    /* renamed from: d, reason: collision with root package name */
    public final C0507u f5398d;

    /* renamed from: e, reason: collision with root package name */
    public int f5399e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public final C0453C f5400f = new C0453C(this, 0);

    /* renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f5401g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public final AccessibilityManagerAccessibilityStateChangeListenerC0509v f5402i;

    /* renamed from: j, reason: collision with root package name */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC0511w f5403j;

    /* renamed from: k, reason: collision with root package name */
    public List f5404k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f5405l;

    /* renamed from: m, reason: collision with root package name */
    public final C0445a f5406m;

    /* renamed from: n, reason: collision with root package name */
    public int f5407n;

    /* renamed from: o, reason: collision with root package name */
    public final C0398r f5408o;

    /* renamed from: p, reason: collision with root package name */
    public final C0398r f5409p;

    /* renamed from: q, reason: collision with root package name */
    public final C0380G f5410q;

    /* renamed from: r, reason: collision with root package name */
    public final C0380G f5411r;

    /* renamed from: s, reason: collision with root package name */
    public int f5412s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f5413t;

    /* renamed from: u, reason: collision with root package name */
    public final C0387g f5414u;

    /* renamed from: v, reason: collision with root package name */
    public final A2.b f5415v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5416w;

    /* renamed from: x, reason: collision with root package name */
    public C0451A f5417x;

    /* renamed from: y, reason: collision with root package name */
    public C0398r f5418y;

    /* renamed from: z, reason: collision with root package name */
    public final C0399s f5419z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i3 = AbstractC0389i.f4991a;
        C0397q c0397q = new C0397q(32);
        int i4 = c0397q.f5015b;
        if (i4 < 0) {
            throw new IndexOutOfBoundsException("Index " + i4 + " must be in 0.." + c0397q.f5015b);
        }
        int i5 = i4 + 32;
        int[] iArr2 = c0397q.f5014a;
        if (iArr2.length < i5) {
            int[] copyOf = Arrays.copyOf(iArr2, Math.max(i5, (iArr2.length * 3) / 2));
            p2.g.d(copyOf, "copyOf(this, newSize)");
            c0397q.f5014a = copyOf;
        }
        int[] iArr3 = c0397q.f5014a;
        int i6 = c0397q.f5015b;
        if (i4 != i6) {
            AbstractC0239j.X(i5, i4, i6, iArr3, iArr3);
        }
        AbstractC0239j.Z(i4, 0, 12, iArr, iArr3);
        c0397q.f5015b += 32;
        f5386L = c0397q;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [o0.v] */
    /* JADX WARN: Type inference failed for: r2v5, types: [o0.w] */
    public C0455E(C0507u c0507u) {
        this.f5398d = c0507u;
        Object systemService = c0507u.getContext().getSystemService("accessibility");
        p2.g.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f5401g = accessibilityManager;
        this.h = 100L;
        this.f5402i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: o0.v
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z3) {
                C0455E c0455e = C0455E.this;
                c0455e.f5404k = z3 ? c0455e.f5401g.getEnabledAccessibilityServiceList(-1) : C0248s.f4255d;
            }
        };
        this.f5403j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: o0.w
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z3) {
                C0455E c0455e = C0455E.this;
                c0455e.f5404k = c0455e.f5401g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f5404k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f5405l = new Handler(Looper.getMainLooper());
        this.f5406m = new C0445a(this, 1);
        this.f5407n = Integer.MIN_VALUE;
        this.f5408o = new C0398r();
        this.f5409p = new C0398r();
        this.f5410q = new C0380G(0);
        this.f5411r = new C0380G(0);
        this.f5412s = -1;
        this.f5414u = new C0387g(0);
        this.f5415v = A2.i.a(1, 0, 6);
        this.f5416w = true;
        C0398r c0398r = AbstractC0390j.f4992a;
        p2.g.c(c0398r, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f5418y = c0398r;
        this.f5419z = new C0399s();
        this.f5387A = new C0396p();
        this.f5388B = new C0396p();
        this.f5389C = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f5390D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f5391E = new B0.a(2);
        this.f5392F = new C0398r();
        t0.k a3 = c0507u.getSemanticsOwner().a();
        p2.g.c(c0398r, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f5393G = new A0(a3, c0398r);
        c0507u.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0115n(3, this));
        this.f5395I = new R.a(11, this);
        this.f5396J = new ArrayList();
        this.f5397K = new C0453C(this, 1);
    }

    public static /* synthetic */ void H(C0455E c0455e, int i3, int i4, Integer num, int i5) {
        if ((i5 & 4) != 0) {
            num = null;
        }
        c0455e.G(i3, i4, num, null);
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i3 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i3 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i3);
                p2.g.c(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    /* JADX WARN: Finally extract failed */
    public static final e1.j j(C0455E c0455e, int i3) {
        androidx.lifecycle.t c3;
        C0507u c0507u = c0455e.f5398d;
        Trace.beginSection("checkIfDestroyed");
        try {
            C0490l viewTreeOwners = c0507u.getViewTreeOwners();
            if (((viewTreeOwners == null || (c3 = viewTreeOwners.f5600a.c()) == null) ? null : c3.f3484c) == androidx.lifecycle.m.f3474d) {
                return null;
            }
            Trace.endSection();
            Trace.beginSection("createAccessibilityNodeInfoObject");
            try {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
                e1.j jVar = new e1.j(obtain);
                Trace.endSection();
                Trace.beginSection("calculateNodeWithAdjustedBounds");
                try {
                    B0 b02 = (B0) c0455e.u().f(i3);
                    if (b02 == null) {
                        return null;
                    }
                    Trace.beginSection("setParentForAccessibility");
                    int i4 = -1;
                    t0.k kVar = b02.f5378a;
                    try {
                        if (i3 == -1) {
                            Object parentForAccessibility = c0507u.getParentForAccessibility();
                            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                            jVar.f4279b = -1;
                            obtain.setParent(view);
                        } else {
                            t0.k j3 = kVar.j();
                            Integer valueOf = j3 != null ? Integer.valueOf(j3.f6242g) : null;
                            if (valueOf == null) {
                                Z0.d.T("semanticsNode " + i3 + " has null parent");
                                throw null;
                            }
                            int intValue = valueOf.intValue();
                            if (intValue != c0507u.getSemanticsOwner().a().f6242g) {
                                i4 = intValue;
                            }
                            jVar.f4279b = i4;
                            obtain.setParent(c0507u, i4);
                        }
                        Trace.endSection();
                        jVar.f4280c = i3;
                        obtain.setSource(c0507u, i3);
                        Trace.beginSection("setBoundsInScreen");
                        try {
                            obtain.setBoundsInScreen(c0455e.l(b02));
                            Trace.endSection();
                            Trace.beginSection("populateAccessibilityNodeInfoProperties");
                            try {
                                c0455e.C(i3, jVar, kVar);
                                return jVar;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean v(t0.k kVar) {
        Object obj = kVar.f6239d.f6230d.get(t0.n.f6281y);
        if (obj == null) {
            obj = null;
        }
        EnumC0604a enumC0604a = (EnumC0604a) obj;
        t0.q qVar = t0.n.f6273q;
        LinkedHashMap linkedHashMap = kVar.f6239d.f6230d;
        Object obj2 = linkedHashMap.get(qVar);
        if (obj2 == null) {
            obj2 = null;
        }
        t0.e eVar = (t0.e) obj2;
        boolean z3 = enumC0604a != null;
        Object obj3 = linkedHashMap.get(t0.n.f6280x);
        if (((Boolean) (obj3 != null ? obj3 : null)) != null) {
            return eVar != null ? t0.e.a(eVar.f6205a, 4) : false ? z3 : true;
        }
        return z3;
    }

    public static C0618c x(t0.k kVar) {
        Object obj = kVar.f6239d.f6230d.get(t0.n.f6278v);
        if (obj == null) {
            obj = null;
        }
        C0618c c0618c = (C0618c) obj;
        Object obj2 = kVar.f6239d.f6230d.get(t0.n.f6275s);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        return c0618c == null ? list != null ? (C0618c) AbstractC0240k.b0(list) : null : c0618c;
    }

    public static String y(t0.k kVar) {
        C0618c c0618c;
        if (kVar == null) {
            return null;
        }
        t0.q qVar = t0.n.f6258a;
        t0.g gVar = kVar.f6239d;
        LinkedHashMap linkedHashMap = gVar.f6230d;
        if (linkedHashMap.containsKey(qVar)) {
            return AbstractC0090a.A((List) gVar.a(qVar), ",");
        }
        t0.q qVar2 = t0.n.f6278v;
        if (linkedHashMap.containsKey(qVar2)) {
            Object obj = linkedHashMap.get(qVar2);
            if (obj == null) {
                obj = null;
            }
            C0618c c0618c2 = (C0618c) obj;
            if (c0618c2 != null) {
                return c0618c2.f6334d;
            }
            return null;
        }
        Object obj2 = linkedHashMap.get(t0.n.f6275s);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list == null || (c0618c = (C0618c) AbstractC0240k.b0(list)) == null) {
            return null;
        }
        return c0618c.f6334d;
    }

    public final boolean A(t0.k kVar) {
        Object obj = kVar.f6239d.f6230d.get(t0.n.f6258a);
        if (obj == null) {
            obj = null;
        }
        List list = (List) obj;
        boolean z3 = ((list != null ? (String) AbstractC0240k.b0(list) : null) == null && x(kVar) == null && w(kVar) == null && !v(kVar)) ? false : true;
        if (kVar.f6239d.f6231e) {
            return true;
        }
        return kVar.m() && z3;
    }

    public final void B(C0444z c0444z) {
        if (this.f5414u.add(c0444z)) {
            this.f5415v.c(C0174m.f3840a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:366:0x06d6, code lost:
    
        if (p2.g.a(r3, java.lang.Boolean.TRUE) == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x06d8, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0712, code lost:
    
        if (r3 == false) goto L367;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0ad4  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:565:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0afe  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [d2.s] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(int r31, e1.j r32, t0.k r33) {
        /*
            Method dump skipped, instructions count: 2820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0455E.C(int, e1.j, t0.k):void");
    }

    public final int D(int i3) {
        if (i3 == this.f5398d.getSemanticsOwner().a().f6242g) {
            return -1;
        }
        return i3;
    }

    public final void E(t0.k kVar, A0 a02) {
        int[] iArr = AbstractC0391k.f4993a;
        C0399s c0399s = new C0399s();
        List h = t0.k.h(kVar, true, 4);
        int size = h.size();
        int i3 = 0;
        while (true) {
            C0444z c0444z = kVar.f6238c;
            if (i3 >= size) {
                C0399s c0399s2 = a02.f5372b;
                int[] iArr2 = c0399s2.f5023b;
                long[] jArr = c0399s2.f5022a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j3 & 255) < 128 && !c0399s.c(iArr2[(i4 << 3) + i6])) {
                                    B(c0444z);
                                    return;
                                }
                                j3 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                List h3 = t0.k.h(kVar, true, 4);
                int size2 = h3.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    t0.k kVar2 = (t0.k) h3.get(i7);
                    if (u().b(kVar2.f6242g)) {
                        Object f3 = this.f5392F.f(kVar2.f6242g);
                        p2.g.b(f3);
                        E(kVar2, (A0) f3);
                    }
                }
                return;
            }
            t0.k kVar3 = (t0.k) h.get(i3);
            if (u().b(kVar3.f6242g)) {
                C0399s c0399s3 = a02.f5372b;
                int i8 = kVar3.f6242g;
                if (!c0399s3.c(i8)) {
                    B(c0444z);
                    return;
                }
                c0399s.a(i8);
            }
            i3++;
        }
    }

    public final boolean F(AccessibilityEvent accessibilityEvent) {
        if (!z()) {
            return false;
        }
        if (accessibilityEvent.getEventType() != 2048) {
            accessibilityEvent.getEventType();
        }
        return ((Boolean) this.f5400f.i(accessibilityEvent)).booleanValue();
    }

    public final boolean G(int i3, int i4, Integer num, List list) {
        if (i3 == Integer.MIN_VALUE || !z()) {
            return false;
        }
        AccessibilityEvent p3 = p(i3, i4);
        if (num != null) {
            p3.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            p3.setContentDescription(AbstractC0090a.A(list, ","));
        }
        Trace.beginSection("sendEvent");
        try {
            return F(p3);
        } finally {
            Trace.endSection();
        }
    }

    public final void I(int i3, int i4, String str) {
        AccessibilityEvent p3 = p(D(i3), 32);
        p3.setContentChangeTypes(i4);
        if (str != null) {
            p3.getText().add(str);
        }
        F(p3);
    }

    public final void J(int i3) {
        C0451A c0451a = this.f5417x;
        if (c0451a != null) {
            t0.k kVar = c0451a.f5365a;
            if (i3 != kVar.f6242g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0451a.f5370f <= 1000) {
                AccessibilityEvent p3 = p(D(kVar.f6242g), 131072);
                p3.setFromIndex(c0451a.f5368d);
                p3.setToIndex(c0451a.f5369e);
                p3.setAction(c0451a.f5366b);
                p3.setMovementGranularity(c0451a.f5367c);
                p3.getText().add(y(kVar));
                F(p3);
            }
        }
        this.f5417x = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x05d9, code lost:
    
        if (r2 != null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x05de, code lost:
    
        if (r2 == null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0547, code lost:
    
        if (r2.containsAll(r3) != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x054a, code lost:
    
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x05e1, code lost:
    
        if (r1 != false) goto L227;
     */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(n.C0398r r40) {
        /*
            Method dump skipped, instructions count: 1664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0455E.K(n.r):void");
    }

    public final void L(C0444z c0444z, C0399s c0399s) {
        t0.g i3;
        if (c0444z.u() && !this.f5398d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c0444z)) {
            C0387g c0387g = this.f5414u;
            int i4 = c0387g.f4989f;
            for (int i5 = 0; i5 < i4; i5++) {
                if (AbstractC0461K.h((C0444z) c0387g.f4988e[i5], c0444z)) {
                    return;
                }
            }
            Trace.beginSection("GetSemanticsNode");
            try {
                C0444z c0444z2 = null;
                if (!c0444z.f5319x.f(8)) {
                    c0444z = c0444z.k();
                    while (true) {
                        if (c0444z == null) {
                            c0444z = null;
                            break;
                        } else if (c0444z.f5319x.f(8)) {
                            break;
                        } else {
                            c0444z = c0444z.k();
                        }
                    }
                }
                if (c0444z != null && (i3 = c0444z.i()) != null) {
                    if (!i3.f6231e) {
                        C0444z k3 = c0444z.k();
                        while (true) {
                            if (k3 == null) {
                                break;
                            }
                            t0.g i6 = k3.i();
                            if (i6 != null && i6.f6231e) {
                                c0444z2 = k3;
                                break;
                            }
                            k3 = k3.k();
                        }
                        if (c0444z2 != null) {
                            c0444z = c0444z2;
                        }
                    }
                    int i7 = c0444z.f5301e;
                    Trace.endSection();
                    if (c0399s.a(i7)) {
                        H(this, D(i7), 2048, 1, 8);
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final boolean M(t0.k kVar, int i3, int i4, boolean z3) {
        String y3;
        t0.g gVar = kVar.f6239d;
        t0.q qVar = t0.f.f6212g;
        if (gVar.f6230d.containsKey(qVar) && AbstractC0461K.a(kVar)) {
            o2.f fVar = (o2.f) ((C0599a) kVar.f6239d.a(qVar)).f6199b;
            if (fVar != null) {
                return ((Boolean) fVar.a(Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
            }
            return false;
        }
        if ((i3 == i4 && i4 == this.f5412s) || (y3 = y(kVar)) == null) {
            return false;
        }
        if (i3 < 0 || i3 != i4 || i4 > y3.length()) {
            i3 = -1;
        }
        this.f5412s = i3;
        boolean z4 = y3.length() > 0;
        int i5 = kVar.f6242g;
        F(q(D(i5), z4 ? Integer.valueOf(this.f5412s) : null, z4 ? Integer.valueOf(this.f5412s) : null, z4 ? Integer.valueOf(y3.length()) : null, y3));
        J(i5);
        return true;
    }

    public final void N() {
        C0396p c0396p = this.f5387A;
        c0396p.a();
        C0396p c0396p2 = this.f5388B;
        c0396p2.a();
        B0 b02 = (B0) u().f(-1);
        t0.k kVar = b02 != null ? b02.f5378a : null;
        p2.g.b(kVar);
        int i3 = 1;
        ArrayList O2 = O(kVar.f6238c.f5315t == G0.f.f1259e, AbstractC0241l.V(kVar));
        int T2 = AbstractC0241l.T(O2);
        if (1 > T2) {
            return;
        }
        while (true) {
            int i4 = ((t0.k) O2.get(i3 - 1)).f6242g;
            int i5 = ((t0.k) O2.get(i3)).f6242g;
            c0396p.g(i4, i5);
            c0396p2.g(i5, i4);
            if (i3 == T2) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce A[LOOP:1: B:8:0x002f->B:26:0x00ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1 A[EDGE_INSN: B:27:0x00d1->B:34:0x00d1 BREAK  A[LOOP:1: B:8:0x002f->B:26:0x00ce], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList O(boolean r18, java.util.ArrayList r19) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0455E.O(boolean, java.util.ArrayList):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0140, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        if (((r0 & ((~r0) << 6)) & (-9187201950435737472L)) == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0150, code lost:
    
        r24 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q() {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0455E.Q():void");
    }

    @Override // d1.C0205b
    public final A.t b(View view) {
        return this.f5406m;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r20, e1.j r21, java.lang.String r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0455E.k(int, e1.j, java.lang.String, android.os.Bundle):void");
    }

    public final Rect l(B0 b02) {
        Rect rect = b02.f5379b;
        long f3 = r2.a.f(rect.left, rect.top);
        C0507u c0507u = this.f5398d;
        long r3 = c0507u.r(f3);
        long r4 = c0507u.r(r2.a.f(rect.right, rect.bottom));
        return new Rect((int) Math.floor(V.c.b(r3)), (int) Math.floor(V.c.c(r3)), (int) Math.ceil(V.c.b(r4)), (int) Math.ceil(V.c.c(r4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #4 {all -> 0x0048, blocks: (B:15:0x0114, B:16:0x005e, B:21:0x0071, B:23:0x0079, B:69:0x0119, B:70:0x011c, B:74:0x0044, B:13:0x002c, B:24:0x0081, B:27:0x008d, B:29:0x0092, B:32:0x00a0, B:37:0x00ce, B:53:0x00e1, B:54:0x00e4, B:57:0x00e6, B:58:0x00e9, B:60:0x00ea, B:62:0x00f1, B:63:0x00fa, B:34:0x00a8, B:39:0x00af, B:42:0x00c0, B:44:0x00c8, B:47:0x00d4, B:48:0x00d9, B:50:0x00da, B:51:0x00df, B:31:0x009d), top: B:7:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0111 -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(i2.c r15) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0455E.m(i2.c):java.lang.Object");
    }

    public final void n(long j3, boolean z3) {
        t0.q qVar;
        int i3;
        if (!p2.g.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return;
        }
        C0398r u3 = u();
        if (V.c.a(j3, 9205357640488583168L) || !V.c.d(j3)) {
            return;
        }
        if (z3) {
            qVar = t0.n.f6272p;
        } else {
            if (z3) {
                throw new B1.c();
            }
            qVar = t0.n.f6271o;
        }
        Object[] objArr = u3.f5018c;
        long[] jArr = u3.f5016a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr[i4];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((255 & j4) < 128) {
                        B0 b02 = (B0) objArr[(i4 << 3) + i7];
                        Rect rect = b02.f5379b;
                        float f3 = rect.left;
                        float f4 = rect.top;
                        float f5 = rect.right;
                        float f6 = rect.bottom;
                        if (V.c.b(j3) >= f3 && V.c.b(j3) < f5 && V.c.c(j3) >= f4 && V.c.c(j3) < f6) {
                            Object obj = b02.f5378a.f6239d.f6230d.get(qVar);
                            if (obj == null) {
                                obj = null;
                            }
                            if (obj != null) {
                                throw new ClassCastException();
                            }
                        }
                        i3 = 8;
                    } else {
                        i3 = i5;
                    }
                    j4 >>= i3;
                    i7++;
                    i5 = i3;
                }
                if (i6 != i5) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final void o() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (z()) {
                E(this.f5398d.getSemanticsOwner().a(), this.f5393G);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                K(u());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent p(int i3, int i4) {
        B0 b02;
        C0507u c0507u = this.f5398d;
        Trace.beginSection("obtainAccessibilityEvent");
        try {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
            Trace.endSection();
            obtain.setEnabled(true);
            obtain.setClassName("android.view.View");
            Trace.beginSection("event.packageName");
            try {
                obtain.setPackageName(c0507u.getContext().getPackageName());
                Trace.endSection();
                Trace.beginSection("event.setSource");
                try {
                    obtain.setSource(c0507u, i3);
                    Trace.endSection();
                    if (z() && (b02 = (B0) u().f(i3)) != null) {
                        obtain.setPassword(b02.f5378a.f6239d.f6230d.containsKey(t0.n.f6282z));
                    }
                    return obtain;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent q(int i3, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent p3 = p(i3, 8192);
        if (num != null) {
            p3.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            p3.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            p3.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            p3.getText().add(charSequence);
        }
        return p3;
    }

    public final void r(t0.k kVar, ArrayList arrayList, C0398r c0398r) {
        boolean z3 = kVar.f6238c.f5315t == G0.f.f1259e;
        Object obj = kVar.f6239d.f6230d.get(t0.n.f6268l);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i3 = kVar.f6242g;
        if ((booleanValue || A(kVar)) && u().c(i3)) {
            arrayList.add(kVar);
        }
        if (booleanValue) {
            c0398r.i(i3, O(z3, AbstractC0240k.j0(t0.k.h(kVar, false, 7))));
            return;
        }
        List h = t0.k.h(kVar, false, 7);
        int size = h.size();
        for (int i4 = 0; i4 < size; i4++) {
            r((t0.k) h.get(i4), arrayList, c0398r);
        }
    }

    public final int s(t0.k kVar) {
        t0.g gVar = kVar.f6239d;
        if (!gVar.f6230d.containsKey(t0.n.f6258a)) {
            t0.q qVar = t0.n.f6279w;
            t0.g gVar2 = kVar.f6239d;
            if (gVar2.f6230d.containsKey(qVar)) {
                return (int) (4294967295L & ((C0612A) gVar2.a(qVar)).f6317a);
            }
        }
        return this.f5412s;
    }

    public final int t(t0.k kVar) {
        t0.g gVar = kVar.f6239d;
        if (!gVar.f6230d.containsKey(t0.n.f6258a)) {
            t0.q qVar = t0.n.f6279w;
            t0.g gVar2 = kVar.f6239d;
            if (gVar2.f6230d.containsKey(qVar)) {
                return (int) (((C0612A) gVar2.a(qVar)).f6317a >> 32);
            }
        }
        return this.f5412s;
    }

    public final C0398r u() {
        if (this.f5416w) {
            this.f5416w = false;
            Trace.beginSection("generateCurrentSemanticsNodes");
            try {
                C0398r d3 = AbstractC0461K.d(this.f5398d.getSemanticsOwner());
                Trace.endSection();
                this.f5418y = d3;
                if (z()) {
                    Trace.beginSection("setTraversalValues");
                    try {
                        N();
                    } finally {
                    }
                }
            } finally {
            }
        }
        return this.f5418y;
    }

    public final String w(t0.k kVar) {
        Object obj = kVar.f6239d.f6230d.get(t0.n.f6259b);
        String str = null;
        if (obj == null) {
            obj = null;
        }
        t0.q qVar = t0.n.f6281y;
        t0.g gVar = kVar.f6239d;
        LinkedHashMap linkedHashMap = gVar.f6230d;
        Object obj2 = linkedHashMap.get(qVar);
        if (obj2 == null) {
            obj2 = null;
        }
        EnumC0604a enumC0604a = (EnumC0604a) obj2;
        Object obj3 = linkedHashMap.get(t0.n.f6273q);
        if (obj3 == null) {
            obj3 = null;
        }
        t0.e eVar = (t0.e) obj3;
        C0507u c0507u = this.f5398d;
        if (enumC0604a != null) {
            int ordinal = enumC0604a.ordinal();
            if (ordinal == 0) {
                if ((eVar == null ? false : t0.e.a(eVar.f6205a, 2)) && obj == null) {
                    obj = c0507u.getContext().getResources().getString(R.string.state_on);
                }
            } else if (ordinal == 1) {
                if ((eVar == null ? false : t0.e.a(eVar.f6205a, 2)) && obj == null) {
                    obj = c0507u.getContext().getResources().getString(R.string.state_off);
                }
            } else if (ordinal == 2 && obj == null) {
                obj = c0507u.getContext().getResources().getString(R.string.indeterminate);
            }
        }
        Object obj4 = linkedHashMap.get(t0.n.f6280x);
        if (obj4 == null) {
            obj4 = null;
        }
        Boolean bool = (Boolean) obj4;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(eVar == null ? false : t0.e.a(eVar.f6205a, 4)) && obj == null) {
                obj = booleanValue ? c0507u.getContext().getResources().getString(R.string.selected) : c0507u.getContext().getResources().getString(R.string.not_selected);
            }
        }
        Object obj5 = linkedHashMap.get(t0.n.f6260c);
        if (obj5 == null) {
            obj5 = null;
        }
        t0.d dVar = (t0.d) obj5;
        if (dVar != null) {
            if (dVar != t0.d.f6202c) {
                if (obj == null) {
                    obj = c0507u.getContext().getResources().getString(R.string.template_percent, 0);
                }
            } else if (obj == null) {
                obj = c0507u.getContext().getResources().getString(R.string.in_progress);
            }
        }
        t0.q qVar2 = t0.n.f6278v;
        if (linkedHashMap.containsKey(qVar2)) {
            t0.g i3 = new t0.k(kVar.f6236a, true, kVar.f6238c, gVar).i();
            t0.q qVar3 = t0.n.f6258a;
            LinkedHashMap linkedHashMap2 = i3.f6230d;
            Object obj6 = linkedHashMap2.get(qVar3);
            if (obj6 == null) {
                obj6 = null;
            }
            Collection collection = (Collection) obj6;
            if (collection == null || collection.isEmpty()) {
                Object obj7 = linkedHashMap2.get(t0.n.f6275s);
                if (obj7 == null) {
                    obj7 = null;
                }
                Collection collection2 = (Collection) obj7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object obj8 = linkedHashMap2.get(qVar2);
                    if (obj8 == null) {
                        obj8 = null;
                    }
                    CharSequence charSequence = (CharSequence) obj8;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = c0507u.getContext().getResources().getString(R.string.state_empty);
                    }
                }
            }
            obj = str;
        }
        return (String) obj;
    }

    public final boolean z() {
        return this.f5401g.isEnabled() && !this.f5404k.isEmpty();
    }
}
