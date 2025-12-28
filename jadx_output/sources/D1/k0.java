package d1;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class k0 {
    public static int a(int i3) {
        int statusBars;
        int i4 = 0;
        for (int i5 = 1; i5 <= 256; i5 <<= 1) {
            if ((i3 & i5) != 0) {
                if (i5 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i5 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i5 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i5 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i5 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i5 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i5 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i5 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i4 |= statusBars;
            }
        }
        return i4;
    }
}
