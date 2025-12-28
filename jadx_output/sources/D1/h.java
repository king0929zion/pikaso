package D1;

import android.view.View;

/* loaded from: classes.dex */
public final class h extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f980a;

    /* renamed from: b, reason: collision with root package name */
    public Object f981b;

    public /* synthetic */ h() {
        this.f980a = 2;
    }

    @Override // D1.p, D1.n
    public void b() {
        switch (this.f980a) {
            case 2:
                C0067a c0067a = (C0067a) this.f981b;
                if (!c0067a.f960C) {
                    c0067a.D();
                    c0067a.f960C = true;
                    break;
                }
                break;
        }
    }

    @Override // D1.n
    public final void d(o oVar) {
        switch (this.f980a) {
            case 0:
                y yVar = x.f1035a;
                yVar.e0((View) this.f981b, 1.0f);
                yVar.getClass();
                oVar.u(this);
                break;
            case 1:
                ((o) this.f981b).w();
                oVar.u(this);
                break;
            default:
                C0067a c0067a = (C0067a) this.f981b;
                int i3 = c0067a.f959B - 1;
                c0067a.f959B = i3;
                if (i3 == 0) {
                    c0067a.f960C = false;
                    c0067a.l();
                }
                oVar.u(this);
                break;
        }
    }

    public /* synthetic */ h(int i3, Object obj) {
        this.f980a = i3;
        this.f981b = obj;
    }
}
