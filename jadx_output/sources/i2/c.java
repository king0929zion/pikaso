package i2;

import D2.AbstractC0071a;
import g2.C0272e;
import g2.InterfaceC0271d;
import g2.InterfaceC0274g;
import g2.InterfaceC0276i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y2.C0673f;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0276i f4461e;

    /* renamed from: f, reason: collision with root package name */
    public transient InterfaceC0271d f4462f;

    public c(InterfaceC0271d interfaceC0271d, InterfaceC0276i interfaceC0276i) {
        super(interfaceC0271d);
        this.f4461e = interfaceC0276i;
    }

    @Override // i2.a
    public void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0271d interfaceC0271d = this.f4462f;
        if (interfaceC0271d != null && interfaceC0271d != this) {
            InterfaceC0274g n2 = o().n(C0272e.f4333d);
            p2.g.b(n2);
            D2.g gVar = (D2.g) interfaceC0271d;
            do {
                atomicReferenceFieldUpdater = D2.g.f1054k;
            } while (atomicReferenceFieldUpdater.get(gVar) == AbstractC0071a.f1045d);
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            C0673f c0673f = obj instanceof C0673f ? (C0673f) obj : null;
            if (c0673f != null) {
                c0673f.p();
            }
        }
        this.f4462f = b.f4460d;
    }

    @Override // g2.InterfaceC0271d
    public InterfaceC0276i o() {
        InterfaceC0276i interfaceC0276i = this.f4461e;
        p2.g.b(interfaceC0276i);
        return interfaceC0276i;
    }

    public c(InterfaceC0271d interfaceC0271d) {
        this(interfaceC0271d, interfaceC0271d != null ? interfaceC0271d.o() : null);
    }
}
