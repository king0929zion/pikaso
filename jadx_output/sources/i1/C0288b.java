package i1;

import A.t;
import N.g;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import d1.AbstractC0189K;
import d1.C0207d;
import d1.InterfaceC0206c;
import k.AbstractC0335t;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f4458a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0288b(InputConnection inputConnection, g gVar) {
        super(inputConnection, false);
        this.f4458a = gVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0206c interfaceC0206c;
        t tVar = inputContentInfo == null ? null : new t(25, new t(24, inputContentInfo));
        g gVar = this.f4458a;
        if ((i3 & 1) != 0) {
            try {
                ((InputContentInfo) ((t) tVar.f175e).f175e).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((t) tVar.f175e).f175e;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e3) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e3);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((t) tVar.f175e).f175e).getDescription();
        t tVar2 = (t) tVar.f175e;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) tVar2.f175e).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0206c = new t(clipData, 2);
        } else {
            C0207d c0207d = new C0207d();
            c0207d.f4191e = clipData;
            c0207d.f4192f = 2;
            interfaceC0206c = c0207d;
        }
        interfaceC0206c.k(((InputContentInfo) tVar2.f175e).getLinkUri());
        interfaceC0206c.j(bundle2);
        if (AbstractC0189K.f((AbstractC0335t) gVar.f1735a, interfaceC0206c.g()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i3, bundle);
    }
}
