package d1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class g0 extends f0 {
    public g0(l0 l0Var, WindowInsets windowInsets) {
        super(l0Var, windowInsets);
    }

    @Override // d1.j0
    public l0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f4201c.consumeDisplayCutout();
        return l0.d(null, consumeDisplayCutout);
    }

    @Override // d1.j0
    public C0212i e() {
        DisplayCutout displayCutout;
        displayCutout = this.f4201c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0212i(displayCutout);
    }

    @Override // d1.e0, d1.j0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Objects.equals(this.f4201c, g0Var.f4201c) && Objects.equals(this.f4205g, g0Var.f4205g);
    }

    @Override // d1.j0
    public int hashCode() {
        return this.f4201c.hashCode();
    }
}
