package R;

import D1.w;
import M1.i;
import a1.C0100h;
import a2.C0106e;
import a2.C0112k;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.A;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import b.j;
import com.ai.assistance.operit.provider.MainComposeActivity;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d2.AbstractC0240k;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n.C0398r;
import n1.C0449e;
import o0.A0;
import o0.B0;
import o0.C0455E;
import o0.C0507u;
import t0.g;
import t0.k;
import t0.n;
import t0.q;
import v0.C0618c;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2197e;

    public /* synthetic */ a(int i3, Object obj) {
        this.f2196d = i3;
        this.f2197e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar;
        int i3;
        C0398r c0398r;
        int i4;
        int[] iArr;
        C0398r c0398r2;
        e eVar2;
        int[] iArr2;
        switch (this.f2196d) {
            case 0:
                e eVar3 = (e) this.f2197e;
                if (eVar3.h()) {
                    C0507u c0507u = eVar3.f2206d;
                    c0507u.s(true);
                    eVar3.l(c0507u.getSemanticsOwner().a(), eVar3.f2219r);
                    eVar3.j(c0507u.getSemanticsOwner().a(), eVar3.f2219r);
                    C0398r g3 = eVar3.g();
                    int[] iArr3 = g3.f5017b;
                    long[] jArr = g3.f5016a;
                    int length = jArr.length - 2;
                    C0398r c0398r3 = eVar3.f2218q;
                    long j3 = 128;
                    long j4 = 255;
                    int i5 = 8;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j5 = jArr[i6];
                            e eVar4 = eVar3;
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j5 & j4) < j3) {
                                        int i9 = iArr3[(i6 << 3) + i8];
                                        A0 a02 = (A0) c0398r3.f(i9);
                                        B0 b02 = (B0) g3.f(i9);
                                        k kVar = b02 != null ? b02.f5378a : null;
                                        if (kVar == null) {
                                            Z0.d.T("no value for specified key");
                                            throw null;
                                        }
                                        g gVar = kVar.f6239d;
                                        int i10 = kVar.f6242g;
                                        LinkedHashMap linkedHashMap = gVar.f6230d;
                                        if (a02 == null) {
                                            Iterator it = gVar.iterator();
                                            while (it.hasNext()) {
                                                Object key = ((Map.Entry) it.next()).getKey();
                                                q qVar = n.f6275s;
                                                if (p2.g.a(key, qVar)) {
                                                    Object obj = linkedHashMap.get(qVar);
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                    List list = (List) obj;
                                                    eVar4.k(String.valueOf(list != null ? (C0618c) AbstractC0240k.b0(list) : null), i10);
                                                }
                                            }
                                            c0398r2 = g3;
                                            eVar2 = eVar4;
                                        } else {
                                            eVar2 = eVar4;
                                            Iterator it2 = gVar.iterator();
                                            while (it2.hasNext()) {
                                                C0398r c0398r4 = g3;
                                                q qVar2 = (q) ((Map.Entry) it2.next()).getKey();
                                                int[] iArr4 = iArr3;
                                                q qVar3 = n.f6275s;
                                                if (p2.g.a(qVar2, qVar3)) {
                                                    Object obj2 = a02.f5371a.f6230d.get(qVar3);
                                                    if (obj2 == null) {
                                                        obj2 = null;
                                                    }
                                                    List list2 = (List) obj2;
                                                    C0618c c0618c = list2 != null ? (C0618c) AbstractC0240k.b0(list2) : null;
                                                    Object obj3 = linkedHashMap.get(qVar3);
                                                    if (obj3 == null) {
                                                        obj3 = null;
                                                    }
                                                    List list3 = (List) obj3;
                                                    C0618c c0618c2 = list3 != null ? (C0618c) AbstractC0240k.b0(list3) : null;
                                                    if (!p2.g.a(c0618c, c0618c2)) {
                                                        eVar2.k(String.valueOf(c0618c2), i10);
                                                    }
                                                }
                                                iArr3 = iArr4;
                                                g3 = c0398r4;
                                            }
                                            c0398r2 = g3;
                                        }
                                        iArr2 = iArr3;
                                    } else {
                                        c0398r2 = g3;
                                        eVar2 = eVar4;
                                        iArr2 = iArr3;
                                    }
                                    j5 >>= 8;
                                    i8++;
                                    g3 = c0398r2;
                                    j3 = 128;
                                    j4 = 255;
                                    int[] iArr5 = iArr2;
                                    eVar4 = eVar2;
                                    i5 = 8;
                                    iArr3 = iArr5;
                                }
                                c0398r = g3;
                                i4 = 1;
                                int[] iArr6 = iArr3;
                                int i11 = i5;
                                eVar = eVar4;
                                iArr = iArr6;
                                if (i7 != i11) {
                                }
                            } else {
                                c0398r = g3;
                                eVar = eVar4;
                                i4 = 1;
                                iArr = iArr3;
                            }
                            if (i6 != length) {
                                i6 += i4;
                                eVar3 = eVar;
                                iArr3 = iArr;
                                g3 = c0398r;
                                i5 = 8;
                                j3 = 128;
                                j4 = 255;
                            }
                        }
                    } else {
                        eVar = eVar3;
                    }
                    c0398r3.a();
                    C0398r g4 = eVar.g();
                    int[] iArr7 = g4.f5017b;
                    Object[] objArr = g4.f5018c;
                    long[] jArr2 = g4.f5016a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j6 = jArr2[i12];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if ((j6 & 255) < 128) {
                                        int i15 = (i12 << 3) + i14;
                                        c0398r3.i(iArr7[i15], new A0(((B0) objArr[i15]).f5378a, eVar.g()));
                                    }
                                    j6 >>= 8;
                                }
                                i3 = 1;
                                if (i13 != 8) {
                                }
                            } else {
                                i3 = 1;
                            }
                            if (i12 != length2) {
                                i12 += i3;
                            }
                        }
                    }
                    eVar.f2219r = new A0(c0507u.getSemanticsOwner().a(), eVar.g());
                    eVar.f2220s = false;
                    return;
                }
                return;
            case 1:
                View view = (View) this.f2197e;
                ((InputMethodManager) T0.b.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 2:
                i iVar = (i) this.f2197e;
                iVar.f1692c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) iVar.f1694e;
                C0449e c0449e = sideSheetBehavior.f4004i;
                if (c0449e != null && c0449e.f()) {
                    iVar.a(iVar.f1691b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.r(iVar.f1691b);
                        return;
                    }
                    return;
                }
            case 3:
                ((C0106e) this.f2197e).t(true);
                return;
            case 4:
                C0112k c0112k = (C0112k) this.f2197e;
                boolean isPopupShowing = c0112k.h.isPopupShowing();
                c0112k.t(isPopupShowing);
                c0112k.f2987m = isPopupShowing;
                return;
            case 5:
                A a3 = (A) this.f2197e;
                p2.g.e(a3, "this$0");
                int i16 = a3.f3439e;
                t tVar = a3.f3442i;
                if (i16 == 0) {
                    a3.f3440f = true;
                    tVar.d(l.ON_PAUSE);
                }
                if (a3.f3438d == 0 && a3.f3440f) {
                    tVar.d(l.ON_STOP);
                    a3.f3441g = true;
                    return;
                }
                return;
            case 6:
                ((MainComposeActivity) this.f2197e).invalidateOptionsMenu();
                return;
            case 7:
                j jVar = (j) this.f2197e;
                Runnable runnable = jVar.f3595e;
                if (runnable != null) {
                    runnable.run();
                    jVar.f3595e = null;
                    return;
                }
                return;
            case 8:
                ((com.google.android.material.timepicker.e) this.f2197e).f();
                return;
            case 9:
                C0507u c0507u2 = (C0507u) this.f2197e;
                c0507u2.f5725u0 = false;
                MotionEvent motionEvent = c0507u2.f5714o0;
                p2.g.b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                c0507u2.E(motionEvent);
                return;
            case 10:
                ((o2.a) this.f2197e).c();
                return;
            case 11:
                C0455E c0455e = (C0455E) this.f2197e;
                Trace.beginSection("measureAndLayout");
                try {
                    c0455e.f5398d.s(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        c0455e.o();
                        Trace.endSection();
                        c0455e.f5394H = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 12:
                o1.q qVar4 = (o1.q) this.f2197e;
                synchronized (qVar4.f5794d) {
                    try {
                        if (qVar4.h == null) {
                            return;
                        }
                        try {
                            C0100h b3 = qVar4.b();
                            int i17 = b3.f2948e;
                            if (i17 == 2) {
                                synchronized (qVar4.f5794d) {
                                }
                            }
                            if (i17 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i17 + ")");
                            }
                            try {
                                int i18 = Z0.e.f2904a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                X1.e eVar5 = qVar4.f5793c;
                                Context context = qVar4.f5791a;
                                eVar5.getClass();
                                Typeface s3 = V0.g.f2467a.s(context, new C0100h[]{b3}, 0);
                                MappedByteBuffer O2 = r2.a.O(qVar4.f5791a, b3.f2944a);
                                if (O2 == null || s3 == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    w wVar = new w(s3, Z0.d.L(O2));
                                    Trace.endSection();
                                    synchronized (qVar4.f5794d) {
                                        try {
                                            Z0.d dVar = qVar4.h;
                                            if (dVar != null) {
                                                dVar.J(wVar);
                                            }
                                        } finally {
                                        }
                                    }
                                    qVar4.a();
                                    return;
                                } finally {
                                    int i19 = Z0.e.f2904a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (qVar4.f5794d) {
                                try {
                                    Z0.d dVar2 = qVar4.h;
                                    if (dVar2 != null) {
                                        dVar2.I(th2);
                                    }
                                    qVar4.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            default:
                z.t.setRippleState$lambda$2((z.t) this.f2197e);
                return;
        }
    }
}
