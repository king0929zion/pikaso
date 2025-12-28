package s1;

import android.util.Log;
import java.io.Writer;

/* renamed from: s1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595i extends Writer {

    /* renamed from: e, reason: collision with root package name */
    public final StringBuilder f6143e = new StringBuilder(128);

    /* renamed from: d, reason: collision with root package name */
    public final String f6142d = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f6143e;
        if (sb.length() > 0) {
            Log.d(this.f6142d, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c3 = cArr[i3 + i5];
            if (c3 == '\n') {
                a();
            } else {
                this.f6143e.append(c3);
            }
        }
    }
}
