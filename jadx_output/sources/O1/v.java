package o1;

import java.nio.ByteBuffer;
import p1.C0545a;
import p1.C0546b;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f5808d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f5809a;

    /* renamed from: b, reason: collision with root package name */
    public final D1.w f5810b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f5811c = 0;

    public v(D1.w wVar, int i3) {
        this.f5810b = wVar;
        this.f5809a = i3;
    }

    public final int a(int i3) {
        C0545a c3 = c();
        int a3 = c3.a(16);
        if (a3 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c3.f5940b;
        int i4 = a3 + c3.f5939a;
        return byteBuffer.getInt((i3 * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    public final int b() {
        C0545a c3 = c();
        int a3 = c3.a(16);
        if (a3 == 0) {
            return 0;
        }
        int i3 = a3 + c3.f5939a;
        return c3.f5940b.getInt(c3.f5940b.getInt(i3) + i3);
    }

    public final C0545a c() {
        ThreadLocal threadLocal = f5808d;
        C0545a c0545a = (C0545a) threadLocal.get();
        if (c0545a == null) {
            c0545a = new C0545a();
            threadLocal.set(c0545a);
        }
        C0546b c0546b = (C0546b) this.f5810b.f1031a;
        int a3 = c0546b.a(6);
        if (a3 != 0) {
            int i3 = a3 + c0546b.f5939a;
            int i4 = (this.f5809a * 4) + c0546b.f5940b.getInt(i3) + i3 + 4;
            int i5 = c0546b.f5940b.getInt(i4) + i4;
            ByteBuffer byteBuffer = c0546b.f5940b;
            c0545a.f5940b = byteBuffer;
            if (byteBuffer != null) {
                c0545a.f5939a = i5;
                int i6 = i5 - byteBuffer.getInt(i5);
                c0545a.f5941c = i6;
                c0545a.f5942d = c0545a.f5940b.getShort(i6);
            } else {
                c0545a.f5939a = 0;
                c0545a.f5941c = 0;
                c0545a.f5942d = 0;
            }
        }
        return c0545a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0545a c3 = c();
        int a3 = c3.a(4);
        sb.append(Integer.toHexString(a3 != 0 ? c3.f5940b.getInt(a3 + c3.f5939a) : 0));
        sb.append(", codepoints:");
        int b3 = b();
        for (int i3 = 0; i3 < b3; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
