package k;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f4741a;

    public C0298a(ActionBarContainer actionBarContainer) {
        this.f4741a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f4741a;
        if (actionBarContainer.f3110j) {
            Drawable drawable = actionBarContainer.f3109i;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f3108g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.h;
        if (drawable3 == null || !actionBarContainer.f3111k) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f4741a;
        if (actionBarContainer.f3110j) {
            if (actionBarContainer.f3109i != null) {
                actionBarContainer.f3108g.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f3108g;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
