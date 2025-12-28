package j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class t extends i implements SubMenu {

    /* renamed from: v, reason: collision with root package name */
    public final i f4595v;

    /* renamed from: w, reason: collision with root package name */
    public final j f4596w;

    public t(Context context, i iVar, j jVar) {
        super(context);
        this.f4595v = iVar;
        this.f4596w = jVar;
    }

    @Override // j.i
    public final boolean d(j jVar) {
        return this.f4595v.d(jVar);
    }

    @Override // j.i
    public final boolean e(i iVar, MenuItem menuItem) {
        super.e(iVar, menuItem);
        return this.f4595v.e(iVar, menuItem);
    }

    @Override // j.i
    public final boolean f(j jVar) {
        return this.f4595v.f(jVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4596w;
    }

    @Override // j.i
    public final i j() {
        return this.f4595v.j();
    }

    @Override // j.i
    public final boolean l() {
        return this.f4595v.l();
    }

    @Override // j.i
    public final boolean m() {
        return this.f4595v.m();
    }

    @Override // j.i
    public final boolean n() {
        return this.f4595v.n();
    }

    @Override // j.i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f4595v.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4596w.setIcon(drawable);
        return this;
    }

    @Override // j.i, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f4595v.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i3) {
        q(0, null, i3, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i3) {
        q(i3, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i3) {
        this.f4596w.setIcon(i3);
        return this;
    }
}
