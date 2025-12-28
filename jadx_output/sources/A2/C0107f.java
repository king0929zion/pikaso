package a2;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: a2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107f extends AbstractC0118q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0107f(C0117p c0117p, int i3) {
        super(c0117p);
        this.f2974e = i3;
    }

    @Override // a2.AbstractC0118q
    public void r() {
        switch (this.f2974e) {
            case 0:
                C0117p c0117p = this.f3023b;
                c0117p.f3014r = null;
                CheckableImageButton checkableImageButton = c0117p.f3006j;
                checkableImageButton.setOnLongClickListener(null);
                Z0.d.O(checkableImageButton, null);
                break;
        }
    }
}
