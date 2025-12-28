package o1;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class t implements TextWatcher, SpanWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final Object f5804d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f5805e = new AtomicInteger(0);

    public t(Object obj) {
        this.f5804d = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f5804d).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        ((TextWatcher) this.f5804d).beforeTextChanged(charSequence, i3, i4, i5);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i3, int i4) {
        if (this.f5805e.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.f5804d).onSpanAdded(spannable, obj, i3, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (this.f5805e.get() <= 0 || !(obj instanceof w)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i3 > i4) {
                    i3 = 0;
                }
                if (i5 > i6) {
                    i7 = i3;
                    i8 = 0;
                    ((SpanWatcher) this.f5804d).onSpanChanged(spannable, obj, i7, i4, i8, i6);
                }
            }
            i7 = i3;
            i8 = i5;
            ((SpanWatcher) this.f5804d).onSpanChanged(spannable, obj, i7, i4, i8, i6);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i3, int i4) {
        if (this.f5805e.get() <= 0 || !(obj instanceof w)) {
            ((SpanWatcher) this.f5804d).onSpanRemoved(spannable, obj, i3, i4);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        ((TextWatcher) this.f5804d).onTextChanged(charSequence, i3, i4, i5);
    }
}
