package j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4567a;

    /* renamed from: b, reason: collision with root package name */
    public final i f4568b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4569c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4570d;

    /* renamed from: e, reason: collision with root package name */
    public View f4571e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4573g;
    public o h;

    /* renamed from: i, reason: collision with root package name */
    public k f4574i;

    /* renamed from: j, reason: collision with root package name */
    public l f4575j;

    /* renamed from: f, reason: collision with root package name */
    public int f4572f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final l f4576k = new l(this);

    public n(int i3, Context context, View view, i iVar, boolean z3) {
        this.f4567a = context;
        this.f4568b = iVar;
        this.f4571e = view;
        this.f4569c = z3;
        this.f4570d = i3;
    }

    public final k a() {
        k sVar;
        if (this.f4574i == null) {
            Context context = this.f4567a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            m.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new f(context, this.f4571e, this.f4570d, this.f4569c);
            } else {
                View view = this.f4571e;
                Context context2 = this.f4567a;
                boolean z3 = this.f4569c;
                sVar = new s(this.f4570d, context2, view, this.f4568b, z3);
            }
            sVar.m(this.f4568b);
            sVar.s(this.f4576k);
            sVar.o(this.f4571e);
            sVar.k(this.h);
            sVar.p(this.f4573g);
            sVar.q(this.f4572f);
            this.f4574i = sVar;
        }
        return this.f4574i;
    }

    public final boolean b() {
        k kVar = this.f4574i;
        return kVar != null && kVar.h();
    }

    public void c() {
        this.f4574i = null;
        l lVar = this.f4575j;
        if (lVar != null) {
            lVar.onDismiss();
        }
    }

    public final void d(int i3, int i4, boolean z3, boolean z4) {
        k a3 = a();
        a3.t(z4);
        if (z3) {
            int i5 = this.f4572f;
            View view = this.f4571e;
            Field field = AbstractC0189K.f4150a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f4571e.getWidth();
            }
            a3.r(i3);
            a3.u(i4);
            int i6 = (int) ((this.f4567a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a3.f4565d = new Rect(i3 - i6, i4 - i6, i3 + i6, i4 + i6);
        }
        a3.b();
    }
}
