package X1;

import W.B;
import W.H;
import W.z;
import a.AbstractC0090a;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import androidx.lifecycle.G;
import e0.InterfaceC0254a;
import java.util.Arrays;

/* loaded from: classes.dex */
public class e implements H, androidx.lifecycle.H, InterfaceC0254a, j.o {

    /* renamed from: e, reason: collision with root package name */
    public static e f2667e;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2668d;

    public /* synthetic */ e(int i3) {
        this.f2668d = i3;
    }

    public static final float e(float f3, float[] fArr, float[] fArr2) {
        float f4;
        float f5;
        float f6;
        float f7;
        float max;
        float abs = Math.abs(f3);
        float signum = Math.signum(f3);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            max = signum * fArr2[binarySearch];
        } else {
            int i3 = -(binarySearch + 1);
            int i4 = i3 - 1;
            if (i4 >= fArr.length - 1) {
                float f8 = fArr[fArr.length - 1];
                float f9 = fArr2[fArr.length - 1];
                if (f8 == 0.0f) {
                    return 0.0f;
                }
                return (f9 / f8) * f3;
            }
            if (i4 == -1) {
                float f10 = fArr[0];
                f6 = fArr2[0];
                f7 = f10;
                f5 = 0.0f;
                f4 = 0.0f;
            } else {
                float f11 = fArr[i4];
                float f12 = fArr[i3];
                f4 = fArr2[i4];
                f5 = f11;
                f6 = fArr2[i3];
                f7 = f12;
            }
            max = signum * (((f6 - f4) * Math.max(0.0f, Math.min(1.0f, f5 == f7 ? 0.0f : (abs - f5) / (f7 - f5)))) + f4);
        }
        return max;
    }

    public static Path f(float f3, float f4, float f5, float f6) {
        Path path = new Path();
        path.moveTo(f3, f4);
        path.lineTo(f5, f6);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h(q1.C0571b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.e.h(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // j.o
    public void a(j.i iVar, boolean z3) {
    }

    @Override // W.H
    public B b(long j3, G0.f fVar, G0.b bVar) {
        return new z(AbstractC0090a.c(0L, j3));
    }

    @Override // j.o
    public boolean c(j.i iVar) {
        return false;
    }

    @Override // androidx.lifecycle.H
    public G d(Class cls, v1.c cVar) {
        return new G();
    }

    public Signature[] g(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean i(CharSequence charSequence) {
        return false;
    }

    public String toString() {
        switch (this.f2668d) {
            case 9:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }

    public e(O1.c cVar, O1.c cVar2) {
        this.f2668d = 4;
        cVar.getClass();
        cVar2.getClass();
        if (0.0f > 0.0f) {
            throw new IllegalArgumentException();
        }
    }
}
