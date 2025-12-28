package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import d1.AbstractC0191M;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0318k;
import k.N0;

/* loaded from: classes.dex */
public class i implements Menu {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f4518u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f4519a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f4520b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4521c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4522d;

    /* renamed from: e, reason: collision with root package name */
    public A.t f4523e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4524f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4525g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4526i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4527j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4528k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4529l;

    /* renamed from: s, reason: collision with root package name */
    public j f4536s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4530m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4531n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4532o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4533p = false;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f4534q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f4535r = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f4537t = false;

    public i(Context context) {
        boolean z3;
        boolean z4 = false;
        this.f4519a = context;
        Resources resources = context.getResources();
        this.f4520b = resources;
        this.f4524f = new ArrayList();
        this.f4525g = new ArrayList();
        this.h = true;
        this.f4526i = new ArrayList();
        this.f4527j = new ArrayList();
        this.f4528k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = AbstractC0191M.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z3 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z3) {
                z4 = true;
            }
        }
        this.f4522d = z4;
    }

    public final j a(int i3, int i4, int i5, CharSequence charSequence) {
        int i6;
        int i7 = ((-65536) & i5) >> 16;
        if (i7 < 0 || i7 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i8 = (f4518u[i7] << 16) | (65535 & i5);
        j jVar = new j(this, i3, i4, i5, i8, charSequence);
        ArrayList arrayList = this.f4524f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i6 = 0;
                break;
            }
            if (((j) arrayList.get(size)).f4543d <= i8) {
                i6 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i6, jVar);
        o(true);
        return jVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        PackageManager packageManager = this.f4519a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i6 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i9 < 0 ? intent : intentArr[i9]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            j a3 = a(i3, i4, i5, resolveInfo.loadLabel(packageManager));
            a3.setIcon(resolveInfo.loadIcon(packageManager));
            a3.f4546g = intent2;
            if (menuItemArr != null && (i7 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i7] = a3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p pVar, Context context) {
        this.f4535r.add(new WeakReference(pVar));
        pVar.c(context, this);
        this.f4528k = true;
    }

    public final void c(boolean z3) {
        if (this.f4533p) {
            return;
        }
        this.f4533p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4535r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.a(this, z3);
            }
        }
        this.f4533p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        j jVar = this.f4536s;
        if (jVar != null) {
            d(jVar);
        }
        this.f4524f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f4529l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4535r;
        boolean z3 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f4536s == jVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 = pVar.j(jVar);
                    if (z3) {
                        break;
                    }
                }
            }
            r();
            if (z3) {
                this.f4536s = null;
            }
        }
        return z3;
    }

    public boolean e(i iVar, MenuItem menuItem) {
        InterfaceC0318k interfaceC0318k;
        A.t tVar = this.f4523e;
        if (tVar == null || (interfaceC0318k = ((ActionMenuView) tVar.f175e).f3149B) == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((N0) interfaceC0318k).f4696a.f3220J.f175e).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public boolean f(j jVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4535r;
        boolean z3 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z3 = pVar.f(jVar);
                if (z3) {
                    break;
                }
            }
        }
        r();
        if (z3) {
            this.f4536s = jVar;
        }
        return z3;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        MenuItem findItem;
        ArrayList arrayList = this.f4524f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = (j) arrayList.get(i4);
            if (jVar.f4540a == i3) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.f4553o.findItem(i3)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final j g(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f4534q;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (j) arrayList.get(0);
        }
        boolean m2 = m();
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = (j) arrayList.get(i4);
            char c3 = m2 ? jVar.f4548j : jVar.h;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (m2 && c3 == '\b' && i3 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f4524f.get(i3);
    }

    public final void h(ArrayList arrayList, int i3, KeyEvent keyEvent) {
        int i4;
        boolean m2 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList2 = this.f4524f;
            int size = arrayList2.size();
            for (0; i4 < size; i4 + 1) {
                j jVar = (j) arrayList2.get(i4);
                if (jVar.hasSubMenu()) {
                    jVar.f4553o.h(arrayList, i3, keyEvent);
                }
                char c3 = m2 ? jVar.f4548j : jVar.h;
                if ((modifiers & 69647) == ((m2 ? jVar.f4549k : jVar.f4547i) & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if (c3 != cArr[0] && c3 != cArr[2]) {
                        if (m2 && c3 == '\b') {
                            i4 = i3 != 67 ? i4 + 1 : 0;
                        }
                    }
                    if (jVar.isEnabled()) {
                        arrayList.add(jVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f4524f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((j) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k3 = k();
        if (this.f4528k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f4535r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 |= pVar.d();
                }
            }
            ArrayList arrayList = this.f4526i;
            ArrayList arrayList2 = this.f4527j;
            if (z3) {
                arrayList.clear();
                arrayList2.clear();
                int size = k3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    j jVar = (j) k3.get(i3);
                    if (jVar.d()) {
                        arrayList.add(jVar);
                    } else {
                        arrayList2.add(jVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f4528k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return g(i3, keyEvent) != null;
    }

    public i j() {
        return this;
    }

    public final ArrayList k() {
        boolean z3 = this.h;
        ArrayList arrayList = this.f4525g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f4524f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = (j) arrayList2.get(i3);
            if (jVar.isVisible()) {
                arrayList.add(jVar);
            }
        }
        this.h = false;
        this.f4528k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f4537t;
    }

    public boolean m() {
        return this.f4521c;
    }

    public boolean n() {
        return this.f4522d;
    }

    public final void o(boolean z3) {
        if (this.f4530m) {
            this.f4531n = true;
            if (z3) {
                this.f4532o = true;
                return;
            }
            return;
        }
        if (z3) {
            this.h = true;
            this.f4528k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4535r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.g();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MenuItem r6, j.k r7, int r8) {
        /*
            r5 = this;
            j.j r6 = (j.j) r6
            r0 = 0
            if (r6 == 0) goto Lab
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto Ld
            goto Lab
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r6.f4554p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r6)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L36
        L1a:
            j.i r1 = r6.f4552n
            boolean r3 = r1.e(r1, r6)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r6.f4546g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f4519a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            r1 = r0
        L36:
            boolean r3 = r6.c()
            if (r3 == 0) goto L47
            boolean r6 = r6.expandActionView()
            r1 = r1 | r6
            if (r1 == 0) goto Laa
            r5.c(r2)
            goto Laa
        L47:
            boolean r3 = r6.hasSubMenu()
            if (r3 != 0) goto L55
            r6 = r8 & 1
            if (r6 != 0) goto Laa
            r5.c(r2)
            goto Laa
        L55:
            r8 = r8 & 4
            if (r8 != 0) goto L5c
            r5.c(r0)
        L5c:
            boolean r8 = r6.hasSubMenu()
            if (r8 != 0) goto L70
            j.t r8 = new j.t
            android.content.Context r3 = r5.f4519a
            r8.<init>(r3, r5, r6)
            r6.f4553o = r8
            java.lang.CharSequence r3 = r6.f4544e
            r8.setHeaderTitle(r3)
        L70:
            j.t r6 = r6.f4553o
            java.util.concurrent.CopyOnWriteArrayList r8 = r5.f4535r
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L7b
            goto La4
        L7b:
            if (r7 == 0) goto L81
            boolean r0 = r7.l(r6)
        L81:
            java.util.Iterator r7 = r8.iterator()
        L85:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r7.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            j.p r4 = (j.p) r4
            if (r4 != 0) goto L9d
            r8.remove(r3)
            goto L85
        L9d:
            if (r0 != 0) goto L85
            boolean r0 = r4.l(r6)
            goto L85
        La4:
            r1 = r1 | r0
            if (r1 != 0) goto Laa
            r5.c(r2)
        Laa:
            return r1
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.i.p(android.view.MenuItem, j.k, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i4) {
        return p(findItem(i3), null, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        j g3 = g(i3, keyEvent);
        boolean p3 = g3 != null ? p(g3, null, i4) : false;
        if ((i4 & 2) != 0) {
            c(true);
        }
        return p3;
    }

    public final void q(int i3, CharSequence charSequence, int i4, View view) {
        if (view != null) {
            this.f4529l = null;
        } else {
            if (i3 > 0) {
                this.f4529l = this.f4520b.getText(i3);
            } else if (charSequence != null) {
                this.f4529l = charSequence;
            }
            if (i4 > 0) {
                T0.a.b(this.f4519a, i4);
            }
        }
        o(false);
    }

    public final void r() {
        this.f4530m = false;
        if (this.f4531n) {
            this.f4531n = false;
            o(this.f4532o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f4524f;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((j) arrayList.get(i5)).f4541b == i3) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            int size2 = arrayList.size() - i5;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= size2 || ((j) arrayList.get(i5)).f4541b != i3) {
                    break;
                }
                if (i5 >= 0) {
                    ArrayList arrayList2 = this.f4524f;
                    if (i5 < arrayList2.size()) {
                        arrayList2.remove(i5);
                    }
                }
                i4 = i6;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f4524f;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((j) arrayList.get(i4)).f4540a == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList2 = this.f4524f;
            if (i4 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i4);
            o(true);
        }
    }

    public final void s() {
        if (this.f4530m) {
            return;
        }
        this.f4530m = true;
        this.f4531n = false;
        this.f4532o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z3, boolean z4) {
        ArrayList arrayList = this.f4524f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = (j) arrayList.get(i4);
            if (jVar.f4541b == i3) {
                jVar.f4562x = (jVar.f4562x & (-5)) | (z4 ? 4 : 0);
                jVar.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f4537t = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z3) {
        ArrayList arrayList = this.f4524f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = (j) arrayList.get(i4);
            if (jVar.f4541b == i3) {
                jVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z3) {
        ArrayList arrayList = this.f4524f;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = (j) arrayList.get(i4);
            if (jVar.f4541b == i3) {
                int i5 = jVar.f4562x;
                int i6 = (i5 & (-9)) | (z3 ? 0 : 8);
                jVar.f4562x = i6;
                if (i5 != i6) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f4521c = z3;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4524f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f4520b.getString(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f4520b.getString(i3));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return a(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        j a3 = a(i3, i4, i5, charSequence);
        t tVar = new t(this.f4519a, this, a3);
        a3.f4553o = tVar;
        tVar.setHeaderTitle(a3.f4544e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return a(i3, i4, i5, this.f4520b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return addSubMenu(i3, i4, i5, this.f4520b.getString(i6));
    }
}
