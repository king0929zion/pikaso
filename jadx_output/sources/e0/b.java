package E0;

import A0.c;
import C0.j;
import D.C0032d;
import D.C0037f0;
import D.D;
import D.I0;
import V.f;
import W.n;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final n f1148a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1149b;

    /* renamed from: c, reason: collision with root package name */
    public final C0037f0 f1150c = C0032d.A(new f(9205357640488583168L));

    /* renamed from: d, reason: collision with root package name */
    public final D f1151d;

    public b(n nVar, float f3) {
        this.f1148a = nVar;
        this.f1149b = f3;
        c cVar = new c(5, this);
        B0.a aVar = I0.f694a;
        this.f1151d = new D(cVar);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.b(textPaint, this.f1149b);
        textPaint.setShader((Shader) this.f1151d.getValue());
    }
}
