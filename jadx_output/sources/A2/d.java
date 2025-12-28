package A2;

import D2.AbstractC0071a;
import D2.w;
import y2.InterfaceC0672e;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f235a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f236b = AbstractC0071a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f237c = AbstractC0071a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final w f238d = new w("BUFFERED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final w f239e = new w("SHOULD_BUFFER", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final w f240f = new w("S_RESUMING_BY_RCV", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final w f241g = new w("RESUMING_BY_EB", 0);
    public static final w h = new w("POISONED", 0);

    /* renamed from: i, reason: collision with root package name */
    public static final w f242i = new w("DONE_RCV", 0);

    /* renamed from: j, reason: collision with root package name */
    public static final w f243j = new w("INTERRUPTED_SEND", 0);

    /* renamed from: k, reason: collision with root package name */
    public static final w f244k = new w("INTERRUPTED_RCV", 0);

    /* renamed from: l, reason: collision with root package name */
    public static final w f245l = new w("CHANNEL_CLOSED", 0);

    /* renamed from: m, reason: collision with root package name */
    public static final w f246m = new w("SUSPEND", 0);

    /* renamed from: n, reason: collision with root package name */
    public static final w f247n = new w("SUSPEND_NO_WAITER", 0);

    /* renamed from: o, reason: collision with root package name */
    public static final w f248o = new w("FAILED", 0);

    /* renamed from: p, reason: collision with root package name */
    public static final w f249p = new w("NO_RECEIVE_RESULT", 0);

    /* renamed from: q, reason: collision with root package name */
    public static final w f250q = new w("CLOSE_HANDLER_CLOSED", 0);

    /* renamed from: r, reason: collision with root package name */
    public static final w f251r = new w("CLOSE_HANDLER_INVOKED", 0);

    /* renamed from: s, reason: collision with root package name */
    public static final w f252s = new w("NO_CLOSE_CAUSE", 0);

    public static final boolean a(InterfaceC0672e interfaceC0672e, Object obj, o2.c cVar) {
        w d3 = interfaceC0672e.d(obj, cVar);
        if (d3 == null) {
            return false;
        }
        interfaceC0672e.w(d3);
        return true;
    }
}
