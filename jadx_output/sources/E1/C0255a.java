package e1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f4260a;

    /* renamed from: b, reason: collision with root package name */
    public final j f4261b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4262c;

    public C0255a(int i3, j jVar, int i4) {
        this.f4260a = i3;
        this.f4261b = jVar;
        this.f4262c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4260a);
        this.f4261b.f4278a.performAction(this.f4262c, bundle);
    }
}
