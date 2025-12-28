package s2;

import java.util.Random;
import o0.U;
import p2.g;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: f, reason: collision with root package name */
    public final U f6144f = new U(1);

    @Override // s2.a
    public final Random a() {
        Object obj = this.f6144f.get();
        g.d(obj, "get(...)");
        return (Random) obj;
    }
}
