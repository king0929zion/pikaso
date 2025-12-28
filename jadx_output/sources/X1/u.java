package X1;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public float f2758a;

    /* renamed from: b, reason: collision with root package name */
    public float f2759b;

    /* renamed from: c, reason: collision with root package name */
    public float f2760c;

    /* renamed from: d, reason: collision with root package name */
    public float f2761d;

    /* renamed from: e, reason: collision with root package name */
    public float f2762e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2763f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2764g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f3) {
        float f4 = this.f2761d;
        if (f4 == f3) {
            return;
        }
        float f5 = ((f3 - f4) + 360.0f) % 360.0f;
        if (f5 > 180.0f) {
            return;
        }
        float f6 = this.f2759b;
        float f7 = this.f2760c;
        q qVar = new q(f6, f7, f6, f7);
        qVar.f2751f = this.f2761d;
        qVar.f2752g = f5;
        this.f2764g.add(new o(qVar));
        this.f2761d = f3;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f2763f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((s) arrayList.get(i3)).a(matrix, path);
        }
    }

    public final void c(float f3, float f4) {
        r rVar = new r();
        rVar.f2753b = f3;
        rVar.f2754c = f4;
        this.f2763f.add(rVar);
        p pVar = new p(rVar, this.f2759b, this.f2760c);
        float b3 = pVar.b() + 270.0f;
        float b4 = pVar.b() + 270.0f;
        a(b3);
        this.f2764g.add(pVar);
        this.f2761d = b4;
        this.f2759b = f3;
        this.f2760c = f4;
    }

    public final void d(float f3, float f4, float f5) {
        this.f2758a = f3;
        this.f2759b = 0.0f;
        this.f2760c = f3;
        this.f2761d = f4;
        this.f2762e = (f4 + f5) % 360.0f;
        this.f2763f.clear();
        this.f2764g.clear();
    }
}
