package w2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6568a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6569b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6570c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(f fVar, o2.c cVar) {
        this.f6569b = fVar;
        this.f6570c = (p2.h) cVar;
    }

    @Override // w2.f
    public final Iterator iterator() {
        switch (this.f6568a) {
            case 0:
                return new J.c(this);
            default:
                return new k(this);
        }
    }

    public e(A0.c cVar, o2.c cVar2) {
        this.f6569b = cVar;
        this.f6570c = cVar2;
    }
}
