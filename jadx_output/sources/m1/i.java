package M1;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d1.AbstractC0189K;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1690a;

    /* renamed from: b, reason: collision with root package name */
    public int f1691b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1692c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1693d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1694e;

    public i(B2.i iVar) {
        this.f1690a = 2;
        iVar.getClass();
        this.f1693d = new ArrayList();
        this.f1691b = -1;
        this.f1694e = iVar;
    }

    public void a(int i3) {
        Object obj = this.f1693d;
        Object obj2 = this.f1694e;
        switch (this.f1690a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.f3896U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1691b = i3;
                    if (!this.f1692c) {
                        Field field = AbstractC0189K.f4150a;
                        ((View) bottomSheetBehavior.f3896U.get()).postOnAnimation((h) obj);
                        this.f1692c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.f4011p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1691b = i3;
                    if (!this.f1692c) {
                        Field field2 = AbstractC0189K.f4150a;
                        ((View) sideSheetBehavior.f4011p.get()).postOnAnimation((R.a) obj);
                        this.f1692c = true;
                        break;
                    }
                }
                break;
        }
    }

    public String toString() {
        switch (this.f1690a) {
            case 2:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f1691b >= 0) {
                    sb.append(" #");
                    sb.append(this.f1691b);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public i(SideSheetBehavior sideSheetBehavior) {
        this.f1690a = 1;
        this.f1694e = sideSheetBehavior;
        this.f1693d = new R.a(2, this);
    }

    public i(BottomSheetBehavior bottomSheetBehavior) {
        this.f1690a = 0;
        this.f1694e = bottomSheetBehavior;
        this.f1693d = new h(0, this);
    }
}
