package N1;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import d1.C0205b;
import e1.i;
import e1.j;

/* loaded from: classes.dex */
public final class e extends C0205b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f1866e;

    public /* synthetic */ e(View view, int i3) {
        this.f1865d = i3;
        this.f1866e = view;
    }

    @Override // d1.C0205b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1865d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1866e).f3982g);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // d1.C0205b
    public final void d(View view, j jVar) {
        View view2 = this.f1866e;
        View.AccessibilityDelegate accessibilityDelegate = this.f4187a;
        switch (this.f1865d) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, jVar.f4278a);
                int i3 = MaterialButtonToggleGroup.f3946n;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view2;
                materialButtonToggleGroup.getClass();
                int i4 = -1;
                if (view instanceof MaterialButton) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i5) == view) {
                                i4 = i6;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.c(i5)) {
                                    i6++;
                                }
                                i5++;
                            }
                        }
                    }
                }
                jVar.i(i.a(((MaterialButton) view).f3943r, 0, 1, i4, 1));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = jVar.f4278a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo.setCheckable(checkableImageButton.h);
                accessibilityNodeInfo.setChecked(checkableImageButton.f3982g);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = jVar.f4278a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) view2).f3985A);
                break;
        }
    }
}
