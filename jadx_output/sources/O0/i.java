package O0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f2024e;

    /* renamed from: a, reason: collision with root package name */
    public int f2025a;

    /* renamed from: b, reason: collision with root package name */
    public int f2026b;

    /* renamed from: c, reason: collision with root package name */
    public float f2027c;

    /* renamed from: d, reason: collision with root package name */
    public float f2028d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2024e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f2054e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            switch (f2024e.get(index)) {
                case 1:
                    this.f2028d = obtainStyledAttributes.getFloat(index, this.f2028d);
                    break;
                case 2:
                    this.f2026b = obtainStyledAttributes.getInt(index, this.f2026b);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = K0.a.f1436a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f2025a = l.f(obtainStyledAttributes, index, this.f2025a);
                    break;
                case 6:
                    this.f2027c = obtainStyledAttributes.getFloat(index, this.f2027c);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
