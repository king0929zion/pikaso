package D;

import c2.C0168g;
import java.util.Comparator;
import n0.C0444z;
import o0.C0454D;

/* renamed from: D.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0054o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f838a;

    public /* synthetic */ C0054o(int i3) {
        this.f838a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f838a) {
            case 0:
                return p2.g.f(((N) obj).f711b, ((N) obj2).f711b);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b3 = bArr[i3];
                    byte b4 = bArr2[i3];
                    if (b3 != b4) {
                        return b3 - b4;
                    }
                }
                return 0;
            case 2:
                C0444z c0444z = (C0444z) obj;
                C0444z c0444z2 = (C0444z) obj2;
                float f3 = c0444z.f5320y.f5146q.f5103A;
                float f4 = c0444z2.f5320y.f5146q.f5103A;
                return f3 == f4 ? p2.g.f(c0444z.l(), c0444z2.l()) : Float.compare(f3, f4);
            case 3:
                return ((Number) C0454D.f5382f.h(obj, obj2)).intValue();
            default:
                C0168g c0168g = (C0168g) obj;
                C0168g c0168g2 = (C0168g) obj2;
                return (((Number) c0168g.f3834e).intValue() - ((Number) c0168g.f3833d).intValue()) - (((Number) c0168g2.f3834e).intValue() - ((Number) c0168g2.f3833d).intValue());
        }
    }
}
