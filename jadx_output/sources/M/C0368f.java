package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0368f implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public C0365c f4951d;

    /* renamed from: e, reason: collision with root package name */
    public C0365c f4952e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f4953f = new WeakHashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f4954g = 0;

    public C0365c a(Object obj) {
        C0365c c0365c = this.f4951d;
        while (c0365c != null && !c0365c.f4944d.equals(obj)) {
            c0365c = c0365c.f4946f;
        }
        return c0365c;
    }

    public Object b(Object obj) {
        C0365c a3 = a(obj);
        if (a3 == null) {
            return null;
        }
        this.f4954g--;
        WeakHashMap weakHashMap = this.f4953f;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0367e) it.next()).a(a3);
            }
        }
        C0365c c0365c = a3.f4947g;
        if (c0365c != null) {
            c0365c.f4946f = a3.f4946f;
        } else {
            this.f4951d = a3.f4946f;
        }
        C0365c c0365c2 = a3.f4946f;
        if (c0365c2 != null) {
            c0365c2.f4947g = c0365c;
        } else {
            this.f4952e = c0365c;
        }
        a3.f4946f = null;
        a3.f4947g = null;
        return a3.f4945e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((m.C0364b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof m.C0368f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m.f r7 = (m.C0368f) r7
            int r1 = r6.f4954g
            int r3 = r7.f4954g
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            m.b r3 = (m.C0364b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            m.b r4 = (m.C0364b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            m.b r7 = (m.C0364b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0368f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (true) {
            C0364b c0364b = (C0364b) it;
            if (!c0364b.hasNext()) {
                return i3;
            }
            i3 += ((Map.Entry) c0364b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0364b c0364b = new C0364b(this.f4951d, this.f4952e, 0);
        this.f4953f.put(c0364b, Boolean.FALSE);
        return c0364b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0364b c0364b = (C0364b) it;
            if (!c0364b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0364b.next()).toString());
            if (c0364b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
