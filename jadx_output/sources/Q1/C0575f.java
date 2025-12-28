package q1;

import android.text.InputFilter;
import android.widget.TextView;

/* renamed from: q1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575f extends Z.b {

    /* renamed from: a, reason: collision with root package name */
    public final C0574e f6063a;

    public C0575f(TextView textView) {
        this.f6063a = new C0574e(textView);
    }

    @Override // Z.b
    public final void L(boolean z3) {
        if (o1.i.c()) {
            this.f6063a.L(z3);
        }
    }

    @Override // Z.b
    public final void M(boolean z3) {
        boolean c3 = o1.i.c();
        C0574e c0574e = this.f6063a;
        if (c3) {
            c0574e.M(z3);
        } else {
            c0574e.f6062c = z3;
        }
    }

    @Override // Z.b
    public final InputFilter[] t(InputFilter[] inputFilterArr) {
        return !o1.i.c() ? inputFilterArr : this.f6063a.t(inputFilterArr);
    }
}
