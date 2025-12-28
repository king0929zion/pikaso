package C2;

import B2.E;

/* loaded from: classes.dex */
public final class z extends B2.v implements E {
    @Override // B2.E
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f358k;
            p2.g.b(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f359l + ((int) ((n() + this.f361n) - this.f359l))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void w(int i3) {
        synchronized (this) {
            Object[] objArr = this.f358k;
            p2.g.b(objArr);
            q(Integer.valueOf(((Number) objArr[((int) ((this.f359l + ((int) ((n() + this.f361n) - this.f359l))) - 1)) & (objArr.length - 1)]).intValue() + i3));
        }
    }
}
