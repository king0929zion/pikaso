package w0;

import android.os.Build;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public final class n implements s {
    @Override // w0.s
    public StaticLayout a(t tVar) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(tVar.f6515a, tVar.f6516b, tVar.f6517c, tVar.f6518d, tVar.f6519e);
        obtain.setTextDirection(tVar.f6520f);
        obtain.setAlignment(tVar.f6521g);
        obtain.setMaxLines(tVar.h);
        obtain.setEllipsize(tVar.f6522i);
        obtain.setEllipsizedWidth(tVar.f6523j);
        obtain.setLineSpacing(tVar.f6525l, tVar.f6524k);
        obtain.setIncludePad(tVar.f6527n);
        obtain.setBreakStrategy(tVar.f6529p);
        obtain.setHyphenationFrequency(tVar.f6532s);
        obtain.setIndents(tVar.f6533t, tVar.f6534u);
        int i3 = Build.VERSION.SDK_INT;
        o.a(obtain, tVar.f6526m);
        if (i3 >= 28) {
            p.a(obtain, tVar.f6528o);
        }
        if (i3 >= 33) {
            q.b(obtain, tVar.f6530q, tVar.f6531r);
        }
        return obtain.build();
    }
}
