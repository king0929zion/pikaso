package b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import d2.C0238i;
import java.util.ListIterator;
import s1.C0592f;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final M1.h f3626a;

    /* renamed from: b, reason: collision with root package name */
    public final C0238i f3627b = new C0238i();

    /* renamed from: c, reason: collision with root package name */
    public C0592f f3628c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f3629d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f3630e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3631f;

    public r(M1.h hVar) {
        this.f3626a = hVar;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            this.f3629d = i3 >= 34 ? q.f3625a.a(new l(this, 0), new l(this, 1), new m(this, 0), new m(this, 1)) : o.f3620a.a(new m(this, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void a() {
        C0592f c0592f;
        C0592f c0592f2 = this.f3628c;
        if (c0592f2 == null) {
            C0238i c0238i = this.f3627b;
            ListIterator listIterator = c0238i.listIterator(c0238i.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0592f = 0;
                    break;
                } else {
                    c0592f = listIterator.previous();
                    if (((C0592f) c0592f).f6134a) {
                        break;
                    }
                }
            }
            c0592f2 = c0592f;
        }
        this.f3628c = null;
        if (c0592f2 == null) {
            this.f3626a.run();
        } else {
            c0592f2.f6135b.i();
            throw null;
        }
    }
}
