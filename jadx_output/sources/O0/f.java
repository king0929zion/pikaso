package O0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f1953a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1954b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1955c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1956d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1957e;

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.f1953a = Float.NaN;
        this.f1954b = Float.NaN;
        this.f1955c = Float.NaN;
        this.f1956d = Float.NaN;
        this.f1957e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f2057i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f1957e);
                this.f1957e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new l().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f1956d = obtainStyledAttributes.getDimension(index, this.f1956d);
            } else if (index == 2) {
                this.f1954b = obtainStyledAttributes.getDimension(index, this.f1954b);
            } else if (index == 3) {
                this.f1955c = obtainStyledAttributes.getDimension(index, this.f1955c);
            } else if (index == 4) {
                this.f1953a = obtainStyledAttributes.getDimension(index, this.f1953a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
