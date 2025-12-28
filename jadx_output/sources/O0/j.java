package O0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f2029a;

    /* renamed from: b, reason: collision with root package name */
    public int f2030b;

    /* renamed from: c, reason: collision with root package name */
    public float f2031c;

    /* renamed from: d, reason: collision with root package name */
    public float f2032d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f2055f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 1) {
                this.f2031c = obtainStyledAttributes.getFloat(index, this.f2031c);
            } else if (index == 0) {
                int i4 = obtainStyledAttributes.getInt(index, this.f2029a);
                this.f2029a = i4;
                this.f2029a = l.f2045d[i4];
            } else if (index == 4) {
                this.f2030b = obtainStyledAttributes.getInt(index, this.f2030b);
            } else if (index == 3) {
                this.f2032d = obtainStyledAttributes.getFloat(index, this.f2032d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
