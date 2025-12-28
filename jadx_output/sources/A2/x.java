package a2;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f3075e;

    public /* synthetic */ x(TextInputLayout textInputLayout, int i3) {
        this.f3074d = i3;
        this.f3075e = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3074d) {
            case 0:
                CheckableImageButton checkableImageButton = this.f3075e.f4057f.f3006j;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                break;
            default:
                this.f3075e.f4059g.requestLayout();
                break;
        }
    }
}
