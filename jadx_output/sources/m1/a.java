package M1;

import android.content.ClipData;
import android.view.ContentInfo;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ ContentInfo.Builder e(ClipData clipData, int i3) {
        return new ContentInfo.Builder(clipData, i3);
    }

    public static /* bridge */ /* synthetic */ ContentInfo g(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder k(AutofillId autofillId, long j3) {
        return new ViewTranslationRequest.Builder(autofillId, j3);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse m(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void o() {
    }
}
