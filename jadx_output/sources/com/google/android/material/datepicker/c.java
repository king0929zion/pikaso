package com.google.android.material.datepicker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import com.ai.assistance.operit.provider.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s1.DialogInterfaceOnCancelListenerC0590d;

/* loaded from: classes.dex */
public final class c<S> extends DialogInterfaceOnCancelListenerC0590d {

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f3978l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f3979m;

    public c() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f3978l = new LinkedHashSet();
        this.f3979m = new LinkedHashSet();
    }

    public static boolean e(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r2.a.T(context, R.attr.materialCalendarStyle, a.class.getCanonicalName()).data, new int[]{i3});
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z3;
    }

    @Override // s1.DialogInterfaceOnCancelListenerC0590d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f3978l.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // s1.DialogInterfaceOnCancelListenerC0590d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f3979m.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}
