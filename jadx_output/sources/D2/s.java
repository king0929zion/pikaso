package D2;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class s {
    private volatile AtomicReferenceArray<Object> array;

    public s(int i3) {
        this.array = new AtomicReferenceArray<>(i3);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i3) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i3 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i3);
        }
        return null;
    }

    public final void c(int i3, F2.a aVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i3 < length) {
            atomicReferenceArray.set(i3, aVar);
            return;
        }
        int i4 = i3 + 1;
        int i5 = length * 2;
        if (i4 < i5) {
            i4 = i5;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i4);
        for (int i6 = 0; i6 < length; i6++) {
            atomicReferenceArray2.set(i6, atomicReferenceArray.get(i6));
        }
        atomicReferenceArray2.set(i3, aVar);
        this.array = atomicReferenceArray2;
    }
}
