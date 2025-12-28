package androidx.compose.foundation.text.modifiers;

import A.AbstractC0000a;
import A.t;
import P.k;
import a.AbstractC0090a;
import n0.P;
import p2.g;
import v0.C0613B;
import x.C0648m;
import z0.InterfaceC0721e;

/* loaded from: classes.dex */
public final class TextStringSimpleElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final String f3300a;

    /* renamed from: b, reason: collision with root package name */
    public final C0613B f3301b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0721e f3302c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3303d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3304e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3305f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3306g;
    public final t h;

    public TextStringSimpleElement(String str, C0613B c0613b, InterfaceC0721e interfaceC0721e, int i3, boolean z3, int i4, int i5, t tVar) {
        this.f3300a = str;
        this.f3301b = c0613b;
        this.f3302c = interfaceC0721e;
        this.f3303d = i3;
        this.f3304e = z3;
        this.f3305f = i4;
        this.f3306g = i5;
        this.h = tVar;
    }

    @Override // n0.P
    public final k d() {
        C0648m c0648m = new C0648m();
        c0648m.f6646q = this.f3300a;
        c0648m.f6647r = this.f3301b;
        c0648m.f6648s = this.f3302c;
        c0648m.f6649t = this.f3303d;
        c0648m.f6650u = this.f3304e;
        c0648m.f6651v = this.f3305f;
        c0648m.f6652w = this.f3306g;
        c0648m.f6653x = this.h;
        return c0648m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r3.f6319a.b(r0.f6319a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0034  */
    @Override // n0.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(P.k r14) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.e(P.k):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return g.a(this.h, textStringSimpleElement.h) && g.a(this.f3300a, textStringSimpleElement.f3300a) && g.a(this.f3301b, textStringSimpleElement.f3301b) && g.a(this.f3302c, textStringSimpleElement.f3302c) && AbstractC0090a.z(this.f3303d, textStringSimpleElement.f3303d) && this.f3304e == textStringSimpleElement.f3304e && this.f3305f == textStringSimpleElement.f3305f && this.f3306g == textStringSimpleElement.f3306g;
    }

    public final int hashCode() {
        int hashCode = (((((Boolean.hashCode(this.f3304e) + AbstractC0000a.a(this.f3303d, (this.f3302c.hashCode() + ((this.f3301b.hashCode() + (this.f3300a.hashCode() * 31)) * 31)) * 31, 31)) * 31) + this.f3305f) * 31) + this.f3306g) * 31;
        t tVar = this.h;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }
}
