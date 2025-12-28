package O0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f2033m;

    /* renamed from: a, reason: collision with root package name */
    public float f2034a;

    /* renamed from: b, reason: collision with root package name */
    public float f2035b;

    /* renamed from: c, reason: collision with root package name */
    public float f2036c;

    /* renamed from: d, reason: collision with root package name */
    public float f2037d;

    /* renamed from: e, reason: collision with root package name */
    public float f2038e;

    /* renamed from: f, reason: collision with root package name */
    public float f2039f;

    /* renamed from: g, reason: collision with root package name */
    public float f2040g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f2041i;

    /* renamed from: j, reason: collision with root package name */
    public float f2042j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2043k;

    /* renamed from: l, reason: collision with root package name */
    public float f2044l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2033m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            switch (f2033m.get(index)) {
                case 1:
                    this.f2034a = obtainStyledAttributes.getFloat(index, this.f2034a);
                    break;
                case 2:
                    this.f2035b = obtainStyledAttributes.getFloat(index, this.f2035b);
                    break;
                case 3:
                    this.f2036c = obtainStyledAttributes.getFloat(index, this.f2036c);
                    break;
                case 4:
                    this.f2037d = obtainStyledAttributes.getFloat(index, this.f2037d);
                    break;
                case 5:
                    this.f2038e = obtainStyledAttributes.getFloat(index, this.f2038e);
                    break;
                case 6:
                    this.f2039f = obtainStyledAttributes.getDimension(index, this.f2039f);
                    break;
                case 7:
                    this.f2040g = obtainStyledAttributes.getDimension(index, this.f2040g);
                    break;
                case 8:
                    this.h = obtainStyledAttributes.getDimension(index, this.h);
                    break;
                case 9:
                    this.f2041i = obtainStyledAttributes.getDimension(index, this.f2041i);
                    break;
                case 10:
                    this.f2042j = obtainStyledAttributes.getDimension(index, this.f2042j);
                    break;
                case 11:
                    this.f2043k = true;
                    this.f2044l = obtainStyledAttributes.getDimension(index, this.f2044l);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
