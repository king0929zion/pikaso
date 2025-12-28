package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import k.S;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f3162d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f3163e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f3164f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f3165g;
    public TypedValue h;

    /* renamed from: i, reason: collision with root package name */
    public TypedValue f3166i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f3167j;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3167j = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3166i == null) {
            this.f3166i = new TypedValue();
        }
        return this.f3166i;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3164f == null) {
            this.f3164f = new TypedValue();
        }
        return this.f3164f;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3165g == null) {
            this.f3165g = new TypedValue();
        }
        return this.f3165g;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3162d == null) {
            this.f3162d = new TypedValue();
        }
        return this.f3162d;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3163e == null) {
            this.f3163e = new TypedValue();
        }
        return this.f3163e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(S s3) {
    }
}
