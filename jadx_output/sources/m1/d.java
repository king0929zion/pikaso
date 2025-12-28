package M1;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1679a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1680b;

    public d(b1.e eVar, boolean z3) {
        this.f1680b = eVar;
        this.f1679a = z3;
    }

    public boolean a() {
        return this.f1679a;
    }

    public boolean b(int i3, CharSequence charSequence) {
        if (charSequence == null || i3 < 0 || charSequence.length() - i3 < 0) {
            throw new IllegalArgumentException();
        }
        if (((b1.e) this.f1680b) == null) {
            return a();
        }
        char c3 = 2;
        for (int i4 = 0; i4 < i3 && c3 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            d dVar = b1.f.f3657a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c3 = 2;
                            break;
                    }
                }
                c3 = 0;
            }
            c3 = 1;
        }
        if (c3 == 0) {
            return true;
        }
        if (c3 != 1) {
            return a();
        }
        return false;
    }

    public d(BottomSheetBehavior bottomSheetBehavior, boolean z3) {
        this.f1680b = bottomSheetBehavior;
        this.f1679a = z3;
    }
}
