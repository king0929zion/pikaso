package w2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6566a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6567b;

    public /* synthetic */ d(int i3, Object obj) {
        this.f6566a = i3;
        this.f6567b = obj;
    }

    @Override // w2.f
    public final Iterator iterator() {
        switch (this.f6566a) {
            case 0:
                return new c(this);
            default:
                return (Iterator) this.f6567b;
        }
    }
}
