package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f4699l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f4700m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f4701a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4702b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f4703c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f4704d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f4705e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f4706f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f4707g = false;
    public TextPaint h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f4708i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f4709j;

    /* renamed from: k, reason: collision with root package name */
    public final N f4710k;

    static {
        new ConcurrentHashMap();
    }

    public Q(TextView textView) {
        this.f4708i = textView;
        this.f4709j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f4710k = new O();
        } else {
            this.f4710k = new N();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i3 : iArr) {
            if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f4700m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e3);
            return null;
        }
    }

    public static Object e(TextView textView, String str, Object obj) {
        try {
            return d(str).invoke(textView, null);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return obj;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f4702b) {
                if (this.f4708i.getMeasuredHeight() <= 0 || this.f4708i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f4710k.b(this.f4708i) ? 1048576 : (this.f4708i.getMeasuredWidth() - this.f4708i.getTotalPaddingLeft()) - this.f4708i.getTotalPaddingRight();
                int height = (this.f4708i.getHeight() - this.f4708i.getCompoundPaddingBottom()) - this.f4708i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f4699l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c3 = c(rectF);
                        if (c3 != this.f4708i.getTextSize()) {
                            g(0, c3);
                        }
                    } finally {
                    }
                }
            }
            this.f4702b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f4706f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = length - 1;
        int i4 = 0;
        int i5 = 1;
        while (i5 <= i3) {
            int i6 = (i5 + i3) / 2;
            int i7 = this.f4706f[i6];
            TextView textView = this.f4708i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int b3 = K.b(textView);
            TextPaint textPaint = this.h;
            if (textPaint == null) {
                this.h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.h.set(textView.getPaint());
            this.h.setTextSize(i7);
            StaticLayout a3 = M.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b3, textView, this.h, this.f4710k);
            if ((b3 == -1 || (a3.getLineCount() <= b3 && a3.getLineEnd(a3.getLineCount() - 1) == charSequence.length())) && a3.getHeight() <= rectF.bottom) {
                int i8 = i6 + 1;
                i4 = i5;
                i5 = i8;
            } else {
                i4 = i6 - 1;
                i3 = i4;
            }
        }
        return this.f4706f[i4];
    }

    public final boolean f() {
        return j() && this.f4701a != 0;
    }

    public final void g(int i3, float f3) {
        Context context = this.f4709j;
        float applyDimension = TypedValue.applyDimension(i3, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f4708i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a3 = L.a(textView);
            if (textView.getLayout() != null) {
                this.f4702b = false;
                try {
                    Method d3 = d("nullLayouts");
                    if (d3 != null) {
                        d3.invoke(textView, null);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (a3) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f4701a == 1) {
            if (!this.f4707g || this.f4706f.length == 0) {
                int floor = ((int) Math.floor((this.f4705e - this.f4704d) / this.f4703c)) + 1;
                int[] iArr = new int[floor];
                for (int i3 = 0; i3 < floor; i3++) {
                    iArr[i3] = Math.round((i3 * this.f4703c) + this.f4704d);
                }
                this.f4706f = b(iArr);
            }
            this.f4702b = true;
        } else {
            this.f4702b = false;
        }
        return this.f4702b;
    }

    public final boolean i() {
        boolean z3 = this.f4706f.length > 0;
        this.f4707g = z3;
        if (z3) {
            this.f4701a = 1;
            this.f4704d = r0[0];
            this.f4705e = r0[r1 - 1];
            this.f4703c = -1.0f;
        }
        return z3;
    }

    public final boolean j() {
        return !(this.f4708i instanceof AbstractC0335t);
    }

    public final void k(float f3, float f4, float f5) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f4 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
        }
        this.f4701a = 1;
        this.f4704d = f3;
        this.f4705e = f4;
        this.f4703c = f5;
        this.f4707g = false;
    }
}
