package androidx.constraintlayout.helper.widget;

import M0.d;
import M0.g;
import N0.b;
import O0.p;
import O0.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Flow extends q {

    /* renamed from: l, reason: collision with root package name */
    public g f3347l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // O0.q, O0.b
    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        g gVar = new g();
        gVar.f1647f0 = 0;
        gVar.f1648g0 = 0;
        gVar.f1649h0 = 0;
        gVar.i0 = 0;
        gVar.f1650j0 = 0;
        gVar.k0 = 0;
        gVar.f1651l0 = false;
        gVar.f1652m0 = 0;
        gVar.f1653n0 = 0;
        gVar.f1654o0 = new b();
        gVar.p0 = null;
        gVar.f1655q0 = -1;
        gVar.f1656r0 = -1;
        gVar.f1657s0 = -1;
        gVar.f1658t0 = -1;
        gVar.f1659u0 = -1;
        gVar.f1660v0 = -1;
        gVar.f1661w0 = 0.5f;
        gVar.f1662x0 = 0.5f;
        gVar.f1663y0 = 0.5f;
        gVar.f1664z0 = 0.5f;
        gVar.f1633A0 = 0.5f;
        gVar.f1634B0 = 0.5f;
        gVar.f1635C0 = 0;
        gVar.f1636D0 = 0;
        gVar.f1637E0 = 2;
        gVar.f1638F0 = 2;
        gVar.f1639G0 = 0;
        gVar.f1640H0 = -1;
        gVar.I0 = 0;
        gVar.f1641J0 = new ArrayList();
        gVar.f1642K0 = null;
        gVar.f1643L0 = null;
        gVar.f1644M0 = null;
        gVar.f1646O0 = 0;
        this.f3347l = gVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f2051b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 0) {
                    this.f3347l.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f3347l;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f1647f0 = dimensionPixelSize;
                    gVar2.f1648g0 = dimensionPixelSize;
                    gVar2.f1649h0 = dimensionPixelSize;
                    gVar2.i0 = dimensionPixelSize;
                } else if (index == 11) {
                    g gVar3 = this.f3347l;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f1649h0 = dimensionPixelSize2;
                    gVar3.f1650j0 = dimensionPixelSize2;
                    gVar3.k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f3347l.i0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f3347l.f1650j0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f3347l.f1647f0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f3347l.k0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f3347l.f1648g0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f3347l.f1639G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f3347l.f1655q0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f3347l.f1656r0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f3347l.f1657s0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f3347l.f1659u0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f3347l.f1658t0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f3347l.f1660v0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f3347l.f1661w0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f3347l.f1663y0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f3347l.f1633A0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f3347l.f1664z0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f3347l.f1634B0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f3347l.f1662x0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f3347l.f1637E0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f3347l.f1638F0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f3347l.f1635C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f3347l.f1636D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f3347l.f1640H0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f1883g = this.f3347l;
        g();
    }

    @Override // O0.b
    public final void f(d dVar, boolean z3) {
        g gVar = this.f3347l;
        int i3 = gVar.f1649h0;
        if (i3 > 0 || gVar.i0 > 0) {
            if (z3) {
                gVar.f1650j0 = gVar.i0;
                gVar.k0 = i3;
            } else {
                gVar.f1650j0 = i3;
                gVar.k0 = gVar.i0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05af  */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v7 */
    @Override // O0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(M0.g r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.h(M0.g, int, int):void");
    }

    @Override // O0.b, android.view.View
    public final void onMeasure(int i3, int i4) {
        h(this.f3347l, i3, i4);
    }

    public void setFirstHorizontalBias(float f3) {
        this.f3347l.f1663y0 = f3;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i3) {
        this.f3347l.f1657s0 = i3;
        requestLayout();
    }

    public void setFirstVerticalBias(float f3) {
        this.f3347l.f1664z0 = f3;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i3) {
        this.f3347l.f1658t0 = i3;
        requestLayout();
    }

    public void setHorizontalAlign(int i3) {
        this.f3347l.f1637E0 = i3;
        requestLayout();
    }

    public void setHorizontalBias(float f3) {
        this.f3347l.f1661w0 = f3;
        requestLayout();
    }

    public void setHorizontalGap(int i3) {
        this.f3347l.f1635C0 = i3;
        requestLayout();
    }

    public void setHorizontalStyle(int i3) {
        this.f3347l.f1655q0 = i3;
        requestLayout();
    }

    public void setMaxElementsWrap(int i3) {
        this.f3347l.f1640H0 = i3;
        requestLayout();
    }

    public void setOrientation(int i3) {
        this.f3347l.I0 = i3;
        requestLayout();
    }

    public void setPadding(int i3) {
        g gVar = this.f3347l;
        gVar.f1647f0 = i3;
        gVar.f1648g0 = i3;
        gVar.f1649h0 = i3;
        gVar.i0 = i3;
        requestLayout();
    }

    public void setPaddingBottom(int i3) {
        this.f3347l.f1648g0 = i3;
        requestLayout();
    }

    public void setPaddingLeft(int i3) {
        this.f3347l.f1650j0 = i3;
        requestLayout();
    }

    public void setPaddingRight(int i3) {
        this.f3347l.k0 = i3;
        requestLayout();
    }

    public void setPaddingTop(int i3) {
        this.f3347l.f1647f0 = i3;
        requestLayout();
    }

    public void setVerticalAlign(int i3) {
        this.f3347l.f1638F0 = i3;
        requestLayout();
    }

    public void setVerticalBias(float f3) {
        this.f3347l.f1662x0 = f3;
        requestLayout();
    }

    public void setVerticalGap(int i3) {
        this.f3347l.f1636D0 = i3;
        requestLayout();
    }

    public void setVerticalStyle(int i3) {
        this.f3347l.f1656r0 = i3;
        requestLayout();
    }

    public void setWrapMode(int i3) {
        this.f3347l.f1639G0 = i3;
        requestLayout();
    }
}
