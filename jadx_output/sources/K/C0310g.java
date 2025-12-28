package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ai.assistance.operit.provider.R;
import j.ViewOnTouchListenerC0289a;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310g extends C0341w implements InterfaceC0314i {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0312h f4776g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0310g(C0312h c0312h, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f4776g = c0312h;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        V0.a(this, getContentDescription());
        setOnTouchListener(new ViewOnTouchListenerC0289a(this, this));
    }

    @Override // k.InterfaceC0314i
    public final boolean a() {
        return false;
    }

    @Override // k.InterfaceC0314i
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f4776g.h();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i3, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i3, i4, i5, i6);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            W0.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
