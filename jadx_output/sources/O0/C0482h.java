package o0;

import android.content.ClipboardManager;
import android.content.Context;

/* renamed from: o0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0482h implements InterfaceC0473c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f5588a;

    public C0482h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        p2.g.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f5588a = (ClipboardManager) systemService;
    }
}
