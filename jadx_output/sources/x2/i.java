package x2;

import c2.C0168g;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f6732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f6733f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, boolean z3) {
        super(2);
        this.f6732e = list;
        this.f6733f = z3;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        Object obj3;
        C0168g c0168g;
        Object obj4;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        p2.g.e(charSequence, "$this$$receiver");
        List list = this.f6732e;
        boolean z3 = this.f6733f;
        if (z3 || list.size() != 1) {
            if (intValue < 0) {
                intValue = 0;
            }
            boolean z4 = charSequence instanceof String;
            int i3 = new u2.d(intValue, charSequence.length(), 1).f6301e;
            if (z4) {
                if (intValue <= i3) {
                    while (true) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            String str = (String) obj4;
                            if (j.l(0, intValue, str.length(), str, (String) charSequence, z3)) {
                                break;
                            }
                        }
                        String str2 = (String) obj4;
                        if (str2 == null) {
                            if (intValue == i3) {
                                break;
                            }
                            intValue++;
                        } else {
                            c0168g = new C0168g(Integer.valueOf(intValue), str2);
                            break;
                        }
                    }
                }
                c0168g = null;
            } else {
                if (intValue <= i3) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            String str3 = (String) obj3;
                            if (j.m(str3, 0, charSequence, intValue, str3.length(), z3)) {
                                break;
                            }
                        }
                        String str4 = (String) obj3;
                        if (str4 == null) {
                            if (intValue == i3) {
                                break;
                            }
                            intValue++;
                        } else {
                            c0168g = new C0168g(Integer.valueOf(intValue), str4);
                            break;
                        }
                    }
                }
                c0168g = null;
            }
        } else {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            String str5 = (String) list.get(0);
            int j3 = j.j(charSequence, str5, intValue, 4);
            if (j3 >= 0) {
                c0168g = new C0168g(Integer.valueOf(j3), str5);
            }
            c0168g = null;
        }
        if (c0168g == null) {
            return null;
        }
        return new C0168g(c0168g.f3833d, Integer.valueOf(((String) c0168g.f3834e).length()));
    }
}
