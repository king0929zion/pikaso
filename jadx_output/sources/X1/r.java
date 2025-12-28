package X1;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f2753b;

    /* renamed from: c, reason: collision with root package name */
    public float f2754c;

    @Override // X1.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2755a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f2753b, this.f2754c);
        path.transform(matrix);
    }
}
