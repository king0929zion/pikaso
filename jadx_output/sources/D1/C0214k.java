package d1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: d1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214k {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f4222a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f4223b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f4224c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4225d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f4226e;

    public C0214k(ViewGroup viewGroup) {
        this.f4224c = viewGroup;
    }

    public final boolean a(float f3, float f4, boolean z3) {
        ViewParent e3;
        if (!this.f4225d || (e3 = e(0)) == null) {
            return false;
        }
        try {
            return AbstractC0194P.a(e3, this.f4224c, f3, f4, z3);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedFling", e4);
            return false;
        }
    }

    public final boolean b(float f3, float f4) {
        ViewParent e3;
        if (!this.f4225d || (e3 = e(0)) == null) {
            return false;
        }
        try {
            return AbstractC0194P.b(e3, this.f4224c, f3, f4);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedPreFling", e4);
            return false;
        }
    }

    public final boolean c(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        ViewParent e3;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f4225d || (e3 = e(i5)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f4224c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            if (this.f4226e == null) {
                this.f4226e = new int[2];
            }
            iArr3 = this.f4226e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e3 instanceof InterfaceC0215l) {
            ((InterfaceC0215l) e3).c(viewGroup, i3, i4, iArr3, i5);
        } else if (i5 == 0) {
            try {
                AbstractC0194P.c(e3, viewGroup, i3, i4, iArr3);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedPreScroll", e4);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        ViewParent e3;
        int i8;
        int i9;
        int[] iArr3;
        if (!this.f4225d || (e3 = e(i7)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f4224c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i8 = iArr[0];
            i9 = iArr[1];
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (iArr2 == null) {
            if (this.f4226e == null) {
                this.f4226e = new int[2];
            }
            int[] iArr4 = this.f4226e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (e3 instanceof InterfaceC0216m) {
            ((InterfaceC0216m) e3).d(viewGroup, i3, i4, i5, i6, i7, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i5;
            iArr3[1] = iArr3[1] + i6;
            if (e3 instanceof InterfaceC0215l) {
                ((InterfaceC0215l) e3).e(viewGroup, i3, i4, i5, i6, i7);
            } else if (i7 == 0) {
                try {
                    AbstractC0194P.d(e3, viewGroup, i3, i4, i5, i6);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedScroll", e4);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i8;
            iArr[1] = iArr[1] - i9;
        }
        return true;
    }

    public final ViewParent e(int i3) {
        if (i3 == 0) {
            return this.f4222a;
        }
        if (i3 != 1) {
            return null;
        }
        return this.f4223b;
    }

    public final boolean f(int i3) {
        return e(i3) != null;
    }

    public final boolean g(int i3, int i4) {
        boolean f3;
        if (f(i4)) {
            return true;
        }
        if (this.f4225d) {
            ViewGroup viewGroup = this.f4224c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z3 = parent instanceof InterfaceC0215l;
                if (z3) {
                    f3 = ((InterfaceC0215l) parent).f(view, viewGroup, i3, i4);
                } else {
                    if (i4 == 0) {
                        try {
                            f3 = AbstractC0194P.f(parent, view, viewGroup, i3);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e3);
                        }
                    }
                    f3 = false;
                }
                if (f3) {
                    if (i4 == 0) {
                        this.f4222a = parent;
                    } else if (i4 == 1) {
                        this.f4223b = parent;
                    }
                    if (z3) {
                        ((InterfaceC0215l) parent).a(view, viewGroup, i3, i4);
                    } else if (i4 == 0) {
                        try {
                            AbstractC0194P.e(parent, view, viewGroup, i3);
                        } catch (AbstractMethodError e4) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e4);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i3) {
        ViewParent e3 = e(i3);
        if (e3 != null) {
            boolean z3 = e3 instanceof InterfaceC0215l;
            ViewGroup viewGroup = this.f4224c;
            if (z3) {
                ((InterfaceC0215l) e3).b(viewGroup, i3);
            } else if (i3 == 0) {
                try {
                    AbstractC0194P.g(e3, viewGroup);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onStopNestedScroll", e4);
                }
            }
            if (i3 == 0) {
                this.f4222a = null;
            } else {
                if (i3 != 1) {
                    return;
                }
                this.f4223b = null;
            }
        }
    }
}
