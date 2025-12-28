package z;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: z.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697E extends RippleDrawable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6838d;

    /* renamed from: e, reason: collision with root package name */
    public W.r f6839e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f6840f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6841g;

    public C0697E(boolean z3) {
        super(ColorStateList.valueOf(-16777216), null, z3 ? new ColorDrawable(-1) : null);
        this.f6838d = z3;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f6838d) {
            this.f6841g = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f6841g = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f6841g;
    }
}
