package x;

import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import v0.C0613B;
import w0.v;
import w0.x;
import z0.InterfaceC0721e;
import z1.F;
import z1.w;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0638c {
    public static int a(F f3, v1.b bVar, View view, View view2, w wVar, boolean z3) {
        if (wVar.p() == 0 || f3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(w.x(view) - w.x(view2)) + 1;
        }
        return Math.min(bVar.f(), bVar.b(view2) - bVar.c(view));
    }

    public static int b(F f3, v1.b bVar, View view, View view2, w wVar, boolean z3, boolean z4) {
        if (wVar.p() == 0 || f3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z4 ? Math.max(0, (f3.a() - Math.max(w.x(view), w.x(view2))) - 1) : Math.max(0, Math.min(w.x(view), w.x(view2)));
        if (z3) {
            return Math.round((max * (Math.abs(bVar.b(view2) - bVar.c(view)) / (Math.abs(w.x(view) - w.x(view2)) + 1))) + (bVar.e() - bVar.c(view)));
        }
        return max;
    }

    public static int c(F f3, v1.b bVar, View view, View view2, w wVar, boolean z3) {
        if (wVar.p() == 0 || f3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return f3.a();
        }
        return (int) (((bVar.b(view2) - bVar.c(view)) / (Math.abs(w.x(view) - w.x(view2)) + 1)) * f3.a());
    }

    public static C0639d d(C0639d c0639d, G0.f fVar, C0613B c0613b, G0.b bVar, InterfaceC0721e interfaceC0721e) {
        if (c0639d != null && fVar == c0639d.f6579a && p2.g.a(c0613b, c0639d.f6580b) && bVar.n() == c0639d.f6581c.n() && interfaceC0721e == c0639d.f6582d) {
            return c0639d;
        }
        C0639d c0639d2 = C0639d.h;
        if (c0639d2 != null && fVar == c0639d2.f6579a && p2.g.a(c0613b, c0639d2.f6580b) && bVar.n() == c0639d2.f6581c.n() && interfaceC0721e == c0639d2.f6582d) {
            return c0639d2;
        }
        C0639d c0639d3 = new C0639d(fVar, Z.b.K(c0613b, fVar), bVar, interfaceC0721e);
        C0639d.h = c0639d3;
        return c0639d3;
    }

    public static final float e(Layout layout, int i3, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i3);
        v vVar = x.f6553a;
        if (layout.getEllipsisCount(i3) <= 0 || layout.getParagraphDirection(i3) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i3) + layout.getLineStart(i3)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i3);
        if ((paragraphAlignment == null ? -1 : x0.d.f6660a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float f(Layout layout, int i3, Paint paint) {
        float width;
        float width2;
        v vVar = x.f6553a;
        if (layout.getEllipsisCount(i3) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i3) != -1 || layout.getWidth() >= layout.getLineRight(i3)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i3) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i3) + layout.getLineStart(i3)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i3);
        if ((paragraphAlignment != null ? x0.d.f6660a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i3);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i3);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }
}
