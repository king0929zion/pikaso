package B2;

import a1.C0098f;
import a1.RunnableC0093a;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import c2.C0174m;
import d1.InterfaceC0218o;
import g.AbstractC0262a;
import g2.InterfaceC0271d;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n.C0379F;
import n.C0393m;
import n0.AbstractC0409C;
import n0.AbstractC0428i;
import n0.C0415I;
import n0.C0429j;
import n0.C0444z;
import n0.InterfaceC0431l;
import n0.c0;
import n0.p0;
import q1.C0570a;
import q1.C0571b;
import q1.C0573d;
import s1.C0589c;
import s1.C0592f;
import z1.P;

/* loaded from: classes.dex */
public final class i implements InterfaceC0021e, M.f, InterfaceC0218o, o1.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315d;

    /* renamed from: e, reason: collision with root package name */
    public Object f316e;

    /* renamed from: f, reason: collision with root package name */
    public Object f317f;

    public /* synthetic */ i(int i3, boolean z3) {
        this.f315d = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [P.k] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [P.k] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [F.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [F.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void h(C0444z c0444z) {
        C0415I c0415i = c0444z.f5320y;
        int i3 = 0;
        if (c0415i.f5132b == 5 && !c0415i.f5134d && !c0415i.f5133c && !c0444z.f5297E && c0444z.v()) {
            P.k kVar = (P.k) c0444z.f5319x.f857f;
            if ((kVar.f2091g & 256) != 0) {
                while (kVar != null) {
                    if ((kVar.f2090f & 256) != 0) {
                        AbstractC0428i abstractC0428i = kVar;
                        ?? r6 = 0;
                        while (abstractC0428i != 0) {
                            if (abstractC0428i instanceof InterfaceC0431l) {
                                InterfaceC0431l interfaceC0431l = (InterfaceC0431l) abstractC0428i;
                                interfaceC0431l.p(AbstractC0409C.p(interfaceC0431l, 256));
                            } else if ((abstractC0428i.f2090f & 256) != 0 && (abstractC0428i instanceof AbstractC0428i)) {
                                P.k kVar2 = abstractC0428i.f5256r;
                                int i4 = 0;
                                abstractC0428i = abstractC0428i;
                                r6 = r6;
                                while (kVar2 != null) {
                                    if ((kVar2.f2090f & 256) != 0) {
                                        i4++;
                                        r6 = r6;
                                        if (i4 == 1) {
                                            abstractC0428i = kVar2;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new F.d(new P.k[16]);
                                            }
                                            if (abstractC0428i != 0) {
                                                r6.b(abstractC0428i);
                                                abstractC0428i = 0;
                                            }
                                            r6.b(kVar2);
                                        }
                                    }
                                    kVar2 = kVar2.f2092i;
                                    abstractC0428i = abstractC0428i;
                                    r6 = r6;
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC0428i = AbstractC0409C.e(r6);
                        }
                    }
                    if ((kVar.f2091g & 256) == 0) {
                        break;
                    } else {
                        kVar = kVar.f2092i;
                    }
                }
            }
        }
        c0444z.f5296D = false;
        F.d n2 = c0444z.n();
        int i5 = n2.f1160f;
        if (i5 > 0) {
            Object[] objArr = n2.f1158d;
            do {
                h((C0444z) objArr[i3]);
                i3++;
            } while (i3 < i5);
        }
    }

    @Override // o1.o
    public Object a() {
        return (o1.y) this.f316e;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    @Override // d1.InterfaceC0218o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d1.l0 b(android.view.View r17, d1.l0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f317f
            S1.m r3 = (S1.m) r3
            int r4 = r3.f2320a
            java.lang.Object r5 = r0.f316e
            M1.d r5 = (M1.d) r5
            d1.j0 r6 = r2.f4228a
            r7 = 7
            V0.c r7 = r6.f(r7)
            r8 = 32
            V0.c r8 = r6.f(r8)
            int r9 = r7.f2461b
            java.lang.Object r10 = r5.f1680b
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r10
            r10.f3927w = r9
            boolean r9 = S1.k.e(r17)
            int r11 = r17.getPaddingBottom()
            int r12 = r17.getPaddingLeft()
            int r13 = r17.getPaddingRight()
            boolean r14 = r10.f3919o
            if (r14 == 0) goto L44
            V0.c r6 = r6.j()
            int r6 = r6.f2463d
            r10.f3926v = r6
            int r11 = r3.f2322c
            int r11 = r11 + r6
        L44:
            int r3 = r3.f2321b
            boolean r6 = r10.f3920p
            int r15 = r7.f2460a
            if (r6 == 0) goto L53
            if (r9 == 0) goto L50
            r6 = r3
            goto L51
        L50:
            r6 = r4
        L51:
            int r12 = r6 + r15
        L53:
            boolean r6 = r10.f3921q
            int r0 = r7.f2462c
            if (r6 == 0) goto L5f
            if (r9 == 0) goto L5c
            goto L5d
        L5c:
            r4 = r3
        L5d:
            int r13 = r4 + r0
        L5f:
            android.view.ViewGroup$LayoutParams r3 = r17.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r4 = r10.f3923s
            r6 = 1
            if (r4 == 0) goto L72
            int r4 = r3.leftMargin
            if (r4 == r15) goto L72
            r3.leftMargin = r15
            r4 = r6
            goto L73
        L72:
            r4 = 0
        L73:
            boolean r9 = r10.f3924t
            if (r9 == 0) goto L7e
            int r9 = r3.rightMargin
            if (r9 == r0) goto L7e
            r3.rightMargin = r0
            r4 = r6
        L7e:
            boolean r0 = r10.f3925u
            if (r0 == 0) goto L8b
            int r0 = r3.topMargin
            int r7 = r7.f2461b
            if (r0 == r7) goto L8b
            r3.topMargin = r7
            goto L8c
        L8b:
            r6 = r4
        L8c:
            if (r6 == 0) goto L91
            r1.setLayoutParams(r3)
        L91:
            int r0 = r17.getPaddingTop()
            r1.setPadding(r12, r0, r13, r11)
            boolean r0 = r5.f1679a
            if (r0 == 0) goto La0
            int r1 = r8.f2463d
            r10.f3917m = r1
        La0:
            if (r14 != 0) goto La4
            if (r0 == 0) goto La7
        La4:
            r10.I()
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.i.b(android.view.View, d1.l0):d1.l0");
    }

    @Override // M.f
    public Object c(M.a aVar, Object obj) {
        return ((o2.e) this.f316e).h(aVar, obj);
    }

    @Override // o1.o
    public boolean d(CharSequence charSequence, int i3, int i4, o1.v vVar) {
        if ((vVar.f5811c & 4) > 0) {
            return true;
        }
        if (((o1.y) this.f316e) == null) {
            this.f316e = new o1.y(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((X1.e) this.f317f).getClass();
        ((o1.y) this.f316e).setSpan(new o1.w(vVar), i3, i4, 33);
        return true;
    }

    public boolean e(long j3) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((i) this.f317f).f316e;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i3);
            if (Z0.d.s(((h0.m) obj).f4379a, j3)) {
                break;
            }
            i3++;
        }
        h0.m mVar = (h0.m) obj;
        if (mVar != null) {
            return mVar.h;
        }
        return false;
    }

    public void f(C0444z c0444z) {
        if (c0444z.u()) {
            ((p0) this.f317f).add(c0444z);
        } else {
            Z0.d.S("DepthSortedSet.add called on an unattached node");
            throw null;
        }
    }

    public void g(C0444z c0444z, boolean z3) {
        i iVar = (i) this.f317f;
        i iVar2 = (i) this.f316e;
        if (z3) {
            iVar2.f(c0444z);
            iVar.f(c0444z);
        } else {
            if (((p0) iVar2.f317f).contains(c0444z)) {
                return;
            }
            iVar.f(c0444z);
        }
    }

    public void i() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public View j(int i3, int i4, int i5, int i6) {
        int u3;
        int i7;
        int v3;
        View o3;
        int left;
        int i8;
        int right;
        int i9;
        z1.v vVar = (z1.v) this.f316e;
        switch (vVar.f7079a) {
            case 0:
                u3 = vVar.f7080b.u();
                break;
            default:
                u3 = vVar.f7080b.w();
                break;
        }
        switch (vVar.f7079a) {
            case 0:
                z1.w wVar = vVar.f7080b;
                i7 = wVar.f7086f;
                v3 = wVar.v();
                break;
            default:
                z1.w wVar2 = vVar.f7080b;
                i7 = wVar2.f7087g;
                v3 = wVar2.t();
                break;
        }
        int i10 = i7 - v3;
        int i11 = i4 > i3 ? 1 : -1;
        View view = null;
        while (i3 != i4) {
            switch (vVar.f7079a) {
                case 0:
                    o3 = vVar.f7080b.o(i3);
                    break;
                default:
                    o3 = vVar.f7080b.o(i3);
                    break;
            }
            switch (vVar.f7079a) {
                case 0:
                    z1.x xVar = (z1.x) o3.getLayoutParams();
                    vVar.f7080b.getClass();
                    left = o3.getLeft() - ((z1.x) o3.getLayoutParams()).f7088a.left;
                    i8 = ((ViewGroup.MarginLayoutParams) xVar).leftMargin;
                    break;
                default:
                    z1.x xVar2 = (z1.x) o3.getLayoutParams();
                    vVar.f7080b.getClass();
                    left = o3.getTop() - ((z1.x) o3.getLayoutParams()).f7088a.top;
                    i8 = ((ViewGroup.MarginLayoutParams) xVar2).topMargin;
                    break;
            }
            int i12 = left - i8;
            switch (vVar.f7079a) {
                case 0:
                    z1.x xVar3 = (z1.x) o3.getLayoutParams();
                    vVar.f7080b.getClass();
                    right = o3.getRight() + ((z1.x) o3.getLayoutParams()).f7088a.right;
                    i9 = ((ViewGroup.MarginLayoutParams) xVar3).rightMargin;
                    break;
                default:
                    z1.x xVar4 = (z1.x) o3.getLayoutParams();
                    vVar.f7080b.getClass();
                    right = o3.getBottom() + ((z1.x) o3.getLayoutParams()).f7088a.bottom;
                    i9 = ((ViewGroup.MarginLayoutParams) xVar4).bottomMargin;
                    break;
            }
            int i13 = right + i9;
            P p3 = (P) this.f317f;
            p3.f7001b = u3;
            p3.f7002c = i10;
            p3.f7003d = i12;
            p3.f7004e = i13;
            if (i5 != 0) {
                p3.f7000a = i5;
                if (p3.a()) {
                    return o3;
                }
            }
            if (i6 != 0) {
                p3.f7000a = i6;
                if (p3.a()) {
                    view = o3;
                }
            }
            i3 += i11;
        }
        return view;
    }

    public KeyListener k(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((i) ((k.H) this.f317f).f4656b).getClass();
        if (keyListener instanceof C0573d) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0573d(keyListener);
    }

    public boolean l() {
        return !(((p0) ((i) this.f317f).f317f).isEmpty() && ((p0) ((i) this.f316e).f317f).isEmpty());
    }

    public void n(AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = ((EditText) this.f316e).getContext().obtainStyledAttributes(attributeSet, AbstractC0262a.f4297g, i3, 0);
        try {
            boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            t(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // B2.InterfaceC0021e
    public Object o(InterfaceC0022f interfaceC0022f, InterfaceC0271d interfaceC0271d) {
        Object o3 = ((C2.n) this.f316e).o(new C0019c(new p2.m(), interfaceC0022f, (C) this.f317f), interfaceC0271d);
        return o3 == h2.a.f4407d ? o3 : C0174m.f3840a;
    }

    public C0571b p(InputConnection inputConnection, EditorInfo editorInfo) {
        k.H h = (k.H) this.f317f;
        if (inputConnection == null) {
            h.getClass();
            inputConnection = null;
        } else {
            i iVar = (i) h.f4656b;
            iVar.getClass();
            if (!(inputConnection instanceof C0571b)) {
                inputConnection = new C0571b((EditText) iVar.f316e, inputConnection, editorInfo);
            }
        }
        return (C0571b) inputConnection;
    }

    public void q(C0098f c0098f) {
        int i3 = c0098f.f2939b;
        Handler handler = (Handler) this.f317f;
        A.t tVar = (A.t) this.f316e;
        if (i3 != 0) {
            handler.post(new RunnableC0093a(tVar, i3));
        } else {
            handler.post(new D2.h(2, tVar, c0098f.f2938a, false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d3, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(android.content.Context r13, android.content.res.XmlResourceParser r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.i.r(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public boolean s(C0444z c0444z) {
        if (c0444z.u()) {
            return ((p0) this.f317f).remove(c0444z);
        }
        Z0.d.S("DepthSortedSet.remove called on an unattached node");
        throw null;
    }

    public void t(boolean z3) {
        q1.h hVar = (q1.h) ((i) ((k.H) this.f317f).f4656b).f317f;
        if (hVar.f6067f != z3) {
            if (hVar.f6066e != null) {
                o1.i a3 = o1.i.a();
                q1.g gVar = hVar.f6066e;
                a3.getClass();
                Z.b.g(gVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a3.f5769a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a3.f5770b.remove(gVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            hVar.f6067f = z3;
            if (z3) {
                q1.h.a(hVar.f6065d, o1.i.a().b());
            }
        }
    }

    public String toString() {
        switch (this.f315d) {
            case 6:
                return "Bounds{lower=" + ((V0.c) this.f316e) + " upper=" + ((V0.c) this.f317f) + "}";
            case 11:
                return ((p0) this.f317f).toString();
            case 19:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(Object obj, int i3, Object obj2) {
        this.f315d = i3;
        this.f316e = obj;
        this.f317f = obj2;
    }

    public i(int i3) {
        this.f315d = i3;
        switch (i3) {
            case 12:
                this.f316e = new i(11);
                this.f317f = new i(11);
                break;
            case 13:
            case 16:
            case 17:
            case 18:
            case 21:
            default:
                this.f316e = Z.b.B(C0429j.f5259f);
                this.f317f = new p0(new c0(1));
                break;
            case 14:
                this.f316e = new F.d(new C0444z[16]);
                break;
            case 15:
                this.f316e = new F.d(new Reference[16]);
                this.f317f = new ReferenceQueue();
                break;
            case 19:
                this.f316e = new ArrayList();
                new C0589c(3);
                new C0592f(this);
                this.f317f = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                new C0589c(this);
                new CopyOnWriteArrayList();
                new ArrayDeque();
                new M1.h(8, this);
                break;
            case 20:
                this.f316e = new X1.e(1);
                this.f317f = new o1.p();
                break;
            case 22:
                this.f316e = new C0379F(0);
                this.f317f = new C0393m((Object) null);
                break;
        }
    }

    public i(EditText editText, int i3) {
        this.f315d = i3;
        switch (i3) {
            case 18:
                this.f316e = editText;
                q1.h hVar = new q1.h(editText);
                this.f317f = hVar;
                editText.addTextChangedListener(hVar);
                if (C0570a.f6052b == null) {
                    synchronized (C0570a.f6051a) {
                        try {
                            if (C0570a.f6052b == null) {
                                C0570a c0570a = new C0570a();
                                try {
                                    C0570a.f6053c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0570a.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                C0570a.f6052b = c0570a;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(C0570a.f6052b);
                return;
            default:
                this.f316e = editText;
                this.f317f = new k.H(editText);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(o2.c cVar, o2.c cVar2) {
        this.f315d = 17;
        this.f316e = (p2.h) cVar;
        this.f317f = (p2.h) cVar2;
    }

    public i(z1.v vVar) {
        this.f315d = 21;
        this.f316e = vVar;
        P p3 = new P();
        p3.f7000a = 0;
        this.f317f = p3;
    }
}
