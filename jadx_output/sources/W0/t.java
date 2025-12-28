package w0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f6515a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6516b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6517c;

    /* renamed from: d, reason: collision with root package name */
    public final C0.e f6518d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6519e;

    /* renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f6520f;

    /* renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f6521g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f6522i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6523j;

    /* renamed from: k, reason: collision with root package name */
    public final float f6524k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6525l;

    /* renamed from: m, reason: collision with root package name */
    public final int f6526m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6527n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6528o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6529p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6530q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6531r;

    /* renamed from: s, reason: collision with root package name */
    public final int f6532s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f6533t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f6534u;

    public t(CharSequence charSequence, int i3, int i4, C0.e eVar, int i5, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i6, TextUtils.TruncateAt truncateAt, int i7, float f3, float f4, int i8, boolean z3, boolean z4, int i9, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        this.f6515a = charSequence;
        this.f6516b = i3;
        this.f6517c = i4;
        this.f6518d = eVar;
        this.f6519e = i5;
        this.f6520f = textDirectionHeuristic;
        this.f6521g = alignment;
        this.h = i6;
        this.f6522i = truncateAt;
        this.f6523j = i7;
        this.f6524k = f3;
        this.f6525l = f4;
        this.f6526m = i8;
        this.f6527n = z3;
        this.f6528o = z4;
        this.f6529p = i9;
        this.f6530q = i10;
        this.f6531r = i11;
        this.f6532s = i12;
        this.f6533t = iArr;
        this.f6534u = iArr2;
        if (i3 < 0 || i3 > i4) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i4 < 0 || i4 > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value");
        }
    }
}
