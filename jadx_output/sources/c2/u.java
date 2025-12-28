package C2;

import A.C0008i;
import B2.InterfaceC0022f;
import c2.AbstractC0171j;
import c2.C0174m;
import d2.AbstractC0240k;
import d2.AbstractC0241l;
import d2.AbstractC0242m;
import g2.C0277j;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import q.C0549B;
import x.AbstractC0637b;
import y2.AbstractC0688v;

/* loaded from: classes.dex */
public final class u extends i2.c implements InterfaceC0022f {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0022f f618g;
    public final InterfaceC0276i h;

    /* renamed from: i, reason: collision with root package name */
    public final int f619i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0276i f620j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0271d f621k;

    public u(InterfaceC0022f interfaceC0022f, InterfaceC0276i interfaceC0276i) {
        super(r.f615d, C0277j.f4334d);
        this.f618g = interfaceC0022f;
        this.h = interfaceC0276i;
        this.f619i = ((Number) interfaceC0276i.l(0, t.f617e)).intValue();
    }

    @Override // B2.InterfaceC0022f
    public final Object b(Object obj, InterfaceC0271d interfaceC0271d) {
        try {
            Object n2 = n(interfaceC0271d, obj);
            return n2 == h2.a.f4407d ? n2 : C0174m.f3840a;
        } catch (Throwable th) {
            this.f620j = new p(interfaceC0271d.o(), th);
            throw th;
        }
    }

    @Override // i2.a, i2.d
    public final i2.d j() {
        InterfaceC0271d interfaceC0271d = this.f621k;
        if (interfaceC0271d instanceof i2.d) {
            return (i2.d) interfaceC0271d;
        }
        return null;
    }

    @Override // i2.a
    public final StackTraceElement k() {
        return null;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Throwable a3 = AbstractC0171j.a(obj);
        if (a3 != null) {
            this.f620j = new p(o(), a3);
        }
        InterfaceC0271d interfaceC0271d = this.f621k;
        if (interfaceC0271d != null) {
            interfaceC0271d.t(obj);
        }
        return h2.a.f4407d;
    }

    public final Object n(InterfaceC0271d interfaceC0271d, Object obj) {
        Comparable comparable;
        String str;
        InterfaceC0276i o3 = interfaceC0271d.o();
        AbstractC0688v.d(o3);
        InterfaceC0276i interfaceC0276i = this.f620j;
        if (interfaceC0276i != o3) {
            int i3 = 0;
            if (interfaceC0276i instanceof p) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p) interfaceC0276i).f613d + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                p2.g.e(str2, "<this>");
                List asList = Arrays.asList("\r\n", "\n", "\r");
                p2.g.d(asList, "asList(...)");
                List a02 = w2.h.a0(new w2.e(new x2.b(str2, 0, 0, new x2.i(asList, false)), new C0549B(str2, 2)));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : a02) {
                    if (!x2.j.k((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0242m.W(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i4 = -1;
                            break;
                        }
                        if (!AbstractC0637b.c(str3.charAt(i4))) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 == -1) {
                        i4 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i4));
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                a02.size();
                int T2 = AbstractC0241l.T(a02);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : a02) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj3;
                    if ((i3 == 0 || i3 == T2) && x2.j.k(str4)) {
                        str = null;
                    } else {
                        p2.g.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        p2.g.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i3 = i5;
                }
                StringBuilder sb = new StringBuilder(length2);
                AbstractC0240k.c0(arrayList3, sb, "\n", "", "", -1, "...", null);
                String sb2 = sb.toString();
                p2.g.d(sb2, "toString(...)");
                throw new IllegalStateException(sb2.toString());
            }
            if (((Number) o3.l(0, new C0008i(3, this))).intValue() != this.f619i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.h + ",\n\t\tbut emission happened in " + o3 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f620j = o3;
        }
        this.f621k = interfaceC0271d;
        v vVar = w.f623a;
        InterfaceC0022f interfaceC0022f = this.f618g;
        p2.g.c(interfaceC0022f, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        vVar.getClass();
        Object b3 = interfaceC0022f.b(obj, this);
        if (!p2.g.a(b3, h2.a.f4407d)) {
            this.f621k = null;
        }
        return b3;
    }

    @Override // i2.c, g2.InterfaceC0271d
    public final InterfaceC0276i o() {
        InterfaceC0276i interfaceC0276i = this.f620j;
        return interfaceC0276i == null ? C0277j.f4334d : interfaceC0276i;
    }
}
