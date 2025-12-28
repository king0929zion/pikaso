package o0;

import D.AbstractC0047k0;
import D.C0032d;
import D.C0038g;
import D.C0048l;
import D.C0049l0;
import D.C0052n;
import D.C0053n0;
import D.C0061u;
import D.C0065y;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import c2.C0174m;
import com.ai.assistance.operit.provider.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import u1.AbstractC0606b;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    public static final D.H f5493a = new D.H(D.U.f731i, C0462L.f5454f);

    /* renamed from: b, reason: collision with root package name */
    public static final D.M0 f5494b = new D.M0(C0462L.f5455g);

    /* renamed from: c, reason: collision with root package name */
    public static final D.M0 f5495c = new D.M0(C0462L.h);

    /* renamed from: d, reason: collision with root package name */
    public static final D.M0 f5496d = new D.M0(C0462L.f5456i);

    /* renamed from: e, reason: collision with root package name */
    public static final D.M0 f5497e = new D.M0(C0462L.f5457j);

    /* renamed from: f, reason: collision with root package name */
    public static final D.M0 f5498f = new D.M0(C0462L.f5458k);

    public static final void a(C0507u c0507u, L.a aVar, C0052n c0052n, int i3) {
        boolean z3;
        c0052n.O(1396852028);
        int i4 = (i3 & 6) == 0 ? (c0052n.h(c0507u) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i4 |= c0052n.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0052n.y()) {
            c0052n.K();
        } else {
            Context context = c0507u.getContext();
            Object H2 = c0052n.H();
            Object obj = C0048l.f781a;
            if (H2 == obj) {
                H2 = C0032d.A(new Configuration(context.getResources().getConfiguration()));
                c0052n.V(H2);
            }
            D.Z z4 = (D.Z) H2;
            Object H3 = c0052n.H();
            if (H3 == obj) {
                H3 = new C0065y(16, z4);
                c0052n.V(H3);
            }
            c0507u.setConfigurationChangeObserver((o2.c) H3);
            Object H4 = c0052n.H();
            if (H4 == obj) {
                H4 = new X();
                c0052n.V(H4);
            }
            X x3 = (X) H4;
            C0490l viewTreeOwners = c0507u.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object H5 = c0052n.H();
            A1.g gVar = viewTreeOwners.f5601b;
            if (H5 == obj) {
                Object parent = c0507u.getParent();
                p2.g.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = M.b.class.getSimpleName() + ':' + str;
                A1.e b3 = gVar.b();
                Bundle a3 = b3.a(str2);
                if (a3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : a3.keySet()) {
                        ArrayList parcelableArrayList = a3.getParcelableArrayList(str3);
                        p2.g.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str3, parcelableArrayList);
                        a3 = a3;
                    }
                }
                D.M0 m02 = M.e.f1520a;
                M.c cVar = new M.c(linkedHashMap);
                try {
                    z3 = true;
                    b3.b(str2, new b.d(1, cVar));
                } catch (IllegalArgumentException unused) {
                    z3 = false;
                }
                Object c0483h0 = new C0483h0(cVar, new C0485i0(z3, b3, str2));
                c0052n.V(c0483h0);
                H5 = c0483h0;
            }
            Object obj2 = (C0483h0) H5;
            C0174m c0174m = C0174m.f3840a;
            boolean h = c0052n.h(obj2);
            Object H6 = c0052n.H();
            if (h || H6 == obj) {
                H6 = new C0065y(17, obj2);
                c0052n.V(H6);
            }
            C0032d.c(c0174m, (o2.c) H6, c0052n);
            Configuration configuration = (Configuration) z4.getValue();
            Object H7 = c0052n.H();
            if (H7 == obj) {
                H7 = new r0.c();
                c0052n.V(H7);
            }
            r0.c cVar2 = (r0.c) H7;
            Object H8 = c0052n.H();
            Object obj3 = H8;
            if (H8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0052n.V(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object H9 = c0052n.H();
            if (H9 == obj) {
                H9 = new ComponentCallbacks2C0466P(configuration3, cVar2);
                c0052n.V(H9);
            }
            ComponentCallbacks2C0466P componentCallbacks2C0466P = (ComponentCallbacks2C0466P) H9;
            boolean h3 = c0052n.h(context);
            Object H10 = c0052n.H();
            if (h3 || H10 == obj) {
                H10 = new C0038g(context, 5, componentCallbacks2C0466P);
                c0052n.V(H10);
            }
            C0032d.c(cVar2, (o2.c) H10, c0052n);
            Object H11 = c0052n.H();
            if (H11 == obj) {
                H11 = new r0.d();
                c0052n.V(H11);
            }
            r0.d dVar = (r0.d) H11;
            Object H12 = c0052n.H();
            if (H12 == obj) {
                H12 = new ComponentCallbacks2C0467Q(dVar);
                c0052n.V(H12);
            }
            ComponentCallbacks2C0467Q componentCallbacks2C0467Q = (ComponentCallbacks2C0467Q) H12;
            boolean h4 = c0052n.h(context);
            Object H13 = c0052n.H();
            if (h4 || H13 == obj) {
                H13 = new C0038g(context, 6, componentCallbacks2C0467Q);
                c0052n.V(H13);
            }
            C0032d.c(dVar, (o2.c) H13, c0052n);
            AbstractC0047k0 abstractC0047k0 = AbstractC0479f0.f5587t;
            C0032d.b(new C0049l0[]{f5493a.a((Configuration) z4.getValue()), f5494b.a(context), AbstractC0606b.f6299a.a(viewTreeOwners.f5600a), f5497e.a(gVar), M.e.f1520a.a(obj2), f5498f.a(c0507u.getView()), f5495c.a(cVar2), f5496d.a(dVar), abstractC0047k0.a(Boolean.valueOf(((Boolean) c0052n.k(abstractC0047k0)).booleanValue() | c0507u.getScrollCaptureInProgress$ui_release()))}, L.b.b(1471621628, new C0464N(c0507u, x3, aVar), c0052n), c0052n, 56);
        }
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            s3.f834d = new C0061u(c0507u, aVar, i3, 3);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
