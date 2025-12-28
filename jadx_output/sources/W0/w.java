package w0;

import a1.C0095c;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final C0.e f6538a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6539b;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6541d;

    /* renamed from: e, reason: collision with root package name */
    public final Layout f6542e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6543f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6544g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6545i;

    /* renamed from: j, reason: collision with root package name */
    public final float f6546j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6547k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f6548l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6549m;

    /* renamed from: n, reason: collision with root package name */
    public final x0.g[] f6550n;

    /* renamed from: p, reason: collision with root package name */
    public C0095c f6552p;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6540c = true;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f6551o = new Rect();

    /* JADX WARN: Removed duplicated region for block: B:60:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(java.lang.CharSequence r40, float r41, C0.e r42, int r43, android.text.TextUtils.TruncateAt r44, int r45, boolean r46, int r47, int r48, int r49, int r50, int r51, int r52, w0.l r53) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.w.<init>(java.lang.CharSequence, float, C0.e, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, w0.l):void");
    }

    public final int a() {
        boolean z3 = this.f6541d;
        Layout layout = this.f6542e;
        return (z3 ? layout.getLineBottom(this.f6543f - 1) : layout.getHeight()) + this.f6544g + this.h + this.f6549m;
    }

    public final C0095c b() {
        C0095c c0095c = this.f6552p;
        if (c0095c != null) {
            p2.g.b(c0095c);
            return c0095c;
        }
        C0095c c0095c2 = new C0095c(this.f6542e);
        this.f6552p = c0095c2;
        return c0095c2;
    }

    public final float c(int i3) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f6544g + ((i3 != this.f6543f + (-1) || (fontMetricsInt = this.f6548l) == null) ? this.f6542e.getLineBaseline(i3) : f(i3) - fontMetricsInt.ascent);
    }

    public final float d(int i3) {
        Paint.FontMetricsInt fontMetricsInt;
        int i4 = this.f6543f;
        int i5 = i4 - 1;
        Layout layout = this.f6542e;
        if (i3 != i5 || (fontMetricsInt = this.f6548l) == null) {
            return this.f6544g + layout.getLineBottom(i3) + (i3 == i4 + (-1) ? this.h : 0);
        }
        return layout.getLineBottom(i3 - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i3) {
        Layout layout = this.f6542e;
        return layout.getEllipsisStart(i3) == 0 ? layout.getLineEnd(i3) : layout.getText().length();
    }

    public final float f(int i3) {
        return this.f6542e.getLineTop(i3) + (i3 == 0 ? 0 : this.f6544g);
    }

    public final float g(int i3, boolean z3) {
        return (this.f6542e.getLineForOffset(i3) == this.f6543f - 1 ? this.f6545i + this.f6546j : 0.0f) + b().d(i3, true, z3);
    }

    public final float h(int i3, boolean z3) {
        return (this.f6542e.getLineForOffset(i3) == this.f6543f + (-1) ? this.f6545i + this.f6546j : 0.0f) + b().d(i3, false, z3);
    }
}
