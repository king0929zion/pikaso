package q;

import D.C0059s;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c2.C0174m;
import g2.InterfaceC0271d;
import n0.AbstractC0409C;
import n0.AbstractC0428i;
import n0.C0444z;
import n0.m0;
import n0.o0;
import y2.AbstractC0688v;
import y2.InterfaceC0687u;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556c extends i2.j implements o2.e {
    public s.i h;

    /* renamed from: i, reason: collision with root package name */
    public int f5979i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f5980j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f5981k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s.g f5982l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0556c(l lVar, long j3, s.g gVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f5980j = lVar;
        this.f5981k = j3;
        this.f5982l = gVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new C0556c(this.f5980j, this.f5981k, this.f5982l, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0556c) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [P.k] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [P.k] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [F.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // i2.a
    public final Object l(Object obj) {
        C0059s c0059s;
        s.i iVar;
        h2.a aVar = h2.a.f4407d;
        int i3 = this.f5979i;
        l lVar = this.f5980j;
        if (i3 == 0) {
            Z0.d.U(obj);
            X1.e eVar = r.f.f6084q;
            P.k kVar = lVar.f2088d;
            if (!kVar.f2099p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            P.k kVar2 = kVar.h;
            C0444z q3 = AbstractC0409C.q(lVar);
            while (q3 != null) {
                if ((((P.k) q3.f5319x.f857f).f2091g & 262144) != 0) {
                    while (kVar2 != null) {
                        if ((kVar2.f2090f & 262144) != 0) {
                            AbstractC0428i abstractC0428i = kVar2;
                            ?? r9 = 0;
                            while (abstractC0428i != 0) {
                                if (abstractC0428i instanceof o0) {
                                    if (eVar.equals(((o0) abstractC0428i).j())) {
                                        throw new ClassCastException();
                                    }
                                } else if ((abstractC0428i.f2090f & 262144) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                                    P.k kVar3 = abstractC0428i.f5256r;
                                    int i4 = 0;
                                    abstractC0428i = abstractC0428i;
                                    r9 = r9;
                                    while (kVar3 != null) {
                                        if ((kVar3.f2090f & 262144) != 0) {
                                            i4++;
                                            r9 = r9;
                                            if (i4 == 1) {
                                                abstractC0428i = kVar3;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new F.d(new P.k[16]);
                                                }
                                                if (abstractC0428i != 0) {
                                                    r9.b(abstractC0428i);
                                                    abstractC0428i = 0;
                                                }
                                                r9.b(kVar3);
                                            }
                                        }
                                        kVar3 = kVar3.f2092i;
                                        abstractC0428i = abstractC0428i;
                                        r9 = r9;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC0428i = AbstractC0409C.e(r9);
                            }
                        }
                        kVar2 = kVar2.h;
                    }
                }
                q3 = q3.k();
                kVar2 = (q3 == null || (c0059s = q3.f5319x) == null) ? null : (m0) c0059s.f856e;
            }
            int i5 = m.f6025b;
            if (!lVar.f2088d.f2099p) {
                Z0.d.S("Cannot get View because the Modifier node is not currently attached.");
                throw null;
            }
            ViewParent parent = ((View) AbstractC0409C.s(AbstractC0409C.q(lVar))).getParent();
            while (true) {
                if (parent == null || !(parent instanceof ViewGroup)) {
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.shouldDelayChildPressedState()) {
                    long j3 = m.f6024a;
                    this.f5979i = 1;
                    if (AbstractC0688v.c(j3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    parent = viewGroup.getParent();
                }
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = this.h;
                Z0.d.U(obj);
                lVar.f6009C = iVar;
                return C0174m.f3840a;
            }
            Z0.d.U(obj);
        }
        iVar = new s.i(this.f5981k);
        this.h = iVar;
        this.f5979i = 2;
        if (this.f5982l.a(iVar, this) == aVar) {
            return aVar;
        }
        lVar.f6009C = iVar;
        return C0174m.f3840a;
    }
}
