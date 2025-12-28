package d1;

import android.graphics.RenderNode;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a0 {
    public static /* synthetic */ RenderNode e() {
        return new RenderNode("Compose");
    }

    public static /* synthetic */ WindowInsets.Builder g() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder h(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }
}
