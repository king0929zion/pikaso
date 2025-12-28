package b;

import c2.C0174m;
import d2.C0238i;
import java.util.ListIterator;
import s1.C0592f;

/* loaded from: classes.dex */
public final class l extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f3615f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(r rVar, int i3) {
        super(1);
        this.f3614e = i3;
        this.f3615f = rVar;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f3614e) {
            case 0:
                p2.g.e((C0132b) obj, "backEvent");
                r rVar = this.f3615f;
                C0238i c0238i = rVar.f3627b;
                ListIterator listIterator = c0238i.listIterator(c0238i.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((C0592f) obj2).f6134a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                rVar.f3628c = (C0592f) obj2;
                break;
            default:
                p2.g.e((C0132b) obj, "backEvent");
                r rVar2 = this.f3615f;
                if (rVar2.f3628c == null) {
                    C0238i c0238i2 = rVar2.f3627b;
                    ListIterator listIterator2 = c0238i2.listIterator(c0238i2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((C0592f) obj3).f6134a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                }
                break;
        }
        return C0174m.f3840a;
    }
}
