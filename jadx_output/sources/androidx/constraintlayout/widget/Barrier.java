package androidx.constraintlayout.widget;

import M0.a;
import M0.d;
import O0.b;
import O0.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: j, reason: collision with root package name */
    public int f3348j;

    /* renamed from: k, reason: collision with root package name */
    public int f3349k;

    /* renamed from: l, reason: collision with root package name */
    public a f3350l;

    public Barrier(Context context) {
        super(context);
        this.f1880d = new int[32];
        this.f1884i = new HashMap();
        this.f1882f = context;
        e(null);
        super.setVisibility(8);
    }

    @Override // O0.b
    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        a aVar = new a();
        aVar.f1524f0 = 0;
        aVar.f1525g0 = true;
        aVar.f1526h0 = 0;
        this.f3350l = aVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f2051b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 15) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.f3350l.f1525g0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.f3350l.f1526h0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.f1883g = this.f3350l;
        g();
    }

    @Override // O0.b
    public final void f(d dVar, boolean z3) {
        int i3 = this.f3348j;
        this.f3349k = i3;
        if (z3) {
            if (i3 == 5) {
                this.f3349k = 1;
            } else if (i3 == 6) {
                this.f3349k = 0;
            }
        } else if (i3 == 5) {
            this.f3349k = 0;
        } else if (i3 == 6) {
            this.f3349k = 1;
        }
        if (dVar instanceof a) {
            ((a) dVar).f1524f0 = this.f3349k;
        }
    }

    public int getMargin() {
        return this.f3350l.f1526h0;
    }

    public int getType() {
        return this.f3348j;
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.f3350l.f1525g0 = z3;
    }

    public void setDpMargin(int i3) {
        this.f3350l.f1526h0 = (int) ((i3 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i3) {
        this.f3350l.f1526h0 = i3;
    }

    public void setType(int i3) {
        this.f3348j = i3;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
