package a1;

import java.util.ArrayList;
import n.C0379F;

/* renamed from: a1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2937b;

    public /* synthetic */ C0097e(int i3, Object obj) {
        this.f2936a = i3;
        this.f2937b = obj;
    }

    public final void a(Object obj) {
        switch (this.f2936a) {
            case 0:
                C0098f c0098f = (C0098f) obj;
                if (c0098f == null) {
                    c0098f = new C0098f(-3);
                }
                ((B2.i) this.f2937b).q(c0098f);
                return;
            default:
                C0098f c0098f2 = (C0098f) obj;
                synchronized (AbstractC0099g.f2942c) {
                    try {
                        C0379F c0379f = AbstractC0099g.f2943d;
                        ArrayList arrayList = (ArrayList) c0379f.get((String) this.f2937b);
                        if (arrayList == null) {
                            return;
                        }
                        c0379f.remove((String) this.f2937b);
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            ((C0097e) arrayList.get(i3)).a(c0098f2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
