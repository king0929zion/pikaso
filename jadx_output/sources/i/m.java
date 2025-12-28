package I;

import a1.C0100h;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e1.s;
import java.util.Arrays;
import p.C0540i;

/* loaded from: classes.dex */
public final class m implements s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1377d;

    /* renamed from: e, reason: collision with root package name */
    public int f1378e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1379f;

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static I.m c(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I.m.c(android.content.res.Resources, int, android.content.res.Resources$Theme):I.m");
    }

    public void a(long j3) {
        if (b(j3)) {
            return;
        }
        int i3 = this.f1378e;
        long[] jArr = (long[]) this.f1379f;
        if (i3 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i3 + 1, jArr.length * 2));
            p2.g.d(copyOf, "copyOf(this, newSize)");
            this.f1379f = copyOf;
        }
        ((long[]) this.f1379f)[i3] = j3;
        if (i3 >= this.f1378e) {
            this.f1378e = i3 + 1;
        }
    }

    public boolean b(long j3) {
        int i3 = this.f1378e;
        for (int i4 = 0; i4 < i3; i4++) {
            if (((long[]) this.f1379f)[i4] == j3) {
                return true;
            }
        }
        return false;
    }

    public void d(int i3) {
        int i4 = this.f1378e;
        if (i3 < i4) {
            int i5 = i4 - 1;
            while (i3 < i5) {
                long[] jArr = (long[]) this.f1379f;
                int i6 = i3 + 1;
                jArr[i3] = jArr[i6];
                i3 = i6;
            }
            this.f1378e--;
        }
    }

    @Override // e1.s
    public boolean f(View view) {
        ((BottomSheetBehavior) this.f1379f).B(this.f1378e);
        return true;
    }

    public String toString() {
        switch (this.f1377d) {
            case 5:
                StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
                int i3 = this.f1378e;
                sb.append(i3 != 1 ? i3 != 2 ? "null" : "Finished" : "BoundReached");
                sb.append(", endState=");
                sb.append((C0540i) this.f1379f);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m(int i3, int i4, Object obj) {
        this.f1377d = i4;
        this.f1379f = obj;
        this.f1378e = i3;
    }

    public m(Shader shader, ColorStateList colorStateList, int i3) {
        this.f1377d = 2;
        this.f1379f = shader;
        this.f1378e = i3;
    }

    public m(int i3, C0100h[] c0100hArr) {
        this.f1377d = 3;
        this.f1378e = i3;
        this.f1379f = c0100hArr;
    }
}
