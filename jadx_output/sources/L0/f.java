package L0;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1485a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1486b;

    /* renamed from: c, reason: collision with root package name */
    public int f1487c;

    public f(int i3) {
        this.f1485a = 1;
        if (i3 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1486b = new Object[i3];
    }

    public Object a() {
        switch (this.f1485a) {
            case 0:
                int i3 = this.f1487c;
                if (i3 <= 0) {
                    return null;
                }
                int i4 = i3 - 1;
                Object[] objArr = this.f1486b;
                Object obj = objArr[i4];
                objArr[i4] = null;
                this.f1487c = i3 - 1;
                return obj;
            default:
                int i5 = this.f1487c;
                if (i5 <= 0) {
                    return null;
                }
                int i6 = i5 - 1;
                Object[] objArr2 = this.f1486b;
                Object obj2 = objArr2[i6];
                p2.g.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr2[i6] = null;
                this.f1487c--;
                return obj2;
        }
    }

    public void b(c cVar) {
        int i3 = this.f1487c;
        Object[] objArr = this.f1486b;
        if (i3 < objArr.length) {
            objArr[i3] = cVar;
            this.f1487c = i3 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z3;
        p2.g.e(obj, "instance");
        int i3 = this.f1487c;
        int i4 = 0;
        while (true) {
            objArr = this.f1486b;
            if (i4 >= i3) {
                z3 = false;
                break;
            }
            if (objArr[i4] == obj) {
                z3 = true;
                break;
            }
            i4++;
        }
        if (z3) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i5 = this.f1487c;
        if (i5 >= objArr.length) {
            return false;
        }
        objArr[i5] = obj;
        this.f1487c = i5 + 1;
        return true;
    }

    public f() {
        this.f1485a = 0;
        this.f1486b = new Object[256];
    }
}
