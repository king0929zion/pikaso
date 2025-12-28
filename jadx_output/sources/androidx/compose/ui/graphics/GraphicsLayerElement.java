package androidx.compose.ui.graphics;

import A.AbstractC0000a;
import D.C0065y;
import P.k;
import W.D;
import W.H;
import W.I;
import W.K;
import W.r;
import n0.AbstractC0409C;
import n0.P;
import n0.Y;
import p.AbstractC0537f;
import p2.g;

/* loaded from: classes.dex */
final class GraphicsLayerElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final float f3323a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3324b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3325c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3326d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3327e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3328f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3329g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3330i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3331j;

    /* renamed from: k, reason: collision with root package name */
    public final long f3332k;

    /* renamed from: l, reason: collision with root package name */
    public final H f3333l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f3334m;

    /* renamed from: n, reason: collision with root package name */
    public final long f3335n;

    /* renamed from: o, reason: collision with root package name */
    public final long f3336o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3337p;

    public GraphicsLayerElement(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, long j3, H h, boolean z3, long j4, long j5, int i3) {
        this.f3323a = f3;
        this.f3324b = f4;
        this.f3325c = f5;
        this.f3326d = f6;
        this.f3327e = f7;
        this.f3328f = f8;
        this.f3329g = f9;
        this.h = f10;
        this.f3330i = f11;
        this.f3331j = f12;
        this.f3332k = j3;
        this.f3333l = h;
        this.f3334m = z3;
        this.f3335n = j4;
        this.f3336o = j5;
        this.f3337p = i3;
    }

    @Override // n0.P
    public final k d() {
        I i3 = new I();
        i3.f2519q = this.f3323a;
        i3.f2520r = this.f3324b;
        i3.f2521s = this.f3325c;
        i3.f2522t = this.f3326d;
        i3.f2523u = this.f3327e;
        i3.f2524v = this.f3328f;
        i3.f2525w = this.f3329g;
        i3.f2526x = this.h;
        i3.f2527y = this.f3330i;
        i3.f2528z = this.f3331j;
        i3.f2512A = this.f3332k;
        i3.f2513B = this.f3333l;
        i3.f2514C = this.f3334m;
        i3.f2515D = this.f3335n;
        i3.f2516E = this.f3336o;
        i3.f2517F = this.f3337p;
        i3.f2518G = new C0065y(8, i3);
        return i3;
    }

    @Override // n0.P
    public final void e(k kVar) {
        I i3 = (I) kVar;
        i3.f2519q = this.f3323a;
        i3.f2520r = this.f3324b;
        i3.f2521s = this.f3325c;
        i3.f2522t = this.f3326d;
        i3.f2523u = this.f3327e;
        i3.f2524v = this.f3328f;
        i3.f2525w = this.f3329g;
        i3.f2526x = this.h;
        i3.f2527y = this.f3330i;
        i3.f2528z = this.f3331j;
        i3.f2512A = this.f3332k;
        i3.f2513B = this.f3333l;
        i3.f2514C = this.f3334m;
        i3.f2515D = this.f3335n;
        i3.f2516E = this.f3336o;
        i3.f2517F = this.f3337p;
        Y y3 = AbstractC0409C.p(i3, 2).f5218o;
        if (y3 != null) {
            y3.J0(i3.f2518G, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        if (Float.compare(this.f3323a, graphicsLayerElement.f3323a) != 0 || Float.compare(this.f3324b, graphicsLayerElement.f3324b) != 0 || Float.compare(this.f3325c, graphicsLayerElement.f3325c) != 0 || Float.compare(this.f3326d, graphicsLayerElement.f3326d) != 0 || Float.compare(this.f3327e, graphicsLayerElement.f3327e) != 0 || Float.compare(this.f3328f, graphicsLayerElement.f3328f) != 0 || Float.compare(this.f3329g, graphicsLayerElement.f3329g) != 0 || Float.compare(this.h, graphicsLayerElement.h) != 0 || Float.compare(this.f3330i, graphicsLayerElement.f3330i) != 0 || Float.compare(this.f3331j, graphicsLayerElement.f3331j) != 0) {
            return false;
        }
        int i3 = K.f2531b;
        return this.f3332k == graphicsLayerElement.f3332k && g.a(this.f3333l, graphicsLayerElement.f3333l) && this.f3334m == graphicsLayerElement.f3334m && g.a(null, null) && r.c(this.f3335n, graphicsLayerElement.f3335n) && r.c(this.f3336o, graphicsLayerElement.f3336o) && D.m(this.f3337p, graphicsLayerElement.f3337p);
    }

    public final int hashCode() {
        int a3 = AbstractC0537f.a(this.f3331j, AbstractC0537f.a(this.f3330i, AbstractC0537f.a(this.h, AbstractC0537f.a(this.f3329g, AbstractC0537f.a(this.f3328f, AbstractC0537f.a(this.f3327e, AbstractC0537f.a(this.f3326d, AbstractC0537f.a(this.f3325c, AbstractC0537f.a(this.f3324b, Float.hashCode(this.f3323a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i3 = K.f2531b;
        int hashCode = (Boolean.hashCode(this.f3334m) + ((this.f3333l.hashCode() + AbstractC0000a.b(a3, 31, this.f3332k)) * 31)) * 961;
        int i4 = r.f2563g;
        return Integer.hashCode(this.f3337p) + AbstractC0000a.b(AbstractC0000a.b(hashCode, 31, this.f3335n), 31, this.f3336o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f3323a);
        sb.append(", scaleY=");
        sb.append(this.f3324b);
        sb.append(", alpha=");
        sb.append(this.f3325c);
        sb.append(", translationX=");
        sb.append(this.f3326d);
        sb.append(", translationY=");
        sb.append(this.f3327e);
        sb.append(", shadowElevation=");
        sb.append(this.f3328f);
        sb.append(", rotationX=");
        sb.append(this.f3329g);
        sb.append(", rotationY=");
        sb.append(this.h);
        sb.append(", rotationZ=");
        sb.append(this.f3330i);
        sb.append(", cameraDistance=");
        sb.append(this.f3331j);
        sb.append(", transformOrigin=");
        int i3 = K.f2531b;
        sb.append((Object) ("TransformOrigin(packedValue=" + this.f3332k + ')'));
        sb.append(", shape=");
        sb.append(this.f3333l);
        sb.append(", clip=");
        sb.append(this.f3334m);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0000a.i(this.f3335n, sb, ", spotShadowColor=");
        sb.append((Object) r.i(this.f3336o));
        sb.append(", compositingStrategy=");
        sb.append((Object) ("CompositingStrategy(value=" + this.f3337p + ')'));
        sb.append(')');
        return sb.toString();
    }
}
