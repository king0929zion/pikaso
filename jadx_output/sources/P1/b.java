package P1;

import S1.h;
import S1.i;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class b extends r2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2105c;

    public /* synthetic */ b(int i3, Object obj) {
        this.f2104b = i3;
        this.f2105c = obj;
    }

    private final void f0(int i3) {
    }

    @Override // r2.a
    public final void Q(int i3) {
        switch (this.f2104b) {
            case 0:
                break;
            default:
                i iVar = (i) this.f2105c;
                iVar.f2314d = true;
                h hVar = (h) iVar.f2315e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.u();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // r2.a
    public final void R(Typeface typeface, boolean z3) {
        switch (this.f2104b) {
            case 0:
                Chip chip = (Chip) this.f2105c;
                f fVar = chip.h;
                chip.setText(fVar.f2120F0 ? fVar.f2123H : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z3) {
                    i iVar = (i) this.f2105c;
                    iVar.f2314d = true;
                    h hVar = (h) iVar.f2315e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.u();
                        fVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
