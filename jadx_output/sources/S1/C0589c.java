package s1;

import android.graphics.Typeface;
import android.util.Log;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import o1.p;
import t.AbstractC0598c;
import t.InterfaceC0597b;
import x1.InterfaceC0653e;
import z0.AbstractC0718b;
import z0.j;
import z0.l;
import z0.n;

/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589c implements InterfaceC0597b, InterfaceC0653e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6126a;

    public /* synthetic */ C0589c(int i3, Object obj) {
        this.f6126a = i3;
    }

    public static Typeface e(String str, l lVar, int i3) {
        Typeface create;
        if (j.a(i3, 0) && p2.g.a(lVar, l.f6929f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), lVar.f6931d, j.a(i3, 1));
        return create;
    }

    public static Typeface f(String str, l lVar, int i3) {
        if (j.a(i3, 0) && p2.g.a(lVar, l.f6929f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int b3 = AbstractC0718b.b(lVar, i3);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(b3) : Typeface.create(str, b3);
    }

    private final void h() {
    }

    private final void i(int i3, Serializable serializable) {
    }

    @Override // x1.InterfaceC0653e
    public void b(int i3, Serializable serializable) {
        String str;
        switch (this.f6126a) {
            case 7:
                break;
            default:
                switch (i3) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i3 != 6 && i3 != 7 && i3 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    @Override // t.InterfaceC0597b
    public void c(int i3, int[] iArr, G0.f fVar, int[] iArr2) {
        if (fVar == G0.f.f1258d) {
            AbstractC0598c.b(iArr, iArr2, false);
        } else {
            AbstractC0598c.c(i3, iArr, iArr2, true);
        }
    }

    @Override // x1.InterfaceC0653e
    public void d() {
        switch (this.f6126a) {
            case 7:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public Typeface g(n nVar, l lVar, int i3) {
        String str;
        switch (this.f6126a) {
            case 13:
                nVar.getClass();
                return e("sans-serif", lVar, i3);
            default:
                nVar.getClass();
                int i4 = lVar.f6931d / 100;
                if (i4 >= 0 && i4 < 2) {
                    str = "sans-serif-thin";
                } else if (2 > i4 || i4 >= 4) {
                    if (i4 != 4) {
                        if (i4 == 5) {
                            str = "sans-serif-medium";
                        } else if ((6 > i4 || i4 >= 8) && 8 <= i4 && i4 < 11) {
                            str = "sans-serif-black";
                        }
                    }
                    str = "sans-serif";
                } else {
                    str = "sans-serif-light";
                }
                Typeface typeface = null;
                if (str.length() != 0) {
                    Typeface f3 = f(str, lVar, i3);
                    if (!p2.g.a(f3, Typeface.create(Typeface.DEFAULT, AbstractC0718b.b(lVar, i3))) && !p2.g.a(f3, f(null, lVar, i3))) {
                        typeface = f3;
                    }
                }
                return typeface == null ? f("sans-serif", lVar, i3) : typeface;
        }
    }

    public String toString() {
        switch (this.f6126a) {
            case 4:
                return "Arrangement#Start";
            case 5:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0589c(int i3, boolean z3) {
        this.f6126a = i3;
    }

    public C0589c(int i3) {
        this.f6126a = i3;
        switch (i3) {
            case 12:
                new p();
                y0.b bVar = new y0.b();
                bVar.f6744a = y0.a.f6742a;
                bVar.f6745b = y0.a.f6743b;
                bVar.f6746c = 0;
                break;
            default:
                new ArrayList();
                new HashMap();
                break;
        }
    }

    public C0589c(B2.i iVar) {
        this.f6126a = 1;
        new CopyOnWriteArrayList();
    }

    public C0589c(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f6126a = 22;
    }
}
