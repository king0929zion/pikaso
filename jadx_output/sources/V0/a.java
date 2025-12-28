package V0;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2458a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(double d3, double d4, double d5) {
        double d6 = (((-0.4986d) * d5) + (((-1.5372d) * d4) + (3.2406d * d3))) / 100.0d;
        double d7 = ((0.0415d * d5) + ((1.8758d * d4) + ((-0.9689d) * d3))) / 100.0d;
        double d8 = ((1.057d * d5) + (((-0.204d) * d4) + (0.0557d * d3))) / 100.0d;
        double pow = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        double pow2 = d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d;
        double pow3 = d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static int b(int i3, int i4) {
        int alpha = Color.alpha(i4);
        int alpha2 = Color.alpha(i3);
        int i5 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i5, c(Color.red(i3), alpha2, Color.red(i4), alpha, i5), c(Color.green(i3), alpha2, Color.green(i4), alpha, i5), c(Color.blue(i3), alpha2, Color.blue(i4), alpha, i5));
    }

    public static int c(int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        return (((255 - i4) * (i5 * i6)) + ((i3 * 255) * i4)) / (i7 * 255);
    }

    public static int d(int i3, int i4) {
        if (i4 < 0 || i4 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i3 & 16777215) | (i4 << 24);
    }
}
