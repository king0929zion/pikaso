package X1;

import a.AbstractC0090a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0090a f2718a = new i();

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0090a f2719b = new i();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0090a f2720c = new i();

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0090a f2721d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f2722e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f2723f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f2724g = new a(0.0f);
    public c h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public e f2725i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f2726j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f2727k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f2728l = new e(0);

    public static j a(Context context, AttributeSet attributeSet, int i3, int i4) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H1.a.f1344j, i3, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, resourceId2);
        }
        TypedArray obtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(H1.a.f1349o);
        try {
            int i5 = obtainStyledAttributes2.getInt(0, 0);
            int i6 = obtainStyledAttributes2.getInt(3, i5);
            int i7 = obtainStyledAttributes2.getInt(4, i5);
            int i8 = obtainStyledAttributes2.getInt(2, i5);
            int i9 = obtainStyledAttributes2.getInt(1, i5);
            c b3 = b(obtainStyledAttributes2, 5, aVar);
            c b4 = b(obtainStyledAttributes2, 8, b3);
            c b5 = b(obtainStyledAttributes2, 9, b3);
            c b6 = b(obtainStyledAttributes2, 7, b3);
            c b7 = b(obtainStyledAttributes2, 6, b3);
            j jVar = new j();
            AbstractC0090a r3 = r2.a.r(i6);
            jVar.f2707a = r3;
            j.b(r3);
            jVar.f2711e = b4;
            AbstractC0090a r4 = r2.a.r(i7);
            jVar.f2708b = r4;
            j.b(r4);
            jVar.f2712f = b5;
            AbstractC0090a r5 = r2.a.r(i8);
            jVar.f2709c = r5;
            j.b(r5);
            jVar.f2713g = b6;
            AbstractC0090a r6 = r2.a.r(i9);
            jVar.f2710d = r6;
            j.b(r6);
            jVar.h = b7;
            return jVar;
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    public static c b(TypedArray typedArray, int i3, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i3);
        if (peekValue == null) {
            return cVar;
        }
        int i4 = peekValue.type;
        return i4 == 5 ? new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i4 == 6 ? new h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean c(RectF rectF) {
        boolean z3 = this.f2728l.getClass().equals(e.class) && this.f2726j.getClass().equals(e.class) && this.f2725i.getClass().equals(e.class) && this.f2727k.getClass().equals(e.class);
        float a3 = this.f2722e.a(rectF);
        return z3 && ((this.f2723f.a(rectF) > a3 ? 1 : (this.f2723f.a(rectF) == a3 ? 0 : -1)) == 0 && (this.h.a(rectF) > a3 ? 1 : (this.h.a(rectF) == a3 ? 0 : -1)) == 0 && (this.f2724g.a(rectF) > a3 ? 1 : (this.f2724g.a(rectF) == a3 ? 0 : -1)) == 0) && ((this.f2719b instanceof i) && (this.f2718a instanceof i) && (this.f2720c instanceof i) && (this.f2721d instanceof i));
    }

    public final j d() {
        j jVar = new j();
        jVar.f2707a = this.f2718a;
        jVar.f2708b = this.f2719b;
        jVar.f2709c = this.f2720c;
        jVar.f2710d = this.f2721d;
        jVar.f2711e = this.f2722e;
        jVar.f2712f = this.f2723f;
        jVar.f2713g = this.f2724g;
        jVar.h = this.h;
        jVar.f2714i = this.f2725i;
        jVar.f2715j = this.f2726j;
        jVar.f2716k = this.f2727k;
        jVar.f2717l = this.f2728l;
        return jVar;
    }
}
