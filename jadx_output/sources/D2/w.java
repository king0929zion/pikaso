package D2;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class w implements o1.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1087d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1088e;

    public /* synthetic */ w(String str, int i3) {
        this.f1087d = i3;
        this.f1088e = str;
    }

    @Override // o1.o
    public Object a() {
        return this;
    }

    @Override // o1.o
    public boolean d(CharSequence charSequence, int i3, int i4, o1.v vVar) {
        if (!TextUtils.equals(charSequence.subSequence(i3, i4), this.f1088e)) {
            return true;
        }
        vVar.f5811c = (vVar.f5811c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f1087d) {
            case 0:
                return "<" + this.f1088e + '>';
            default:
                return super.toString();
        }
    }
}
