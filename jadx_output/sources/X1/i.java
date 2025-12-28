package X1;

import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class i extends AbstractC0090a {
    @Override // a.AbstractC0090a
    public final void G(u uVar, float f3, float f4) {
        uVar.d(f4 * f3, 180.0f, 90.0f);
        float f5 = f4 * 2.0f * f3;
        q qVar = new q(0.0f, 0.0f, f5, f5);
        qVar.f2751f = 180.0f;
        qVar.f2752g = 90.0f;
        uVar.f2763f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f2764g.add(oVar);
        uVar.f2761d = 270.0f;
        float f6 = (0.0f + f5) * 0.5f;
        float f7 = (f5 - 0.0f) / 2.0f;
        double d3 = 270.0f;
        uVar.f2759b = (((float) Math.cos(Math.toRadians(d3))) * f7) + f6;
        uVar.f2760c = (f7 * ((float) Math.sin(Math.toRadians(d3)))) + f6;
    }
}
