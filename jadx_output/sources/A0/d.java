package A0;

import W.D;
import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.ArrayList;
import o0.C0507u;
import v0.C0612A;
import v0.C0618c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final View f200a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f201b;

    public d(View view) {
        this.f200a = view;
        Z.b.B(new c(0, this));
    }

    public d(View view, C0507u c0507u) {
        new d(view);
        Choreographer.getInstance();
        this.f200a = view;
        new e(new C0618c("", null, null, null), C0612A.f6315b, null);
        int i3 = b.f191g;
        new ArrayList();
        Z.b.B(new c(1, this));
        new CursorAnchorInfo.Builder();
        D.j();
        new Matrix();
    }
}
