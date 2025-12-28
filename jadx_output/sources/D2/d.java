package D2;

import g2.InterfaceC0276i;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class d implements InterfaceC0687u {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0276i f1051d;

    public d(InterfaceC0276i interfaceC0276i) {
        this.f1051d = interfaceC0276i;
    }

    @Override // y2.InterfaceC0687u
    public final InterfaceC0276i m() {
        return this.f1051d;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f1051d + ')';
    }
}
