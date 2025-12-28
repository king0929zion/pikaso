package k;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class P {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) Q.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
