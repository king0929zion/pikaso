package s1;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.InterfaceC0128i;
import androidx.lifecycle.J;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: s1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0591e implements ComponentCallbacks, View.OnCreateContextMenuListener, r, J, InterfaceC0128i, A1.g {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f6130g = null;

    /* renamed from: d, reason: collision with root package name */
    public final String f6131d = UUID.randomUUID().toString();

    /* renamed from: e, reason: collision with root package name */
    public final t f6132e;

    /* renamed from: f, reason: collision with root package name */
    public final A1.f f6133f;

    public AbstractComponentCallbacksC0591e() {
        new B2.i(19);
        new v();
        new AtomicInteger();
        new ArrayList();
        this.f6132e = new t(this);
        this.f6133f = new A1.f(this);
    }

    @Override // A1.g
    public final A1.e b() {
        return (A1.e) this.f6133f.f217c;
    }

    @Override // androidx.lifecycle.r
    public final t c() {
        return this.f6132e;
    }

    public final B2.i d() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f6131d);
        sb.append(")");
        return sb.toString();
    }
}
