package F2;

import y2.AbstractC0688v;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f1234f;

    public j(Runnable runnable, long j3, i iVar) {
        super(j3, iVar);
        this.f1234f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1234f.run();
        } finally {
            this.f1232e.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1234f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0688v.f(runnable));
        sb.append(", ");
        sb.append(this.f1231d);
        sb.append(", ");
        sb.append(this.f1232e);
        sb.append(']');
        return sb.toString();
    }
}
