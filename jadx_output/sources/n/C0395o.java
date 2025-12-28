package n;

import androidx.lifecycle.I;

/* renamed from: n.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0395o {

    /* renamed from: a, reason: collision with root package name */
    public final int f5002a;

    /* renamed from: b, reason: collision with root package name */
    public final I f5003b;

    /* renamed from: c, reason: collision with root package name */
    public final X1.e f5004c;

    /* renamed from: d, reason: collision with root package name */
    public int f5005d;

    /* renamed from: e, reason: collision with root package name */
    public int f5006e;

    /* renamed from: f, reason: collision with root package name */
    public int f5007f;

    public C0395o(int i3) {
        this.f5002a = i3;
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f5003b = new I(1);
        this.f5004c = new X1.e(21);
    }

    public final Object a(Object obj) {
        p2.g.e(obj, "key");
        synchronized (this.f5004c) {
            I i3 = this.f5003b;
            i3.getClass();
            Object obj2 = i3.f3457a.get(obj);
            if (obj2 != null) {
                this.f5006e++;
                return obj2;
            }
            this.f5007f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            p2.g.e(r6, r0)
            X1.e r0 = r5.f5004c
            monitor-enter(r0)
            int r1 = r5.f5005d     // Catch: java.lang.Throwable -> L22
            int r1 = r1 + 1
            r5.f5005d = r1     // Catch: java.lang.Throwable -> L22
            androidx.lifecycle.I r1 = r5.f5003b     // Catch: java.lang.Throwable -> L22
            r1.getClass()     // Catch: java.lang.Throwable -> L22
            java.util.LinkedHashMap r1 = r1.f3457a     // Catch: java.lang.Throwable -> L22
            java.lang.Object r6 = r1.put(r6, r7)     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L25
            int r7 = r5.f5005d     // Catch: java.lang.Throwable -> L22
            int r7 = r7 + (-1)
            r5.f5005d = r7     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r6 = move-exception
            goto Lb9
        L25:
            monitor-exit(r0)
            int r7 = r5.f5002a
        L28:
            X1.e r0 = r5.f5004c
            monitor-enter(r0)
            int r1 = r5.f5005d     // Catch: java.lang.Throwable -> L3e
            if (r1 < 0) goto Laf
            androidx.lifecycle.I r1 = r5.f5003b     // Catch: java.lang.Throwable -> L3e
            java.util.LinkedHashMap r1 = r1.f3457a     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L41
            int r1 = r5.f5005d     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto Laf
            goto L41
        L3e:
            r6 = move-exception
            goto Lb7
        L41:
            int r1 = r5.f5005d     // Catch: java.lang.Throwable -> L3e
            if (r1 <= r7) goto Lad
            androidx.lifecycle.I r1 = r5.f5003b     // Catch: java.lang.Throwable -> L3e
            java.util.LinkedHashMap r1 = r1.f3457a     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L50
            goto Lad
        L50:
            androidx.lifecycle.I r1 = r5.f5003b     // Catch: java.lang.Throwable -> L3e
            java.util.LinkedHashMap r1 = r1.f3457a     // Catch: java.lang.Throwable -> L3e
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "map.entries"
            p2.g.d(r1, r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L3e
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L3e
            r3 = 0
            if (r2 == 0) goto L73
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L3e
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L6d
            goto L82
        L6d:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L3e
            goto L82
        L73:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3e
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L7e
            goto L82
        L7e:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L3e
        L82:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L88
            monitor-exit(r0)
            goto Lae
        L88:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L3e
            androidx.lifecycle.I r3 = r5.f5003b     // Catch: java.lang.Throwable -> L3e
            r3.getClass()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "key"
            p2.g.e(r1, r4)     // Catch: java.lang.Throwable -> L3e
            java.util.LinkedHashMap r3 = r3.f3457a     // Catch: java.lang.Throwable -> L3e
            r3.remove(r1)     // Catch: java.lang.Throwable -> L3e
            int r1 = r5.f5005d     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "value"
            p2.g.e(r2, r3)     // Catch: java.lang.Throwable -> L3e
            int r1 = r1 + (-1)
            r5.f5005d = r1     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            goto L28
        Lad:
            monitor-exit(r0)
        Lae:
            return r6
        Laf:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3e
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L3e
            throw r7     // Catch: java.lang.Throwable -> L3e
        Lb7:
            monitor-exit(r0)
            throw r6
        Lb9:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0395o.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String toString() {
        String str;
        synchronized (this.f5004c) {
            try {
                int i3 = this.f5006e;
                int i4 = this.f5007f + i3;
                str = "LruCache[maxSize=" + this.f5002a + ",hits=" + this.f5006e + ",misses=" + this.f5007f + ",hitRate=" + (i4 != 0 ? (i3 * 100) / i4 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
