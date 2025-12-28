package o0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import java.util.LinkedHashMap;
import n.C0398r;
import t0.C0599a;

/* renamed from: o0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTranslationCallbackC0458H implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewTranslationCallbackC0458H f5422a = new ViewTranslationCallbackC0458H();

    public final boolean onClearTranslation(View view) {
        o2.a aVar;
        p2.g.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        R.e contentCaptureManager$ui_release = ((C0507u) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f2211j = 1;
        C0398r g3 = contentCaptureManager$ui_release.g();
        Object[] objArr = g3.f5018c;
        long[] jArr = g3.f5016a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            t0.g gVar = ((B0) objArr[(i3 << 3) + i5]).f5378a.f6239d;
                            t0.q qVar = t0.n.f6277u;
                            LinkedHashMap linkedHashMap = gVar.f6230d;
                            Object obj = linkedHashMap.get(qVar);
                            if (obj == null) {
                                obj = null;
                            }
                            if (obj != null) {
                                Object obj2 = linkedHashMap.get(t0.f.f6215k);
                                C0599a c0599a = (C0599a) (obj2 != null ? obj2 : null);
                                if (c0599a != null && (aVar = (o2.a) c0599a.f6199b) != null) {
                                }
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return true;
    }

    public final boolean onHideTranslation(View view) {
        o2.c cVar;
        p2.g.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        R.e contentCaptureManager$ui_release = ((C0507u) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f2211j = 1;
        C0398r g3 = contentCaptureManager$ui_release.g();
        Object[] objArr = g3.f5018c;
        long[] jArr = g3.f5016a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            t0.g gVar = ((B0) objArr[(i3 << 3) + i5]).f5378a.f6239d;
                            t0.q qVar = t0.n.f6277u;
                            LinkedHashMap linkedHashMap = gVar.f6230d;
                            Object obj = linkedHashMap.get(qVar);
                            if (obj == null) {
                                obj = null;
                            }
                            if (p2.g.a(obj, Boolean.TRUE)) {
                                Object obj2 = linkedHashMap.get(t0.f.f6214j);
                                C0599a c0599a = (C0599a) (obj2 != null ? obj2 : null);
                                if (c0599a != null && (cVar = (o2.c) c0599a.f6199b) != null) {
                                }
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        o2.c cVar;
        p2.g.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        R.e contentCaptureManager$ui_release = ((C0507u) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f2211j = 2;
        C0398r g3 = contentCaptureManager$ui_release.g();
        Object[] objArr = g3.f5018c;
        long[] jArr = g3.f5016a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        while (true) {
            long j3 = jArr[i3];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j3) < 128) {
                        t0.g gVar = ((B0) objArr[(i3 << 3) + i5]).f5378a.f6239d;
                        t0.q qVar = t0.n.f6277u;
                        LinkedHashMap linkedHashMap = gVar.f6230d;
                        Object obj = linkedHashMap.get(qVar);
                        if (obj == null) {
                            obj = null;
                        }
                        if (p2.g.a(obj, Boolean.FALSE)) {
                            Object obj2 = linkedHashMap.get(t0.f.f6214j);
                            C0599a c0599a = (C0599a) (obj2 != null ? obj2 : null);
                            if (c0599a != null && (cVar = (o2.c) c0599a.f6199b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i4 != 8) {
                    return true;
                }
            }
            if (i3 == length) {
                return true;
            }
            i3++;
        }
    }
}
