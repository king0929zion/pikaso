package androidx.compose.foundation.text.modifiers;

import A.AbstractC0000a;
import A.t;
import P.k;
import a.AbstractC0090a;
import n0.P;
import o2.c;
import p2.g;
import v0.C0613B;
import v0.C0618c;
import x.C0645j;
import z0.InterfaceC0721e;

/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final C0618c f3292a;

    /* renamed from: b, reason: collision with root package name */
    public final C0613B f3293b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0721e f3294c;

    /* renamed from: d, reason: collision with root package name */
    public final c f3295d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3296e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3297f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3298g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final t f3299i;

    public TextAnnotatedStringElement(C0618c c0618c, C0613B c0613b, InterfaceC0721e interfaceC0721e, c cVar, int i3, boolean z3, int i4, int i5, t tVar) {
        this.f3292a = c0618c;
        this.f3293b = c0613b;
        this.f3294c = interfaceC0721e;
        this.f3295d = cVar;
        this.f3296e = i3;
        this.f3297f = z3;
        this.f3298g = i4;
        this.h = i5;
        this.f3299i = tVar;
    }

    @Override // n0.P
    public final k d() {
        C0618c c0618c = this.f3292a;
        C0645j c0645j = new C0645j();
        c0645j.f6628q = c0618c;
        c0645j.f6629r = this.f3293b;
        c0645j.f6630s = this.f3294c;
        c0645j.f6631t = this.f3295d;
        c0645j.f6632u = this.f3296e;
        c0645j.f6633v = this.f3297f;
        c0645j.f6634w = this.f3298g;
        c0645j.f6635x = this.h;
        c0645j.f6636y = null;
        c0645j.f6637z = null;
        c0645j.f6622A = this.f3299i;
        c0645j.f6623B = null;
        return c0645j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1.f6319a.b(r0.f6319a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    @Override // n0.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(P.k r15) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.e(P.k):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return g.a(this.f3299i, textAnnotatedStringElement.f3299i) && this.f3292a.equals(textAnnotatedStringElement.f3292a) && g.a(this.f3293b, textAnnotatedStringElement.f3293b) && g.a(null, null) && g.a(this.f3294c, textAnnotatedStringElement.f3294c) && this.f3295d == textAnnotatedStringElement.f3295d && AbstractC0090a.z(this.f3296e, textAnnotatedStringElement.f3296e) && this.f3297f == textAnnotatedStringElement.f3297f && this.f3298g == textAnnotatedStringElement.f3298g && this.h == textAnnotatedStringElement.h && g.a(null, null);
    }

    public final int hashCode() {
        int hashCode = (this.f3294c.hashCode() + ((this.f3293b.hashCode() + (this.f3292a.hashCode() * 31)) * 31)) * 31;
        c cVar = this.f3295d;
        int hashCode2 = (((((Boolean.hashCode(this.f3297f) + AbstractC0000a.a(this.f3296e, (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31)) * 31) + this.f3298g) * 31) + this.h) * 923521;
        t tVar = this.f3299i;
        return (hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31;
    }
}
