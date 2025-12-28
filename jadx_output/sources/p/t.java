package p;

/* loaded from: classes.dex */
public interface t extends InterfaceC0539h {
    @Override // p.InterfaceC0539h
    default InterfaceC0531J a(B2.i iVar) {
        return new D1.w(this);
    }

    float b(long j3, float f3, float f4, float f5);

    float c(long j3, float f3, float f4, float f5);

    long d(float f3, float f4, float f5);

    default float e(float f3, float f4, float f5) {
        return c(d(f3, f4, f5), f3, f4, f5);
    }
}
