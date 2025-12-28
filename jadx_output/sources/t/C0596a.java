package t;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596a implements InterfaceC0597b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6147a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6148b;

    public C0596a(int i3) {
        this.f6147a = i3;
        switch (i3) {
            case 1:
                this.f6148b = 0;
                break;
            case 2:
                this.f6148b = 0;
                break;
            case 3:
                this.f6148b = 0;
                break;
            default:
                this.f6148b = 0;
                break;
        }
    }

    @Override // t.InterfaceC0597b
    public final float a() {
        switch (this.f6147a) {
        }
        return this.f6148b;
    }

    @Override // t.InterfaceC0597b
    public final void c(int i3, int[] iArr, G0.f fVar, int[] iArr2) {
        switch (this.f6147a) {
            case 0:
                if (fVar != G0.f.f1258d) {
                    AbstractC0598c.a(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0598c.a(i3, iArr, iArr2, false);
                    break;
                }
            case 1:
                if (fVar != G0.f.f1258d) {
                    AbstractC0598c.d(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0598c.d(i3, iArr, iArr2, false);
                    break;
                }
            case 2:
                if (fVar != G0.f.f1258d) {
                    AbstractC0598c.e(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0598c.e(i3, iArr, iArr2, false);
                    break;
                }
            default:
                if (fVar != G0.f.f1258d) {
                    AbstractC0598c.f(i3, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC0598c.f(i3, iArr, iArr2, false);
                    break;
                }
        }
    }

    public final String toString() {
        switch (this.f6147a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
