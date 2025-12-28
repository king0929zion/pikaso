package o0;

import B2.InterfaceC0022f;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import c2.C0174m;
import g2.InterfaceC0271d;
import k1.C0348a;

/* loaded from: classes.dex */
public final class W0 extends i2.j implements o2.e {
    public A2.a h;

    /* renamed from: i, reason: collision with root package name */
    public int f5525i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f5526j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f5527k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f5528l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0348a f5529m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ A2.b f5530n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f5531o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(ContentResolver contentResolver, Uri uri, C0348a c0348a, A2.b bVar, Context context, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f5527k = contentResolver;
        this.f5528l = uri;
        this.f5529m = c0348a;
        this.f5530n = bVar;
        this.f5531o = context;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        A2.b bVar = this.f5530n;
        W0 w02 = new W0(this.f5527k, this.f5528l, this.f5529m, bVar, this.f5531o, interfaceC0271d);
        w02.f5526j = obj;
        return w02;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((W0) f((InterfaceC0271d) obj2, (InterfaceC0022f) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0044, B:14:0x0055, B:16:0x005d, B:25:0x002c, B:27:0x003d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r11) {
        /*
            r10 = this;
            h2.a r0 = h2.a.f4407d
            int r1 = r10.f5525i
            k1.a r2 = r10.f5529m
            r3 = 2
            r4 = 1
            android.content.ContentResolver r5 = r10.f5527k
            if (r1 == 0) goto L30
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1e
            A2.a r1 = r10.h
            java.lang.Object r6 = r10.f5526j
            B2.f r6 = (B2.InterfaceC0022f) r6
            Z0.d.U(r11)     // Catch: java.lang.Throwable -> L1c
        L19:
            r11 = r6
            r6 = r1
            goto L44
        L1c:
            r11 = move-exception
            goto L86
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            A2.a r1 = r10.h
            java.lang.Object r6 = r10.f5526j
            B2.f r6 = (B2.InterfaceC0022f) r6
            Z0.d.U(r11)     // Catch: java.lang.Throwable -> L1c
            goto L55
        L30:
            Z0.d.U(r11)
            java.lang.Object r11 = r10.f5526j
            B2.f r11 = (B2.InterfaceC0022f) r11
            android.net.Uri r1 = r10.f5528l
            r6 = 0
            r5.registerContentObserver(r1, r6, r2)
            A2.b r1 = r10.f5530n     // Catch: java.lang.Throwable -> L1c
            A2.a r6 = new A2.a     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1c
        L44:
            r10.f5526j = r11     // Catch: java.lang.Throwable -> L1c
            r10.h = r6     // Catch: java.lang.Throwable -> L1c
            r10.f5525i = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r6.b(r10)     // Catch: java.lang.Throwable -> L1c
            if (r1 != r0) goto L51
            return r0
        L51:
            r9 = r6
            r6 = r11
            r11 = r1
            r1 = r9
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1c
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L80
            r1.c()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r11 = r10.f5531o     // Catch: java.lang.Throwable -> L1c
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1c
            r10.f5526j = r6     // Catch: java.lang.Throwable -> L1c
            r10.h = r1     // Catch: java.lang.Throwable -> L1c
            r10.f5525i = r3     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r11 = r6.b(r7, r10)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r0) goto L19
            return r0
        L80:
            r5.unregisterContentObserver(r2)
            c2.m r11 = c2.C0174m.f3840a
            return r11
        L86:
            r5.unregisterContentObserver(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.W0.l(java.lang.Object):java.lang.Object");
    }
}
