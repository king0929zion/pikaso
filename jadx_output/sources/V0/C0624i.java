package v0;

import W.G;
import W.J;
import a.AbstractC0090a;
import a1.C0095c;
import android.graphics.Matrix;
import android.graphics.Shader;
import d2.AbstractC0240k;
import d2.AbstractC0241l;
import d2.AbstractC0246q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: v0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624i {

    /* renamed from: a, reason: collision with root package name */
    public final C0095c f6350a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6351b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6352c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6353d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6354e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6355f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6356g;
    public final ArrayList h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public C0624i(C0095c c0095c, long j3, int i3, boolean z3) {
        boolean z4;
        int g3;
        this.f6350a = c0095c;
        this.f6351b = i3;
        if (G0.a.j(j3) != 0 || G0.a.i(j3) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c0095c.f2930f;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        float f3 = 0.0f;
        while (i4 < size) {
            l lVar = (l) arrayList2.get(i4);
            C0.d dVar = lVar.f6366a;
            int h = G0.a.h(j3);
            if (G0.a.c(j3)) {
                g3 = G0.a.g(j3) - ((int) Math.ceil(f3));
                if (g3 < 0) {
                    g3 = 0;
                }
            } else {
                g3 = G0.a.g(j3);
            }
            C0616a c0616a = new C0616a(dVar, this.f6351b - i5, z3, AbstractC0090a.b(h, g3, 5));
            float b3 = c0616a.b() + f3;
            w0.w wVar = c0616a.f6327d;
            int i6 = i5 + wVar.f6543f;
            ArrayList arrayList3 = arrayList2;
            arrayList.add(new k(c0616a, lVar.f6367b, lVar.f6368c, i5, i6, f3, b3));
            if (wVar.f6541d || (i6 == this.f6351b && i4 != AbstractC0241l.T((ArrayList) this.f6350a.f2930f))) {
                z4 = true;
                f3 = b3;
                i5 = i6;
                break;
            } else {
                i4++;
                f3 = b3;
                i5 = i6;
                arrayList2 = arrayList3;
            }
        }
        z4 = false;
        this.f6354e = f3;
        this.f6355f = i5;
        this.f6352c = z4;
        this.h = arrayList;
        this.f6353d = G0.a.h(j3);
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            k kVar = (k) arrayList.get(i7);
            ?? r7 = kVar.f6359a.f6329f;
            ArrayList arrayList5 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i8 = 0; i8 < size3; i8++) {
                V.d dVar2 = (V.d) r7.get(i8);
                arrayList5.add(dVar2 != null ? dVar2.e(r2.a.f(0.0f, kVar.f6364f)) : null);
            }
            AbstractC0246q.Y(arrayList4, arrayList5);
        }
        if (arrayList4.size() < ((List) this.f6350a.f2926b).size()) {
            int size4 = ((List) this.f6350a.f2926b).size() - arrayList4.size();
            ArrayList arrayList6 = new ArrayList(size4);
            for (int i9 = 0; i9 < size4; i9++) {
                arrayList6.add(null);
            }
            arrayList4 = AbstractC0240k.g0(arrayList4, arrayList6);
        }
        this.f6356g = arrayList4;
    }

    public static void a(C0624i c0624i, W.o oVar, W.D d3, float f3, G g3, F0.g gVar, Y.c cVar) {
        oVar.d();
        ArrayList arrayList = c0624i.h;
        if (arrayList.size() <= 1) {
            C0.j.a(c0624i, oVar, d3, f3, g3, gVar, cVar, 3);
        } else if (d3 instanceof J) {
            C0.j.a(c0624i, oVar, d3, f3, g3, gVar, cVar, 3);
        } else if (d3 instanceof W.n) {
            int size = arrayList.size();
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i3 = 0; i3 < size; i3++) {
                k kVar = (k) arrayList.get(i3);
                f5 += kVar.f6359a.b();
                f4 = Math.max(f4, kVar.f6359a.c());
            }
            AbstractC0090a.d(f4, f5);
            Matrix matrix = new Matrix();
            Shader shader = ((W.n) d3).f2555g;
            shader.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                k kVar2 = (k) arrayList.get(i4);
                kVar2.f6359a.f(oVar, new W.n(shader), f3, g3, gVar, cVar, 3);
                C0616a c0616a = kVar2.f6359a;
                oVar.o(0.0f, c0616a.b());
                matrix.setTranslate(0.0f, -c0616a.b());
                shader.setLocalMatrix(matrix);
            }
        }
        oVar.a();
    }

    public final void b(int i3) {
        int i4 = this.f6355f;
        if (i3 < 0 || i3 >= i4) {
            throw new IllegalArgumentException(("lineIndex(" + i3 + ") is out of bounds [0, " + i4 + ')').toString());
        }
    }
}
