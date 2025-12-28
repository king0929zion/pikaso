package N;

import A.C0008i;
import D.C0032d;
import D.C0065y;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final o0.r f1783a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1785c;

    /* renamed from: g, reason: collision with root package name */
    public g f1789g;
    public u h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f1784b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final C0008i f1786d = new C0008i(5, this);

    /* renamed from: e, reason: collision with root package name */
    public final C0065y f1787e = new C0065y(6, this);

    /* renamed from: f, reason: collision with root package name */
    public final F.d f1788f = new F.d(new u[16]);

    /* renamed from: i, reason: collision with root package name */
    public long f1790i = -1;

    public v(o0.r rVar) {
        this.f1783a = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(v vVar) {
        boolean z3;
        Set set;
        synchronized (vVar.f1788f) {
            z3 = vVar.f1785c;
        }
        if (z3) {
            return false;
        }
        boolean z4 = false;
        while (true) {
            AtomicReference atomicReference = vVar.f1784b;
            Object obj = atomicReference.get();
            Set set2 = null;
            r4 = null;
            List list = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        C0032d.s("Unexpected notification");
                        throw null;
                    }
                    List list2 = (List) obj;
                    set = (Set) list2.get(0);
                    if (list2.size() == 2) {
                        list = list2.get(1);
                    } else if (list2.size() > 2) {
                        list = list2.subList(1, list2.size());
                    }
                }
                List list3 = list;
                while (!atomicReference.compareAndSet(obj, list3)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z4;
            }
            synchronized (vVar.f1788f) {
                F.d dVar = vVar.f1788f;
                int i3 = dVar.f1160f;
                if (i3 > 0) {
                    Object[] objArr = dVar.f1158d;
                    int i4 = 0;
                    do {
                        z4 = ((u) objArr[i4]).b(set2) || z4;
                        i4++;
                    } while (i4 < i3);
                }
            }
        }
    }
}
