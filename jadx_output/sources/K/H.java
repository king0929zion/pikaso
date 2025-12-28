package k;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.SparseIntArray;
import android.widget.EditText;
import android.widget.TextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import d2.AbstractC0242m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.H;
import o1.ThreadFactoryC0519a;
import p.InterfaceC0531J;
import q1.C0575f;
import s1.C0589c;
import x1.InterfaceC0653e;

/* loaded from: classes.dex */
public class H implements G, o1.h, p.o, InterfaceC0531J, InterfaceC0653e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4655a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4656b;

    public /* synthetic */ H(int i3, Object obj) {
        this.f4655a = i3;
        this.f4656b = obj;
    }

    public static int k(int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i5++;
            if (i5 == i4) {
                i6++;
                i5 = 0;
            } else if (i5 > i4) {
                i6++;
                i5 = 1;
            }
        }
        return i5 + 1 > i4 ? i6 + 1 : i6;
    }

    @Override // p.InterfaceC0531J
    public p.n a(p.n nVar, p.n nVar2, p.n nVar3) {
        return ((D1.w) this.f4656b).a(nVar, nVar2, nVar3);
    }

    @Override // x1.InterfaceC0653e
    public void b(int i3, Serializable serializable) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f4656b).setResultCode(i3);
    }

    @Override // p.InterfaceC0531J
    public long c(p.n nVar, p.n nVar2, p.n nVar3) {
        return ((D1.w) this.f4656b).c(nVar, nVar2, nVar3);
    }

    @Override // x1.InterfaceC0653e
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p.InterfaceC0531J
    public p.n e(long j3, p.n nVar, p.n nVar2, p.n nVar3) {
        return ((D1.w) this.f4656b).e(j3, nVar, nVar2, nVar3);
    }

    @Override // p.InterfaceC0531J
    public p.n f(long j3, p.n nVar, p.n nVar2, p.n nVar3) {
        return ((D1.w) this.f4656b).f(j3, nVar, nVar2, nVar3);
    }

    @Override // o1.h
    public void g(final Z0.d dVar) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0519a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: o1.k
            @Override // java.lang.Runnable
            public final void run() {
                H h = H.this;
                Z0.d dVar2 = dVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                h.getClass();
                try {
                    r m2 = Z.b.m((Context) h.f4656b);
                    if (m2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    q qVar = (q) m2.f5799a;
                    synchronized (qVar.f5794d) {
                        qVar.f5796f = threadPoolExecutor2;
                    }
                    m2.f5799a.g(new l(dVar2, threadPoolExecutor2));
                } catch (Throwable th) {
                    dVar2.I(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // p.o
    public p.t get(int i3) {
        switch (this.f4655a) {
            case 2:
                return (p.u) this.f4656b;
            default:
                return (p.t) this.f4656b;
        }
    }

    @Override // k.G
    public void h(int i3) {
    }

    @Override // k.G
    public void i(int i3) {
    }

    @Override // p.InterfaceC0531J
    public void j() {
        ((D1.w) this.f4656b).getClass();
    }

    public H(int i3) {
        this.f4655a = i3;
        switch (i3) {
            case 9:
                this.f4656b = new SparseIntArray();
                new SparseIntArray();
                break;
            default:
                this.f4656b = Build.VERSION.SDK_INT >= 28 ? new C0589c(13, false) : new C0589c(14, false);
                break;
        }
    }

    public H(TextView textView) {
        this.f4655a = 6;
        this.f4656b = new C0575f(textView);
    }

    public H(EditText editText) {
        this.f4655a = 5;
        this.f4656b = new B2.i(editText, 18);
    }

    public H(Context context) {
        this.f4655a = 1;
        this.f4656b = context.getApplicationContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H(float f3, float f4, p.n nVar) {
        H h;
        this.f4655a = 4;
        if (nVar != null) {
            D.K0 k0 = new D.K0();
            u2.d R2 = Z.b.R(0, nVar.b());
            ArrayList arrayList = new ArrayList(AbstractC0242m.W(R2));
            Iterator it = R2.iterator();
            while (((u2.c) it).f6305f) {
                arrayList.add(new p.u(f3, f4, nVar.a(((u2.c) it).a())));
            }
            k0.f706a = arrayList;
            h = k0;
        } else {
            h = new H(f3, f4);
        }
        this.f4656b = new D1.w(h);
    }

    public H(float f3, float f4) {
        this.f4655a = 2;
        this.f4656b = new p.u(f3, f4, 0.01f);
    }
}
