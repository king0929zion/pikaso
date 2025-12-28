package x1;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6686a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0653e f6687b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6688c;

    /* renamed from: d, reason: collision with root package name */
    public final File f6689d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6690e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6691f = false;

    /* renamed from: g, reason: collision with root package name */
    public C0651c[] f6692g;
    public byte[] h;

    public C0650b(AssetManager assetManager, Executor executor, InterfaceC0653e interfaceC0653e, String str, File file) {
        this.f6686a = executor;
        this.f6687b = interfaceC0653e;
        this.f6690e = str;
        this.f6689d = file;
        int i3 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i3 <= 34) {
            switch (i3) {
                case 26:
                    bArr = AbstractC0654f.f6707g;
                    break;
                case 27:
                    bArr = AbstractC0654f.f6706f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0654f.f6705e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC0654f.f6704d;
                    break;
            }
        }
        this.f6688c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f6687b.d();
            }
            return null;
        }
    }

    public final void b(final int i3, final Serializable serializable) {
        this.f6686a.execute(new Runnable() { // from class: x1.a
            @Override // java.lang.Runnable
            public final void run() {
                C0650b.this.f6687b.b(i3, serializable);
            }
        });
    }
}
