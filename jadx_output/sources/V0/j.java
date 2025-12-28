package V0;

import a.AbstractC0090a;
import a1.C0100h;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends AbstractC0090a {
    public static Font k0(FontFamily fontFamily, int i3) {
        FontStyle fontStyle = new FontStyle((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int l02 = l0(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int l03 = l0(fontStyle, font2.getStyle());
            if (l03 < l02) {
                font = font2;
                l02 = l03;
            }
        }
        return font;
    }

    public static int l0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // a.AbstractC0090a
    public final C0100h B(int i3, C0100h[] c0100hArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // a.AbstractC0090a
    public final Typeface r(Context context, U0.f fVar, Resources resources, int i3) {
        try {
            FontFamily.Builder builder = null;
            for (U0.g gVar : fVar.f2382a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f2388f).setWeight(gVar.f2384b).setSlant(gVar.f2385c ? 1 : 0).setTtcIndex(gVar.f2387e).setFontVariationSettings(gVar.f2386d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(k0(build2, i3).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // a.AbstractC0090a
    public final Typeface s(Context context, C0100h[] c0100hArr, int i3) {
        int i4;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = c0100hArr.length;
            FontFamily.Builder builder = null;
            while (i4 < length) {
                C0100h c0100h = c0100hArr[i4];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0100h.f2944a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i4 = openFileDescriptor == null ? i4 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(c0100h.f2946c).setSlant(c0100h.f2947d ? 1 : 0).setTtcIndex(c0100h.f2945b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(k0(build2, i3).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // a.AbstractC0090a
    public final Typeface t(Context context, Resources resources, int i3, String str, int i4) {
        try {
            Font build = new Font.Builder(resources, i3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
