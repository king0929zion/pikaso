package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements MenuItem {

    /* renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f4538A;

    /* renamed from: a, reason: collision with root package name */
    public final int f4540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4541b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4542c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4543d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4544e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f4545f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f4546g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f4548j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4550l;

    /* renamed from: n, reason: collision with root package name */
    public final i f4552n;

    /* renamed from: o, reason: collision with root package name */
    public t f4553o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f4554p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f4555q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f4556r;

    /* renamed from: z, reason: collision with root package name */
    public View f4564z;

    /* renamed from: i, reason: collision with root package name */
    public int f4547i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f4549k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f4551m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f4557s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f4558t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4559u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4560v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4561w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f4562x = 16;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4539B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f4563y = 0;

    public j(i iVar, int i3, int i4, int i5, int i6, CharSequence charSequence) {
        this.f4552n = iVar;
        this.f4540a = i4;
        this.f4541b = i3;
        this.f4542c = i5;
        this.f4543d = i6;
        this.f4544e = charSequence;
    }

    public static void a(StringBuilder sb, int i3, int i4, String str) {
        if ((i3 & i4) == i4) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f4561w && (this.f4559u || this.f4560v)) {
            drawable = drawable.mutate();
            if (this.f4559u) {
                W0.a.h(drawable, this.f4557s);
            }
            if (this.f4560v) {
                W0.a.i(drawable, this.f4558t);
            }
            this.f4561w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return ((this.f4563y & 8) == 0 || this.f4564z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f4563y & 8) == 0) {
            return false;
        }
        if (this.f4564z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4538A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4552n.d(this);
        }
        return false;
    }

    public final boolean d() {
        return (this.f4562x & 32) == 32;
    }

    public final j e(CharSequence charSequence) {
        this.f4555q = charSequence;
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4538A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4552n.f(this);
        }
        return false;
    }

    public final void f(boolean z3) {
        if (z3) {
            this.f4562x |= 32;
        } else {
            this.f4562x &= -33;
        }
    }

    public final j g(CharSequence charSequence) {
        this.f4556r = charSequence;
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f4564z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4549k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4548j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4555q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4541b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f4550l;
        if (drawable != null) {
            return b(drawable);
        }
        int i3 = this.f4551m;
        if (i3 == 0) {
            return null;
        }
        Drawable r3 = Z.b.r(this.f4552n.f4519a, i3);
        this.f4551m = 0;
        this.f4550l = r3;
        return b(r3);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4557s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4558t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4546g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f4540a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4547i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4542c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f4553o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4544e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4545f;
        return charSequence != null ? charSequence : this.f4544e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4556r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f4553o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f4539B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4562x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4562x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4562x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f4562x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i3;
        this.f4564z = view;
        if (view != null && view.getId() == -1 && (i3 = this.f4540a) > 0) {
            view.setId(i3);
        }
        i iVar = this.f4552n;
        iVar.f4528k = true;
        iVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f4548j == c3) {
            return this;
        }
        this.f4548j = Character.toLowerCase(c3);
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i3 = this.f4562x;
        int i4 = (z3 ? 1 : 0) | (i3 & (-2));
        this.f4562x = i4;
        if (i3 != i4) {
            this.f4552n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i3 = this.f4562x;
        if ((i3 & 4) != 0) {
            i iVar = this.f4552n;
            iVar.getClass();
            ArrayList arrayList = iVar.f4524f;
            int size = arrayList.size();
            iVar.s();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar = (j) arrayList.get(i4);
                if (jVar.f4541b == this.f4541b && (jVar.f4562x & 4) != 0 && jVar.isCheckable()) {
                    boolean z4 = jVar == this;
                    int i5 = jVar.f4562x;
                    int i6 = (z4 ? 2 : 0) | (i5 & (-3));
                    jVar.f4562x = i6;
                    if (i5 != i6) {
                        jVar.f4552n.o(false);
                    }
                }
            }
            iVar.r();
        } else {
            int i7 = (i3 & (-3)) | (z3 ? 2 : 0);
            this.f4562x = i7;
            if (i3 != i7) {
                this.f4552n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f4562x |= 16;
        } else {
            this.f4562x &= -17;
        }
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4551m = 0;
        this.f4550l = drawable;
        this.f4561w = true;
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4557s = colorStateList;
        this.f4559u = true;
        this.f4561w = true;
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4558t = mode;
        this.f4560v = true;
        this.f4561w = true;
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4546g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.h == c3) {
            return this;
        }
        this.h = c3;
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4538A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4554p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.h = c3;
        this.f4548j = Character.toLowerCase(c4);
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        int i4 = i3 & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f4563y = i3;
        i iVar = this.f4552n;
        iVar.f4528k = true;
        iVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4544e = charSequence;
        this.f4552n.o(false);
        t tVar = this.f4553o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4545f = charSequence;
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i3 = this.f4562x;
        int i4 = (z3 ? 0 : 8) | (i3 & (-9));
        this.f4562x = i4;
        if (i3 != i4) {
            i iVar = this.f4552n;
            iVar.h = true;
            iVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f4544e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i3) {
        if (this.f4548j == c3 && this.f4549k == i3) {
            return this;
        }
        this.f4548j = Character.toLowerCase(c3);
        this.f4549k = KeyEvent.normalizeMetaState(i3);
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i3) {
        if (this.h == c3 && this.f4547i == i3) {
            return this;
        }
        this.h = c3;
        this.f4547i = KeyEvent.normalizeMetaState(i3);
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.h = c3;
        this.f4547i = KeyEvent.normalizeMetaState(i3);
        this.f4548j = Character.toLowerCase(c4);
        this.f4549k = KeyEvent.normalizeMetaState(i4);
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f4550l = null;
        this.f4551m = i3;
        this.f4561w = true;
        this.f4552n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        setTitle(this.f4552n.f4519a.getString(i3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        int i4;
        Context context = this.f4552n.f4519a;
        View inflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.f4564z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i4 = this.f4540a) > 0) {
            inflate.setId(i4);
        }
        i iVar = this.f4552n;
        iVar.f4528k = true;
        iVar.o(true);
        return this;
    }
}
