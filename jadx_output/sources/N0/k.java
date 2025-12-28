package N0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public m f1830a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1831b;

    public static long a(f fVar, long j3) {
        m mVar = fVar.f1820d;
        if (mVar instanceof i) {
            return j3;
        }
        ArrayList arrayList = fVar.f1826k;
        int size = arrayList.size();
        long j4 = j3;
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) arrayList.get(i3);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1820d != mVar) {
                    j4 = Math.min(j4, a(fVar2, fVar2.f1822f + j3));
                }
            }
        }
        if (fVar != mVar.f1841i) {
            return j4;
        }
        long j5 = mVar.j();
        long j6 = j3 - j5;
        return Math.min(Math.min(j4, a(mVar.h, j6)), j6 - r9.f1822f);
    }

    public static long b(f fVar, long j3) {
        m mVar = fVar.f1820d;
        if (mVar instanceof i) {
            return j3;
        }
        ArrayList arrayList = fVar.f1826k;
        int size = arrayList.size();
        long j4 = j3;
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) arrayList.get(i3);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1820d != mVar) {
                    j4 = Math.max(j4, b(fVar2, fVar2.f1822f + j3));
                }
            }
        }
        if (fVar != mVar.h) {
            return j4;
        }
        long j5 = mVar.j();
        long j6 = j3 + j5;
        return Math.max(Math.max(j4, b(mVar.f1841i, j6)), j6 - r9.f1822f);
    }
}
