package o0;

import android.os.Looper;
import android.view.Choreographer;
import y2.AbstractC0688v;

/* renamed from: o0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462L extends p2.h implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5474e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0462L f5454f = new C0462L(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0462L f5455g = new C0462L(0, 1);
    public static final C0462L h = new C0462L(0, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0462L f5456i = new C0462L(0, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final C0462L f5457j = new C0462L(0, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final C0462L f5458k = new C0462L(0, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final C0462L f5459l = new C0462L(0, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final C0462L f5460m = new C0462L(0, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final C0462L f5461n = new C0462L(0, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final C0462L f5462o = new C0462L(0, 9);

    /* renamed from: p, reason: collision with root package name */
    public static final C0462L f5463p = new C0462L(0, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final C0462L f5464q = new C0462L(0, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final C0462L f5465r = new C0462L(0, 12);

    /* renamed from: s, reason: collision with root package name */
    public static final C0462L f5466s = new C0462L(0, 13);

    /* renamed from: t, reason: collision with root package name */
    public static final C0462L f5467t = new C0462L(0, 14);

    /* renamed from: u, reason: collision with root package name */
    public static final C0462L f5468u = new C0462L(0, 15);

    /* renamed from: v, reason: collision with root package name */
    public static final C0462L f5469v = new C0462L(0, 16);

    /* renamed from: w, reason: collision with root package name */
    public static final C0462L f5470w = new C0462L(0, 17);

    /* renamed from: x, reason: collision with root package name */
    public static final C0462L f5471x = new C0462L(0, 18);

    /* renamed from: y, reason: collision with root package name */
    public static final C0462L f5472y = new C0462L(0, 19);

    /* renamed from: z, reason: collision with root package name */
    public static final C0462L f5473z = new C0462L(0, 20);

    /* renamed from: A, reason: collision with root package name */
    public static final C0462L f5448A = new C0462L(0, 21);

    /* renamed from: B, reason: collision with root package name */
    public static final C0462L f5449B = new C0462L(0, 22);

    /* renamed from: C, reason: collision with root package name */
    public static final C0462L f5450C = new C0462L(0, 23);

    /* renamed from: D, reason: collision with root package name */
    public static final C0462L f5451D = new C0462L(0, 24);

    /* renamed from: E, reason: collision with root package name */
    public static final C0462L f5452E = new C0462L(0, 25);

    /* renamed from: F, reason: collision with root package name */
    public static final C0462L f5453F = new C0462L(0, 26);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0462L(int i3, int i4) {
        super(i3);
        this.f5474e = i4;
    }

    @Override // o2.a
    public final Object c() {
        Choreographer choreographer;
        switch (this.f5474e) {
            case 0:
                S.b("LocalConfiguration");
                throw null;
            case 1:
                S.b("LocalContext");
                throw null;
            case 2:
                S.b("LocalImageVectorCache");
                throw null;
            case 3:
                S.b("LocalResourceIdCache");
                throw null;
            case 4:
                S.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                S.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    F2.d dVar = y2.B.f6749a;
                    choreographer = (Choreographer) AbstractC0688v.o(D2.o.f1078a, new T(2, null));
                }
                W w3 = new W(choreographer, Z0.d.p(Looper.getMainLooper()));
                return Z0.d.K(w3, w3.f5524o);
            case 7:
            case 8:
                return null;
            case 9:
                AbstractC0479f0.b("LocalAutofillTree");
                throw null;
            case 10:
                AbstractC0479f0.b("LocalClipboardManager");
                throw null;
            case 11:
                AbstractC0479f0.b("LocalDensity");
                throw null;
            case 12:
                AbstractC0479f0.b("LocalFocusManager");
                throw null;
            case 13:
                AbstractC0479f0.b("LocalFontFamilyResolver");
                throw null;
            case 14:
                AbstractC0479f0.b("LocalFontLoader");
                throw null;
            case 15:
                AbstractC0479f0.b("LocalGraphicsContext");
                throw null;
            case 16:
                AbstractC0479f0.b("LocalHapticFeedback");
                throw null;
            case 17:
                AbstractC0479f0.b("LocalInputManager");
                throw null;
            case 18:
                AbstractC0479f0.b("LocalLayoutDirection");
                throw null;
            case 19:
                return null;
            case 20:
                return Boolean.FALSE;
            case 21:
            case 22:
                return null;
            case 23:
                AbstractC0479f0.b("LocalTextToolbar");
                throw null;
            case 24:
                AbstractC0479f0.b("LocalUriHandler");
                throw null;
            case 25:
                AbstractC0479f0.b("LocalViewConfiguration");
                throw null;
            default:
                AbstractC0479f0.b("LocalWindowInfo");
                throw null;
        }
    }
}
