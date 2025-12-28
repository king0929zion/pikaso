package n1;

import A.t;
import android.os.Bundle;
import android.os.Trace;
import android.view.accessibility.AccessibilityNodeInfo;
import d1.C0205b;
import e1.j;
import o0.C0455E;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445a extends t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0205b f5323g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0445a(C0205b c0205b, int i3) {
        super(21);
        this.f5322f = i3;
        this.f5323g = c0205b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0183, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0562, code lost:
    
        if (r1 != 16) goto L423;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x027f  */
    @Override // A.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(int r25, int r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 1968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C0445a.B(int, int, android.os.Bundle):boolean");
    }

    @Override // A.t
    public void s(int i3, j jVar, String str, Bundle bundle) {
        switch (this.f5322f) {
            case 1:
                ((C0455E) this.f5323g).k(i3, jVar, str, bundle);
                break;
        }
    }

    @Override // A.t
    public final j v(int i3) {
        switch (this.f5322f) {
            case 0:
                return new j(AccessibilityNodeInfo.obtain(((AbstractC0446b) this.f5323g).n(i3).f4278a));
            default:
                C0455E c0455e = (C0455E) this.f5323g;
                Trace.beginSection("createAccessibilityNodeInfo");
                try {
                    return C0455E.j(c0455e, i3);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // A.t
    public final j w(int i3) {
        switch (this.f5322f) {
            case 0:
                AbstractC0446b abstractC0446b = (AbstractC0446b) this.f5323g;
                int i4 = i3 == 2 ? abstractC0446b.f5333k : abstractC0446b.f5334l;
                if (i4 == Integer.MIN_VALUE) {
                    return null;
                }
                return v(i4);
            default:
                return v(((C0455E) this.f5323g).f5407n);
        }
    }
}
