package b;

import A.AbstractC0000a;
import a.AbstractC0090a;
import a1.C0097e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.D;
import androidx.lifecycle.E;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0128i;
import androidx.lifecycle.J;
import androidx.lifecycle.t;
import com.ai.assistance.operit.provider.MainComposeActivity;
import com.ai.assistance.operit.provider.R;
import d.C0176a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m.C0364b;
import m.C0366d;
import m.C0368f;
import v1.C0626a;

/* loaded from: classes.dex */
public abstract class k extends Activity implements J, InterfaceC0128i, A1.g, androidx.lifecycle.r {

    /* renamed from: d, reason: collision with root package name */
    public final t f3598d = new t(this);

    /* renamed from: e, reason: collision with root package name */
    public final C0176a f3599e = new C0176a();

    /* renamed from: f, reason: collision with root package name */
    public final A.t f3600f;

    /* renamed from: g, reason: collision with root package name */
    public final t f3601g;
    public final A1.f h;

    /* renamed from: i, reason: collision with root package name */
    public I f3602i;

    /* renamed from: j, reason: collision with root package name */
    public r f3603j;

    /* renamed from: k, reason: collision with root package name */
    public final j f3604k;

    /* renamed from: l, reason: collision with root package name */
    public final A1.f f3605l;

    /* renamed from: m, reason: collision with root package name */
    public final f f3606m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f3607n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f3608o;

    /* renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f3609p;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f3610q;

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f3611r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3612s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3613t;

    /* JADX WARN: Type inference failed for: r6v0, types: [b.c] */
    public k() {
        final MainComposeActivity mainComposeActivity = (MainComposeActivity) this;
        this.f3600f = new A.t(new R.a(6, mainComposeActivity));
        t tVar = new t(this);
        this.f3601g = tVar;
        A1.f fVar = new A1.f(this);
        this.h = fVar;
        A1.d dVar = null;
        this.f3603j = null;
        j jVar = new j(mainComposeActivity);
        this.f3604k = jVar;
        this.f3605l = new A1.f(jVar, new o2.a() { // from class: b.c
            @Override // o2.a
            public final Object c() {
                MainComposeActivity.this.reportFullyDrawn();
                return null;
            }
        });
        new AtomicInteger();
        this.f3606m = new f();
        this.f3607n = new CopyOnWriteArrayList();
        this.f3608o = new CopyOnWriteArrayList();
        this.f3609p = new CopyOnWriteArrayList();
        this.f3610q = new CopyOnWriteArrayList();
        this.f3611r = new CopyOnWriteArrayList();
        this.f3612s = false;
        this.f3613t = false;
        tVar.a(new g(mainComposeActivity, 0));
        tVar.a(new g(mainComposeActivity, 1));
        tVar.a(new g(mainComposeActivity, 2));
        fVar.c();
        androidx.lifecycle.m mVar = tVar.f3484c;
        if (mVar != androidx.lifecycle.m.f3475e && mVar != androidx.lifecycle.m.f3476f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        A1.e eVar = (A1.e) fVar.f217c;
        eVar.getClass();
        Iterator it = ((C0368f) eVar.f213c).iterator();
        while (true) {
            C0364b c0364b = (C0364b) it;
            if (!c0364b.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0364b.next();
            p2.g.d(entry, "components");
            String str = (String) entry.getKey();
            A1.d dVar2 = (A1.d) entry.getValue();
            if (p2.g.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                dVar = dVar2;
                break;
            }
        }
        if (dVar == null) {
            F f3 = new F((A1.e) this.h.f217c, this);
            ((A1.e) this.h.f217c).b("androidx.lifecycle.internal.SavedStateHandlesProvider", f3);
            this.f3601g.a(new A1.a(2, f3));
        }
        ((A1.e) this.h.f217c).b("android:support:activity-result", new d(0, mainComposeActivity));
        e eVar2 = new e(mainComposeActivity);
        C0176a c0176a = this.f3599e;
        c0176a.getClass();
        if (c0176a.f4137b != null) {
            eVar2.a();
        }
        c0176a.f4136a.add(eVar2);
    }

    @Override // androidx.lifecycle.InterfaceC0128i
    public final v1.b a() {
        v1.c cVar = new v1.c(C0626a.f6482b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f6483a;
        if (application != null) {
            linkedHashMap.put(E.f3450g, getApplication());
        }
        linkedHashMap.put(E.f3447d, this);
        linkedHashMap.put(E.f3448e, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(E.f3449f, getIntent().getExtras());
        }
        return cVar;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        this.f3604k.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // A1.g
    public final A1.e b() {
        return (A1.e) this.h.f217c;
    }

    @Override // androidx.lifecycle.r
    public final t c() {
        return this.f3601g;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r12) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.k.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        p2.g.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        p2.g.d(decorView, "window.decorView");
        if (Z0.d.r(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public final I e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f3602i == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f3602i = iVar.f3593a;
            }
            if (this.f3602i == null) {
                this.f3602i = new I(0);
            }
        }
        return this.f3602i;
    }

    public final void f() {
        View decorView = getWindow().getDecorView();
        p2.g.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        p2.g.e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        p2.g.e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        p2.g.e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        p2.g.e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final void g(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = D.f3445e;
        E.c(this);
    }

    public final void h(Bundle bundle) {
        p2.g.e(bundle, "outState");
        androidx.lifecycle.m mVar = androidx.lifecycle.m.f3476f;
        t tVar = this.f3598d;
        tVar.c("setCurrentState");
        tVar.e(mVar);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        if (this.f3606m.a(i3, i4, intent)) {
            return;
        }
        super.onActivityResult(i3, i4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.f3603j == null) {
            this.f3603j = new r(new M1.h(1, this));
            this.f3601g.a(new A1.a(3, this));
        }
        this.f3603j.a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f3607n.iterator();
        while (it.hasNext()) {
            ((C0097e) it.next()).a(configuration);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.r, java.lang.Object] */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        A1.f fVar = this.h;
        if (!fVar.f215a) {
            fVar.c();
        }
        t c3 = fVar.f216b.c();
        if (c3.f3484c.compareTo(androidx.lifecycle.m.f3477g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c3.f3484c).toString());
        }
        A1.e eVar = (A1.e) fVar.f217c;
        if (!eVar.f211a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (eVar.f212b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        eVar.f214d = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.f212b = true;
        C0176a c0176a = this.f3599e;
        c0176a.getClass();
        c0176a.f4137b = this;
        Iterator it = c0176a.f4136a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a();
        }
        g(bundle);
        int i3 = D.f3445e;
        E.c(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i3, Menu menu) {
        if (i3 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i3, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f3600f.f175e).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f3600f.f175e).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3) {
        if (this.f3612s) {
            return;
        }
        Iterator it = this.f3610q.iterator();
        while (it.hasNext()) {
            ((C0097e) it.next()).a(new X1.e(6));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f3609p.iterator();
        while (it.hasNext()) {
            ((C0097e) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i3, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f3600f.f175e).iterator();
        if (it.hasNext()) {
            AbstractC0000a.j(it.next());
            throw null;
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3) {
        if (this.f3613t) {
            return;
        }
        Iterator it = this.f3611r.iterator();
        while (it.hasNext()) {
            ((C0097e) it.next()).a(new X1.e(7));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i3, View view, Menu menu) {
        if (i3 != 0) {
            return true;
        }
        super.onPreparePanel(i3, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f3600f.f175e).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (this.f3606m.a(i3, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        I i3 = this.f3602i;
        if (i3 == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            i3 = iVar.f3593a;
        }
        if (i3 == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f3593a = i3;
        return iVar2;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        t tVar = this.f3601g;
        if (tVar != null) {
            androidx.lifecycle.m mVar = androidx.lifecycle.m.f3476f;
            tVar.c("setCurrentState");
            tVar.e(mVar);
        }
        h(bundle);
        A1.f fVar = this.h;
        fVar.getClass();
        p2.g.e(bundle, "outBundle");
        A1.e eVar = (A1.e) fVar.f217c;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) eVar.f214d;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0368f c0368f = (C0368f) eVar.f213c;
        c0368f.getClass();
        C0366d c0366d = new C0366d(c0368f);
        c0368f.f4953f.put(c0366d, Boolean.FALSE);
        while (c0366d.hasNext()) {
            Map.Entry entry = (Map.Entry) c0366d.next();
            bundle2.putBundle((String) entry.getKey(), ((A1.d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        Iterator it = this.f3608o.iterator();
        while (it.hasNext()) {
            ((C0097e) it.next()).a(Integer.valueOf(i3));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0090a.P()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            A1.f fVar = this.f3605l;
            synchronized (fVar.f216b) {
                try {
                    fVar.f215a = true;
                    Iterator it = ((ArrayList) fVar.f217c).iterator();
                    while (it.hasNext()) {
                        ((o2.a) it.next()).c();
                    }
                    ((ArrayList) fVar.f217c).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i3) {
        f();
        this.f3604k.a(getWindow().getDecorView());
        super.setContentView(i3);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        f();
        this.f3604k.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z3, Configuration configuration) {
        this.f3612s = true;
        try {
            super.onMultiWindowModeChanged(z3, configuration);
            this.f3612s = false;
            Iterator it = this.f3610q.iterator();
            while (it.hasNext()) {
                C0097e c0097e = (C0097e) it.next();
                p2.g.e(configuration, "newConfig");
                c0097e.a(new X1.e(6));
            }
        } catch (Throwable th) {
            this.f3612s = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        this.f3613t = true;
        try {
            super.onPictureInPictureModeChanged(z3, configuration);
            this.f3613t = false;
            Iterator it = this.f3611r.iterator();
            while (it.hasNext()) {
                C0097e c0097e = (C0097e) it.next();
                p2.g.e(configuration, "newConfig");
                c0097e.a(new X1.e(7));
            }
        } catch (Throwable th) {
            this.f3613t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        this.f3604k.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
