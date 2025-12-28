package v0;

import W.G;
import a.AbstractC0090a;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class s extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6423e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f6403f = new s(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final s f6404g = new s(1, 1);
    public static final s h = new s(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final s f6405i = new s(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final s f6406j = new s(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final s f6407k = new s(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final s f6408l = new s(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final s f6409m = new s(1, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final s f6410n = new s(1, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final s f6411o = new s(1, 9);

    /* renamed from: p, reason: collision with root package name */
    public static final s f6412p = new s(1, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final s f6413q = new s(1, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final s f6414r = new s(1, 12);

    /* renamed from: s, reason: collision with root package name */
    public static final s f6415s = new s(1, 13);

    /* renamed from: t, reason: collision with root package name */
    public static final s f6416t = new s(1, 14);

    /* renamed from: u, reason: collision with root package name */
    public static final s f6417u = new s(1, 15);

    /* renamed from: v, reason: collision with root package name */
    public static final s f6418v = new s(1, 16);

    /* renamed from: w, reason: collision with root package name */
    public static final s f6419w = new s(1, 17);

    /* renamed from: x, reason: collision with root package name */
    public static final s f6420x = new s(1, 18);

    /* renamed from: y, reason: collision with root package name */
    public static final s f6421y = new s(1, 19);

    /* renamed from: z, reason: collision with root package name */
    public static final s f6422z = new s(1, 20);

    /* renamed from: A, reason: collision with root package name */
    public static final s f6402A = new s(1, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i3, int i4) {
        super(i3);
        this.f6423e = i4;
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [o2.c, p2.h] */
    /* JADX WARN: Type inference failed for: r12v3, types: [o2.c, p2.h] */
    /* JADX WARN: Type inference failed for: r3v31, types: [o2.c, p2.h] */
    /* JADX WARN: Type inference failed for: r3v39, types: [o2.c, p2.h] */
    /* JADX WARN: Type inference failed for: r3v62, types: [o2.c, p2.h] */
    /* JADX WARN: Type inference failed for: r4v40, types: [o2.c, p2.h] */
    /* JADX WARN: Type inference failed for: r5v24, types: [o2.c, p2.h] */
    /* JADX WARN: Type inference failed for: r5v31, types: [o2.c, p2.h] */
    /* JADX WARN: Type inference failed for: r6v13, types: [o2.c, p2.h] */
    @Override // o2.c
    public final Object i(Object obj) {
        int i3 = 0;
        List list = null;
        r9 = null;
        v vVar = null;
        r9 = null;
        G0.h hVar = null;
        r9 = null;
        G g3 = null;
        r9 = null;
        F0.l lVar = null;
        r9 = null;
        z zVar = null;
        r9 = null;
        z zVar2 = null;
        r9 = null;
        C0621f c0621f = null;
        r9 = null;
        C0622g c0622g = null;
        r9 = null;
        C0614C c0614c = null;
        r9 = null;
        C0615D c0615d = null;
        r9 = null;
        v vVar2 = null;
        r9 = null;
        n nVar = null;
        list = null;
        switch (this.f6423e) {
            case 0:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj2 = list2.get(1);
                B2.i iVar = u.f6426a;
                Boolean bool = Boolean.FALSE;
                List list3 = (p2.g.a(obj2, bool) || obj2 == null) ? null : (List) ((o2.c) iVar.f317f).i(obj2);
                Object obj3 = list2.get(2);
                List list4 = (p2.g.a(obj3, bool) || obj3 == null) ? null : (List) ((o2.c) iVar.f317f).i(obj3);
                Object obj4 = list2.get(0);
                String str = obj4 != null ? (String) obj4 : null;
                p2.g.b(str);
                if (list3 == null || list3.isEmpty()) {
                    list3 = null;
                }
                if (list4 == null || list4.isEmpty()) {
                    list4 = null;
                }
                Object obj5 = list2.get(3);
                if (!p2.g.a(obj5, bool) && obj5 != null) {
                    list = (List) ((o2.c) iVar.f317f).i(obj5);
                }
                return new C0618c(str, list3, list4, list);
            case 1:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                ArrayList arrayList = new ArrayList(list5.size());
                int size = list5.size();
                while (i3 < size) {
                    Object obj6 = list5.get(i3);
                    C0617b c0617b = (p2.g.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (C0617b) ((o2.c) u.f6427b.f317f).i(obj6);
                    p2.g.b(c0617b);
                    arrayList.add(c0617b);
                    i3++;
                }
                return arrayList;
            case 2:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj7 = list6.get(0);
                EnumC0620e enumC0620e = obj7 != null ? (EnumC0620e) obj7 : null;
                p2.g.b(enumC0620e);
                Object obj8 = list6.get(2);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                p2.g.b(num);
                int intValue = num.intValue();
                Object obj9 = list6.get(3);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                p2.g.b(num2);
                int intValue2 = num2.intValue();
                Object obj10 = list6.get(4);
                String str2 = obj10 != null ? (String) obj10 : null;
                p2.g.b(str2);
                switch (enumC0620e.ordinal()) {
                    case 0:
                        Object obj11 = list6.get(1);
                        B2.i iVar2 = u.f6432g;
                        if (!p2.g.a(obj11, Boolean.FALSE) && obj11 != null) {
                            nVar = (n) ((o2.c) iVar2.f317f).i(obj11);
                        }
                        p2.g.b(nVar);
                        return new C0617b(nVar, intValue, intValue2, str2);
                    case 1:
                        Object obj12 = list6.get(1);
                        B2.i iVar3 = u.h;
                        if (!p2.g.a(obj12, Boolean.FALSE) && obj12 != null) {
                            vVar2 = (v) ((o2.c) iVar3.f317f).i(obj12);
                        }
                        p2.g.b(vVar2);
                        return new C0617b(vVar2, intValue, intValue2, str2);
                    case 2:
                        Object obj13 = list6.get(1);
                        B2.i iVar4 = u.f6428c;
                        if (!p2.g.a(obj13, Boolean.FALSE) && obj13 != null) {
                            c0615d = (C0615D) ((o2.c) iVar4.f317f).i(obj13);
                        }
                        p2.g.b(c0615d);
                        return new C0617b(c0615d, intValue, intValue2, str2);
                    case 3:
                        Object obj14 = list6.get(1);
                        B2.i iVar5 = u.f6429d;
                        if (!p2.g.a(obj14, Boolean.FALSE) && obj14 != null) {
                            c0614c = (C0614C) ((o2.c) iVar5.f317f).i(obj14);
                        }
                        p2.g.b(c0614c);
                        return new C0617b(c0614c, intValue, intValue2, str2);
                    case 4:
                        Object obj15 = list6.get(1);
                        B2.i iVar6 = u.f6430e;
                        if (!p2.g.a(obj15, Boolean.FALSE) && obj15 != null) {
                            c0622g = (C0622g) ((o2.c) iVar6.f317f).i(obj15);
                        }
                        p2.g.b(c0622g);
                        return new C0617b(c0622g, intValue, intValue2, str2);
                    case 5:
                        Object obj16 = list6.get(1);
                        B2.i iVar7 = u.f6431f;
                        if (!p2.g.a(obj16, Boolean.FALSE) && obj16 != null) {
                            c0621f = (C0621f) ((o2.c) iVar7.f317f).i(obj16);
                        }
                        p2.g.b(c0621f);
                        return new C0617b(c0621f, intValue, intValue2, str2);
                    case 6:
                        Object obj17 = list6.get(1);
                        String str3 = obj17 != null ? (String) obj17 : null;
                        p2.g.b(str3);
                        return new C0617b(str3, intValue, intValue2, str2);
                    default:
                        throw new B1.c();
                }
            case 3:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new F0.a(((Float) obj).floatValue());
            case 4:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list7 = (List) obj;
                Object obj18 = list7.get(0);
                String str4 = obj18 != null ? (String) obj18 : null;
                p2.g.b(str4);
                Object obj19 = list7.get(1);
                B2.i iVar8 = u.f6433i;
                if (!p2.g.a(obj19, Boolean.FALSE) && obj19 != null) {
                    zVar2 = (z) ((o2.c) iVar8.f317f).i(obj19);
                }
                return new C0621f(str4, zVar2);
            case 5:
                if (p2.g.a(obj, Boolean.FALSE)) {
                    return new W.r(W.r.f2562f);
                }
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new W.r(W.D.b(((Integer) obj).intValue()));
            case 6:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new z0.l(((Integer) obj).intValue());
            case 7:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list8 = (List) obj;
                Object obj20 = list8.get(0);
                String str5 = obj20 != null ? (String) obj20 : null;
                p2.g.b(str5);
                Object obj21 = list8.get(1);
                B2.i iVar9 = u.f6433i;
                if (!p2.g.a(obj21, Boolean.FALSE) && obj21 != null) {
                    zVar = (z) ((o2.c) iVar9.f317f).i(obj21);
                }
                return new C0622g(str5, zVar);
            case 8:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i3 < size2) {
                    Object obj22 = list9.get(i3);
                    B0.b bVar = (p2.g.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (B0.b) ((o2.c) u.f6444t.f317f).i(obj22);
                    p2.g.b(bVar);
                    arrayList2.add(bVar);
                    i3++;
                }
                return new B0.c(arrayList2);
            case 9:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj;
                B0.d.f278a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str6);
                if (p2.g.a(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str6 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new B0.b(forLanguageTag);
            case 10:
                if (p2.g.a(obj, Boolean.FALSE)) {
                    return new V.c(9205357640488583168L);
                }
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj23 = list10.get(0);
                Float f3 = obj23 != null ? (Float) obj23 : null;
                p2.g.b(f3);
                float floatValue = f3.floatValue();
                Object obj24 = list10.get(1);
                Float f4 = obj24 != null ? (Float) obj24 : null;
                p2.g.b(f4);
                return new V.c(r2.a.f(floatValue, f4.floatValue()));
            case 11:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj25 = list11.get(0);
                F0.f fVar = obj25 != null ? (F0.f) obj25 : null;
                p2.g.b(fVar);
                Object obj26 = list11.get(1);
                F0.h hVar2 = obj26 != null ? (F0.h) obj26 : null;
                p2.g.b(hVar2);
                Object obj27 = list11.get(2);
                G0.i[] iVarArr = G0.h.f1262b;
                t tVar = u.f6441q;
                Boolean bool2 = Boolean.FALSE;
                G0.h hVar3 = ((p2.g.a(obj27, bool2) && tVar == null) || obj27 == null) ? null : (G0.h) tVar.f6425e.i(obj27);
                p2.g.b(hVar3);
                Object obj28 = list11.get(3);
                F0.l lVar2 = F0.l.f1190c;
                B2.i iVar10 = u.f6436l;
                if (!p2.g.a(obj28, bool2) && obj28 != null) {
                    lVar = (F0.l) ((o2.c) iVar10.f317f).i(obj28);
                }
                return new n(fVar.f1181a, hVar2.f1185a, hVar3.f1264a, lVar, null, null, 0, Integer.MIN_VALUE, null);
            case 12:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                Object obj29 = list12.get(0);
                int i4 = W.r.f2563g;
                t tVar2 = u.f6440p;
                Boolean bool3 = Boolean.FALSE;
                W.r rVar = ((p2.g.a(obj29, bool3) && tVar2 == null) || obj29 == null) ? null : (W.r) tVar2.f6425e.i(obj29);
                p2.g.b(rVar);
                Object obj30 = list12.get(1);
                t tVar3 = u.f6442r;
                V.c cVar = ((p2.g.a(obj30, bool3) && tVar3 == null) || obj30 == null) ? null : (V.c) tVar3.f6425e.i(obj30);
                p2.g.b(cVar);
                Object obj31 = list12.get(2);
                Float f5 = obj31 != null ? (Float) obj31 : null;
                p2.g.b(f5);
                return new G(rVar.f2564a, cVar.f2444a, f5.floatValue());
            case 13:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list13 = (List) obj;
                Object obj32 = list13.get(0);
                int i5 = W.r.f2563g;
                t tVar4 = u.f6440p;
                Boolean bool4 = Boolean.FALSE;
                W.r rVar2 = ((p2.g.a(obj32, bool4) && tVar4 == null) || obj32 == null) ? null : (W.r) tVar4.f6425e.i(obj32);
                p2.g.b(rVar2);
                Object obj33 = list13.get(1);
                G0.i[] iVarArr2 = G0.h.f1262b;
                t tVar5 = u.f6441q;
                G0.h hVar4 = ((p2.g.a(obj33, bool4) && tVar5 == null) || obj33 == null) ? null : (G0.h) tVar5.f6425e.i(obj33);
                p2.g.b(hVar4);
                Object obj34 = list13.get(2);
                z0.l lVar3 = z0.l.f6928e;
                z0.l lVar4 = (p2.g.a(obj34, bool4) || obj34 == null) ? null : (z0.l) ((o2.c) u.f6437m.f317f).i(obj34);
                Object obj35 = list13.get(3);
                z0.j jVar = obj35 != null ? (z0.j) obj35 : null;
                Object obj36 = list13.get(4);
                z0.k kVar = obj36 != null ? (z0.k) obj36 : null;
                Object obj37 = list13.get(6);
                String str7 = obj37 != null ? (String) obj37 : null;
                Object obj38 = list13.get(7);
                G0.h hVar5 = ((p2.g.a(obj38, bool4) && tVar5 == null) || obj38 == null) ? null : (G0.h) tVar5.f6425e.i(obj38);
                p2.g.b(hVar5);
                Object obj39 = list13.get(8);
                F0.a aVar = (p2.g.a(obj39, bool4) || obj39 == null) ? null : (F0.a) ((o2.c) u.f6438n.f317f).i(obj39);
                Object obj40 = list13.get(9);
                F0.k kVar2 = (p2.g.a(obj40, bool4) || obj40 == null) ? null : (F0.k) ((o2.c) u.f6435k.f317f).i(obj40);
                Object obj41 = list13.get(10);
                B0.c cVar2 = B0.c.f275f;
                B0.c cVar3 = (p2.g.a(obj41, bool4) || obj41 == null) ? null : (B0.c) ((o2.c) u.f6443s.f317f).i(obj41);
                Object obj42 = list13.get(11);
                W.r rVar3 = ((p2.g.a(obj42, bool4) && tVar4 == null) || obj42 == null) ? null : (W.r) tVar4.f6425e.i(obj42);
                p2.g.b(rVar3);
                Object obj43 = list13.get(12);
                F0.g gVar = (p2.g.a(obj43, bool4) || obj43 == null) ? null : (F0.g) ((o2.c) u.f6434j.f317f).i(obj43);
                Object obj44 = list13.get(13);
                G g4 = G.f2508d;
                B2.i iVar11 = u.f6439o;
                if (!p2.g.a(obj44, bool4) && obj44 != null) {
                    g3 = (G) ((o2.c) iVar11.f317f).i(obj44);
                }
                return new v(rVar2.f2564a, hVar4.f1264a, lVar4, jVar, kVar, (z0.r) null, str7, hVar5.f1264a, aVar, kVar2, cVar3, rVar3.f2564a, gVar, g3, 49184);
            case 14:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new F0.g(((Integer) obj).intValue());
            case 15:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list14 = (List) obj;
                return new F0.k(((Number) list14.get(0)).floatValue(), ((Number) list14.get(1)).floatValue());
            case 16:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list15 = (List) obj;
                Object obj45 = list15.get(0);
                G0.i[] iVarArr3 = G0.h.f1262b;
                t tVar6 = u.f6441q;
                Boolean bool5 = Boolean.FALSE;
                G0.h hVar6 = ((p2.g.a(obj45, bool5) && tVar6 == null) || obj45 == null) ? null : (G0.h) tVar6.f6425e.i(obj45);
                p2.g.b(hVar6);
                Object obj46 = list15.get(1);
                if ((!p2.g.a(obj46, bool5) || tVar6 != null) && obj46 != null) {
                    hVar = (G0.h) tVar6.f6425e.i(obj46);
                }
                p2.g.b(hVar);
                return new F0.l(hVar6.f1264a, hVar.f1264a);
            case 17:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj47 = list16.get(0);
                B2.i iVar12 = u.h;
                Boolean bool6 = Boolean.FALSE;
                v vVar3 = (p2.g.a(obj47, bool6) || obj47 == null) ? null : (v) ((o2.c) iVar12.f317f).i(obj47);
                Object obj48 = list16.get(1);
                v vVar4 = (p2.g.a(obj48, bool6) || obj48 == null) ? null : (v) ((o2.c) iVar12.f317f).i(obj48);
                Object obj49 = list16.get(2);
                v vVar5 = (p2.g.a(obj49, bool6) || obj49 == null) ? null : (v) ((o2.c) iVar12.f317f).i(obj49);
                Object obj50 = list16.get(3);
                if (!p2.g.a(obj50, bool6) && obj50 != null) {
                    vVar = (v) ((o2.c) iVar12.f317f).i(obj50);
                }
                return new z(vVar3, vVar4, vVar5, vVar);
            case 18:
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list17 = (List) obj;
                Object obj51 = list17.get(0);
                Integer num3 = obj51 != null ? (Integer) obj51 : null;
                p2.g.b(num3);
                int intValue3 = num3.intValue();
                Object obj52 = list17.get(1);
                Integer num4 = obj52 != null ? (Integer) obj52 : null;
                p2.g.b(num4);
                return new C0612A(Z0.d.e(intValue3, num4.intValue()));
            case 19:
                if (p2.g.a(obj, Boolean.FALSE)) {
                    return new G0.h(G0.h.f1263c);
                }
                p2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj53 = list18.get(0);
                Float f6 = obj53 != null ? (Float) obj53 : null;
                p2.g.b(f6);
                float floatValue2 = f6.floatValue();
                Object obj54 = list18.get(1);
                G0.i iVar13 = obj54 != null ? (G0.i) obj54 : null;
                p2.g.b(iVar13);
                return new G0.h(AbstractC0090a.W(iVar13.f1265a, floatValue2));
            case 20:
                String str8 = obj != null ? (String) obj : null;
                p2.g.b(str8);
                return new C0614C(str8);
            default:
                String str9 = obj != null ? (String) obj : null;
                p2.g.b(str9);
                return new C0615D(str9);
        }
    }
}
