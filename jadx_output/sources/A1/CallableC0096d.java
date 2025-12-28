package a1;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: a1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0096d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2932b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2933c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0095c f2934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2935e;

    public /* synthetic */ CallableC0096d(String str, Context context, C0095c c0095c, int i3, int i4) {
        this.f2931a = i4;
        this.f2932b = str;
        this.f2933c = context;
        this.f2934d = c0095c;
        this.f2935e = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2931a) {
            case 0:
                return AbstractC0099g.a(this.f2932b, this.f2933c, this.f2934d, this.f2935e);
            default:
                try {
                    return AbstractC0099g.a(this.f2932b, this.f2933c, this.f2934d, this.f2935e);
                } catch (Throwable unused) {
                    return new C0098f(-3);
                }
        }
    }
}
