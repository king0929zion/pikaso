package v0;

import A.AbstractC0000a;
import a.AbstractC0090a;
import java.util.List;
import z0.InterfaceC0721e;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final C0618c f6463a;

    /* renamed from: b, reason: collision with root package name */
    public final C0613B f6464b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6465c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6466d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6467e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6468f;

    /* renamed from: g, reason: collision with root package name */
    public final G0.b f6469g;
    public final G0.f h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0721e f6470i;

    /* renamed from: j, reason: collision with root package name */
    public final long f6471j;

    public x(C0618c c0618c, C0613B c0613b, List list, int i3, boolean z3, int i4, G0.b bVar, G0.f fVar, InterfaceC0721e interfaceC0721e, long j3) {
        this.f6463a = c0618c;
        this.f6464b = c0613b;
        this.f6465c = list;
        this.f6466d = i3;
        this.f6467e = z3;
        this.f6468f = i4;
        this.f6469g = bVar;
        this.h = fVar;
        this.f6470i = interfaceC0721e;
        this.f6471j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p2.g.a(this.f6463a, xVar.f6463a) && p2.g.a(this.f6464b, xVar.f6464b) && this.f6465c.equals(xVar.f6465c) && this.f6466d == xVar.f6466d && this.f6467e == xVar.f6467e && AbstractC0090a.z(this.f6468f, xVar.f6468f) && p2.g.a(this.f6469g, xVar.f6469g) && this.h == xVar.h && p2.g.a(this.f6470i, xVar.f6470i) && G0.a.b(this.f6471j, xVar.f6471j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6471j) + ((this.f6470i.hashCode() + ((this.h.hashCode() + ((this.f6469g.hashCode() + AbstractC0000a.a(this.f6468f, (Boolean.hashCode(this.f6467e) + ((((this.f6465c.hashCode() + ((this.f6464b.hashCode() + (this.f6463a.hashCode() * 31)) * 31)) * 31) + this.f6466d) * 31)) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f6463a);
        sb.append(", style=");
        sb.append(this.f6464b);
        sb.append(", placeholders=");
        sb.append(this.f6465c);
        sb.append(", maxLines=");
        sb.append(this.f6466d);
        sb.append(", softWrap=");
        sb.append(this.f6467e);
        sb.append(", overflow=");
        int i3 = this.f6468f;
        sb.append((Object) (AbstractC0090a.z(i3, 1) ? "Clip" : AbstractC0090a.z(i3, 2) ? "Ellipsis" : AbstractC0090a.z(i3, 3) ? "Visible" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f6469g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f6470i);
        sb.append(", constraints=");
        sb.append((Object) G0.a.k(this.f6471j));
        sb.append(')');
        return sb.toString();
    }
}
