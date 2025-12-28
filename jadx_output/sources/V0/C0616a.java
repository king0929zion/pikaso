package v0;

import W.AbstractC0081d;
import W.G;
import a.AbstractC0090a;
import android.graphics.Canvas;
import android.text.TextUtils;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616a {

    /* renamed from: a, reason: collision with root package name */
    public final C0.d f6324a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6325b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6326c;

    /* renamed from: d, reason: collision with root package name */
    public final w0.w f6327d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f6328e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6329f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0233  */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0616a(C0.d r25, int r26, boolean r27, long r28) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C0616a.<init>(C0.d, int, boolean, long):void");
    }

    public final w0.w a(int i3, int i4, TextUtils.TruncateAt truncateAt, int i5, int i6, int i7, int i8, int i9) {
        float c3 = c();
        C0.d dVar = this.f6324a;
        C0.a aVar = C0.b.f550a;
        q qVar = dVar.f553b.f6321c;
        return new w0.w(this.f6328e, c3, dVar.f558g, i3, truncateAt, dVar.f562l, false, i5, i7, i8, i9, i6, i4, dVar.f559i);
    }

    public final float b() {
        return this.f6327d.a();
    }

    public final float c() {
        return G0.a.h(this.f6326c);
    }

    public final void d(W.o oVar) {
        Canvas a3 = AbstractC0081d.a(oVar);
        w0.w wVar = this.f6327d;
        if (wVar.f6541d) {
            a3.save();
            a3.clipRect(0.0f, 0.0f, c(), b());
        }
        if (a3.getClipBounds(wVar.f6551o)) {
            int i3 = wVar.f6544g;
            if (i3 != 0) {
                a3.translate(0.0f, i3);
            }
            w0.v vVar = w0.x.f6553a;
            vVar.f6537a = a3;
            wVar.f6542e.draw(vVar);
            if (i3 != 0) {
                a3.translate(0.0f, (-1) * i3);
            }
        }
        if (wVar.f6541d) {
            a3.restore();
        }
    }

    public final void e(W.o oVar, long j3, G g3, F0.g gVar, Y.c cVar, int i3) {
        C0.d dVar = this.f6324a;
        C0.e eVar = dVar.f558g;
        int i4 = eVar.f565c;
        eVar.d(j3);
        eVar.f(g3);
        eVar.g(gVar);
        eVar.e(cVar);
        eVar.b(i3);
        d(oVar);
        dVar.f558g.b(i4);
    }

    public final void f(W.o oVar, W.D d3, float f3, G g3, F0.g gVar, Y.c cVar, int i3) {
        C0.e eVar = this.f6324a.f558g;
        int i4 = eVar.f565c;
        eVar.c(d3, AbstractC0090a.d(c(), b()), f3);
        eVar.f(g3);
        eVar.g(gVar);
        eVar.e(cVar);
        eVar.b(i3);
        d(oVar);
        eVar.b(i4);
    }
}
