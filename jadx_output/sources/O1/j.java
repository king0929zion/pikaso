package o1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.InterfaceC0123d;

/* loaded from: classes.dex */
public final class j implements InterfaceC0123d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.t f5777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f5778e;

    public j(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.t tVar) {
        this.f5778e = emojiCompatInitializer;
        this.f5777d = tVar;
    }

    @Override // androidx.lifecycle.InterfaceC0123d
    public final void a(androidx.lifecycle.r rVar) {
        this.f5778e.getClass();
        (Build.VERSION.SDK_INT >= 28 ? AbstractC0520b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new m(), 500L);
        this.f5777d.f(this);
    }
}
