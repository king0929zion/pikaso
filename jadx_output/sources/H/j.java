package H;

import d2.AbstractC0239j;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final j f1327e = new j(new Object[0]);

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f1328d;

    public j(Object[] objArr) {
        this.f1328d = objArr;
    }

    @Override // d2.AbstractC0230a
    public final int a() {
        return this.f1328d.length;
    }

    @Override // H.c
    public final c b(int i3, Object obj) {
        Object[] objArr = this.f1328d;
        r2.a.m(i3, objArr.length);
        if (i3 == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC0239j.a0(objArr, objArr2, 0, i3, 6);
            AbstractC0239j.Y(objArr, objArr2, i3 + 1, i3, objArr.length);
            objArr2[i3] = obj;
            return new j(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        p2.g.d(copyOf, "copyOf(this, size)");
        AbstractC0239j.Y(objArr, copyOf, i3 + 1, i3, objArr.length - 1);
        copyOf[i3] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new f(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // H.c
    public final c c(Object obj) {
        Object[] objArr = this.f1328d;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new f(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        p2.g.d(copyOf, "copyOf(this, newSize)");
        copyOf[objArr.length] = obj;
        return new j(copyOf);
    }

    @Override // H.c
    public final c d(Collection collection) {
        Object[] objArr = this.f1328d;
        if (collection.size() + objArr.length > 32) {
            g e3 = e();
            e3.addAll(collection);
            return e3.c();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        p2.g.d(copyOf, "copyOf(this, newSize)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new j(copyOf);
    }

    @Override // H.c
    public final g e() {
        return new g(this, null, this.f1328d, 0);
    }

    @Override // H.c
    public final c f(b bVar) {
        Object[] objArr = this.f1328d;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z3 = false;
        for (int i3 = 0; i3 < length2; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) bVar.i(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    p2.g.d(objArr2, "copyOf(this, size)");
                    z3 = true;
                    length = i3;
                }
            } else if (z3) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f1327e : new j(AbstractC0239j.b0(objArr2, 0, length));
    }

    @Override // H.c
    public final c g(int i3) {
        Object[] objArr = this.f1328d;
        r2.a.l(i3, objArr.length);
        if (objArr.length == 1) {
            return f1327e;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        p2.g.d(copyOf, "copyOf(this, newSize)");
        AbstractC0239j.Y(objArr, copyOf, i3, i3 + 1, objArr.length);
        return new j(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        r2.a.l(i3, a());
        return this.f1328d[i3];
    }

    @Override // H.c
    public final c h(int i3, Object obj) {
        Object[] objArr = this.f1328d;
        r2.a.l(i3, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        p2.g.d(copyOf, "copyOf(this, size)");
        copyOf[i3] = obj;
        return new j(copyOf);
    }

    @Override // d2.AbstractC0233d, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC0239j.e0(this.f1328d, obj);
    }

    @Override // d2.AbstractC0233d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f1328d;
        p2.g.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i3 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i3 < 0) {
                    return -1;
                }
                length = i3;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i4 = length2 - 1;
                if (obj.equals(objArr[length2])) {
                    return length2;
                }
                if (i4 < 0) {
                    return -1;
                }
                length2 = i4;
            }
        }
    }

    @Override // d2.AbstractC0233d, java.util.List
    public final ListIterator listIterator(int i3) {
        r2.a.m(i3, a());
        return new d(this.f1328d, i3, a());
    }
}
