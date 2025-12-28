package t2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p2.g;

/* loaded from: classes.dex */
public final class a extends s2.a {
    @Override // s2.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        g.d(current, "current(...)");
        return current;
    }
}
