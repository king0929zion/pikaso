package W;

import A.AbstractC0000a;
import D.C0038g;
import D.C0065y;
import d2.C0249t;
import l0.InterfaceC0360j;
import n0.AbstractC0418L;
import n0.InterfaceC0437s;

/* loaded from: classes.dex */
public final class I extends P.k implements InterfaceC0437s {

    /* renamed from: A, reason: collision with root package name */
    public long f2512A;

    /* renamed from: B, reason: collision with root package name */
    public H f2513B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2514C;

    /* renamed from: D, reason: collision with root package name */
    public long f2515D;

    /* renamed from: E, reason: collision with root package name */
    public long f2516E;

    /* renamed from: F, reason: collision with root package name */
    public int f2517F;

    /* renamed from: G, reason: collision with root package name */
    public C0065y f2518G;

    /* renamed from: q, reason: collision with root package name */
    public float f2519q;

    /* renamed from: r, reason: collision with root package name */
    public float f2520r;

    /* renamed from: s, reason: collision with root package name */
    public float f2521s;

    /* renamed from: t, reason: collision with root package name */
    public float f2522t;

    /* renamed from: u, reason: collision with root package name */
    public float f2523u;

    /* renamed from: v, reason: collision with root package name */
    public float f2524v;

    /* renamed from: w, reason: collision with root package name */
    public float f2525w;

    /* renamed from: x, reason: collision with root package name */
    public float f2526x;

    /* renamed from: y, reason: collision with root package name */
    public float f2527y;

    /* renamed from: z, reason: collision with root package name */
    public float f2528z;

    @Override // n0.InterfaceC0437s
    public final M1.j R(AbstractC0418L abstractC0418L, InterfaceC0360j interfaceC0360j, long j3) {
        l0.o a3 = interfaceC0360j.a(j3);
        return abstractC0418L.b0(a3.f4927d, a3.f4928e, C0249t.f4256d, new C0038g(a3, 4, this));
    }

    @Override // P.k
    public final boolean V() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f2519q);
        sb.append(", scaleY=");
        sb.append(this.f2520r);
        sb.append(", alpha = ");
        sb.append(this.f2521s);
        sb.append(", translationX=");
        sb.append(this.f2522t);
        sb.append(", translationY=");
        sb.append(this.f2523u);
        sb.append(", shadowElevation=");
        sb.append(this.f2524v);
        sb.append(", rotationX=");
        sb.append(this.f2525w);
        sb.append(", rotationY=");
        sb.append(this.f2526x);
        sb.append(", rotationZ=");
        sb.append(this.f2527y);
        sb.append(", cameraDistance=");
        sb.append(this.f2528z);
        sb.append(", transformOrigin=");
        long j3 = this.f2512A;
        int i3 = K.f2531b;
        sb.append((Object) ("TransformOrigin(packedValue=" + j3 + ')'));
        sb.append(", shape=");
        sb.append(this.f2513B);
        sb.append(", clip=");
        sb.append(this.f2514C);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0000a.i(this.f2515D, sb, ", spotShadowColor=");
        AbstractC0000a.i(this.f2516E, sb, ", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.f2517F + ')'));
        sb.append(')');
        return sb.toString();
    }
}
