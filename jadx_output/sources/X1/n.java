package X1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2741c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f2742d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f2741c = arrayList;
        this.f2742d = matrix;
    }

    @Override // X1.t
    public final void a(Matrix matrix, W1.a aVar, int i3, Canvas canvas) {
        Iterator it = this.f2741c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f2742d, aVar, i3, canvas);
        }
    }
}
