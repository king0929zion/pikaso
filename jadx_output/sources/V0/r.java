package v0;

import W.G;
import d2.AbstractC0241l;
import d2.C0248s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6401e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f6381f = new r(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final r f6382g = new r(2, 1);
    public static final r h = new r(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final r f6383i = new r(2, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final r f6384j = new r(2, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final r f6385k = new r(2, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final r f6386l = new r(2, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final r f6387m = new r(2, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final r f6388n = new r(2, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final r f6389o = new r(2, 9);

    /* renamed from: p, reason: collision with root package name */
    public static final r f6390p = new r(2, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final r f6391q = new r(2, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final r f6392r = new r(2, 12);

    /* renamed from: s, reason: collision with root package name */
    public static final r f6393s = new r(2, 13);

    /* renamed from: t, reason: collision with root package name */
    public static final r f6394t = new r(2, 14);

    /* renamed from: u, reason: collision with root package name */
    public static final r f6395u = new r(2, 15);

    /* renamed from: v, reason: collision with root package name */
    public static final r f6396v = new r(2, 16);

    /* renamed from: w, reason: collision with root package name */
    public static final r f6397w = new r(2, 17);

    /* renamed from: x, reason: collision with root package name */
    public static final r f6398x = new r(2, 18);

    /* renamed from: y, reason: collision with root package name */
    public static final r f6399y = new r(2, 19);

    /* renamed from: z, reason: collision with root package name */
    public static final r f6400z = new r(2, 20);

    /* renamed from: A, reason: collision with root package name */
    public static final r f6380A = new r(2, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i3, int i4) {
        super(i3);
        this.f6401e = i4;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        int i3 = 0;
        switch (this.f6401e) {
            case 0:
                M.a aVar = (M.a) obj;
                C0618c c0618c = (C0618c) obj2;
                String str = c0618c.f6334d;
                B2.i iVar = u.f6426a;
                Collection collection = C0248s.f4255d;
                Collection collection2 = c0618c.f6335e;
                if (collection2 == null) {
                    collection2 = collection;
                }
                B2.i iVar2 = u.f6426a;
                Object a3 = u.a(collection2, iVar2, aVar);
                Collection collection3 = c0618c.f6336f;
                if (collection3 != null) {
                    collection = collection3;
                }
                return AbstractC0241l.S(str, a3, u.a(collection, iVar2, aVar), u.a(c0618c.f6337g, iVar2, aVar));
            case 1:
                M.a aVar2 = (M.a) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i3 < size) {
                    arrayList.add(u.a((C0617b) list.get(i3), u.f6427b, aVar2));
                    i3++;
                }
                return arrayList;
            case 2:
                M.a aVar3 = (M.a) obj;
                C0617b c0617b = (C0617b) obj2;
                Object obj3 = c0617b.f6330a;
                EnumC0620e enumC0620e = obj3 instanceof n ? EnumC0620e.f6339d : obj3 instanceof v ? EnumC0620e.f6340e : obj3 instanceof C0615D ? EnumC0620e.f6341f : obj3 instanceof C0614C ? EnumC0620e.f6342g : obj3 instanceof C0622g ? EnumC0620e.h : obj3 instanceof C0621f ? EnumC0620e.f6343i : EnumC0620e.f6344j;
                int ordinal = enumC0620e.ordinal();
                Object obj4 = c0617b.f6330a;
                switch (ordinal) {
                    case 0:
                        p2.g.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        obj4 = u.a((n) obj4, u.f6432g, aVar3);
                        break;
                    case 1:
                        p2.g.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        obj4 = u.a((v) obj4, u.h, aVar3);
                        break;
                    case 2:
                        p2.g.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        obj4 = u.a((C0615D) obj4, u.f6428c, aVar3);
                        break;
                    case 3:
                        p2.g.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        obj4 = u.a((C0614C) obj4, u.f6429d, aVar3);
                        break;
                    case 4:
                        p2.g.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        obj4 = u.a((C0622g) obj4, u.f6430e, aVar3);
                        break;
                    case 5:
                        p2.g.c(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        obj4 = u.a((C0621f) obj4, u.f6431f, aVar3);
                        break;
                    case 6:
                        B2.i iVar3 = u.f6426a;
                        break;
                    default:
                        throw new B1.c();
                }
                return AbstractC0241l.S(enumC0620e, obj4, Integer.valueOf(c0617b.f6331b), Integer.valueOf(c0617b.f6332c), c0617b.f6333d);
            case 3:
                return Float.valueOf(((F0.a) obj2).f1171a);
            case 4:
                C0621f c0621f = (C0621f) obj2;
                return AbstractC0241l.S(c0621f.f6346a, u.a(c0621f.f6347b, u.f6433i, (M.a) obj));
            case 5:
                long j3 = ((W.r) obj2).f2564a;
                return j3 == 16 ? Boolean.FALSE : Integer.valueOf(W.D.C(j3));
            case 6:
                return Integer.valueOf(((z0.l) obj2).f6931d);
            case 7:
                C0622g c0622g = (C0622g) obj2;
                return AbstractC0241l.S(c0622g.f6348a, u.a(c0622g.f6349b, u.f6433i, (M.a) obj));
            case 8:
                M.a aVar4 = (M.a) obj;
                List list2 = ((B0.c) obj2).f276d;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i3 < size2) {
                    arrayList2.add(u.a((B0.b) list2.get(i3), u.f6444t, aVar4));
                    i3++;
                }
                return arrayList2;
            case 9:
                return ((B0.b) obj2).f274a.toLanguageTag();
            case 10:
                long j4 = ((V.c) obj2).f2444a;
                if (V.c.a(j4, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(V.c.b(j4));
                B2.i iVar4 = u.f6426a;
                return AbstractC0241l.S(valueOf, Float.valueOf(V.c.c(j4)));
            case 11:
                M.a aVar5 = (M.a) obj;
                n nVar = (n) obj2;
                F0.f fVar = new F0.f(nVar.f6369a);
                B2.i iVar5 = u.f6426a;
                F0.h hVar = new F0.h(nVar.f6370b);
                Object a4 = u.a(new G0.h(nVar.f6371c), u.f6441q, aVar5);
                F0.l lVar = F0.l.f1190c;
                return AbstractC0241l.S(fVar, hVar, a4, u.a(nVar.f6372d, u.f6436l, aVar5));
            case 12:
                M.a aVar6 = (M.a) obj;
                G g3 = (G) obj2;
                return AbstractC0241l.S(u.a(new W.r(g3.f2509a), u.f6440p, aVar6), u.a(new V.c(g3.f2510b), u.f6442r, aVar6), Float.valueOf(g3.f2511c));
            case 13:
                M.a aVar7 = (M.a) obj;
                v vVar = (v) obj2;
                W.r rVar = new W.r(vVar.f6445a.b());
                t tVar = u.f6440p;
                Object a5 = u.a(rVar, tVar, aVar7);
                G0.h hVar2 = new G0.h(vVar.f6446b);
                t tVar2 = u.f6441q;
                Object a6 = u.a(hVar2, tVar2, aVar7);
                z0.l lVar2 = z0.l.f6928e;
                Object a7 = u.a(vVar.f6447c, u.f6437m, aVar7);
                Object a8 = u.a(new G0.h(vVar.h), tVar2, aVar7);
                Object a9 = u.a(vVar.f6452i, u.f6438n, aVar7);
                Object a10 = u.a(vVar.f6453j, u.f6435k, aVar7);
                B0.c cVar = B0.c.f275f;
                Object a11 = u.a(vVar.f6454k, u.f6443s, aVar7);
                Object a12 = u.a(new W.r(vVar.f6455l), tVar, aVar7);
                Object a13 = u.a(vVar.f6456m, u.f6434j, aVar7);
                G g4 = G.f2508d;
                return AbstractC0241l.S(a5, a6, a7, vVar.f6448d, vVar.f6449e, -1, vVar.f6451g, a8, a9, a10, a11, a12, a13, u.a(vVar.f6457n, u.f6439o, aVar7));
            case 14:
                return Integer.valueOf(((F0.g) obj2).f1184a);
            case 15:
                F0.k kVar = (F0.k) obj2;
                return AbstractC0241l.S(Float.valueOf(kVar.f1188a), Float.valueOf(kVar.f1189b));
            case 16:
                M.a aVar8 = (M.a) obj;
                F0.l lVar3 = (F0.l) obj2;
                G0.h hVar3 = new G0.h(lVar3.f1191a);
                t tVar3 = u.f6441q;
                return AbstractC0241l.S(u.a(hVar3, tVar3, aVar8), u.a(new G0.h(lVar3.f1192b), tVar3, aVar8));
            case 17:
                M.a aVar9 = (M.a) obj;
                z zVar = (z) obj2;
                v vVar2 = zVar.f6478a;
                B2.i iVar6 = u.h;
                return AbstractC0241l.S(u.a(vVar2, iVar6, aVar9), u.a(zVar.f6479b, iVar6, aVar9), u.a(zVar.f6480c, iVar6, aVar9), u.a(zVar.f6481d, iVar6, aVar9));
            case 18:
                long j5 = ((C0612A) obj2).f6317a;
                int i4 = C0612A.f6316c;
                Integer valueOf2 = Integer.valueOf((int) (j5 >> 32));
                B2.i iVar7 = u.f6426a;
                return AbstractC0241l.S(valueOf2, Integer.valueOf((int) (j5 & 4294967295L)));
            case 19:
                long j6 = ((G0.h) obj2).f1264a;
                if (G0.h.a(j6, G0.h.f1263c)) {
                    return Boolean.FALSE;
                }
                Float valueOf3 = Float.valueOf(G0.h.c(j6));
                B2.i iVar8 = u.f6426a;
                return AbstractC0241l.S(valueOf3, new G0.i(G0.h.b(j6)));
            case 20:
                String str2 = ((C0614C) obj2).f6322a;
                B2.i iVar9 = u.f6426a;
                return str2;
            default:
                String str3 = ((C0615D) obj2).f6323a;
                B2.i iVar10 = u.f6426a;
                return str3;
        }
    }
}
