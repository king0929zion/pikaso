package o0;

import D.C0041h0;
import android.os.Handler;
import android.view.Choreographer;
import c2.C0172k;
import d2.C0238i;
import g2.InterfaceC0276i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class W extends y2.r {

    /* renamed from: p, reason: collision with root package name */
    public static final C0172k f5514p = Z.b.C(C0462L.f5459l);

    /* renamed from: q, reason: collision with root package name */
    public static final U f5515q = new U(0);

    /* renamed from: f, reason: collision with root package name */
    public final Choreographer f5516f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f5517g;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5521l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5522m;

    /* renamed from: o, reason: collision with root package name */
    public final C0041h0 f5524o;
    public final Object h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final C0238i f5518i = new C0238i();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f5519j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f5520k = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final V f5523n = new V(this);

    public W(Choreographer choreographer, Handler handler) {
        this.f5516f = choreographer;
        this.f5517g = handler;
        this.f5524o = new C0041h0(choreographer, this);
    }

    public static final void j(W w3) {
        Runnable runnable;
        boolean z3;
        do {
            synchronized (w3.h) {
                C0238i c0238i = w3.f5518i;
                runnable = (Runnable) (c0238i.isEmpty() ? null : c0238i.h());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (w3.h) {
                    C0238i c0238i2 = w3.f5518i;
                    runnable = (Runnable) (c0238i2.isEmpty() ? null : c0238i2.h());
                }
            }
            synchronized (w3.h) {
                if (w3.f5518i.isEmpty()) {
                    z3 = false;
                    w3.f5521l = false;
                } else {
                    z3 = true;
                }
            }
        } while (z3);
    }

    @Override // y2.r
    public final void d(InterfaceC0276i interfaceC0276i, Runnable runnable) {
        synchronized (this.h) {
            this.f5518i.c(runnable);
            if (!this.f5521l) {
                this.f5521l = true;
                this.f5517g.post(this.f5523n);
                if (!this.f5522m) {
                    this.f5522m = true;
                    this.f5516f.postFrameCallback(this.f5523n);
                }
            }
        }
    }
}
