package D;

/* renamed from: D.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f789b;

    public /* synthetic */ C0050m(int i3, Object obj) {
        this.f788a = i3;
        this.f789b = obj;
    }

    public final void a() {
        switch (this.f788a) {
            case 0:
                C0052n c0052n = (C0052n) this.f789b;
                c0052n.f828x--;
                break;
            default:
                N.u uVar = (N.u) this.f789b;
                uVar.f1780j--;
                break;
        }
    }

    public final void b() {
        switch (this.f788a) {
            case 0:
                ((C0052n) this.f789b).f828x++;
                break;
            default:
                ((N.u) this.f789b).f1780j++;
                break;
        }
    }
}
