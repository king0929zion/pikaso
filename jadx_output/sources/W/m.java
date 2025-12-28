package W;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f2552a = new m();

    public final BlendModeColorFilter a(long j3, int i3) {
        AbstractC0078a.g();
        return AbstractC0078a.f(D.C(j3), D.A(i3));
    }

    public final C0089l b(BlendModeColorFilter blendModeColorFilter) {
        int color;
        BlendMode mode;
        int ordinal;
        int i3;
        color = blendModeColorFilter.getColor();
        long b3 = D.b(color);
        mode = blendModeColorFilter.getMode();
        int[] iArr = AbstractC0079b.f2533a;
        ordinal = mode.ordinal();
        switch (iArr[ordinal]) {
            case 1:
                i3 = 0;
                break;
            case 2:
                i3 = 1;
                break;
            case 3:
                i3 = 2;
                break;
            case 4:
            default:
                i3 = 3;
                break;
            case 5:
                i3 = 4;
                break;
            case 6:
                i3 = 5;
                break;
            case 7:
                i3 = 6;
                break;
            case 8:
                i3 = 7;
                break;
            case 9:
                i3 = 8;
                break;
            case 10:
                i3 = 9;
                break;
            case 11:
                i3 = 10;
                break;
            case 12:
                i3 = 11;
                break;
            case 13:
                i3 = 12;
                break;
            case 14:
                i3 = 13;
                break;
            case 15:
                i3 = 14;
                break;
            case 16:
                i3 = 15;
                break;
            case 17:
                i3 = 16;
                break;
            case 18:
                i3 = 17;
                break;
            case 19:
                i3 = 18;
                break;
            case 20:
                i3 = 19;
                break;
            case 21:
                i3 = 20;
                break;
            case 22:
                i3 = 21;
                break;
            case 23:
                i3 = 22;
                break;
            case 24:
                i3 = 23;
                break;
            case 25:
                i3 = 24;
                break;
            case 26:
                i3 = 25;
                break;
            case 27:
                i3 = 26;
                break;
            case 28:
                i3 = 27;
                break;
            case 29:
                i3 = 28;
                break;
        }
        return new C0089l(b3, i3, blendModeColorFilter);
    }
}
