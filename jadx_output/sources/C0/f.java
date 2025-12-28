package C0;

import android.text.style.ClickableSpan;
import android.view.View;
import v0.AbstractC0623h;

/* loaded from: classes.dex */
public final class f extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0623h f570a;

    public f(AbstractC0623h abstractC0623h) {
        this.f570a = abstractC0623h;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f570a.getClass();
    }
}
