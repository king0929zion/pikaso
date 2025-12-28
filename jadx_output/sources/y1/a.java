package Y1;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends r2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2779b;

    /* renamed from: c, reason: collision with root package name */
    public final SideSheetBehavior f2780c;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i3) {
        this.f2779b = i3;
        this.f2780c = sideSheetBehavior;
    }

    @Override // r2.a
    public final int A() {
        switch (this.f2779b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2780c;
                return (-sideSheetBehavior.f4007l) - sideSheetBehavior.f4010o;
            default:
                return this.f2780c.f4008m;
        }
    }

    @Override // r2.a
    public final int B() {
        switch (this.f2779b) {
            case 0:
                return this.f2780c.f4010o;
            default:
                return this.f2780c.f4008m;
        }
    }

    @Override // r2.a
    public final int C() {
        switch (this.f2779b) {
            case 0:
                return -this.f2780c.f4007l;
            default:
                return z();
        }
    }

    @Override // r2.a
    public final int D(View view) {
        switch (this.f2779b) {
            case 0:
                return view.getRight() + this.f2780c.f4010o;
            default:
                return view.getLeft() - this.f2780c.f4010o;
        }
    }

    @Override // r2.a
    public final int E(CoordinatorLayout coordinatorLayout) {
        switch (this.f2779b) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // r2.a
    public final int F() {
        switch (this.f2779b) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // r2.a
    public final boolean I(float f3) {
        switch (this.f2779b) {
            case 0:
                if (f3 > 0.0f) {
                }
                break;
            default:
                if (f3 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // r2.a
    public final boolean J(View view) {
        switch (this.f2779b) {
            case 0:
                if (view.getRight() < (z() - A()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (z() + this.f2780c.f4008m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // r2.a
    public final boolean L(float f3, float f4) {
        switch (this.f2779b) {
            case 0:
                if (Math.abs(f3) > Math.abs(f4)) {
                    float abs = Math.abs(f3);
                    this.f2780c.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f3) > Math.abs(f4)) {
                    float abs2 = Math.abs(f3);
                    this.f2780c.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // r2.a
    public final boolean Y(View view, float f3) {
        switch (this.f2779b) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f2780c;
                float abs = Math.abs((f3 * sideSheetBehavior.f4006k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f2780c;
                float abs2 = Math.abs((f3 * sideSheetBehavior2.f4006k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // r2.a
    public final void e0(ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4) {
        switch (this.f2779b) {
            case 0:
                if (i3 <= this.f2780c.f4008m) {
                    marginLayoutParams.leftMargin = i4;
                    break;
                }
                break;
            default:
                int i5 = this.f2780c.f4008m;
                if (i3 <= i5) {
                    marginLayoutParams.rightMargin = i5 - i3;
                    break;
                }
                break;
        }
    }

    @Override // r2.a
    public final int j(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f2779b) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // r2.a
    public final float k(int i3) {
        switch (this.f2779b) {
            case 0:
                float A3 = A();
                return (i3 - A3) / (z() - A3);
            default:
                float f3 = this.f2780c.f4008m;
                return (f3 - i3) / (f3 - z());
        }
    }

    @Override // r2.a
    public final int z() {
        switch (this.f2779b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2780c;
                return Math.max(0, sideSheetBehavior.f4009n + sideSheetBehavior.f4010o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f2780c;
                return Math.max(0, (sideSheetBehavior2.f4008m - sideSheetBehavior2.f4007l) - sideSheetBehavior2.f4010o);
        }
    }
}
