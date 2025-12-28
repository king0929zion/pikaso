package d1;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: d1.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198U extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final M1.j f4166a;

    /* renamed from: b, reason: collision with root package name */
    public List f4167b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f4168c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f4169d;

    public C0198U(M1.j jVar) {
        super(0);
        this.f4169d = new HashMap();
        this.f4166a = jVar;
    }

    public final C0201X a(WindowInsetsAnimation windowInsetsAnimation) {
        C0201X c0201x = (C0201X) this.f4169d.get(windowInsetsAnimation);
        if (c0201x == null) {
            c0201x = new C0201X(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0201x.f4175a = new C0199V(windowInsetsAnimation);
            }
            this.f4169d.put(windowInsetsAnimation, c0201x);
        }
        return c0201x;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        M1.j jVar = this.f4166a;
        a(windowInsetsAnimation);
        ((View) jVar.f1699e).setTranslationY(0.0f);
        this.f4169d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        M1.j jVar = this.f4166a;
        a(windowInsetsAnimation);
        View view = (View) jVar.f1699e;
        int[] iArr = (int[]) jVar.f1696b;
        view.getLocationOnScreen(iArr);
        jVar.f1695a = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f4168c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f4168c = arrayList2;
            this.f4167b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation l3 = G1.i.l(list.get(size));
            C0201X a3 = a(l3);
            fraction = l3.getFraction();
            a3.f4175a.d(fraction);
            this.f4168c.add(a3);
        }
        M1.j jVar = this.f4166a;
        l0 d3 = l0.d(null, windowInsets);
        jVar.f(d3, this.f4167b);
        return d3.c();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        M1.j jVar = this.f4166a;
        a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        V0.c c3 = V0.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        V0.c c4 = V0.c.c(upperBound);
        View view = (View) jVar.f1699e;
        int[] iArr = (int[]) jVar.f1696b;
        view.getLocationOnScreen(iArr);
        int i3 = jVar.f1695a - iArr[1];
        jVar.f1697c = i3;
        view.setTranslationY(i3);
        G1.i.n();
        return G1.i.j(c3.d(), c4.d());
    }
}
