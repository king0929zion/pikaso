package o0;

import D.C0032d;
import D.C0049l0;
import D.C0052n;
import D.C0053n0;

/* renamed from: o0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0479f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final D.M0 f5569a = new D.M0(C0462L.f5460m);

    /* renamed from: b, reason: collision with root package name */
    public static final D.M0 f5570b = new D.M0(C0462L.f5461n);

    /* renamed from: c, reason: collision with root package name */
    public static final D.M0 f5571c = new D.M0(C0462L.f5462o);

    /* renamed from: d, reason: collision with root package name */
    public static final D.M0 f5572d = new D.M0(C0462L.f5463p);

    /* renamed from: e, reason: collision with root package name */
    public static final D.M0 f5573e = new D.M0(C0462L.f5468u);

    /* renamed from: f, reason: collision with root package name */
    public static final D.M0 f5574f = new D.M0(C0462L.f5464q);

    /* renamed from: g, reason: collision with root package name */
    public static final D.M0 f5575g = new D.M0(C0462L.f5465r);
    public static final D.M0 h = new D.M0(C0462L.f5467t);

    /* renamed from: i, reason: collision with root package name */
    public static final D.M0 f5576i = new D.M0(C0462L.f5466s);

    /* renamed from: j, reason: collision with root package name */
    public static final D.M0 f5577j = new D.M0(C0462L.f5469v);

    /* renamed from: k, reason: collision with root package name */
    public static final D.M0 f5578k = new D.M0(C0462L.f5470w);

    /* renamed from: l, reason: collision with root package name */
    public static final D.M0 f5579l = new D.M0(C0462L.f5471x);

    /* renamed from: m, reason: collision with root package name */
    public static final D.M0 f5580m = new D.M0(C0462L.f5449B);

    /* renamed from: n, reason: collision with root package name */
    public static final D.M0 f5581n = new D.M0(C0462L.f5448A);

    /* renamed from: o, reason: collision with root package name */
    public static final D.M0 f5582o = new D.M0(C0462L.f5450C);

    /* renamed from: p, reason: collision with root package name */
    public static final D.M0 f5583p = new D.M0(C0462L.f5451D);

    /* renamed from: q, reason: collision with root package name */
    public static final D.M0 f5584q = new D.M0(C0462L.f5452E);

    /* renamed from: r, reason: collision with root package name */
    public static final D.M0 f5585r = new D.M0(C0462L.f5453F);

    /* renamed from: s, reason: collision with root package name */
    public static final D.M0 f5586s = new D.M0(C0462L.f5472y);

    /* renamed from: t, reason: collision with root package name */
    public static final D.H f5587t = new D.H(D.U.f731i, C0462L.f5473z);

    public static final void a(n0.e0 e0Var, X x3, L.a aVar, C0052n c0052n, int i3) {
        int i4;
        c0052n.O(874662829);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? c0052n.f(e0Var) : c0052n.h(e0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? c0052n.f(x3) : c0052n.h(x3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0052n.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0052n.y()) {
            c0052n.K();
        } else {
            C0507u c0507u = (C0507u) e0Var;
            C0049l0 a3 = f5569a.a(c0507u.getAccessibilityManager());
            C0049l0 a4 = f5570b.a(c0507u.getAutofill());
            C0049l0 a5 = f5571c.a(c0507u.getAutofillTree());
            C0049l0 a6 = f5572d.a(c0507u.getClipboardManager());
            C0049l0 a7 = f5574f.a(c0507u.getDensity());
            C0049l0 a8 = f5575g.a(c0507u.getFocusOwner());
            C0049l0 a9 = h.a(c0507u.getFontLoader());
            a9.f787f = false;
            C0049l0 a10 = f5576i.a(c0507u.getFontFamilyResolver());
            a10.f787f = false;
            C0032d.b(new C0049l0[]{a3, a4, a5, a6, a7, a8, a9, a10, f5577j.a(c0507u.getHapticFeedBack()), f5578k.a(c0507u.getInputModeManager()), f5579l.a(c0507u.getLayoutDirection()), f5580m.a(c0507u.getTextInputService()), f5581n.a(c0507u.getSoftwareKeyboardController()), f5582o.a(c0507u.getTextToolbar()), f5583p.a(x3), f5584q.a(c0507u.getViewConfiguration()), f5585r.a(c0507u.getWindowInfo()), f5586s.a(c0507u.getPointerIconService()), f5573e.a(c0507u.getGraphicsContext())}, aVar, c0052n, ((i4 >> 3) & 112) | 8);
        }
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            s3.f834d = new A.x(e0Var, x3, aVar, i3);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
