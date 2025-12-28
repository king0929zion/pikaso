package R;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import x1.AbstractC0658j;
import x1.RunnableC0655g;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2200f;

    public /* synthetic */ b(Object obj, int i3, Object obj2) {
        this.f2198d = i3;
        this.f2199e = obj;
        this.f2200f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2198d) {
            case 0:
                c.a((e) this.f2199e, (LongSparseArray) this.f2200f);
                break;
            case 1:
                ((U0.b) this.f2199e).h((Typeface) this.f2200f);
                break;
            default:
                ((ProfileInstallerInitializer) this.f2199e).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0658j.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0655g((Context) this.f2200f, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }
}
