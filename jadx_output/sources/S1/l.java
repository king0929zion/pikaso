package S1;

import android.view.View;
import d1.AbstractC0189K;
import d1.AbstractC0227x;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class l implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        Field field = AbstractC0189K.f4150a;
        AbstractC0227x.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
