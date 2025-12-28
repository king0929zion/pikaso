package b;

import android.content.Intent;
import android.os.Bundle;
import e.C0252a;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3585a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3586b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3587c;

    /* renamed from: d, reason: collision with root package name */
    public final transient HashMap f3588d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f3589e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f3590f;

    public f() {
        new HashMap();
        this.f3587c = new ArrayList();
        this.f3588d = new HashMap();
        this.f3589e = new HashMap();
        this.f3590f = new Bundle();
    }

    public final boolean a(int i3, int i4, Intent intent) {
        String str = (String) this.f3585a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        this.f3589e.remove(str);
        this.f3590f.putParcelable(str, new C0252a(i4, intent));
        return true;
    }
}
