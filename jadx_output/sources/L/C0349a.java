package l;

import java.util.concurrent.Executors;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349a extends Z.b {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0349a f4912b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4913a;

    public C0349a(int i3) {
        switch (i3) {
            case 1:
                this.f4913a = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0350b());
                break;
            default:
                this.f4913a = new C0349a(1);
                break;
        }
    }
}
