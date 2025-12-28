package M1;

import a.AbstractC0090a;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class e extends Z.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q0.a f1682b;

    public /* synthetic */ e(Q0.a aVar, int i3) {
        this.f1681a = i3;
        this.f1682b = aVar;
    }

    @Override // Z.b
    public final void H(int i3) {
        switch (this.f1681a) {
            case 0:
                if (i3 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1682b;
                    if (bottomSheetBehavior.f3886K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
            default:
                if (i3 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1682b;
                    if (sideSheetBehavior.f4003g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // Z.b
    public final void I(View view, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f1681a) {
            case 0:
                ((BottomSheetBehavior) this.f1682b).u(i4);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1682b;
                WeakReference weakReference = sideSheetBehavior.f4012q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f3997a.e0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f4016u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f3997a.k(i3);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.f3997a.J(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f3997a.z()) < java.lang.Math.abs(r7 - r0.f3997a.A())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r7 > r4.f3880E) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f3880E)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f3879D) < java.lang.Math.abs(r7 - r4.f3882G)) goto L27;
     */
    @Override // Z.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.e.J(android.view.View, float, float):void");
    }

    @Override // Z.b
    public final boolean P(View view, int i3) {
        WeakReference weakReference;
        switch (this.f1681a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1682b;
                int i4 = bottomSheetBehavior.f3887L;
                if (i4 != 1 && !bottomSheetBehavior.f3903a0) {
                    if (i4 == 3 && bottomSheetBehavior.f3900Y == i3) {
                        WeakReference weakReference2 = bottomSheetBehavior.f3897V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f3896U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1682b;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f4011p) != null && weakReference.get() == view) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // Z.b
    public final int h(View view, int i3) {
        switch (this.f1681a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1682b;
                return AbstractC0090a.m(i3, sideSheetBehavior.f3997a.C(), sideSheetBehavior.f3997a.B());
        }
    }

    @Override // Z.b
    public final int i(View view, int i3) {
        switch (this.f1681a) {
            case 0:
                return AbstractC0090a.m(i3, ((BottomSheetBehavior) this.f1682b).x(), y());
            default:
                return view.getTop();
        }
    }

    @Override // Z.b
    public int x(View view) {
        switch (this.f1681a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1682b;
                return sideSheetBehavior.f4007l + sideSheetBehavior.f4010o;
            default:
                return super.x(view);
        }
    }

    @Override // Z.b
    public int y() {
        switch (this.f1681a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1682b;
                return bottomSheetBehavior.f3884I ? bottomSheetBehavior.f3895T : bottomSheetBehavior.f3882G;
            default:
                return super.y();
        }
    }
}
