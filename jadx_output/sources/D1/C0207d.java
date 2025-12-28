package d1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: d1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207d implements InterfaceC0206c, InterfaceC0208e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4190d = 0;

    /* renamed from: e, reason: collision with root package name */
    public ClipData f4191e;

    /* renamed from: f, reason: collision with root package name */
    public int f4192f;

    /* renamed from: g, reason: collision with root package name */
    public int f4193g;
    public Uri h;

    /* renamed from: i, reason: collision with root package name */
    public Bundle f4194i;

    public /* synthetic */ C0207d() {
    }

    @Override // d1.InterfaceC0208e
    public ClipData e() {
        return this.f4191e;
    }

    @Override // d1.InterfaceC0206c
    public C0209f g() {
        return new C0209f(new C0207d(this));
    }

    @Override // d1.InterfaceC0208e
    public int h() {
        return this.f4193g;
    }

    @Override // d1.InterfaceC0208e
    public ContentInfo i() {
        return null;
    }

    @Override // d1.InterfaceC0206c
    public void j(Bundle bundle) {
        this.f4194i = bundle;
    }

    @Override // d1.InterfaceC0206c
    public void k(Uri uri) {
        this.h = uri;
    }

    @Override // d1.InterfaceC0208e
    public int l() {
        return this.f4192f;
    }

    @Override // d1.InterfaceC0206c
    public void p(int i3) {
        this.f4193g = i3;
    }

    public String toString() {
        String str;
        switch (this.f4190d) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f4191e.getDescription());
                sb.append(", source=");
                int i3 = this.f4192f;
                sb.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? String.valueOf(i3) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i4 = this.f4193g;
                sb.append((i4 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i4));
                Uri uri = this.h;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(this.f4194i != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0207d(C0207d c0207d) {
        ClipData clipData = c0207d.f4191e;
        clipData.getClass();
        this.f4191e = clipData;
        int i3 = c0207d.f4192f;
        if (i3 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i3 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f4192f = i3;
        int i4 = c0207d.f4193g;
        if ((i4 & 1) == i4) {
            this.f4193g = i4;
            this.h = c0207d.h;
            this.f4194i = c0207d.f4194i;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
