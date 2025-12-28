package N1;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import n0.C0444z;
import t0.k;

/* loaded from: classes.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1864b;

    public /* synthetic */ d(int i3, Object obj) {
        this.f1863a = i3;
        this.f1864b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1863a) {
            case 0:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f3943r).compareTo(Boolean.valueOf(materialButton2.f3943r));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f1864b;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            case 1:
                int compare = ((Comparator) this.f1864b).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return C0444z.f5292J.compare(((k) obj).f6238c, ((k) obj2).f6238c);
            default:
                int compare2 = ((d) this.f1864b).compare(obj, obj2);
                return compare2 != 0 ? compare2 : Z.b.l(Integer.valueOf(((k) obj).f6242g), Integer.valueOf(((k) obj2).f6242g));
        }
    }

    public d(Comparator comparator) {
        this.f1863a = 1;
        this.f1864b = comparator;
    }
}
