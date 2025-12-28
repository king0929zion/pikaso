package M;

import java.util.LinkedHashMap;
import o0.C0492m;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1517a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1518b;

    public c(LinkedHashMap linkedHashMap) {
        this.f1517a = linkedHashMap != null ? new LinkedHashMap(linkedHashMap) : new LinkedHashMap();
        this.f1518b = new LinkedHashMap();
    }

    public boolean a(Object obj) {
        return ((Boolean) C0492m.f5608j.i(obj)).booleanValue();
    }

    public c() {
        this.f1517a = new LinkedHashMap();
        this.f1518b = new LinkedHashMap();
    }
}
