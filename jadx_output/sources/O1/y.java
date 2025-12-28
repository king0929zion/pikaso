package o1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class y implements Spannable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f5817d = false;

    /* renamed from: e, reason: collision with root package name */
    public Spannable f5818e;

    public y(Spannable spannable) {
        this.f5818e = spannable;
    }

    public final void a() {
        Spannable spannable = this.f5818e;
        if (!this.f5817d) {
            if ((Build.VERSION.SDK_INT < 28 ? new X1.e(25) : new x(25)).i(spannable)) {
                this.f5818e = new SpannableString(spannable);
            }
        }
        this.f5817d = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f5818e.charAt(i3);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f5818e.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f5818e.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f5818e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f5818e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f5818e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i3, int i4, Class cls) {
        return this.f5818e.getSpans(i3, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5818e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i3, int i4, Class cls) {
        return this.f5818e.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f5818e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        a();
        this.f5818e.setSpan(obj, i3, i4, i5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i4) {
        return this.f5818e.subSequence(i3, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f5818e.toString();
    }
}
