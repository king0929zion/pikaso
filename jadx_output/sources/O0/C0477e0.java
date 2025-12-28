package o0;

import D.C0032d;
import D.C0037f0;
import D.C0052n;
import D.C0053n0;
import a2.ViewOnAttachStateChangeListenerC0115n;
import com.ai.assistance.operit.provider.MainComposeActivity;
import n0.C0410D;

/* renamed from: o0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477e0 extends AbstractC0468a {

    /* renamed from: l, reason: collision with root package name */
    public final C0037f0 f5567l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5568m;

    public C0477e0(MainComposeActivity mainComposeActivity) {
        super(mainComposeActivity, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        ViewOnAttachStateChangeListenerC0115n viewOnAttachStateChangeListenerC0115n = new ViewOnAttachStateChangeListenerC0115n(4, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0115n);
        X.d dVar = new X.d(4);
        Z.b.v(this).f4939a.add(dVar);
        this.h = new C0410D(this, viewOnAttachStateChangeListenerC0115n, dVar, 2);
        this.f5567l = C0032d.A(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // o0.AbstractC0468a
    public final void a(int i3, C0052n c0052n) {
        int i4;
        c0052n.O(420213850);
        if ((i3 & 6) == 0) {
            i4 = (c0052n.h(this) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0052n.y()) {
            c0052n.K();
        } else {
            o2.e eVar = (o2.e) this.f5567l.getValue();
            if (eVar == null) {
                c0052n.N(358373017);
            } else {
                c0052n.N(150107752);
                eVar.h(c0052n, 0);
            }
            c0052n.q(false);
        }
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            s3.f834d = new A.M(this, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C0477e0.class.getName();
    }

    @Override // o0.AbstractC0468a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f5568m;
    }

    public final void setContent(o2.e eVar) {
        this.f5568m = true;
        this.f5567l.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f5540g == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }
}
