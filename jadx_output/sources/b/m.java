package b;

import c2.C0174m;
import d2.C0238i;
import java.util.ListIterator;
import s1.C0592f;

/* loaded from: classes.dex */
public final class m extends p2.h implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f3617f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(r rVar, int i3) {
        super(0);
        this.f3616e = i3;
        this.f3617f = rVar;
    }

    @Override // o2.a
    public final Object c() {
        Object obj;
        switch (this.f3616e) {
            case 0:
                this.f3617f.a();
                break;
            case 1:
                r rVar = this.f3617f;
                if (rVar.f3628c == null) {
                    C0238i c0238i = rVar.f3627b;
                    ListIterator listIterator = c0238i.listIterator(c0238i.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            if (((C0592f) obj).f6134a) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                }
                rVar.f3628c = null;
                break;
            default:
                this.f3617f.a();
                break;
        }
        return C0174m.f3840a;
    }
}
