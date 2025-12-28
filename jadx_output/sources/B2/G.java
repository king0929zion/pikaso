package B2;

import c2.C0174m;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y2.C0673f;

/* loaded from: classes.dex */
public final class G extends C2.b implements E, InterfaceC0021e, InterfaceC0022f, C2.q {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f297i = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_state");
    private volatile Object _state;
    public int h;

    public G(Object obj) {
        this._state = obj;
    }

    @Override // B2.InterfaceC0022f
    public final Object b(Object obj, InterfaceC0271d interfaceC0271d) {
        if (obj == null) {
            obj = C2.c.f586b;
        }
        g(null, obj);
        return C0174m.f3840a;
    }

    @Override // C2.b
    public final C2.d c() {
        return new H();
    }

    @Override // C2.b
    public final C2.d[] d() {
        return new H[2];
    }

    public final boolean g(Object obj, Object obj2) {
        int i3;
        C2.d[] dVarArr;
        D2.w wVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f297i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !p2.g.a(obj3, obj)) {
                return false;
            }
            if (p2.g.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i4 = this.h;
            if ((i4 & 1) != 0) {
                this.h = i4 + 2;
                return true;
            }
            int i5 = i4 + 1;
            this.h = i5;
            C2.d[] dVarArr2 = this.f581d;
            while (true) {
                H[] hArr = (H[]) dVarArr2;
                if (hArr != null) {
                    for (H h : hArr) {
                        if (h != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = H.f298a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(h);
                                if (obj4 != null && obj4 != (wVar = w.f365c)) {
                                    D2.w wVar2 = w.f364b;
                                    if (obj4 != wVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(h, obj4, wVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(h) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0673f) obj4).t(C0174m.f3840a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(h, obj4, wVar)) {
                                        if (atomicReferenceFieldUpdater2.get(h) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.h;
                    if (i3 == i5) {
                        this.h = i5 + 1;
                        return true;
                    }
                    dVarArr = this.f581d;
                }
                dVarArr2 = dVarArr;
                i5 = i3;
            }
        }
    }

    @Override // B2.E
    public final Object getValue() {
        D2.w wVar = C2.c.f586b;
        Object obj = f297i.get(this);
        if (obj == wVar) {
            return null;
        }
        return obj;
    }

    @Override // C2.q
    public final InterfaceC0021e m(InterfaceC0276i interfaceC0276i, int i3, int i4) {
        return ((((i3 < 0 || i3 >= 2) && i3 != -2) || i4 != 2) && !((i3 == 0 || i3 == -3) && i4 == 1)) ? new C2.i(this, interfaceC0276i, i3, i4) : this;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c8, B:31:0x00e0, B:37:0x00f4, B:33:0x00eb, B:36:0x00f1, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c8, B:31:0x00e0, B:37:0x00f4, B:33:0x00eb, B:36:0x00f1, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c7 -> B:15:0x007e). Please report as a decompilation issue!!! */
    @Override // B2.InterfaceC0021e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(B2.InterfaceC0022f r17, g2.InterfaceC0271d r18) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.G.o(B2.f, g2.d):java.lang.Object");
    }
}
