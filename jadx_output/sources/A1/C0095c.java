package a1;

import android.text.Layout;
import android.util.Base64;
import d2.C0248s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import v0.AbstractC0619d;
import v0.C0613B;
import v0.C0617b;
import v0.C0618c;
import v0.C0625j;
import v0.l;
import v0.m;
import v0.n;
import z0.InterfaceC0721e;

/* renamed from: a1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2925a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2926b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2927c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2928d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2929e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f2930f;

    /* JADX WARN: Type inference failed for: r6v6, types: [boolean[], java.io.Serializable] */
    public C0095c(Layout layout) {
        this.f2925a = 2;
        this.f2927c = layout;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        do {
            int i4 = x2.j.i(((Layout) this.f2927c).getText(), '\n', i3, false, 4);
            i3 = i4 < 0 ? ((Layout) this.f2927c).getText().length() : i4 + 1;
            arrayList.add(Integer.valueOf(i3));
        } while (i3 < ((Layout) this.f2927c).getText().length());
        this.f2928d = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(null);
        }
        this.f2929e = arrayList2;
        this.f2930f = new boolean[((ArrayList) this.f2928d).size()];
        ((ArrayList) this.f2928d).size();
    }

    @Override // v0.m
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f2930f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((l) arrayList.get(i3)).f6366a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c2.d, java.lang.Object] */
    @Override // v0.m
    public float b() {
        return ((Number) this.f2929e.getValue()).floatValue();
    }

    public float c(int i3, boolean z3) {
        Layout layout = (Layout) this.f2927c;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i3));
        if (i3 > lineEnd) {
            i3 = lineEnd;
        }
        return z3 ? layout.getPrimaryHorizontal(i3) : layout.getSecondaryHorizontal(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0176, code lost:
    
        if (r3.getRunCount() == 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0037, code lost:
    
        if (r30 != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float d(int r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0095c.d(int, boolean, boolean):float");
    }

    public int e(int i3, int i4) {
        while (i3 > i4) {
            char charAt = ((Layout) this.f2927c).getText().charAt(i3 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((p2.g.f(charAt, 8192) < 0 || p2.g.f(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                break;
            }
            i3--;
        }
        return i3;
    }

    public String toString() {
        switch (this.f2925a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f2927c) + ", mProviderPackage: " + ((String) this.f2928d) + ", mQuery: " + ((String) this.f2929e) + ", mCertificates:");
                int i3 = 0;
                while (true) {
                    List list = (List) this.f2926b;
                    if (i3 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i3);
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i3++;
                }
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public C0095c(C0618c c0618c, C0613B c0613b, List list, G0.b bVar, InterfaceC0721e interfaceC0721e) {
        n nVar;
        int i3;
        String str;
        ?? r3;
        C0248s c0248s;
        int i4;
        ArrayList arrayList;
        List list2;
        C0248s c0248s2;
        ArrayList arrayList2;
        int i5;
        String str2;
        int i6;
        int i7;
        int i8;
        C0618c c0618c2 = c0618c;
        this.f2925a = 1;
        this.f2927c = c0618c2;
        this.f2926b = list;
        this.f2928d = Z.b.B(new C0625j(this, 1));
        this.f2929e = Z.b.B(new C0625j(this, 0));
        int i9 = AbstractC0619d.f6338a;
        int length = c0618c2.f6334d.length();
        C0248s c0248s3 = C0248s.f4255d;
        List list3 = c0618c2.f6336f;
        list3 = list3 == null ? c0248s3 : list3;
        ArrayList arrayList3 = new ArrayList();
        int size = list3.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            nVar = c0613b.f6320b;
            if (i10 >= size) {
                break;
            }
            C0617b c0617b = (C0617b) list3.get(i10);
            n nVar2 = (n) c0617b.f6330a;
            int i12 = c0617b.f6331b;
            if (i12 != i11) {
                arrayList3.add(new C0617b(i11, i12, nVar));
            }
            n a3 = nVar.a(nVar2);
            int i13 = c0617b.f6332c;
            arrayList3.add(new C0617b(i12, i13, a3));
            i10++;
            i11 = i13;
        }
        if (i11 != length) {
            arrayList3.add(new C0617b(i11, length, nVar));
        }
        if (arrayList3.isEmpty()) {
            i3 = 0;
            arrayList3.add(new C0617b(0, 0, nVar));
        } else {
            i3 = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i14 = i3;
        while (i14 < size2) {
            C0617b c0617b2 = (C0617b) arrayList3.get(i14);
            int i15 = c0617b2.f6331b;
            String str3 = c0618c2.f6334d;
            int i16 = c0617b2.f6332c;
            if (i15 != i16) {
                str = str3.substring(i15, i16);
                p2.g.d(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = "";
            }
            if (i15 == i16 || (r3 = c0618c2.f6335e) == 0) {
                c0248s = c0248s3;
                i4 = size2;
                arrayList = arrayList3;
                list2 = null;
                c0248s2 = null;
            } else {
                if (i15 != 0 || i16 < str3.length()) {
                    ArrayList arrayList5 = new ArrayList(r3.size());
                    int size3 = r3.size();
                    c0248s = c0248s3;
                    int i17 = 0;
                    List list4 = r3;
                    while (i17 < size3) {
                        int i18 = size3;
                        Object obj = list4.get(i17);
                        List list5 = list4;
                        C0617b c0617b3 = (C0617b) obj;
                        int i19 = size2;
                        if (AbstractC0619d.b(i15, i16, c0617b3.f6331b, c0617b3.f6332c)) {
                            arrayList5.add(obj);
                        }
                        i17++;
                        size3 = i18;
                        list4 = list5;
                        size2 = i19;
                    }
                    i4 = size2;
                    r3 = new ArrayList(arrayList5.size());
                    int size4 = arrayList5.size();
                    int i20 = 0;
                    while (i20 < size4) {
                        C0617b c0617b4 = (C0617b) arrayList5.get(i20);
                        r3.add(new C0617b(Z.b.k(c0617b4.f6331b, i15, i16) - i15, Z.b.k(c0617b4.f6332c, i15, i16) - i15, c0617b4.f6330a));
                        i20++;
                        size4 = size4;
                        arrayList5 = arrayList5;
                        arrayList3 = arrayList3;
                    }
                } else {
                    c0248s = c0248s3;
                    i4 = size2;
                }
                arrayList = arrayList3;
                list2 = null;
                c0248s2 = r3;
            }
            new C0618c(str, c0248s2, list2, list2);
            n nVar3 = (n) c0617b2.f6330a;
            if (F0.h.a(nVar3.f6370b, Integer.MIN_VALUE)) {
                arrayList2 = arrayList4;
                i5 = i14;
                str2 = str;
                i6 = i16;
                nVar3 = new n(nVar3.f6369a, nVar.f6370b, nVar3.f6371c, nVar3.f6372d, nVar3.f6373e, nVar3.f6374f, nVar3.f6375g, nVar3.h, nVar3.f6376i);
            } else {
                arrayList2 = arrayList4;
                str2 = str;
                i5 = i14;
                i6 = i16;
            }
            C0613B c0613b2 = new C0613B(c0613b.f6319a, nVar.a(nVar3));
            C0248s c0248s4 = c0248s2 == null ? c0248s : c0248s2;
            List list6 = (List) this.f2926b;
            ArrayList arrayList6 = new ArrayList(list6.size());
            int size5 = list6.size();
            int i21 = 0;
            while (true) {
                i7 = c0617b2.f6331b;
                if (i21 >= size5) {
                    break;
                }
                Object obj2 = list6.get(i21);
                C0617b c0617b5 = (C0617b) obj2;
                int i22 = i6;
                if (AbstractC0619d.b(i7, i22, c0617b5.f6331b, c0617b5.f6332c)) {
                    arrayList6.add(obj2);
                }
                i21++;
                i6 = i22;
            }
            int i23 = i6;
            ArrayList arrayList7 = new ArrayList(arrayList6.size());
            int size6 = arrayList6.size();
            for (int i24 = 0; i24 < size6; i24++) {
                C0617b c0617b6 = (C0617b) arrayList6.get(i24);
                int i25 = c0617b6.f6331b;
                if (i7 <= i25 && (i8 = c0617b6.f6332c) <= i23) {
                    arrayList7.add(new C0617b(i25 - i7, i8 - i7, c0617b6.f6330a));
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
            }
            l lVar = new l(new C0.d(str2, c0613b2, c0248s4, arrayList7, interfaceC0721e, bVar), i7, i23);
            ArrayList arrayList8 = arrayList2;
            arrayList8.add(lVar);
            i14 = i5 + 1;
            arrayList4 = arrayList8;
            c0248s3 = c0248s;
            size2 = i4;
            arrayList3 = arrayList;
            c0618c2 = c0618c;
        }
        this.f2930f = arrayList4;
    }

    public C0095c(String str, String str2, String str3, List list) {
        this.f2925a = 0;
        str.getClass();
        this.f2927c = str;
        str2.getClass();
        this.f2928d = str2;
        this.f2929e = str3;
        list.getClass();
        this.f2926b = list;
        this.f2930f = str + "-" + str2 + "-" + str3;
    }
}
