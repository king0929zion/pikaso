package androidx.lifecycle;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3457a;

    public I(int i3) {
        switch (i3) {
            case 1:
                this.f3457a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f3457a = new LinkedHashMap();
                break;
        }
    }
}
