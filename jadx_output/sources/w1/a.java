package W1;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f2573i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f2574j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2575k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f2576l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2577a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2578b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2579c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2580d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2581e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2582f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f2583g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f2577a = paint2;
        this.f2580d = V0.a.d(-16777216, 68);
        this.f2581e = V0.a.d(-16777216, 20);
        this.f2582f = V0.a.d(-16777216, 0);
        paint2.setColor(this.f2580d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f2578b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f2579c = new Paint(paint3);
    }
}
