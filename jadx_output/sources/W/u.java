package W;

import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes.dex */
public abstract class u {
    public static final ColorSpace a(X.c cVar) {
        X.r rVar;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb rgb;
        if (p2.g.a(cVar, X.e.f2597c)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (p2.g.a(cVar, X.e.f2608o)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (p2.g.a(cVar, X.e.f2609p)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (p2.g.a(cVar, X.e.f2606m)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (p2.g.a(cVar, X.e.h)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (p2.g.a(cVar, X.e.f2601g)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (p2.g.a(cVar, X.e.f2611r)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (p2.g.a(cVar, X.e.f2610q)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (p2.g.a(cVar, X.e.f2602i)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (p2.g.a(cVar, X.e.f2603j)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (p2.g.a(cVar, X.e.f2599e)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (p2.g.a(cVar, X.e.f2600f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (p2.g.a(cVar, X.e.f2598d)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (p2.g.a(cVar, X.e.f2604k)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (p2.g.a(cVar, X.e.f2607n)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (p2.g.a(cVar, X.e.f2605l)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(cVar instanceof X.r)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        X.r rVar2 = (X.r) cVar;
        float[] a3 = rVar2.f2642d.a();
        X.s sVar = rVar2.f2645g;
        if (sVar != null) {
            rVar = rVar2;
            transferParameters = new ColorSpace.Rgb.TransferParameters(sVar.f2656b, sVar.f2657c, sVar.f2658d, sVar.f2659e, sVar.f2660f, sVar.f2661g, sVar.f2655a);
        } else {
            rVar = rVar2;
            transferParameters = null;
        }
        if (transferParameters != null) {
            rgb = new ColorSpace.Rgb(cVar.f2591a, rVar.h, a3, transferParameters);
        } else {
            X.r rVar3 = rVar;
            String str = cVar.f2591a;
            final X.q qVar = rVar3.f2649l;
            final int i3 = 0;
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: W.s
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d3) {
                    switch (i3) {
                        case 0:
                            return ((Number) ((X.q) qVar).i(Double.valueOf(d3))).doubleValue();
                        default:
                            return ((Number) ((X.q) qVar).i(Double.valueOf(d3))).doubleValue();
                    }
                }
            };
            final X.q qVar2 = rVar3.f2652o;
            final int i4 = 1;
            X.r rVar4 = (X.r) cVar;
            rgb = new ColorSpace.Rgb(str, rVar3.h, a3, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: W.s
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d3) {
                    switch (i4) {
                        case 0:
                            return ((Number) ((X.q) qVar2).i(Double.valueOf(d3))).doubleValue();
                        default:
                            return ((Number) ((X.q) qVar2).i(Double.valueOf(d3))).doubleValue();
                    }
                }
            }, rVar4.f2643e, rVar4.f2644f);
        }
        return rgb;
    }

    public static final X.c b(final ColorSpace colorSpace) {
        X.t tVar;
        X.t tVar2;
        X.s sVar;
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return X.e.f2597c;
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return X.e.f2608o;
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return X.e.f2609p;
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return X.e.f2606m;
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return X.e.h;
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return X.e.f2601g;
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return X.e.f2611r;
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return X.e.f2610q;
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return X.e.f2602i;
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return X.e.f2603j;
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return X.e.f2599e;
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return X.e.f2600f;
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return X.e.f2598d;
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return X.e.f2604k;
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return X.e.f2607n;
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return X.e.f2605l;
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return X.e.f2597c;
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        if (rgb.getWhitePoint().length == 3) {
            float f3 = rgb.getWhitePoint()[0];
            float f4 = rgb.getWhitePoint()[1];
            float f5 = f3 + f4 + rgb.getWhitePoint()[2];
            tVar = new X.t(f3 / f5, f4 / f5);
        } else {
            tVar = new X.t(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        }
        X.t tVar3 = tVar;
        if (transferParameters != null) {
            tVar2 = tVar3;
            sVar = new X.s(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f);
        } else {
            tVar2 = tVar3;
            sVar = null;
        }
        String name = rgb.getName();
        float[] primaries = rgb.getPrimaries();
        float[] transform = rgb.getTransform();
        final int i3 = 0;
        X.j jVar = new X.j() { // from class: W.t
            @Override // X.j
            public final double b(double d3) {
                switch (i3) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d3);
                    default:
                        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d3);
                }
            }
        };
        final int i4 = 1;
        return new X.r(name, primaries, tVar2, transform, jVar, new X.j() { // from class: W.t
            @Override // X.j
            public final double b(double d3) {
                switch (i4) {
                    case 0:
                        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d3);
                    default:
                        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d3);
                }
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), sVar, rgb.getId());
    }
}
