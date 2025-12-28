package C0;

import A.t;
import D.C0054o;
import D.L0;
import android.text.Layout;
import android.text.TextPaint;
import c2.C0168g;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import v0.C0613B;
import v0.m;
import v0.q;
import w0.l;
import z0.InterfaceC0721e;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f552a;

    /* renamed from: b, reason: collision with root package name */
    public final C0613B f553b;

    /* renamed from: c, reason: collision with root package name */
    public final List f554c;

    /* renamed from: d, reason: collision with root package name */
    public final List f555d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0721e f556e;

    /* renamed from: f, reason: collision with root package name */
    public final G0.b f557f;

    /* renamed from: g, reason: collision with root package name */
    public final e f558g;
    public final CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public final l f559i;

    /* renamed from: j, reason: collision with root package name */
    public B0.a f560j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f561k;

    /* renamed from: l, reason: collision with root package name */
    public final int f562l;

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0390, code lost:
    
        if (a.AbstractC0090a.S(r3.f6320b.f6371c) == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x00b7, code lost:
    
        if (r4 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b3  */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.lang.String r37, v0.C0613B r38, java.util.List r39, java.util.List r40, z0.InterfaceC0721e r41, G0.b r42) {
        /*
            Method dump skipped, instructions count: 2187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.d.<init>(java.lang.String, v0.B, java.util.List, java.util.List, z0.e, G0.b):void");
    }

    @Override // v0.m
    public final boolean a() {
        B0.a aVar = this.f560j;
        if (!(aVar != null ? aVar.w() : false)) {
            if (this.f561k) {
                return false;
            }
            q qVar = this.f553b.f6321c;
            t tVar = i.f575a;
            t tVar2 = i.f575a;
            L0 l02 = (L0) tVar2.f175e;
            if (l02 == null) {
                if (o1.i.c()) {
                    l02 = tVar2.x();
                    tVar2.f175e = l02;
                } else {
                    l02 = j.f576a;
                }
            }
            if (!((Boolean) l02.getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // v0.m
    public final float b() {
        return this.f559i.b();
    }

    public final float c() {
        l lVar = this.f559i;
        if (!Float.isNaN(lVar.f6511e)) {
            return lVar.f6511e;
        }
        TextPaint textPaint = lVar.f6508b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = lVar.f6507a;
        lineInstance.setText(new w0.i(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new C0054o(4));
        int i3 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C0168g(Integer.valueOf(i3), Integer.valueOf(next)));
            } else {
                C0168g c0168g = (C0168g) priorityQueue.peek();
                if (c0168g != null && ((Number) c0168g.f3834e).intValue() - ((Number) c0168g.f3833d).intValue() < next - i3) {
                    priorityQueue.poll();
                    priorityQueue.add(new C0168g(Integer.valueOf(i3), Integer.valueOf(next)));
                }
            }
            i3 = next;
        }
        Iterator it = priorityQueue.iterator();
        float f3 = 0.0f;
        while (it.hasNext()) {
            C0168g c0168g2 = (C0168g) it.next();
            f3 = Math.max(f3, Layout.getDesiredWidth(charSequence, ((Number) c0168g2.f3833d).intValue(), ((Number) c0168g2.f3834e).intValue(), textPaint));
        }
        lVar.f6511e = f3;
        return f3;
    }
}
