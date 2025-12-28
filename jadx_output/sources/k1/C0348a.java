package k1;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import c2.C0174m;
import k.I0;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4902a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4903b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0348a(A2.b bVar, Handler handler) {
        super(handler);
        this.f4903b = bVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f4902a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3, Uri uri) {
        switch (this.f4902a) {
            case 1:
                ((A2.b) this.f4903b).c(C0174m.f3840a);
                break;
            default:
                super.onChange(z3, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0348a(I0 i0) {
        super(new Handler());
        this.f4903b = i0;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3) {
        Cursor cursor;
        switch (this.f4902a) {
            case 0:
                I0 i0 = (I0) this.f4903b;
                if (i0.f4905e && (cursor = i0.f4906f) != null && !cursor.isClosed()) {
                    i0.f4904d = i0.f4906f.requery();
                    break;
                }
                break;
            default:
                super.onChange(z3);
                break;
        }
    }
}
