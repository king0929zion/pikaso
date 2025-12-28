package k;

import d1.AbstractC0189K;
import java.lang.reflect.Field;

/* renamed from: k.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0315i0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0323m0 f4799e;

    public /* synthetic */ RunnableC0315i0(AbstractC0323m0 abstractC0323m0, int i3) {
        this.f4798d = i3;
        this.f4799e = abstractC0323m0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0323m0 abstractC0323m0 = this.f4799e;
        switch (this.f4798d) {
            case 0:
                C0332r0 c0332r0 = abstractC0323m0.f4824f;
                if (c0332r0 != null) {
                    c0332r0.setListSelectionHidden(true);
                    c0332r0.requestLayout();
                    break;
                }
                break;
            default:
                C0332r0 c0332r02 = abstractC0323m0.f4824f;
                if (c0332r02 != null) {
                    Field field = AbstractC0189K.f4150a;
                    if (c0332r02.isAttachedToWindow() && abstractC0323m0.f4824f.getCount() > abstractC0323m0.f4824f.getChildCount() && abstractC0323m0.f4824f.getChildCount() <= Integer.MAX_VALUE) {
                        abstractC0323m0.f4842y.setInputMethodMode(2);
                        abstractC0323m0.b();
                        break;
                    }
                }
                break;
        }
    }
}
