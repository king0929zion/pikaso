package Z;

import android.view.RenderNode;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f2886a = new n();

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i3) {
        renderNode.setAmbientShadowColor(i3);
    }

    public final void d(RenderNode renderNode, int i3) {
        renderNode.setSpotShadowColor(i3);
    }
}
