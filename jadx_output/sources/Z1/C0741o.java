package z1;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: z1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741o extends v1.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7071b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0741o(w wVar, int i3) {
        super(wVar);
        this.f7071b = i3;
    }

    @Override // v1.b
    public final int b(View view) {
        switch (this.f7071b) {
            case 0:
                x xVar = (x) view.getLayoutParams();
                ((w) this.f6483a).getClass();
                return view.getRight() + ((x) view.getLayoutParams()).f7088a.right + ((ViewGroup.MarginLayoutParams) xVar).rightMargin;
            default:
                x xVar2 = (x) view.getLayoutParams();
                ((w) this.f6483a).getClass();
                return view.getBottom() + ((x) view.getLayoutParams()).f7088a.bottom + ((ViewGroup.MarginLayoutParams) xVar2).bottomMargin;
        }
    }

    @Override // v1.b
    public final int c(View view) {
        switch (this.f7071b) {
            case 0:
                x xVar = (x) view.getLayoutParams();
                ((w) this.f6483a).getClass();
                return (view.getLeft() - ((x) view.getLayoutParams()).f7088a.left) - ((ViewGroup.MarginLayoutParams) xVar).leftMargin;
            default:
                x xVar2 = (x) view.getLayoutParams();
                ((w) this.f6483a).getClass();
                return (view.getTop() - ((x) view.getLayoutParams()).f7088a.top) - ((ViewGroup.MarginLayoutParams) xVar2).topMargin;
        }
    }

    @Override // v1.b
    public final int d() {
        switch (this.f7071b) {
            case 0:
                w wVar = (w) this.f6483a;
                return wVar.f7086f - wVar.v();
            default:
                w wVar2 = (w) this.f6483a;
                return wVar2.f7087g - wVar2.t();
        }
    }

    @Override // v1.b
    public final int e() {
        switch (this.f7071b) {
            case 0:
                return ((w) this.f6483a).u();
            default:
                return ((w) this.f6483a).w();
        }
    }

    @Override // v1.b
    public final int f() {
        switch (this.f7071b) {
            case 0:
                w wVar = (w) this.f6483a;
                return (wVar.f7086f - wVar.u()) - wVar.v();
            default:
                w wVar2 = (w) this.f6483a;
                return (wVar2.f7087g - wVar2.w()) - wVar2.t();
        }
    }
}
